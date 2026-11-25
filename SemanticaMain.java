import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ListTokenSource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

// Executa: LexerAluno -> ListTokenSource -> JBParser -> SemanticVisitor
public class SemanticaMain {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Uso: java SemanticaMain programa.jb");
            System.exit(2);
        }
        String codigo = new String(Files.readAllBytes(Paths.get(args[0])),
                StandardCharsets.UTF_8);

        // 1) Análise léxica (lexer da aula)
        LexerAluno.Lexer lexer = new LexerAluno.Lexer(codigo, LexerAluno.construirRegras());
        List<LexerAluno.Token> tokensAluno = lexer.tokenizar();

        // 2) Análise sintática (parser do ANTLR)
        ListTokenSource fonte = TokensANTLR.converter(tokensAluno, codigo, args[0], JBParser.VOCABULARY);
        JBParser parser = new JBParser(new CommonTokenStream(fonte));
        JBParser.ProgramContext arvore = parser.program();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.out.println("Há erros de sintaxe; corrija-os antes da análise semântica.");
            System.exit(1);
        }

        // 3) Análise semântica
        SemanticVisitor sv = new SemanticVisitor();
        sv.visit(arvore);

        if (sv.getErros().isEmpty()) {
            System.out.println("Nenhum erro semântico encontrado.");
        } else {
            for (String erro : sv.getErros()) {
                System.out.println(erro);
            }
        }
    }
}
