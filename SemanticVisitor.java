import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

// Percorre a árvore do ANTLR e verifica as variáveis
public class SemanticVisitor extends JBBaseVisitor<Void> {

    private final TabelaDeSimbolos tabela = new TabelaDeSimbolos();
    private final List<String> erros = new ArrayList<>();

    public List<String> getErros() {
        return erros;
    }

    // Guarda uma mensagem de erro com linha e coluna
    private void erro(TerminalNode id, String mensagem) {
        Token t = id.getSymbol();
        erros.add(String.format("Erro semântico [L%d:C%d]: %s",
                t.getLine(), t.getCharPositionInLine() + 1, mensagem));
    }

    // Declara a variável ou reporta declaração duplicada
    private void declarar(TerminalNode id, String tipo) {
        String nome = id.getText();
        if (!tabela.declarar(nome, tipo)) {
            erro(id, "variável '" + nome + "' já foi declarada neste escopo (como "
                    + tabela.tipoNoEscopoAtual(nome) + ").");
        }
    }

    // Reporta uso de variável não declarada - ex: idade = 20;
    private void verificarUso(TerminalNode id) {
        String nome = id.getText();
        if (!tabela.existe(nome)) {
            erro(id, "variável '" + nome + "' usada antes de ser declarada.");
        }
    }

    // int x = expr; - Registrar declarações de variáveis
    @Override
    public Void visitVariableDecl(JBParser.VariableDeclContext ctx) {
        if (ctx.expression() != null) {
            visit(ctx.expression()); // verifica a expressão antes de declarar
        }
        declarar(ctx.ID(), ctx.primitiveType().getText());
        return null;
    }

    // for (int i = expr; ...)  -> declara i
    // for (i = expr; ...)      -> usa i (precisa já existir)
    @Override
    public Void visitForInit(JBParser.ForInitContext ctx) {
        if (ctx.expression() != null) {
            visit(ctx.expression());
        }
        if (ctx.primitiveType() != null) {
            declarar(ctx.ID(), ctx.primitiveType().getText());
        } else {
            verificarUso(ctx.ID());
        }
        return null;
    }

    // Parâmetro de função
    @Override
    public Void visitParameter(JBParser.ParameterContext ctx) {
        declarar(ctx.ID(), ctx.primitiveType().getText());
        return null;
    }

    // x = expr;
    @Override
    public Void visitAssignment(JBParser.AssignmentContext ctx) {
        verificarUso(ctx.ID());
        visit(ctx.expression());
        return null;
    }

    // x++; ou x--;
    @Override
    public Void visitIncrementStmt(JBParser.IncrementStmtContext ctx) {
        verificarUso(ctx.ID());
        return null;
    }

    // i++, i-- ou i = expr (atualização do for)
    @Override
    public Void visitForUpdate(JBParser.ForUpdateContext ctx) {
        verificarUso(ctx.ID());
        if (ctx.expression() != null) {
            visit(ctx.expression());
        }
        return null;
    }

    // Variável usada dentro de uma expressão - int idade = 20; int resultado = idade + altura;
    @Override
    public Void visitPrimaryExpr(JBParser.PrimaryExprContext ctx) {
        if (ctx.ID() != null) {
            verificarUso(ctx.ID());
        }
        return visitChildren(ctx);
    }

    // Bloco { } tem escopo próprio
    @Override
    public Void visitBlock(JBParser.BlockContext ctx) {
        tabela.abrirEscopo();
        visitChildren(ctx);
        tabela.fecharEscopo();
        return null;
    }

    // Variável do for só existe dentro do for
    @Override
    public Void visitForStmt(JBParser.ForStmtContext ctx) {
        tabela.abrirEscopo();
        visitChildren(ctx);
        tabela.fecharEscopo();
        return null;
    }

    // Parâmetros e corpo da função ficam no mesmo escopo
    @Override
    public Void visitFuncStmt(JBParser.FuncStmtContext ctx) {
        tabela.abrirEscopo();
        if (ctx.parameters() != null) {
            visit(ctx.parameters());
        }
        for (JBParser.StatementContext st : ctx.block().statement()) {
            visit(st);
        }
        tabela.fecharEscopo();
        return null;
    }
}