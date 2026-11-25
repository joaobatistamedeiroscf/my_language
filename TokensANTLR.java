import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ListTokenSource;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.misc.Pair;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Converte os tokens do LexerAluno para o ANTLR usando ListTokenSource
public class TokensANTLR {

    // Nome do token -> número do tipo no ANTLR
    static Map<String, Integer> mapaDeTipos(Vocabulary vocab) {
        Map<String, Integer> tipos = new HashMap<>();
        for (int t = 1; t <= vocab.getMaxTokenType(); t++) {
            String nome = vocab.getSymbolicName(t);
            if (nome != null) tipos.put(nome, t);
        }
        return tipos;
    }

    // Posição onde cada linha começa no código
    static List<Integer> iniciosDeLinha(String codigo) {
        List<Integer> inicios = new ArrayList<>();
        inicios.add(0);
        for (int i = 0; i < codigo.length(); i++) {
            if (codigo.charAt(i) == '\n') inicios.add(i + 1);
        }
        return inicios;
    }

    // Cria a lista de CommonToken e o ListTokenSource
    static ListTokenSource converter(List<LexerAluno.Token> tokensAluno,
                                     String codigo, String nomeFonte,
                                     Vocabulary vocab) {
        Map<String, Integer> tipos = mapaDeTipos(vocab);
        List<Integer> inicios = iniciosDeLinha(codigo);
        CharStream entrada = CharStreams.fromString(codigo, nomeFonte);

        List<Token> lista = new ArrayList<>();
        ListTokenSource fonte = new ListTokenSource(lista, nomeFonte);
        Pair<TokenSource, CharStream> origem = new Pair<>(fonte, entrada);

        for (LexerAluno.Token t : tokensAluno) {
            Integer tipo = tipos.get(t.tipo);
            if (tipo == null) {
                // token que não existe na gramática
                System.err.printf("Aviso: token %s ('%s') em L%d:C%d não existe na gramática%n",
                        t.tipo, t.valor, t.linha, t.coluna);
                tipo = Token.INVALID_TYPE;
            }
            int inicio = inicios.get(t.linha - 1) + (t.coluna - 1);
            int fim = inicio + t.valor.length() - 1;

            CommonToken ct = new CommonToken(origem, tipo, Token.DEFAULT_CHANNEL, inicio, fim);
            ct.setText(t.valor);
            ct.setLine(t.linha);
            ct.setCharPositionInLine(t.coluna - 1); // ANTLR conta coluna a partir de 0
            ct.setTokenIndex(lista.size());
            lista.add(ct);
        }

        // Token de fim de arquivo
        CommonToken eof = new CommonToken(origem, Token.EOF, Token.DEFAULT_CHANNEL,
                codigo.length(), codigo.length() - 1);
        eof.setText("<EOF>");
        int ultimaLinha = inicios.size();
        eof.setLine(ultimaLinha);
        eof.setCharPositionInLine(codigo.length() - inicios.get(ultimaLinha - 1));
        eof.setTokenIndex(lista.size());
        lista.add(eof);

        return fonte;
    }

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Uso: java TokensANTLR programa.jb [saida.tokens]");
            System.exit(2);
        }
        String codigo = new String(Files.readAllBytes(Paths.get(args[0])),
                StandardCharsets.UTF_8);
        String saida = (args.length > 1) ? args[1] : "saida.tokens";

        // Lexer da aula
        LexerAluno.Lexer lexer = new LexerAluno.Lexer(codigo, LexerAluno.construirRegras());
        List<LexerAluno.Token> tokensAluno = lexer.tokenizar();

        // Tokens -> ListTokenSource -> parser
        ListTokenSource fonte = converter(tokensAluno, codigo, args[0], JBParser.VOCABULARY);
        CommonTokenStream fluxo = new CommonTokenStream(fonte);
        fluxo.fill();
        JBParser parser = new JBParser(fluxo);

        // Grava o arquivo de tokens no formato do ANTLR
        try (PrintWriter out = new PrintWriter(
                Files.newBufferedWriter(Paths.get(saida), StandardCharsets.UTF_8))) {
            for (Token t : fluxo.getTokens()) {
                out.println(((CommonToken) t).toString(parser));
            }
        }
        System.out.println("Arquivo de tokens gravado em: " + saida);

        // Mostra a árvore sintática
        System.out.println(parser.program().toStringTree(parser));
    }
}
