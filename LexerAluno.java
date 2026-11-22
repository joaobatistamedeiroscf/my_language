/*
 * Uso:
 *   javac LexerAluno.java
 *   java  LexerAluno [arquivo]
 *
 * Estrutura espelhada em lexer_aluno.py / lexer_aluno.c:
 *   1. Token
 *   2. AFD (tabela de transições)
 *   3. Configuração da linguagem
 *   4. Construtores genéricos (literal, trie)
 *   5. Construtores específicos (ID, NUM)
 *   6. Lexer
 *   7. Programa principal
 */

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexerAluno {

    /* =================================================================
     * 1. TOKEN
     * ================================================================= */
    static class Token {
        final String tipo;
        final String valor;
        final int linha;
        final int coluna;

        Token(String tipo, String valor, int linha, int coluna) {
            this.tipo = tipo;
            this.valor = valor;
            this.linha = linha;
            this.coluna = coluna;
        }

        @Override
        public String toString() {
            return "<" + tipo + ", '" + valor + "'> @ " + linha + ":" + coluna;
        }
    }

    /* =================================================================
     * 2. AFD — tabela de transições
     *    transicoes[estado][caractere] = proximo estado
     * ================================================================= */
    static class AFD {
        final String nome;
        final Map<Integer, Map<Character, Integer>> transicoes = new HashMap<>();
        final Set<Integer> finais = new HashSet<>();
        int inicial = 0;
        int prox = 1;

        AFD(String nome) {
            this.nome = nome;
        }

        int novoEstado() {
            int e = prox;
            prox++;
            return e;
        }

        /** Registra transição para CADA caractere em `simbolos`. */
        void transicao(int origem, String simbolos, int destino) {
            Map<Character, Integer> mapa =
                    transicoes.computeIfAbsent(origem, k -> new HashMap<>());
            for (int i = 0; i < simbolos.length(); i++) {
                mapa.put(simbolos.charAt(i), destino);
            }
        }

        void marcarFinal(int estado) {
            finais.add(estado);
        }

        /**
         * Retorna o comprimento do MAIOR prefixo de `texto` aceito pelo AFD,
         * ou -1 se nenhum prefixo for aceito.
         */
        int maiorPrefixo(String texto) {
            int estado = inicial;
            int ultimo = finais.contains(estado) ? 0 : -1;
            for (int i = 0; i < texto.length(); i++) {
                Map<Character, Integer> mapa = transicoes.get(estado);
                if (mapa == null) break;
                Integer p = mapa.get(texto.charAt(i));
                if (p == null) break;
                estado = p;
                if (finais.contains(estado)) ultimo = i + 1;
            }
            return ultimo;
        }
    }

    /* =================================================================
     * 3. CONFIGURAÇÃO DA LINGUAGEM
     * -----------------------------------------------------------------
     * Edite APENAS esta seção para adaptar o lexer à sua linguagem. Linguagem JB
     * ================================================================= */

    static final String LETRAS_ID =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String INICIAIS_ID = LETRAS_ID ;
    static final String CONTINUACAO_ID = LETRAS_ID + "0123456789_";
    static final String DIGITOS = "0123456789";
    static final Pattern PADRAO_REAL =
        Pattern.compile("[0-9]+\\.[0-9]+");
    static final Pattern PADRAO_STRING =
        Pattern.compile("\"([^\"\\\\]|\\\\.)*\"");
    static final Pattern PADRAO_CHAR =
        Pattern.compile("'([^'\\\\]|\\\\.)'");



    static final Map<String, String> PALAVRAS_RESERVADAS = new LinkedHashMap<>();
    static {
    PALAVRAS_RESERVADAS.put("if", "IF");
    PALAVRAS_RESERVADAS.put("else", "ELSE");
    PALAVRAS_RESERVADAS.put("while", "WHILE");
    PALAVRAS_RESERVADAS.put("for", "FOR");
    PALAVRAS_RESERVADAS.put("return", "RETURN");
    PALAVRAS_RESERVADAS.put("func", "FUNC");
    PALAVRAS_RESERVADAS.put("const", "CONST");
    PALAVRAS_RESERVADAS.put("print", "PRINT");
    PALAVRAS_RESERVADAS.put("input", "INPUT");

    /* TIPOS */
    PALAVRAS_RESERVADAS.put("int", "INT");
    PALAVRAS_RESERVADAS.put("real", "REAL");
    PALAVRAS_RESERVADAS.put("str", "STR");
    PALAVRAS_RESERVADAS.put("char", "CHAR");
    PALAVRAS_RESERVADAS.put("bool", "BOOL");
    PALAVRAS_RESERVADAS.put("void", "VOID");

    /* VALORES BOOLEANOS */
    PALAVRAS_RESERVADAS.put("true", "TRUE");
    PALAVRAS_RESERVADAS.put("false", "FALSE");
    }

    static final Map<String, String> OPERADORES = new LinkedHashMap<>();
    static {
    /* Atribuição */
    OPERADORES.put("=", "ATRIB");

    /* Aritméticos */
    OPERADORES.put("+", "OP_SOMA");
    OPERADORES.put("-", "OP_SUB");
    OPERADORES.put("/", "OP_DIV");
    OPERADORES.put("*", "OP_MUL");
    OPERADORES.put("%", "OP_MOD");

    /* Relacionais */
    OPERADORES.put("<=", "OP_LE");
    OPERADORES.put(">=", "OP_GE");
    OPERADORES.put("==", "OP_EQ");
    OPERADORES.put("!=", "OP_NE");
    OPERADORES.put("<", "OP_LT");
    OPERADORES.put(">", "OP_GT");

    /* Lógicos */
    OPERADORES.put("&&", "OP_AND");
    OPERADORES.put("||", "OP_OR");
    OPERADORES.put("!", "OP_NOT");

    /* Incremento / decremento */
    OPERADORES.put("++", "OP_INC");
    OPERADORES.put("--", "OP_DEC");

    
    }

    /*SÍMBOLOS E DELIMITADORES */
    static final Map<String, String> SIMBOLOS = new LinkedHashMap<>();
    static {
        SIMBOLOS.put("(", "PAR_ESQ");
        SIMBOLOS.put(")", "PAR_DIR");
        SIMBOLOS.put("{", "CHAVE_ESQ");
        SIMBOLOS.put("}", "CHAVE_DIR");
        SIMBOLOS.put(";", "PONTO_VIRGULA");
        SIMBOLOS.put(",", "VIRGULA");
        SIMBOLOS.put(".", "PONTO");
    }

    /** Tabela combinada (operadores + símbolos). */
    static final Map<String, String> FIXOS = new LinkedHashMap<>();
    static {
        FIXOS.putAll(OPERADORES);
        FIXOS.putAll(SIMBOLOS);
    }

    /* =================================================================
     * 4. CONSTRUTORES GENÉRICOS DE AFDs
     * ================================================================= */

    /** AFD que reconhece EXATAMENTE a string `texto`. */
    static AFD afdLiteral(String nome, String texto) {
        AFD afd = new AFD(nome);
        int atual = afd.inicial;
        for (int i = 0; i < texto.length(); i++) {
            int p = afd.novoEstado();
            afd.transicao(atual, String.valueOf(texto.charAt(i)), p);
            atual = p;
        }
        afd.marcarFinal(atual);
        return afd;
    }

    /** AFD-trie reconhecendo QUALQUER uma das strings em `textos`. */
    static AFD afdConjuntoLiterais(String nome, List<String> textos) {
        AFD afd = new AFD(nome);
        for (String texto : textos) {
            int atual = afd.inicial;
            for (int i = 0; i < texto.length(); i++) {
                char c = texto.charAt(i);
                Map<Character, Integer> mapa = afd.transicoes.get(atual);
                Integer p = (mapa != null) ? mapa.get(c) : null;
                if (p == null) {
                    p = afd.novoEstado();
                    afd.transicao(atual, String.valueOf(c), p);
                }
                atual = p;
            }
            afd.marcarFinal(atual);
        }
        return afd;
    }

    /* =================================================================
     * 5. CONSTRUTORES ESPECÍFICOS — ID e NUM
     * ================================================================= */

    /** [INICIAIS_ID][CONTINUACAO_ID]* -> tipo ID */
    static AFD afdIdentificador() {
        AFD afd = new AFD("ID");
        int q1 = afd.novoEstado();
        afd.transicao(afd.inicial, INICIAIS_ID, q1);
        afd.transicao(q1, CONTINUACAO_ID, q1);
        afd.marcarFinal(q1);
        return afd;
    }

    /** [DIGITOS]+ -> tipo NUM */
    static AFD afdNumero() {
        AFD afd = new AFD("NUM");
        int q1 = afd.novoEstado();
        afd.transicao(afd.inicial, DIGITOS, q1);
        afd.transicao(q1, DIGITOS, q1);
        afd.marcarFinal(q1);
        return afd;
    }

    /* =================================================================
     * 6. LEXER
     * ================================================================= */

    static class Regra {
        final String tipo;
        final AFD afd;
        Regra(String tipo, AFD afd) {
            this.tipo = tipo;
            this.afd = afd;
        }
    }

    static class Lexer {
        final String entrada;
        final List<Regra> regras;
        int pos = 0;
        int linha = 1;
        int coluna = 1;

        Lexer(String entrada, List<Regra> regras) {
            this.entrada = entrada;
            this.regras = regras;
        }

        void avancar(int n) {
            for (int i = 0; i < n; i++) {
                if (pos >= entrada.length()) return;
                if (entrada.charAt(pos) == '\n') {
                    linha++;
                    coluna = 1;
                } else {
                    coluna++;
                }
                pos++;
            }
        }

        String reclassificar(String tipo, String valor) {
            if (tipo.equals("ID") && PALAVRAS_RESERVADAS.containsKey(valor)) {
                return PALAVRAS_RESERVADAS.get(valor);
            }
            if (tipo.equals("FIXO")) {
                return FIXOS.getOrDefault(valor, tipo);
            }
            return tipo;
        }

        Token proximoToken() {
            // 1) pular espaços em branco
            while (pos < entrada.length()) {
                char c = entrada.charAt(pos);
                if (c == ' ' || c == '\t' || c == '\r' || c == '\n') {
                    avancar(1);
                } else {
                    break;
                }
            }
            if (pos >= entrada.length()) return null;

            int l = linha;
            int c = coluna;
            String resto = entrada.substring(pos);

           // 2) maior prefixo entre todas as regras
        String melhorTipo = null;
        int melhorTam = 0;

        for (Regra regra : regras) {
            int tam = regra.afd.maiorPrefixo(resto);

            if (tam > melhorTam) {
                melhorTam = tam;
                melhorTipo = regra.tipo;
            }
        }

            // 3) Reconhecimento de números reais
            Matcher matcherReal = PADRAO_REAL.matcher(resto);

            if (matcherReal.lookingAt() && matcherReal.end() > melhorTam) {
                melhorTam = matcherReal.end();
                melhorTipo = "REAL_LITERAL";
            }

            // 4) Reconhecimento de strings
            Matcher matcherString = PADRAO_STRING.matcher(resto);

            if (matcherString.lookingAt() && matcherString.end() > melhorTam) {
                melhorTam = matcherString.end();
                melhorTipo = "STRING_LITERAL";
            }


            // 5) Reconhecimento de caracteres
            Matcher matcherChar = PADRAO_CHAR.matcher(resto);

            if (matcherChar.lookingAt() && matcherChar.end() > melhorTam) {
                melhorTam = matcherChar.end();
                melhorTipo = "CHAR_LITERAL";
            }

            if (melhorTam == 0) {
                System.err.printf(
                        "Caractere inesperado '%c' em L%d:C%d%n",
                        resto.charAt(0), l, c);
                System.exit(1);
            }

            String valor = resto.substring(0, melhorTam);
            avancar(melhorTam);

            // 3) reclassificação
            String tipoFinal = reclassificar(melhorTipo, valor);

            return new Token(tipoFinal, valor, l, c);
        }

        List<Token> tokenizar() {
            List<Token> tokens = new ArrayList<>();
            Token t;
            while ((t = proximoToken()) != null) {
                tokens.add(t);
            }
            return tokens;
        }
    }

    /* =================================================================
     * 7. PROGRAMA PRINCIPAL
     * ================================================================= */

    static List<Regra> construirRegras() {
        List<String> fixosOrdenados = new ArrayList<>(FIXOS.keySet());
        Collections.sort(fixosOrdenados);

        List<Regra> regras = new ArrayList<>();
        regras.add(new Regra("ID", afdIdentificador()));
        regras.add(new Regra("INT_LITERAL", afdNumero()));
        regras.add(new Regra("FIXO",
                afdConjuntoLiterais("FIXO", fixosOrdenados)));
        return regras;
    }

    public static void main(String[] args) throws IOException {
        String codigo = "";
        if (args.length > 0) {
            byte[] bytes = Files.readAllBytes(Paths.get(args[0]));
            codigo = new String(bytes, StandardCharsets.UTF_8);
        }

        Lexer lexer = new Lexer(codigo, construirRegras());
        List<Token> tokens = lexer.tokenizar();

        System.out.printf("%-12s %-10s%n", "TEXTO", "TOKEN");
        System.out.println("-".repeat(22));
        for (Token tok : tokens) {
            System.out.printf("%-12s %-10s%n", tok.valor, tok.tipo);
        }
    }
}