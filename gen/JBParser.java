// Generated from JB.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JBParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, REAL=2, STR=3, BOOL=4, TRUE=5, FALSE=6, INT_LITERAL=7, REAL_LITERAL=8, 
		STRING_LITERAL=9, CHAR_LITERAL=10, ATRIB=11, PONTO_VIRGULA=12, CHAVE_ESQ=13, 
		CHAVE_DIR=14, WS=15, OP_SOMA=16, OP_SUB=17, OP_MULT=18, OP_DIV=19, OP_MOD=20, 
		PAR_ESQ=21, PAR_DIR=22, OP_LE=23, OP_LT=24, OP_GE=25, OP_GT=26, OP_EQ=27, 
		OP_NE=28, IF=29, ELSE=30, WHILE=31, FOR=32, OP_INC=33, OP_DEC=34, ID=35;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableDecl = 2, RULE_ifStmt = 3, 
		RULE_whileStmt = 4, RULE_forStmt = 5, RULE_forInit = 6, RULE_forUpdate = 7, 
		RULE_primitiveType = 8, RULE_block = 9, RULE_expression = 10, RULE_relationalExpr = 11, 
		RULE_additiveExpr = 12, RULE_multiplicativeExpr = 13, RULE_primaryExpr = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableDecl", "ifStmt", "whileStmt", "forStmt", 
			"forInit", "forUpdate", "primitiveType", "block", "expression", "relationalExpr", 
			"additiveExpr", "multiplicativeExpr", "primaryExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'real'", "'str'", "'bool'", "'true'", "'false'", null, 
			null, null, null, "'='", "';'", "'{'", "'}'", null, "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'('", "')'", "'<='", "'<'", "'>='", "'>'", "'=='", "'!='", 
			"'if'", "'else'", "'while'", "'for'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "REAL", "STR", "BOOL", "TRUE", "FALSE", "INT_LITERAL", "REAL_LITERAL", 
			"STRING_LITERAL", "CHAR_LITERAL", "ATRIB", "PONTO_VIRGULA", "CHAVE_ESQ", 
			"CHAVE_DIR", "WS", "OP_SOMA", "OP_SUB", "OP_MULT", "OP_DIV", "OP_MOD", 
			"PAR_ESQ", "PAR_DIR", "OP_LE", "OP_LT", "OP_GE", "OP_GT", "OP_EQ", "OP_NE", 
			"IF", "ELSE", "WHILE", "FOR", "OP_INC", "OP_DEC", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JBParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6979330078L) != 0)) {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL:
			case STR:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				variableDecl();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				ifStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				whileStmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				forStmt();
				}
				break;
			case CHAVE_ESQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JBParser.ID, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(JBParser.PONTO_VIRGULA, 0); }
		public TerminalNode ATRIB() { return getToken(JBParser.ATRIB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			primitiveType();
			setState(46);
			match(ID);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIB) {
				{
				setState(47);
				match(ATRIB);
				setState(48);
				expression();
				}
			}

			setState(51);
			match(PONTO_VIRGULA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JBParser.IF, 0); }
		public TerminalNode PAR_ESQ() { return getToken(JBParser.PAR_ESQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_DIR() { return getToken(JBParser.PAR_DIR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JBParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(IF);
			setState(54);
			match(PAR_ESQ);
			setState(55);
			expression();
			setState(56);
			match(PAR_DIR);
			setState(57);
			statement();
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(58);
				match(ELSE);
				setState(59);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JBParser.WHILE, 0); }
		public TerminalNode PAR_ESQ() { return getToken(JBParser.PAR_ESQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_DIR() { return getToken(JBParser.PAR_DIR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(WHILE);
			setState(63);
			match(PAR_ESQ);
			setState(64);
			expression();
			setState(65);
			match(PAR_DIR);
			setState(66);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JBParser.FOR, 0); }
		public TerminalNode PAR_ESQ() { return getToken(JBParser.PAR_ESQ, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> PONTO_VIRGULA() { return getTokens(JBParser.PONTO_VIRGULA); }
		public TerminalNode PONTO_VIRGULA(int i) {
			return getToken(JBParser.PONTO_VIRGULA, i);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public TerminalNode PAR_DIR() { return getToken(JBParser.PAR_DIR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(FOR);
			setState(69);
			match(PAR_ESQ);
			setState(70);
			forInit();
			setState(71);
			match(PONTO_VIRGULA);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34361837536L) != 0)) {
				{
				setState(72);
				expression();
				}
			}

			setState(75);
			match(PONTO_VIRGULA);
			setState(76);
			forUpdate();
			setState(77);
			match(PAR_DIR);
			setState(78);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JBParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(JBParser.ATRIB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			primitiveType();
			setState(81);
			match(ID);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIB) {
				{
				setState(82);
				match(ATRIB);
				setState(83);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JBParser.ID, 0); }
		public TerminalNode OP_INC() { return getToken(JBParser.OP_INC, 0); }
		public TerminalNode OP_DEC() { return getToken(JBParser.OP_DEC, 0); }
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forUpdate);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(ID);
				setState(87);
				match(OP_INC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(ID);
				setState(89);
				match(OP_DEC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JBParser.INT, 0); }
		public TerminalNode REAL() { return getToken(JBParser.REAL, 0); }
		public TerminalNode STR() { return getToken(JBParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(JBParser.BOOL, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode CHAVE_ESQ() { return getToken(JBParser.CHAVE_ESQ, 0); }
		public TerminalNode CHAVE_DIR() { return getToken(JBParser.CHAVE_DIR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(CHAVE_ESQ);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6979330078L) != 0)) {
				{
				{
				setState(95);
				statement();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(CHAVE_DIR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public RelationalExprContext relationalExpr() {
			return getRuleContext(RelationalExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			relationalExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends ParserRuleContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public List<TerminalNode> OP_LT() { return getTokens(JBParser.OP_LT); }
		public TerminalNode OP_LT(int i) {
			return getToken(JBParser.OP_LT, i);
		}
		public List<TerminalNode> OP_LE() { return getTokens(JBParser.OP_LE); }
		public TerminalNode OP_LE(int i) {
			return getToken(JBParser.OP_LE, i);
		}
		public List<TerminalNode> OP_GT() { return getTokens(JBParser.OP_GT); }
		public TerminalNode OP_GT(int i) {
			return getToken(JBParser.OP_GT, i);
		}
		public List<TerminalNode> OP_GE() { return getTokens(JBParser.OP_GE); }
		public TerminalNode OP_GE(int i) {
			return getToken(JBParser.OP_GE, i);
		}
		public List<TerminalNode> OP_EQ() { return getTokens(JBParser.OP_EQ); }
		public TerminalNode OP_EQ(int i) {
			return getToken(JBParser.OP_EQ, i);
		}
		public List<TerminalNode> OP_NE() { return getTokens(JBParser.OP_NE); }
		public TerminalNode OP_NE(int i) {
			return getToken(JBParser.OP_NE, i);
		}
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relationalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			additiveExpr();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) {
				{
				{
				setState(106);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(107);
				additiveExpr();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExprContext extends ParserRuleContext {
		public List<MultiplicativeExprContext> multiplicativeExpr() {
			return getRuleContexts(MultiplicativeExprContext.class);
		}
		public MultiplicativeExprContext multiplicativeExpr(int i) {
			return getRuleContext(MultiplicativeExprContext.class,i);
		}
		public List<TerminalNode> OP_SOMA() { return getTokens(JBParser.OP_SOMA); }
		public TerminalNode OP_SOMA(int i) {
			return getToken(JBParser.OP_SOMA, i);
		}
		public List<TerminalNode> OP_SUB() { return getTokens(JBParser.OP_SUB); }
		public TerminalNode OP_SUB(int i) {
			return getToken(JBParser.OP_SUB, i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			multiplicativeExpr();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SOMA || _la==OP_SUB) {
				{
				{
				setState(114);
				_la = _input.LA(1);
				if ( !(_la==OP_SOMA || _la==OP_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(115);
				multiplicativeExpr();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExprContext extends ParserRuleContext {
		public List<PrimaryExprContext> primaryExpr() {
			return getRuleContexts(PrimaryExprContext.class);
		}
		public PrimaryExprContext primaryExpr(int i) {
			return getRuleContext(PrimaryExprContext.class,i);
		}
		public List<TerminalNode> OP_MULT() { return getTokens(JBParser.OP_MULT); }
		public TerminalNode OP_MULT(int i) {
			return getToken(JBParser.OP_MULT, i);
		}
		public List<TerminalNode> OP_DIV() { return getTokens(JBParser.OP_DIV); }
		public TerminalNode OP_DIV(int i) {
			return getToken(JBParser.OP_DIV, i);
		}
		public List<TerminalNode> OP_MOD() { return getTokens(JBParser.OP_MOD); }
		public TerminalNode OP_MOD(int i) {
			return getToken(JBParser.OP_MOD, i);
		}
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			primaryExpr();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) {
				{
				{
				setState(122);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(123);
				primaryExpr();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(JBParser.INT_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(JBParser.REAL_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JBParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(JBParser.CHAR_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(JBParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JBParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(JBParser.ID, 0); }
		public TerminalNode PAR_ESQ() { return getToken(JBParser.PAR_ESQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_DIR() { return getToken(JBParser.PAR_DIR, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primaryExpr);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(INT_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(REAL_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(STRING_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(CHAR_LITERAL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				match(FALSE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(135);
				match(ID);
				}
				break;
			case PAR_ESQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(136);
				match(PAR_ESQ);
				setState(137);
				expression();
				setState(138);
				match(PAR_DIR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u008f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001,\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00022\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005J\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006U\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007[\b\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0005\ta\b\t\n\t\f\td\t\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bm\b\u000b\n\u000b\f"+
		"\u000bp\t\u000b\u0001\f\u0001\f\u0001\f\u0005\fu\b\f\n\f\f\fx\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0005\r}\b\r\n\r\f\r\u0080\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u008d\b\u000e\u0001\u000e"+
		"\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0004\u0001\u0000\u0001\u0004\u0001\u0000"+
		"\u0017\u001c\u0001\u0000\u0010\u0011\u0001\u0000\u0012\u0014\u0094\u0000"+
		"!\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004-\u0001"+
		"\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000\b>\u0001\u0000\u0000"+
		"\u0000\nD\u0001\u0000\u0000\u0000\fP\u0001\u0000\u0000\u0000\u000eZ\u0001"+
		"\u0000\u0000\u0000\u0010\\\u0001\u0000\u0000\u0000\u0012^\u0001\u0000"+
		"\u0000\u0000\u0014g\u0001\u0000\u0000\u0000\u0016i\u0001\u0000\u0000\u0000"+
		"\u0018q\u0001\u0000\u0000\u0000\u001ay\u0001\u0000\u0000\u0000\u001c\u008c"+
		"\u0001\u0000\u0000\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001e\u0001"+
		"\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000$%\u0005\u0000\u0000\u0001%\u0001\u0001\u0000\u0000\u0000"+
		"&,\u0003\u0004\u0002\u0000\',\u0003\u0006\u0003\u0000(,\u0003\b\u0004"+
		"\u0000),\u0003\n\u0005\u0000*,\u0003\u0012\t\u0000+&\u0001\u0000\u0000"+
		"\u0000+\'\u0001\u0000\u0000\u0000+(\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0003\u0001\u0000\u0000\u0000"+
		"-.\u0003\u0010\b\u0000.1\u0005#\u0000\u0000/0\u0005\u000b\u0000\u0000"+
		"02\u0003\u0014\n\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000034\u0005\f\u0000\u00004\u0005\u0001\u0000\u0000"+
		"\u000056\u0005\u001d\u0000\u000067\u0005\u0015\u0000\u000078\u0003\u0014"+
		"\n\u000089\u0005\u0016\u0000\u00009<\u0003\u0002\u0001\u0000:;\u0005\u001e"+
		"\u0000\u0000;=\u0003\u0002\u0001\u0000<:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005\u001f\u0000"+
		"\u0000?@\u0005\u0015\u0000\u0000@A\u0003\u0014\n\u0000AB\u0005\u0016\u0000"+
		"\u0000BC\u0003\u0002\u0001\u0000C\t\u0001\u0000\u0000\u0000DE\u0005 \u0000"+
		"\u0000EF\u0005\u0015\u0000\u0000FG\u0003\f\u0006\u0000GI\u0005\f\u0000"+
		"\u0000HJ\u0003\u0014\n\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KL\u0005\f\u0000\u0000LM\u0003\u000e\u0007"+
		"\u0000MN\u0005\u0016\u0000\u0000NO\u0003\u0002\u0001\u0000O\u000b\u0001"+
		"\u0000\u0000\u0000PQ\u0003\u0010\b\u0000QT\u0005#\u0000\u0000RS\u0005"+
		"\u000b\u0000\u0000SU\u0003\u0014\n\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000U\r\u0001\u0000\u0000\u0000VW\u0005#\u0000\u0000W[\u0005"+
		"!\u0000\u0000XY\u0005#\u0000\u0000Y[\u0005\"\u0000\u0000ZV\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000[\u000f\u0001\u0000\u0000\u0000"+
		"\\]\u0007\u0000\u0000\u0000]\u0011\u0001\u0000\u0000\u0000^b\u0005\r\u0000"+
		"\u0000_a\u0003\u0002\u0001\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005\u000e\u0000\u0000"+
		"f\u0013\u0001\u0000\u0000\u0000gh\u0003\u0016\u000b\u0000h\u0015\u0001"+
		"\u0000\u0000\u0000in\u0003\u0018\f\u0000jk\u0007\u0001\u0000\u0000km\u0003"+
		"\u0018\f\u0000lj\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0017\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000qv\u0003\u001a\r\u0000rs\u0007\u0002\u0000"+
		"\u0000su\u0003\u001a\r\u0000tr\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0019\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000y~\u0003\u001c\u000e\u0000"+
		"z{\u0007\u0003\u0000\u0000{}\u0003\u001c\u000e\u0000|z\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u001b\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0081\u008d\u0005\u0007\u0000\u0000\u0082\u008d\u0005"+
		"\b\u0000\u0000\u0083\u008d\u0005\t\u0000\u0000\u0084\u008d\u0005\n\u0000"+
		"\u0000\u0085\u008d\u0005\u0005\u0000\u0000\u0086\u008d\u0005\u0006\u0000"+
		"\u0000\u0087\u008d\u0005#\u0000\u0000\u0088\u0089\u0005\u0015\u0000\u0000"+
		"\u0089\u008a\u0003\u0014\n\u0000\u008a\u008b\u0005\u0016\u0000\u0000\u008b"+
		"\u008d\u0001\u0000\u0000\u0000\u008c\u0081\u0001\u0000\u0000\u0000\u008c"+
		"\u0082\u0001\u0000\u0000\u0000\u008c\u0083\u0001\u0000\u0000\u0000\u008c"+
		"\u0084\u0001\u0000\u0000\u0000\u008c\u0085\u0001\u0000\u0000\u0000\u008c"+
		"\u0086\u0001\u0000\u0000\u0000\u008c\u0087\u0001\u0000\u0000\u0000\u008c"+
		"\u0088\u0001\u0000\u0000\u0000\u008d\u001d\u0001\u0000\u0000\u0000\f!"+
		"+1<ITZbnv~\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}