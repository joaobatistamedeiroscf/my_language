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
		INT=1, REAL=2, STR=3, BOOL=4, VOID=5, TRUE=6, FALSE=7, INT_LITERAL=8, 
		REAL_LITERAL=9, STRING_LITERAL=10, CHAR_LITERAL=11, ATRIB=12, PONTO_VIRGULA=13, 
		CHAVE_ESQ=14, CHAVE_DIR=15, WS=16, OP_SOMA=17, OP_SUB=18, OP_MULT=19, 
		OP_DIV=20, OP_MOD=21, PAR_ESQ=22, PAR_DIR=23, OP_LE=24, OP_LT=25, OP_GE=26, 
		OP_GT=27, OP_EQ=28, OP_NE=29, IF=30, ELSE=31, WHILE=32, FOR=33, OP_INC=34, 
		OP_DEC=35, FUNC=36, VIRGULA=37, ID=38;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableDecl = 2, RULE_assignment = 3, 
		RULE_ifStmt = 4, RULE_whileStmt = 5, RULE_forStmt = 6, RULE_forInit = 7, 
		RULE_forUpdate = 8, RULE_funcStmt = 9, RULE_parameters = 10, RULE_parameter = 11, 
		RULE_returnType = 12, RULE_primitiveType = 13, RULE_block = 14, RULE_expression = 15, 
		RULE_relationalExpr = 16, RULE_additiveExpr = 17, RULE_multiplicativeExpr = 18, 
		RULE_primaryExpr = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableDecl", "assignment", "ifStmt", "whileStmt", 
			"forStmt", "forInit", "forUpdate", "funcStmt", "parameters", "parameter", 
			"returnType", "primitiveType", "block", "expression", "relationalExpr", 
			"additiveExpr", "multiplicativeExpr", "primaryExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'real'", "'str'", "'bool'", "'void'", "'true'", "'false'", 
			null, null, null, null, "'='", "';'", "'{'", "'}'", null, "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'('", "')'", "'<='", "'<'", "'>='", "'>'", "'=='", 
			"'!='", "'if'", "'else'", "'while'", "'for'", "'++'", "'--'", "'func'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "REAL", "STR", "BOOL", "VOID", "TRUE", "FALSE", "INT_LITERAL", 
			"REAL_LITERAL", "STRING_LITERAL", "CHAR_LITERAL", "ATRIB", "PONTO_VIRGULA", 
			"CHAVE_ESQ", "CHAVE_DIR", "WS", "OP_SOMA", "OP_SUB", "OP_MULT", "OP_DIV", 
			"OP_MOD", "PAR_ESQ", "PAR_DIR", "OP_LE", "OP_LT", "OP_GE", "OP_GT", "OP_EQ", 
			"OP_NE", "IF", "ELSE", "WHILE", "FOR", "OP_INC", "OP_DEC", "FUNC", "VIRGULA", 
			"ID"
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 357556043838L) != 0)) {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
		public FuncStmtContext funcStmt() {
			return getRuleContext(FuncStmtContext.class,0);
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
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL:
			case STR:
			case BOOL:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				variableDecl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				assignment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				ifStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				whileStmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				forStmt();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				funcStmt();
				}
				break;
			case CHAVE_ESQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
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
			setState(57);
			primitiveType();
			setState(58);
			match(ID);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIB) {
				{
				setState(59);
				match(ATRIB);
				setState(60);
				expression();
				}
			}

			setState(63);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JBParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(JBParser.ATRIB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(JBParser.PONTO_VIRGULA, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(66);
			match(ATRIB);
			setState(67);
			expression();
			setState(68);
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
		enterRule(_localctx, 8, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IF);
			setState(71);
			match(PAR_ESQ);
			setState(72);
			expression();
			setState(73);
			match(PAR_DIR);
			setState(74);
			statement();
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(75);
				match(ELSE);
				setState(76);
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
		enterRule(_localctx, 10, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(WHILE);
			setState(80);
			match(PAR_ESQ);
			setState(81);
			expression();
			setState(82);
			match(PAR_DIR);
			setState(83);
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
		enterRule(_localctx, 12, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(FOR);
			setState(86);
			match(PAR_ESQ);
			setState(87);
			forInit();
			setState(88);
			match(PONTO_VIRGULA);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274882105280L) != 0)) {
				{
				setState(89);
				expression();
				}
			}

			setState(92);
			match(PONTO_VIRGULA);
			setState(93);
			forUpdate();
			setState(94);
			match(PAR_DIR);
			setState(95);
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
		enterRule(_localctx, 14, RULE_forInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			primitiveType();
			setState(98);
			match(ID);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIB) {
				{
				setState(99);
				match(ATRIB);
				setState(100);
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
		enterRule(_localctx, 16, RULE_forUpdate);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(ID);
				setState(104);
				match(OP_INC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(ID);
				setState(106);
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
	public static class FuncStmtContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(JBParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(JBParser.ID, 0); }
		public TerminalNode PAR_ESQ() { return getToken(JBParser.PAR_ESQ, 0); }
		public TerminalNode PAR_DIR() { return getToken(JBParser.PAR_DIR, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FuncStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitFuncStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncStmtContext funcStmt() throws RecognitionException {
		FuncStmtContext _localctx = new FuncStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(FUNC);
			setState(110);
			match(ID);
			setState(111);
			match(PAR_ESQ);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
				{
				setState(112);
				parameters();
				}
			}

			setState(115);
			match(PAR_DIR);
			setState(116);
			returnType();
			setState(117);
			block();
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
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(JBParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(JBParser.VIRGULA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			parameter();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(120);
				match(VIRGULA);
				setState(121);
				parameter();
				}
				}
				setState(126);
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
	public static class ParameterContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JBParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			primitiveType();
			setState(128);
			match(ID);
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
	public static class ReturnTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JBVisitor ) return ((JBVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			primitiveType();
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
		public TerminalNode VOID() { return getToken(JBParser.VOID, 0); }
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
		enterRule(_localctx, 26, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(CHAVE_ESQ);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 357556043838L) != 0)) {
				{
				{
				setState(135);
				statement();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
		enterRule(_localctx, 32, RULE_relationalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			additiveExpr();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) {
				{
				{
				setState(146);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(147);
				additiveExpr();
				}
				}
				setState(152);
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
		enterRule(_localctx, 34, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			multiplicativeExpr();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SOMA || _la==OP_SUB) {
				{
				{
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==OP_SOMA || _la==OP_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				multiplicativeExpr();
				}
				}
				setState(160);
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
		enterRule(_localctx, 36, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			primaryExpr();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) {
				{
				{
				setState(162);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(163);
				primaryExpr();
				}
				}
				setState(168);
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
		enterRule(_localctx, 38, RULE_primaryExpr);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(INT_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(REAL_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(STRING_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(CHAR_LITERAL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				match(FALSE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				match(ID);
				}
				break;
			case PAR_ESQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(176);
				match(PAR_ESQ);
				setState(177);
				expression();
				setState(178);
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
		"\u0004\u0001&\u00b7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002>\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006[\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007f\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\bl\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tr\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n{\b\n\n\n\f"+
		"\n~\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0005\u000e\u0089\b\u000e\n\u000e\f\u000e\u008c"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0095\b\u0010\n\u0010\f\u0010\u0098\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u009d\b\u0011\n\u0011"+
		"\f\u0011\u00a0\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00a5\b\u0012\n\u0012\f\u0012\u00a8\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00b5\b\u0013\u0001\u0013\u0000"+
		"\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&\u0000\u0004\u0001\u0000\u0001\u0005\u0001"+
		"\u0000\u0018\u001d\u0001\u0000\u0011\u0012\u0001\u0000\u0013\u0015\u00bb"+
		"\u0000+\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u00049"+
		"\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\bF\u0001\u0000"+
		"\u0000\u0000\nO\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000e"+
		"a\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012m\u0001"+
		"\u0000\u0000\u0000\u0014w\u0001\u0000\u0000\u0000\u0016\u007f\u0001\u0000"+
		"\u0000\u0000\u0018\u0082\u0001\u0000\u0000\u0000\u001a\u0084\u0001\u0000"+
		"\u0000\u0000\u001c\u0086\u0001\u0000\u0000\u0000\u001e\u008f\u0001\u0000"+
		"\u0000\u0000 \u0091\u0001\u0000\u0000\u0000\"\u0099\u0001\u0000\u0000"+
		"\u0000$\u00a1\u0001\u0000\u0000\u0000&\u00b4\u0001\u0000\u0000\u0000("+
		"*\u0003\u0002\u0001\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0000\u0000\u0001/\u0001"+
		"\u0001\u0000\u0000\u000008\u0003\u0004\u0002\u000018\u0003\u0006\u0003"+
		"\u000028\u0003\b\u0004\u000038\u0003\n\u0005\u000048\u0003\f\u0006\u0000"+
		"58\u0003\u0012\t\u000068\u0003\u001c\u000e\u000070\u0001\u0000\u0000\u0000"+
		"71\u0001\u0000\u0000\u000072\u0001\u0000\u0000\u000073\u0001\u0000\u0000"+
		"\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000"+
		"\u0000\u00008\u0003\u0001\u0000\u0000\u00009:\u0003\u001a\r\u0000:=\u0005"+
		"&\u0000\u0000;<\u0005\f\u0000\u0000<>\u0003\u001e\u000f\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?@\u0005\r\u0000\u0000@\u0005\u0001\u0000\u0000\u0000AB\u0005&\u0000\u0000"+
		"BC\u0005\f\u0000\u0000CD\u0003\u001e\u000f\u0000DE\u0005\r\u0000\u0000"+
		"E\u0007\u0001\u0000\u0000\u0000FG\u0005\u001e\u0000\u0000GH\u0005\u0016"+
		"\u0000\u0000HI\u0003\u001e\u000f\u0000IJ\u0005\u0017\u0000\u0000JM\u0003"+
		"\u0002\u0001\u0000KL\u0005\u001f\u0000\u0000LN\u0003\u0002\u0001\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\t\u0001\u0000\u0000"+
		"\u0000OP\u0005 \u0000\u0000PQ\u0005\u0016\u0000\u0000QR\u0003\u001e\u000f"+
		"\u0000RS\u0005\u0017\u0000\u0000ST\u0003\u0002\u0001\u0000T\u000b\u0001"+
		"\u0000\u0000\u0000UV\u0005!\u0000\u0000VW\u0005\u0016\u0000\u0000WX\u0003"+
		"\u000e\u0007\u0000XZ\u0005\r\u0000\u0000Y[\u0003\u001e\u000f\u0000ZY\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\]\u0005\r\u0000\u0000]^\u0003\u0010\b\u0000^_\u0005\u0017\u0000\u0000"+
		"_`\u0003\u0002\u0001\u0000`\r\u0001\u0000\u0000\u0000ab\u0003\u001a\r"+
		"\u0000be\u0005&\u0000\u0000cd\u0005\f\u0000\u0000df\u0003\u001e\u000f"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u000f\u0001"+
		"\u0000\u0000\u0000gh\u0005&\u0000\u0000hl\u0005\"\u0000\u0000ij\u0005"+
		"&\u0000\u0000jl\u0005#\u0000\u0000kg\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000l\u0011\u0001\u0000\u0000\u0000mn\u0005$\u0000\u0000no\u0005"+
		"&\u0000\u0000oq\u0005\u0016\u0000\u0000pr\u0003\u0014\n\u0000qp\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"st\u0005\u0017\u0000\u0000tu\u0003\u0018\f\u0000uv\u0003\u001c\u000e\u0000"+
		"v\u0013\u0001\u0000\u0000\u0000w|\u0003\u0016\u000b\u0000xy\u0005%\u0000"+
		"\u0000y{\u0003\u0016\u000b\u0000zx\u0001\u0000\u0000\u0000{~\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0015"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u001a"+
		"\r\u0000\u0080\u0081\u0005&\u0000\u0000\u0081\u0017\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0003\u001a\r\u0000\u0083\u0019\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0007\u0000\u0000\u0000\u0085\u001b\u0001\u0000\u0000\u0000"+
		"\u0086\u008a\u0005\u000e\u0000\u0000\u0087\u0089\u0003\u0002\u0001\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005\u000f\u0000\u0000\u008e\u001d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0003 \u0010\u0000\u0090\u001f\u0001\u0000\u0000\u0000\u0091"+
		"\u0096\u0003\"\u0011\u0000\u0092\u0093\u0007\u0001\u0000\u0000\u0093\u0095"+
		"\u0003\"\u0011\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0098\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097!\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0099\u009e\u0003$\u0012\u0000\u009a\u009b\u0007\u0002\u0000"+
		"\u0000\u009b\u009d\u0003$\u0012\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f#\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a1\u00a6\u0003&\u0013\u0000\u00a2\u00a3"+
		"\u0007\u0003\u0000\u0000\u00a3\u00a5\u0003&\u0013\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7%\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00b5\u0005\b\u0000"+
		"\u0000\u00aa\u00b5\u0005\t\u0000\u0000\u00ab\u00b5\u0005\n\u0000\u0000"+
		"\u00ac\u00b5\u0005\u000b\u0000\u0000\u00ad\u00b5\u0005\u0006\u0000\u0000"+
		"\u00ae\u00b5\u0005\u0007\u0000\u0000\u00af\u00b5\u0005&\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0016\u0000\u0000\u00b1\u00b2\u0003\u001e\u000f\u0000\u00b2"+
		"\u00b3\u0005\u0017\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4"+
		"\u00a9\u0001\u0000\u0000\u0000\u00b4\u00aa\u0001\u0000\u0000\u0000\u00b4"+
		"\u00ab\u0001\u0000\u0000\u0000\u00b4\u00ac\u0001\u0000\u0000\u0000\u00b4"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b4"+
		"\u00af\u0001\u0000\u0000\u0000\u00b4\u00b0\u0001\u0000\u0000\u0000\u00b5"+
		"\'\u0001\u0000\u0000\u0000\u000e+7=MZekq|\u008a\u0096\u009e\u00a6\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}