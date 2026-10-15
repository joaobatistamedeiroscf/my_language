// Generated from JB.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JBParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JBVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JBParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JBParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JBParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(JBParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(JBParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(JBParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(JBParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JBParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(JBParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JBParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JBParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JBParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBParser#relationalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(JBParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(JBParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(JBParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JBParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(JBParser.PrimaryExprContext ctx);
}