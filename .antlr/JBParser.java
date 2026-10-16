// Generated from c:/Users/joaob/OneDrive/Documentos/my_language/JB.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JBParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, REAL=2, STR=3, BOOL=4, VOID=5, TRUE=6, FALSE=7, RETURN=8, INT_LITERAL=9, 
		REAL_LITERAL=10, STRING_LITERAL=11, CHAR_LITERAL=12, ATRIB=13, PONTO_VIRGULA=14, 
		CHAVE_ESQ=15, CHAVE_DIR=16, WS=17, OP_SOMA=18, OP_SUB=19, OP_MULT=20, 
		OP_DIV=21, OP_MOD=22, PAR_ESQ=23, PAR_DIR=24, OP_LE=25, OP_LT=26, OP_GE=27, 
		OP_GT=28, OP_EQ=29, OP_NE=30, IF=31, ELSE=32, WHILE=33, FOR=34, OP_INC=35, 
		OP_DEC=36, FUNC=37, VIRGULA=38, ID=39;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableDecl = 2, RULE_assignment = 3, 
		RULE_ifStmt = 4, RULE_whileStmt = 5, RULE_forStmt = 6, RULE_forInit = 7, 
		RULE_forUpdate = 8, RULE_returnStmt = 9, RULE_funcStmt = 10, RULE_parameters = 11, 
		RULE_parameter = 12, RULE_primitiveType = 13, RULE_block = 14, RULE_expression = 15, 
		RULE_relationalExpr = 16, RULE_additiveExpr = 17, RULE_multiplicativeExpr = 18, 
		RULE_primaryExpr = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableDecl", "assignment", "ifStmt", "whileStmt", 
			"forStmt", "forInit", "forUpdate", "returnStmt", "funcStmt", "parameters", 
			"parameter", "primitiveType", "block", "expression", "relationalExpr", 
			"additiveExpr", "multiplicativeExpr", "primaryExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'real'", "'str'", "'bool'", "'void'", "'true'", "'false'", 
			"'return'", null, null, null, null, "'='", "';'", "'{'", "'}'", null, 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'<='", "'<'", "'>='", 
			"'>'", "'=='", "'!='", "'if'", "'else'", "'while'", "'for'", "'++'", 
			"'--'", "'func'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "REAL", "STR", "BOOL", "VOID", "TRUE", "FALSE", "RETURN", 
			"INT_LITERAL", "REAL_LITERAL", "STRING_LITERAL", "CHAR_LITERAL", "ATRIB", 
			"PONTO_VIRGULA", "CHAVE_ESQ", "CHAVE_DIR", "WS", "OP_SOMA", "OP_SUB", 
			"OP_MULT", "OP_DIV", "OP_MOD", "PAR_ESQ", "PAR_DIR", "OP_LE", "OP_LT", 
			"OP_GE", "OP_GT", "OP_EQ", "OP_NE", "IF", "ELSE", "WHILE", "FOR", "OP_INC", 
			"OP_DEC", "FUNC", "VIRGULA", "ID"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 715112087838L) != 0)) {
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
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL:
			case STR:
			case BOOL:
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
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				returnStmt();
				}
				break;
			case CHAVE_ESQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
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
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			primitiveType();
			setState(59);
			match(ID);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIB) {
				{
				setState(60);
				match(ATRIB);
				setState(61);
				expression();
				}
			}

			setState(64);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
			setState(67);
			match(ATRIB);
			setState(68);
			expression();
			setState(69);
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
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(IF);
			setState(72);
			match(PAR_ESQ);
			setState(73);
			expression();
			setState(74);
			match(PAR_DIR);
			setState(75);
			statement();
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(76);
				match(ELSE);
				setState(77);
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
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(WHILE);
			setState(81);
			match(PAR_ESQ);
			setState(82);
			expression();
			setState(83);
			match(PAR_DIR);
			setState(84);
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
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(FOR);
			setState(87);
			match(PAR_ESQ);
			setState(88);
			forInit();
			setState(89);
			match(PONTO_VIRGULA);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549764210368L) != 0)) {
				{
				setState(90);
				expression();
				}
			}

			setState(93);
			match(PONTO_VIRGULA);
			setState(94);
			forUpdate();
			setState(95);
			match(PAR_DIR);
			setState(96);
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
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			primitiveType();
			setState(99);
			match(ID);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIB) {
				{
				setState(100);
				match(ATRIB);
				setState(101);
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
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forUpdate);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(ID);
				setState(105);
				match(OP_INC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(ID);
				setState(107);
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
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JBParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(JBParser.PONTO_VIRGULA, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(RETURN);
			setState(111);
			expression();
			setState(112);
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
	public static class FuncStmtContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(JBParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(JBParser.ID, 0); }
		public TerminalNode PAR_ESQ() { return getToken(JBParser.PAR_ESQ, 0); }
		public TerminalNode PAR_DIR() { return getToken(JBParser.PAR_DIR, 0); }
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
	}

	public final FuncStmtContext funcStmt() throws RecognitionException {
		FuncStmtContext _localctx = new FuncStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(FUNC);
			setState(115);
			match(ID);
			setState(116);
			match(PAR_ESQ);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) {
				{
				setState(117);
				parameters();
				}
			}

			setState(120);
			match(PAR_DIR);
			setState(121);
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
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			parameter();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(124);
				match(VIRGULA);
				setState(125);
				parameter();
				}
				}
				setState(130);
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
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			primitiveType();
			setState(132);
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
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JBParser.INT, 0); }
		public TerminalNode REAL() { return getToken(JBParser.REAL, 0); }
		public TerminalNode STR() { return getToken(JBParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(JBParser.BOOL, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(CHAVE_ESQ);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 715112087838L) != 0)) {
				{
				{
				setState(137);
				statement();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relationalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			additiveExpr();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2113929216L) != 0)) {
				{
				{
				setState(148);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2113929216L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				additiveExpr();
				}
				}
				setState(154);
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
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			multiplicativeExpr();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SOMA || _la==OP_SUB) {
				{
				{
				setState(156);
				_la = _input.LA(1);
				if ( !(_la==OP_SOMA || _la==OP_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(157);
				multiplicativeExpr();
				}
				}
				setState(162);
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
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			primaryExpr();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				{
				setState(164);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				primaryExpr();
				}
				}
				setState(170);
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
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primaryExpr);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(INT_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(REAL_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(STRING_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(CHAR_LITERAL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				match(FALSE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				match(ID);
				}
				break;
			case PAR_ESQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				match(PAR_ESQ);
				setState(179);
				expression();
				setState(180);
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
		"\u0004\u0001\'\u00b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"9\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"?\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\\\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007g\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bm\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\nw\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u007f\b\u000b\n\u000b\f\u000b"+
		"\u0082\t\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u008b\b\u000e\n\u000e\f\u000e\u008e\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0097\b\u0010\n\u0010\f\u0010\u009a\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u009f\b\u0011\n\u0011\f\u0011\u00a2\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00a7\b\u0012\n\u0012"+
		"\f\u0012\u00aa\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00b7\b\u0013\u0001\u0013\u0000\u0000\u0014\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&\u0000\u0004\u0001\u0000\u0001\u0004\u0001\u0000\u0019\u001e"+
		"\u0001\u0000\u0012\u0013\u0001\u0000\u0014\u0016\u00be\u0000+\u0001\u0000"+
		"\u0000\u0000\u00028\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000\u0000"+
		"\u0006B\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nP\u0001\u0000"+
		"\u0000\u0000\fV\u0001\u0000\u0000\u0000\u000eb\u0001\u0000\u0000\u0000"+
		"\u0010l\u0001\u0000\u0000\u0000\u0012n\u0001\u0000\u0000\u0000\u0014r"+
		"\u0001\u0000\u0000\u0000\u0016{\u0001\u0000\u0000\u0000\u0018\u0083\u0001"+
		"\u0000\u0000\u0000\u001a\u0086\u0001\u0000\u0000\u0000\u001c\u0088\u0001"+
		"\u0000\u0000\u0000\u001e\u0091\u0001\u0000\u0000\u0000 \u0093\u0001\u0000"+
		"\u0000\u0000\"\u009b\u0001\u0000\u0000\u0000$\u00a3\u0001\u0000\u0000"+
		"\u0000&\u00b6\u0001\u0000\u0000\u0000(*\u0003\u0002\u0001\u0000)(\u0001"+
		"\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000./\u0005\u0000\u0000\u0001/\u0001\u0001\u0000\u0000\u000009\u0003"+
		"\u0004\u0002\u000019\u0003\u0006\u0003\u000029\u0003\b\u0004\u000039\u0003"+
		"\n\u0005\u000049\u0003\f\u0006\u000059\u0003\u0014\n\u000069\u0003\u0012"+
		"\t\u000079\u0003\u001c\u000e\u000080\u0001\u0000\u0000\u000081\u0001\u0000"+
		"\u0000\u000082\u0001\u0000\u0000\u000083\u0001\u0000\u0000\u000084\u0001"+
		"\u0000\u0000\u000085\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"87\u0001\u0000\u0000\u00009\u0003\u0001\u0000\u0000\u0000:;\u0003\u001a"+
		"\r\u0000;>\u0005\'\u0000\u0000<=\u0005\r\u0000\u0000=?\u0003\u001e\u000f"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0005\u000e\u0000\u0000A\u0005\u0001\u0000\u0000\u0000"+
		"BC\u0005\'\u0000\u0000CD\u0005\r\u0000\u0000DE\u0003\u001e\u000f\u0000"+
		"EF\u0005\u000e\u0000\u0000F\u0007\u0001\u0000\u0000\u0000GH\u0005\u001f"+
		"\u0000\u0000HI\u0005\u0017\u0000\u0000IJ\u0003\u001e\u000f\u0000JK\u0005"+
		"\u0018\u0000\u0000KN\u0003\u0002\u0001\u0000LM\u0005 \u0000\u0000MO\u0003"+
		"\u0002\u0001\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"O\t\u0001\u0000\u0000\u0000PQ\u0005!\u0000\u0000QR\u0005\u0017\u0000\u0000"+
		"RS\u0003\u001e\u000f\u0000ST\u0005\u0018\u0000\u0000TU\u0003\u0002\u0001"+
		"\u0000U\u000b\u0001\u0000\u0000\u0000VW\u0005\"\u0000\u0000WX\u0005\u0017"+
		"\u0000\u0000XY\u0003\u000e\u0007\u0000Y[\u0005\u000e\u0000\u0000Z\\\u0003"+
		"\u001e\u000f\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0005\u000e\u0000\u0000^_\u0003\u0010\b"+
		"\u0000_`\u0005\u0018\u0000\u0000`a\u0003\u0002\u0001\u0000a\r\u0001\u0000"+
		"\u0000\u0000bc\u0003\u001a\r\u0000cf\u0005\'\u0000\u0000de\u0005\r\u0000"+
		"\u0000eg\u0003\u001e\u000f\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000g\u000f\u0001\u0000\u0000\u0000hi\u0005\'\u0000\u0000im\u0005"+
		"#\u0000\u0000jk\u0005\'\u0000\u0000km\u0005$\u0000\u0000lh\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000m\u0011\u0001\u0000\u0000\u0000"+
		"no\u0005\b\u0000\u0000op\u0003\u001e\u000f\u0000pq\u0005\u000e\u0000\u0000"+
		"q\u0013\u0001\u0000\u0000\u0000rs\u0005%\u0000\u0000st\u0005\'\u0000\u0000"+
		"tv\u0005\u0017\u0000\u0000uw\u0003\u0016\u000b\u0000vu\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005\u0018"+
		"\u0000\u0000yz\u0003\u001c\u000e\u0000z\u0015\u0001\u0000\u0000\u0000"+
		"{\u0080\u0003\u0018\f\u0000|}\u0005&\u0000\u0000}\u007f\u0003\u0018\f"+
		"\u0000~|\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0017"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0003\u001a\r\u0000\u0084\u0085\u0005\'\u0000\u0000\u0085\u0019\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0007\u0000\u0000\u0000\u0087\u001b\u0001"+
		"\u0000\u0000\u0000\u0088\u008c\u0005\u000f\u0000\u0000\u0089\u008b\u0003"+
		"\u0002\u0001\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005\u0010\u0000\u0000\u0090\u001d\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0003 \u0010\u0000\u0092\u001f\u0001\u0000"+
		"\u0000\u0000\u0093\u0098\u0003\"\u0011\u0000\u0094\u0095\u0007\u0001\u0000"+
		"\u0000\u0095\u0097\u0003\"\u0011\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099!\u0001\u0000\u0000\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009b\u00a0\u0003$\u0012\u0000\u009c\u009d"+
		"\u0007\u0002\u0000\u0000\u009d\u009f\u0003$\u0012\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1#\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a8\u0003&\u0013"+
		"\u0000\u00a4\u00a5\u0007\u0003\u0000\u0000\u00a5\u00a7\u0003&\u0013\u0000"+
		"\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9%\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab"+
		"\u00b7\u0005\t\u0000\u0000\u00ac\u00b7\u0005\n\u0000\u0000\u00ad\u00b7"+
		"\u0005\u000b\u0000\u0000\u00ae\u00b7\u0005\f\u0000\u0000\u00af\u00b7\u0005"+
		"\u0006\u0000\u0000\u00b0\u00b7\u0005\u0007\u0000\u0000\u00b1\u00b7\u0005"+
		"\'\u0000\u0000\u00b2\u00b3\u0005\u0017\u0000\u0000\u00b3\u00b4\u0003\u001e"+
		"\u000f\u0000\u00b4\u00b5\u0005\u0018\u0000\u0000\u00b5\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b6\u00ab\u0001\u0000\u0000\u0000\u00b6\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b6\u00ad\u0001\u0000\u0000\u0000\u00b6\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b6\u00af\u0001\u0000\u0000\u0000\u00b6\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b1\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b7\'\u0001\u0000\u0000\u0000\u000e+8>N[flv\u0080\u008c"+
		"\u0098\u00a0\u00a8\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}