// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/js/JavaScriptParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.js;

    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JavaScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BREAK=1, CASE=2, CATCH=3, CLASS=4, CONST=5, CONTINUE=6, DEBUGGER=7, DEFAULT=8, 
		DELETE=9, DO=10, ELSE=11, EXPORT=12, EXTENDS=13, FINALLY=14, FOR=15, FUNCTION=16, 
		IF=17, IMPORT=18, IN=19, INSTANCEOF=20, LET=21, NEW=22, RETURN=23, SUPER=24, 
		SWITCH=25, THIS=26, THROW=27, TRY=28, TYPEOF=29, VAR=30, VOID=31, WHILE=32, 
		WITH=33, YIELD=34, ASYNC=35, AWAIT=36, FROM=37, OF=38, STATIC=39, TRUE=40, 
		FALSE=41, NULL=42, UNDEFINED=43, ASSIGN=44, PLUS_ASSIGN=45, MINUS_ASSIGN=46, 
		MULT_ASSIGN=47, DIV_ASSIGN=48, MOD_ASSIGN=49, POWER_ASSIGN=50, LEFT_SHIFT_ASSIGN=51, 
		RIGHT_SHIFT_ASSIGN=52, UNSIGNED_RIGHT_SHIFT_ASSIGN=53, BIT_AND_ASSIGN=54, 
		BIT_OR_ASSIGN=55, BIT_XOR_ASSIGN=56, PLUS=57, MINUS=58, MULT=59, DIV=60, 
		MOD=61, POWER=62, INCREMENT=63, DECREMENT=64, EQ=65, STRICT_EQ=66, NE=67, 
		STRICT_NE=68, LT=69, LE=70, GT=71, GE=72, AND=73, OR=74, NOT=75, BIT_AND=76, 
		BIT_OR=77, BIT_XOR=78, BIT_NOT=79, LEFT_SHIFT=80, RIGHT_SHIFT=81, UNSIGNED_RIGHT_SHIFT=82, 
		ARROW=83, TEMPLATE_STRING_START=84, SEMICOLON=85, COMMA=86, DOT=87, QUESTION=88, 
		COLON=89, OPTIONAL_CHAINING=90, NULLISH_COALESCING=91, LPAREN=92, RPAREN=93, 
		LBRACE=94, RBRACE=95, LBRACKET=96, RBRACKET=97, NUMBER_LITERAL=98, STRING_LITERAL=99, 
		REGEX_LITERAL=100, IDENTIFIER=101, LINE_COMMENT=102, BLOCK_COMMENT=103, 
		WS=104, TEMPLATE_STRING_END=105, TEMPLATE_EXPRESSION_START=106, TEMPLATE_STRING_PART=107;
	public static final int
		RULE_program = 0, RULE_sourceElement = 1, RULE_statement = 2, RULE_block = 3, 
		RULE_variableStatement = 4, RULE_variableDeclaration = 5, RULE_expressionStatement = 6, 
		RULE_ifStatement = 7, RULE_iterationStatement = 8, RULE_continueStatement = 9, 
		RULE_breakStatement = 10, RULE_returnStatement = 11, RULE_switchStatement = 12, 
		RULE_caseClause = 13, RULE_defaultClause = 14, RULE_throwStatement = 15, 
		RULE_tryStatement = 16, RULE_catchProduction = 17, RULE_finallyProduction = 18, 
		RULE_debuggerStatement = 19, RULE_functionDeclaration = 20, RULE_formalParameterList = 21, 
		RULE_formalParameter = 22, RULE_classDeclaration = 23, RULE_classElement = 24, 
		RULE_methodDefinition = 25, RULE_expression = 26, RULE_assignmentExpression = 27, 
		RULE_arrowFunction = 28, RULE_assignmentOperator = 29, RULE_conditionalExpression = 30, 
		RULE_binaryExpression = 31, RULE_unaryExpression = 32, RULE_postfixExpression = 33, 
		RULE_leftHandSideExpression = 34, RULE_newExpression = 35, RULE_memberExpression = 36, 
		RULE_callExpression = 37, RULE_arguments = 38, RULE_argumentList = 39, 
		RULE_primaryExpression = 40, RULE_functionExpression = 41, RULE_arrayLiteral = 42, 
		RULE_objectLiteral = 43, RULE_propertyAssignment = 44, RULE_propertyName = 45, 
		RULE_literal = 46, RULE_templateLiteral = 47, RULE_templateElement = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElement", "statement", "block", "variableStatement", 
			"variableDeclaration", "expressionStatement", "ifStatement", "iterationStatement", 
			"continueStatement", "breakStatement", "returnStatement", "switchStatement", 
			"caseClause", "defaultClause", "throwStatement", "tryStatement", "catchProduction", 
			"finallyProduction", "debuggerStatement", "functionDeclaration", "formalParameterList", 
			"formalParameter", "classDeclaration", "classElement", "methodDefinition", 
			"expression", "assignmentExpression", "arrowFunction", "assignmentOperator", 
			"conditionalExpression", "binaryExpression", "unaryExpression", "postfixExpression", 
			"leftHandSideExpression", "newExpression", "memberExpression", "callExpression", 
			"arguments", "argumentList", "primaryExpression", "functionExpression", 
			"arrayLiteral", "objectLiteral", "propertyAssignment", "propertyName", 
			"literal", "templateLiteral", "templateElement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'case'", "'catch'", "'class'", "'const'", "'continue'", 
			"'debugger'", "'default'", "'delete'", "'do'", "'else'", "'export'", 
			"'extends'", "'finally'", "'for'", "'function'", "'if'", "'import'", 
			"'in'", "'instanceof'", "'let'", "'new'", "'return'", "'super'", "'switch'", 
			"'this'", "'throw'", "'try'", "'typeof'", "'var'", "'void'", "'while'", 
			"'with'", "'yield'", "'async'", "'await'", "'from'", "'of'", "'static'", 
			"'true'", "'false'", "'null'", "'undefined'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'**='", "'<<='", "'>>='", "'>>>='", "'&='", 
			"'|='", "'^='", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'++'", "'--'", 
			"'=='", "'==='", "'!='", "'!=='", "'<'", "'<='", "'>'", "'>='", "'&&'", 
			"'||'", "'!'", "'&'", "'|'", "'^'", "'~'", "'<<'", "'>>'", "'>>>'", "'=>'", 
			null, "';'", "','", "'.'", "'?'", "':'", "'?.'", "'??'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", null, null, null, null, null, null, null, 
			null, "'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BREAK", "CASE", "CATCH", "CLASS", "CONST", "CONTINUE", "DEBUGGER", 
			"DEFAULT", "DELETE", "DO", "ELSE", "EXPORT", "EXTENDS", "FINALLY", "FOR", 
			"FUNCTION", "IF", "IMPORT", "IN", "INSTANCEOF", "LET", "NEW", "RETURN", 
			"SUPER", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR", "VOID", "WHILE", 
			"WITH", "YIELD", "ASYNC", "AWAIT", "FROM", "OF", "STATIC", "TRUE", "FALSE", 
			"NULL", "UNDEFINED", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "POWER_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", 
			"UNSIGNED_RIGHT_SHIFT_ASSIGN", "BIT_AND_ASSIGN", "BIT_OR_ASSIGN", "BIT_XOR_ASSIGN", 
			"PLUS", "MINUS", "MULT", "DIV", "MOD", "POWER", "INCREMENT", "DECREMENT", 
			"EQ", "STRICT_EQ", "NE", "STRICT_NE", "LT", "LE", "GT", "GE", "AND", 
			"OR", "NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", "LEFT_SHIFT", 
			"RIGHT_SHIFT", "UNSIGNED_RIGHT_SHIFT", "ARROW", "TEMPLATE_STRING_START", 
			"SEMICOLON", "COMMA", "DOT", "QUESTION", "COLON", "OPTIONAL_CHAINING", 
			"NULLISH_COALESCING", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", 
			"RBRACKET", "NUMBER_LITERAL", "STRING_LITERAL", "REGEX_LITERAL", "IDENTIFIER", 
			"LINE_COMMENT", "BLOCK_COMMENT", "WS", "TEMPLATE_STRING_END", "TEMPLATE_EXPRESSION_START", 
			"TEMPLATE_STRING_PART"
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
	public String getGrammarFileName() { return "JavaScriptParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private SymbolTable symbolTable = new SymbolTable();
	    private ErrorTable errorTable = new ErrorTable();
	    private Set<String> declaredVariables = new HashSet<>();
	    
	    public SymbolTable getSymbolTable() { return symbolTable; }
	    public ErrorTable getErrorTable() { return errorTable; }
	    
	    private void addSymbol(String name, String type, int line, int column) {
	        Symbol symbol = new Symbol(name, type, "global", null, line, column);
	        symbolTable.addSymbol(symbol);
	    }
	    
	    private void addError(String message, int line, int column, String type) {
	        CompilationError.ErrorType errorType = CompilationError.ErrorType.SEMANTIC;
	        if ("LEXICAL".equals(type)) {
	            errorType = CompilationError.ErrorType.LEXICAL;
	        } else if ("SYNTACTIC".equals(type)) {
	            errorType = CompilationError.ErrorType.SYNTACTIC;
	        }
	        CompilationError error = new CompilationError(errorType, message, line, column, "");
	        errorTable.addError(error);
	    }
	    
	    private void checkVariableDeclaration(String varName, int line, int column) {
	        if (declaredVariables.contains(varName)) {
	            addError("Variable '" + varName + "' already declared", line, column, "SEMANTIC");
	        } else {
	            declaredVariables.add(varName);
	        }
	    }
	    
	    private void checkVariableUsage(String varName, int line, int column) {
	        if (!declaredVariables.contains(varName)) {
	            addError("Variable '" + varName + "' used before declaration", line, column, "SEMANTIC");
	        }
	    }

	public JavaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaScriptParser.EOF, 0); }
		public List<SourceElementContext> sourceElement() {
			return getRuleContexts(SourceElementContext.class);
		}
		public SourceElementContext sourceElement(int i) {
			return getRuleContext(SourceElementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8791018664395307278L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 263336265729L) != 0)) {
				{
				{
				setState(98);
				sourceElement();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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
	public static class SourceElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterSourceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitSourceElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitSourceElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElement);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				classDeclaration();
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
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DebuggerStatementContext debuggerStatement() {
			return getRuleContext(DebuggerStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				continueStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				breakStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				returnStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(119);
				switchStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(120);
				throwStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(121);
				tryStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(122);
				debuggerStatement();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaScriptParser.RBRACE, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(LBRACE);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8791018664395307294L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 263336265729L) != 0)) {
				{
				{
				setState(126);
				statement();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(RBRACE);
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
	public static class VariableStatementContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JavaScriptParser.VAR, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaScriptParser.COMMA, i);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaScriptParser.SEMICOLON, 0); }
		public TerminalNode LET() { return getToken(JavaScriptParser.LET, 0); }
		public TerminalNode CONST() { return getToken(JavaScriptParser.CONST, 0); }
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableStatement);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(VAR);
				setState(135);
				variableDeclaration();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(136);
					match(COMMA);
					setState(137);
					variableDeclaration();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(143);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(LET);
				setState(147);
				variableDeclaration();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(148);
					match(COMMA);
					setState(149);
					variableDeclaration();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(155);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(CONST);
				setState(159);
				variableDeclaration();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(160);
					match(COMMA);
					setState(161);
					variableDeclaration();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(167);
					match(SEMICOLON);
					}
					break;
				}
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaScriptParser.ASSIGN, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((VariableDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(173);
				match(ASSIGN);
				setState(174);
				assignmentExpression();
				}
			}


			        checkVariableDeclaration(((VariableDeclarationContext)_localctx).IDENTIFIER.getText(), ((VariableDeclarationContext)_localctx).IDENTIFIER.getLine(), ((VariableDeclarationContext)_localctx).IDENTIFIER.getCharPositionInLine());
			        addSymbol(((VariableDeclarationContext)_localctx).IDENTIFIER.getText(), "variable", ((VariableDeclarationContext)_localctx).IDENTIFIER.getLine(), ((VariableDeclarationContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaScriptParser.SEMICOLON, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			expression();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(180);
				match(SEMICOLON);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaScriptParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(JavaScriptParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaScriptParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaScriptParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(IF);
			setState(184);
			match(LPAREN);
			setState(185);
			expression();
			setState(186);
			match(RPAREN);
			setState(187);
			statement();
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(188);
				match(ELSE);
				setState(189);
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
	public static class IterationStatementContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode DO() { return getToken(JavaScriptParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JavaScriptParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(JavaScriptParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JavaScriptParser.RPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(JavaScriptParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JavaScriptParser.SEMICOLON, i);
		}
		public TerminalNode FOR() { return getToken(JavaScriptParser.FOR, 0); }
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public TerminalNode VAR() { return getToken(JavaScriptParser.VAR, 0); }
		public TerminalNode LET() { return getToken(JavaScriptParser.LET, 0); }
		public TerminalNode CONST() { return getToken(JavaScriptParser.CONST, 0); }
		public TerminalNode IN() { return getToken(JavaScriptParser.IN, 0); }
		public TerminalNode OF() { return getToken(JavaScriptParser.OF, 0); }
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_iterationStatement);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(DO);
				setState(193);
				statement();
				setState(194);
				match(WHILE);
				setState(195);
				match(LPAREN);
				setState(196);
				expression();
				setState(197);
				match(RPAREN);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(198);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(WHILE);
				setState(202);
				match(LPAREN);
				setState(203);
				expression();
				setState(204);
				match(RPAREN);
				setState(205);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(FOR);
				setState(208);
				match(LPAREN);
				setState(214);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
				case LET:
				case VAR:
					{
					setState(209);
					variableStatement();
					}
					break;
				case DELETE:
				case FUNCTION:
				case NEW:
				case THIS:
				case TYPEOF:
				case VOID:
				case ASYNC:
				case AWAIT:
				case TRUE:
				case FALSE:
				case NULL:
				case PLUS:
				case MINUS:
				case INCREMENT:
				case DECREMENT:
				case NOT:
				case BIT_NOT:
				case TEMPLATE_STRING_START:
				case LPAREN:
				case LBRACE:
				case LBRACKET:
				case NUMBER_LITERAL:
				case STRING_LITERAL:
				case REGEX_LITERAL:
				case IDENTIFIER:
					{
					setState(210);
					expression();
					setState(211);
					match(SEMICOLON);
					}
					break;
				case SEMICOLON:
					{
					setState(213);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(220);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DELETE:
				case FUNCTION:
				case NEW:
				case THIS:
				case TYPEOF:
				case VOID:
				case ASYNC:
				case AWAIT:
				case TRUE:
				case FALSE:
				case NULL:
				case PLUS:
				case MINUS:
				case INCREMENT:
				case DECREMENT:
				case NOT:
				case BIT_NOT:
				case TEMPLATE_STRING_START:
				case LPAREN:
				case LBRACE:
				case LBRACKET:
				case NUMBER_LITERAL:
				case STRING_LITERAL:
				case REGEX_LITERAL:
				case IDENTIFIER:
					{
					setState(216);
					expression();
					setState(217);
					match(SEMICOLON);
					}
					break;
				case SEMICOLON:
					{
					setState(219);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8791018670210874880L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 263336265729L) != 0)) {
					{
					setState(222);
					expression();
					}
				}

				setState(225);
				match(RPAREN);
				setState(226);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(FOR);
				setState(228);
				match(LPAREN);
				setState(229);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1075839008L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
				((IterationStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(231);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(232);
				expression();
				setState(233);
				match(RPAREN);
				setState(234);
				statement();

				        addSymbol(((IterationStatementContext)_localctx).IDENTIFIER.getText(), "iterator", ((IterationStatementContext)_localctx).IDENTIFIER.getLine(), ((IterationStatementContext)_localctx).IDENTIFIER.getCharPositionInLine());
				    
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
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(JavaScriptParser.CONTINUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaScriptParser.SEMICOLON, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(CONTINUE);
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(240);
				match(IDENTIFIER);
				}
				break;
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(243);
				match(SEMICOLON);
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
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(JavaScriptParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaScriptParser.SEMICOLON, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(BREAK);
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(247);
				match(IDENTIFIER);
				}
				break;
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(250);
				match(SEMICOLON);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaScriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaScriptParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(RETURN);
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(254);
				expression();
				}
				break;
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(257);
				match(SEMICOLON);
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
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaScriptParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(JavaScriptParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaScriptParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(JavaScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaScriptParser.RBRACE, 0); }
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_switchStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(SWITCH);
			setState(261);
			match(LPAREN);
			setState(262);
			expression();
			setState(263);
			match(RPAREN);
			setState(264);
			match(LBRACE);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					caseClause();
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(271);
				defaultClause();
				}
			}

			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(274);
				caseClause();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(RBRACE);
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
	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JavaScriptParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaScriptParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(CASE);
			setState(283);
			expression();
			setState(284);
			match(COLON);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8791018664395307294L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 263336265729L) != 0)) {
				{
				{
				setState(285);
				statement();
				}
				}
				setState(290);
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
	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JavaScriptParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(JavaScriptParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitDefaultClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitDefaultClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_defaultClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(DEFAULT);
			setState(292);
			match(COLON);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8791018664395307294L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 263336265729L) != 0)) {
				{
				{
				setState(293);
				statement();
				}
				}
				setState(298);
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
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(JavaScriptParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaScriptParser.SEMICOLON, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_throwStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(THROW);
			setState(300);
			expression();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(301);
				match(SEMICOLON);
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
	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(JavaScriptParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext catchProduction() {
			return getRuleContext(CatchProductionContext.class,0);
		}
		public FinallyProductionContext finallyProduction() {
			return getRuleContext(FinallyProductionContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(TRY);
			setState(305);
			block();
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATCH:
				{
				setState(306);
				catchProduction();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(307);
					finallyProduction();
					}
				}

				}
				break;
			case FINALLY:
				{
				setState(310);
				finallyProduction();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class CatchProductionContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode CATCH() { return getToken(JavaScriptParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(JavaScriptParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(JavaScriptParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterCatchProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitCatchProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitCatchProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_catchProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(CATCH);
			setState(314);
			match(LPAREN);
			setState(315);
			((CatchProductionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(316);
			match(RPAREN);
			setState(317);
			block();

			        addSymbol(((CatchProductionContext)_localctx).IDENTIFIER.getText(), "exception", ((CatchProductionContext)_localctx).IDENTIFIER.getLine(), ((CatchProductionContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class FinallyProductionContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(JavaScriptParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterFinallyProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitFinallyProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitFinallyProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(FINALLY);
			setState(321);
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
	public static class DebuggerStatementContext extends ParserRuleContext {
		public TerminalNode DEBUGGER() { return getToken(JavaScriptParser.DEBUGGER, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaScriptParser.SEMICOLON, 0); }
		public DebuggerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debuggerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterDebuggerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitDebuggerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitDebuggerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebuggerStatementContext debuggerStatement() throws RecognitionException {
		DebuggerStatementContext _localctx = new DebuggerStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_debuggerStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(DEBUGGER);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(324);
				match(SEMICOLON);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode FUNCTION() { return getToken(JavaScriptParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(JavaScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaScriptParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(JavaScriptParser.ASYNC, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionDeclaration);
		int _la;
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(FUNCTION);
				setState(328);
				((FunctionDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(329);
				match(LPAREN);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(330);
					formalParameterList();
					}
				}

				setState(333);
				match(RPAREN);
				setState(334);
				block();

				        addSymbol(((FunctionDeclarationContext)_localctx).IDENTIFIER.getText(), "function", ((FunctionDeclarationContext)_localctx).IDENTIFIER.getLine(), ((FunctionDeclarationContext)_localctx).IDENTIFIER.getCharPositionInLine());
				    
				}
				break;
			case ASYNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(ASYNC);
				setState(338);
				match(FUNCTION);
				setState(339);
				((FunctionDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(340);
				match(LPAREN);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(341);
					formalParameterList();
					}
				}

				setState(344);
				match(RPAREN);
				setState(345);
				block();

				        addSymbol(((FunctionDeclarationContext)_localctx).IDENTIFIER.getText(), "async_function", ((FunctionDeclarationContext)_localctx).IDENTIFIER.getLine(), ((FunctionDeclarationContext)_localctx).IDENTIFIER.getCharPositionInLine());
				    
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
	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaScriptParser.COMMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			formalParameter();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(351);
				match(COMMA);
				setState(352);
				formalParameter();
				}
				}
				setState(357);
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
	public static class FormalParameterContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaScriptParser.ASSIGN, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((FormalParameterContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(359);
				match(ASSIGN);
				setState(360);
				assignmentExpression();
				}
			}


			        addSymbol(((FormalParameterContext)_localctx).IDENTIFIER.getText(), "parameter", ((FormalParameterContext)_localctx).IDENTIFIER.getLine(), ((FormalParameterContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode CLASS() { return getToken(JavaScriptParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaScriptParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(JavaScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaScriptParser.RBRACE, 0); }
		public TerminalNode EXTENDS() { return getToken(JavaScriptParser.EXTENDS, 0); }
		public List<ClassElementContext> classElement() {
			return getRuleContexts(ClassElementContext.class);
		}
		public ClassElementContext classElement(int i) {
			return getRuleContext(ClassElementContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(CLASS);
			setState(366);
			((ClassDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(367);
				match(EXTENDS);
				setState(368);
				((ClassDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				}
			}

			setState(371);
			match(LBRACE);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASYNC || _la==STATIC || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 45L) != 0)) {
				{
				{
				setState(372);
				classElement();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(RBRACE);

			        addSymbol(((ClassDeclarationContext)_localctx).IDENTIFIER.getText(), "class", ((ClassDeclarationContext)_localctx).IDENTIFIER.getLine(), ((ClassDeclarationContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class ClassElementContext extends ParserRuleContext {
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaScriptParser.ASSIGN, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaScriptParser.STATIC, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaScriptParser.SEMICOLON, 0); }
		public ClassElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterClassElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitClassElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitClassElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassElementContext classElement() throws RecognitionException {
		ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_classElement);
		int _la;
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				methodDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(382);
					match(STATIC);
					}
				}

				setState(385);
				propertyName();
				setState(386);
				match(ASSIGN);
				setState(387);
				assignmentExpression();
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(388);
					match(SEMICOLON);
					}
				}

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
	public static class MethodDefinitionContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaScriptParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaScriptParser.STATIC, 0); }
		public TerminalNode ASYNC() { return getToken(JavaScriptParser.ASYNC, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(393);
				match(STATIC);
				}
			}

			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(396);
				match(ASYNC);
				}
			}

			setState(399);
			propertyName();
			setState(400);
			match(LPAREN);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(401);
				formalParameterList();
				}
			}

			setState(404);
			match(RPAREN);
			setState(405);
			block();

			        // Method name handling would need more complex logic for computed property names
			    
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
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaScriptParser.COMMA, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			assignmentExpression();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(409);
				match(COMMA);
				setState(410);
				assignmentExpression();
				}
				}
				setState(415);
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
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public LeftHandSideExpressionContext leftHandSideExpression() {
			return getRuleContext(LeftHandSideExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignmentExpression);
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				arrowFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				leftHandSideExpression();
				setState(419);
				assignmentOperator();
				setState(420);
				assignmentExpression();
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
	public static class ArrowFunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public TerminalNode ARROW() { return getToken(JavaScriptParser.ARROW, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaScriptParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrowFunction);
		int _la;
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(IDENTIFIER);
				setState(425);
				match(ARROW);
				setState(426);
				assignmentExpression();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(LPAREN);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(428);
					formalParameterList();
					}
				}

				setState(431);
				match(RPAREN);
				setState(432);
				match(ARROW);
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(433);
					assignmentExpression();
					}
					break;
				case 2:
					{
					setState(434);
					block();
					}
					break;
				}
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
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(JavaScriptParser.ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(JavaScriptParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JavaScriptParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JavaScriptParser.MOD_ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(JavaScriptParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(JavaScriptParser.MINUS_ASSIGN, 0); }
		public TerminalNode LEFT_SHIFT_ASSIGN() { return getToken(JavaScriptParser.LEFT_SHIFT_ASSIGN, 0); }
		public TerminalNode RIGHT_SHIFT_ASSIGN() { return getToken(JavaScriptParser.RIGHT_SHIFT_ASSIGN, 0); }
		public TerminalNode UNSIGNED_RIGHT_SHIFT_ASSIGN() { return getToken(JavaScriptParser.UNSIGNED_RIGHT_SHIFT_ASSIGN, 0); }
		public TerminalNode BIT_AND_ASSIGN() { return getToken(JavaScriptParser.BIT_AND_ASSIGN, 0); }
		public TerminalNode BIT_XOR_ASSIGN() { return getToken(JavaScriptParser.BIT_XOR_ASSIGN, 0); }
		public TerminalNode BIT_OR_ASSIGN() { return getToken(JavaScriptParser.BIT_OR_ASSIGN, 0); }
		public TerminalNode POWER_ASSIGN() { return getToken(JavaScriptParser.POWER_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 144097595889811456L) != 0)) ) {
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
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JavaScriptParser.QUESTION, 0); }
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(JavaScriptParser.COLON, 0); }
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			binaryExpression(0);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(442);
				match(QUESTION);
				setState(443);
				assignmentExpression();
				setState(444);
				match(COLON);
				setState(445);
				assignmentExpression();
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
	public static class BinaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public List<BinaryExpressionContext> binaryExpression() {
			return getRuleContexts(BinaryExpressionContext.class);
		}
		public BinaryExpressionContext binaryExpression(int i) {
			return getRuleContext(BinaryExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(JavaScriptParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(JavaScriptParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JavaScriptParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(JavaScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JavaScriptParser.MINUS, 0); }
		public TerminalNode LEFT_SHIFT() { return getToken(JavaScriptParser.LEFT_SHIFT, 0); }
		public TerminalNode RIGHT_SHIFT() { return getToken(JavaScriptParser.RIGHT_SHIFT, 0); }
		public TerminalNode UNSIGNED_RIGHT_SHIFT() { return getToken(JavaScriptParser.UNSIGNED_RIGHT_SHIFT, 0); }
		public TerminalNode LT() { return getToken(JavaScriptParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaScriptParser.GT, 0); }
		public TerminalNode LE() { return getToken(JavaScriptParser.LE, 0); }
		public TerminalNode GE() { return getToken(JavaScriptParser.GE, 0); }
		public TerminalNode INSTANCEOF() { return getToken(JavaScriptParser.INSTANCEOF, 0); }
		public TerminalNode IN() { return getToken(JavaScriptParser.IN, 0); }
		public TerminalNode EQ() { return getToken(JavaScriptParser.EQ, 0); }
		public TerminalNode NE() { return getToken(JavaScriptParser.NE, 0); }
		public TerminalNode STRICT_EQ() { return getToken(JavaScriptParser.STRICT_EQ, 0); }
		public TerminalNode STRICT_NE() { return getToken(JavaScriptParser.STRICT_NE, 0); }
		public TerminalNode BIT_AND() { return getToken(JavaScriptParser.BIT_AND, 0); }
		public TerminalNode BIT_XOR() { return getToken(JavaScriptParser.BIT_XOR, 0); }
		public TerminalNode BIT_OR() { return getToken(JavaScriptParser.BIT_OR, 0); }
		public TerminalNode AND() { return getToken(JavaScriptParser.AND, 0); }
		public TerminalNode OR() { return getToken(JavaScriptParser.OR, 0); }
		public TerminalNode NULLISH_COALESCING() { return getToken(JavaScriptParser.NULLISH_COALESCING, 0); }
		public BinaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionContext binaryExpression() throws RecognitionException {
		return binaryExpression(0);
	}

	private BinaryExpressionContext binaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BinaryExpressionContext _localctx = new BinaryExpressionContext(_ctx, _parentState);
		BinaryExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_binaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(450);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(485);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(452);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(453);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4035225266123964416L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(454);
						binaryExpression(12);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(455);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(456);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(457);
						binaryExpression(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(458);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(459);
						_la = _input.LA(1);
						if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(460);
						binaryExpression(10);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(461);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(462);
						_la = _input.LA(1);
						if ( !(((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 16888498602639363L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(463);
						binaryExpression(9);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(464);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(465);
						_la = _input.LA(1);
						if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 15L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(466);
						binaryExpression(8);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(467);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(468);
						match(BIT_AND);
						setState(469);
						binaryExpression(7);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(470);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(471);
						match(BIT_XOR);
						setState(472);
						binaryExpression(6);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(473);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(474);
						match(BIT_OR);
						setState(475);
						binaryExpression(5);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(476);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(477);
						match(AND);
						setState(478);
						binaryExpression(4);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(479);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(480);
						match(OR);
						setState(481);
						binaryExpression(3);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(482);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(483);
						match(NULLISH_COALESCING);
						setState(484);
						binaryExpression(2);
						}
						break;
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(JavaScriptParser.DELETE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaScriptParser.VOID, 0); }
		public TerminalNode TYPEOF() { return getToken(JavaScriptParser.TYPEOF, 0); }
		public TerminalNode INCREMENT() { return getToken(JavaScriptParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(JavaScriptParser.DECREMENT, 0); }
		public TerminalNode PLUS() { return getToken(JavaScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JavaScriptParser.MINUS, 0); }
		public TerminalNode BIT_NOT() { return getToken(JavaScriptParser.BIT_NOT, 0); }
		public TerminalNode NOT() { return getToken(JavaScriptParser.NOT, 0); }
		public TerminalNode AWAIT() { return getToken(JavaScriptParser.AWAIT, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unaryExpression);
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case NEW:
			case THIS:
			case ASYNC:
			case TRUE:
			case FALSE:
			case NULL:
			case TEMPLATE_STRING_START:
			case LPAREN:
			case LBRACE:
			case LBRACKET:
			case NUMBER_LITERAL:
			case STRING_LITERAL:
			case REGEX_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				postfixExpression();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(DELETE);
				setState(492);
				unaryExpression();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				match(VOID);
				setState(494);
				unaryExpression();
				}
				break;
			case TYPEOF:
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
				match(TYPEOF);
				setState(496);
				unaryExpression();
				}
				break;
			case INCREMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(497);
				match(INCREMENT);
				setState(498);
				unaryExpression();
				}
				break;
			case DECREMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(499);
				match(DECREMENT);
				setState(500);
				unaryExpression();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 7);
				{
				setState(501);
				match(PLUS);
				setState(502);
				unaryExpression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 8);
				{
				setState(503);
				match(MINUS);
				setState(504);
				unaryExpression();
				}
				break;
			case BIT_NOT:
				enterOuterAlt(_localctx, 9);
				{
				setState(505);
				match(BIT_NOT);
				setState(506);
				unaryExpression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 10);
				{
				setState(507);
				match(NOT);
				setState(508);
				unaryExpression();
				}
				break;
			case AWAIT:
				enterOuterAlt(_localctx, 11);
				{
				setState(509);
				match(AWAIT);
				setState(510);
				unaryExpression();
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
	public static class PostfixExpressionContext extends ParserRuleContext {
		public LeftHandSideExpressionContext leftHandSideExpression() {
			return getRuleContext(LeftHandSideExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(JavaScriptParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(JavaScriptParser.DECREMENT, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_postfixExpression);
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				leftHandSideExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				leftHandSideExpression();
				setState(515);
				match(INCREMENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				leftHandSideExpression();
				setState(518);
				match(DECREMENT);
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
	public static class LeftHandSideExpressionContext extends ParserRuleContext {
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public LeftHandSideExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSideExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLeftHandSideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLeftHandSideExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitLeftHandSideExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideExpressionContext leftHandSideExpression() throws RecognitionException {
		LeftHandSideExpressionContext _localctx = new LeftHandSideExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_leftHandSideExpression);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				newExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				callExpression(0);
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
	public static class NewExpressionContext extends ParserRuleContext {
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JavaScriptParser.NEW, 0); }
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_newExpression);
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				memberExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				match(NEW);
				setState(528);
				newExpression();
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
	public static class MemberExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JavaScriptParser.NEW, 0); }
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(JavaScriptParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(JavaScriptParser.RBRACKET, 0); }
		public TerminalNode DOT() { return getToken(JavaScriptParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public TerminalNode OPTIONAL_CHAINING() { return getToken(JavaScriptParser.OPTIONAL_CHAINING, 0); }
		public MemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitMemberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberExpressionContext memberExpression() throws RecognitionException {
		return memberExpression(0);
	}

	private MemberExpressionContext memberExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberExpressionContext _localctx = new MemberExpressionContext(_ctx, _parentState);
		MemberExpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_memberExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case THIS:
			case ASYNC:
			case TRUE:
			case FALSE:
			case NULL:
			case TEMPLATE_STRING_START:
			case LPAREN:
			case LBRACE:
			case LBRACKET:
			case NUMBER_LITERAL:
			case STRING_LITERAL:
			case REGEX_LITERAL:
			case IDENTIFIER:
				{
				setState(532);
				primaryExpression();
				}
				break;
			case NEW:
				{
				setState(533);
				match(NEW);
				setState(534);
				memberExpression(0);
				setState(535);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(550);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new MemberExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_memberExpression);
						setState(539);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(540);
						match(LBRACKET);
						setState(541);
						expression();
						setState(542);
						match(RBRACKET);
						}
						break;
					case 2:
						{
						_localctx = new MemberExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_memberExpression);
						setState(544);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(545);
						match(DOT);
						setState(546);
						match(IDENTIFIER);
						}
						break;
					case 3:
						{
						_localctx = new MemberExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_memberExpression);
						setState(547);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(548);
						match(OPTIONAL_CHAINING);
						setState(549);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallExpressionContext extends ParserRuleContext {
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(JavaScriptParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(JavaScriptParser.RBRACKET, 0); }
		public TerminalNode DOT() { return getToken(JavaScriptParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public TerminalNode OPTIONAL_CHAINING() { return getToken(JavaScriptParser.OPTIONAL_CHAINING, 0); }
		public CallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallExpressionContext callExpression() throws RecognitionException {
		return callExpression(0);
	}

	private CallExpressionContext callExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CallExpressionContext _localctx = new CallExpressionContext(_ctx, _parentState);
		CallExpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_callExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(556);
			memberExpression(0);
			setState(557);
			arguments();
			}
			_ctx.stop = _input.LT(-1);
			setState(574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(572);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new CallExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_callExpression);
						setState(559);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(560);
						arguments();
						}
						break;
					case 2:
						{
						_localctx = new CallExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_callExpression);
						setState(561);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(562);
						match(LBRACKET);
						setState(563);
						expression();
						setState(564);
						match(RBRACKET);
						}
						break;
					case 3:
						{
						_localctx = new CallExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_callExpression);
						setState(566);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(567);
						match(DOT);
						setState(568);
						match(IDENTIFIER);
						}
						break;
					case 4:
						{
						_localctx = new CallExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_callExpression);
						setState(569);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(570);
						match(OPTIONAL_CHAINING);
						setState(571);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaScriptParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(LPAREN);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8791018670210874880L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 263336265729L) != 0)) {
				{
				setState(578);
				argumentList();
				}
			}

			setState(581);
			match(RPAREN);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaScriptParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			assignmentExpression();
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(584);
				match(COMMA);
				setState(585);
				assignmentExpression();
				}
				}
				setState(590);
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode THIS() { return getToken(JavaScriptParser.THIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaScriptParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaScriptParser.RPAREN, 0); }
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primaryExpression);
		try {
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(THIS);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				((PrimaryExpressionContext)_localctx).IDENTIFIER = match(IDENTIFIER);

				        checkVariableUsage(((PrimaryExpressionContext)_localctx).IDENTIFIER.getText(), ((PrimaryExpressionContext)_localctx).IDENTIFIER.getLine(), ((PrimaryExpressionContext)_localctx).IDENTIFIER.getCharPositionInLine());
				    
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case TEMPLATE_STRING_START:
			case NUMBER_LITERAL:
			case STRING_LITERAL:
			case REGEX_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				literal();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(595);
				arrayLiteral();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(596);
				objectLiteral();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(597);
				match(LPAREN);
				setState(598);
				expression();
				setState(599);
				match(RPAREN);
				}
				break;
			case FUNCTION:
			case ASYNC:
				enterOuterAlt(_localctx, 7);
				{
				setState(601);
				functionExpression();
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
	public static class FunctionExpressionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(JavaScriptParser.FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(JavaScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaScriptParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(JavaScriptParser.ASYNC, 0); }
		public FunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExpressionContext functionExpression() throws RecognitionException {
		FunctionExpressionContext _localctx = new FunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_functionExpression);
		int _la;
		try {
			setState(625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				match(FUNCTION);
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(605);
					match(IDENTIFIER);
					}
				}

				setState(608);
				match(LPAREN);
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(609);
					formalParameterList();
					}
				}

				setState(612);
				match(RPAREN);
				setState(613);
				block();
				}
				break;
			case ASYNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(ASYNC);
				setState(615);
				match(FUNCTION);
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(616);
					match(IDENTIFIER);
					}
				}

				setState(619);
				match(LPAREN);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(620);
					formalParameterList();
					}
				}

				setState(623);
				match(RPAREN);
				setState(624);
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(JavaScriptParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(JavaScriptParser.RBRACKET, 0); }
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaScriptParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(LBRACKET);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8791018670210874880L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 263336265729L) != 0)) {
				{
				setState(628);
				assignmentExpression();
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(629);
					match(COMMA);
					setState(630);
					assignmentExpression();
					}
					}
					setState(635);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(638);
			match(RBRACKET);
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
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaScriptParser.RBRACE, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaScriptParser.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(LBRACE);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 45L) != 0)) {
				{
				setState(641);
				propertyAssignment();
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(642);
					match(COMMA);
					setState(643);
					propertyAssignment();
					}
					}
					setState(648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(651);
			match(RBRACE);
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
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaScriptParser.COLON, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaScriptParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_propertyAssignment);
		int _la;
		try {
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				propertyName();
				setState(654);
				match(COLON);
				setState(655);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				propertyName();
				setState(658);
				match(LPAREN);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(659);
					formalParameterList();
					}
				}

				setState(662);
				match(RPAREN);
				setState(663);
				block();
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
	public static class PropertyNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaScriptParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JavaScriptParser.STRING_LITERAL, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(JavaScriptParser.NUMBER_LITERAL, 0); }
		public TerminalNode LBRACKET() { return getToken(JavaScriptParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(JavaScriptParser.RBRACKET, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_propertyName);
		try {
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				match(STRING_LITERAL);
				}
				break;
			case NUMBER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(669);
				match(NUMBER_LITERAL);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(670);
				match(LBRACKET);
				setState(671);
				expression();
				setState(672);
				match(RBRACKET);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(JavaScriptParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(JavaScriptParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JavaScriptParser.FALSE, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(JavaScriptParser.NUMBER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JavaScriptParser.STRING_LITERAL, 0); }
		public TerminalNode REGEX_LITERAL() { return getToken(JavaScriptParser.REGEX_LITERAL, 0); }
		public TemplateLiteralContext templateLiteral() {
			return getRuleContext(TemplateLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_literal);
		try {
			setState(683);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				match(NULL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(678);
				match(FALSE);
				}
				break;
			case NUMBER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(679);
				match(NUMBER_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(680);
				match(STRING_LITERAL);
				}
				break;
			case REGEX_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(681);
				match(REGEX_LITERAL);
				}
				break;
			case TEMPLATE_STRING_START:
				enterOuterAlt(_localctx, 7);
				{
				setState(682);
				templateLiteral();
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
	public static class TemplateLiteralContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_STRING_START() { return getToken(JavaScriptParser.TEMPLATE_STRING_START, 0); }
		public TerminalNode TEMPLATE_STRING_END() { return getToken(JavaScriptParser.TEMPLATE_STRING_END, 0); }
		public List<TemplateElementContext> templateElement() {
			return getRuleContexts(TemplateElementContext.class);
		}
		public TemplateElementContext templateElement(int i) {
			return getRuleContext(TemplateElementContext.class,i);
		}
		public TemplateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterTemplateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitTemplateLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitTemplateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateLiteralContext templateLiteral() throws RecognitionException {
		TemplateLiteralContext _localctx = new TemplateLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_templateLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(TEMPLATE_STRING_START);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE_EXPRESSION_START || _la==TEMPLATE_STRING_PART) {
				{
				{
				setState(686);
				templateElement();
				}
				}
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(692);
			match(TEMPLATE_STRING_END);
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
	public static class TemplateElementContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_STRING_PART() { return getToken(JavaScriptParser.TEMPLATE_STRING_PART, 0); }
		public TerminalNode TEMPLATE_EXPRESSION_START() { return getToken(JavaScriptParser.TEMPLATE_EXPRESSION_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaScriptParser.RBRACE, 0); }
		public TemplateElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterTemplateElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitTemplateElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitTemplateElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateElementContext templateElement() throws RecognitionException {
		TemplateElementContext _localctx = new TemplateElementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_templateElement);
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE_STRING_PART:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				match(TEMPLATE_STRING_PART);
				}
				break;
			case TEMPLATE_EXPRESSION_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				match(TEMPLATE_EXPRESSION_START);
				setState(696);
				expression();
				setState(697);
				match(RBRACE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31:
			return binaryExpression_sempred((BinaryExpressionContext)_localctx, predIndex);
		case 36:
			return memberExpression_sempred((MemberExpressionContext)_localctx, predIndex);
		case 37:
			return callExpression_sempred((CallExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean binaryExpression_sempred(BinaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberExpression_sempred(MemberExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean callExpression_sempred(CallExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001k\u02be\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0005\u0000"+
		"d\b\u0000\n\u0000\f\u0000g\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001n\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002|\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u0080\b\u0003\n\u0003\f\u0003\u0083"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u008b\b\u0004\n\u0004\f\u0004\u008e\t\u0004\u0001\u0004"+
		"\u0003\u0004\u0091\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u0097\b\u0004\n\u0004\f\u0004\u009a\t\u0004\u0001\u0004\u0003"+
		"\u0004\u009d\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00a3\b\u0004\n\u0004\f\u0004\u00a6\t\u0004\u0001\u0004\u0003\u0004"+
		"\u00a9\b\u0004\u0003\u0004\u00ab\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00b0\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00b6\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00bf\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c8\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d7\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00dd\b\b\u0001\b\u0003\b\u00e0\b\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00ee\b\b\u0001\t\u0001\t\u0003\t\u00f2\b\t\u0001\t\u0003\t"+
		"\u00f5\b\t\u0001\n\u0001\n\u0003\n\u00f9\b\n\u0001\n\u0003\n\u00fc\b\n"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0100\b\u000b\u0001\u000b\u0003\u000b"+
		"\u0103\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f"+
		"\u010b\b\f\n\f\f\f\u010e\t\f\u0001\f\u0003\f\u0111\b\f\u0001\f\u0005\f"+
		"\u0114\b\f\n\f\f\f\u0117\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u011f\b\r\n\r\f\r\u0122\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0127\b\u000e\n\u000e\f\u000e\u012a\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u012f\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0135\b\u0010\u0001\u0010\u0003\u0010\u0138"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0146\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u014c\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0157\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u015d\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0162"+
		"\b\u0015\n\u0015\f\u0015\u0165\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u016a\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u0172\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u0176\b\u0017\n\u0017\f\u0017\u0179\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0180\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0186\b\u0018\u0003"+
		"\u0018\u0188\b\u0018\u0001\u0019\u0003\u0019\u018b\b\u0019\u0001\u0019"+
		"\u0003\u0019\u018e\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0193\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u019c\b\u001a\n\u001a\f\u001a\u019f"+
		"\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u01a7\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u01ae\b\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u01b4\b\u001c\u0003\u001c\u01b6\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u01c0\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01e6\b\u001f"+
		"\n\u001f\f\u001f\u01e9\t\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0200\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u0209\b!\u0001\"\u0001\"\u0003\""+
		"\u020d\b\"\u0001#\u0001#\u0001#\u0003#\u0212\b#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u021a\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u0227\b$\n$\f$\u022a\t$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u023d\b%\n%\f%\u0240"+
		"\t%\u0001&\u0001&\u0003&\u0244\b&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0005\'\u024b\b\'\n\'\f\'\u024e\t\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u025b\b(\u0001)\u0001"+
		")\u0003)\u025f\b)\u0001)\u0001)\u0003)\u0263\b)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u026a\b)\u0001)\u0001)\u0003)\u026e\b)\u0001)\u0001)\u0003"+
		")\u0272\b)\u0001*\u0001*\u0001*\u0001*\u0005*\u0278\b*\n*\f*\u027b\t*"+
		"\u0003*\u027d\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0005+\u0285"+
		"\b+\n+\f+\u0288\t+\u0003+\u028a\b+\u0001+\u0001+\u0001,\u0001,\u0001,"+
		"\u0001,\u0001,\u0001,\u0001,\u0003,\u0295\b,\u0001,\u0001,\u0001,\u0003"+
		",\u029a\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02a3"+
		"\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u02ac\b.\u0001"+
		"/\u0001/\u0005/\u02b0\b/\n/\f/\u02b3\t/\u0001/\u0001/\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u02bc\b0\u00010\u0000\u0003>HJ1\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`\u0000\b\u0003\u0000\u0005\u0005\u0015"+
		"\u0015\u001e\u001e\u0002\u0000\u0013\u0013&&\u0001\u0000,8\u0001\u0000"+
		";=\u0001\u00009:\u0001\u0000PR\u0002\u0000\u0013\u0014EH\u0001\u0000A"+
		"D\u0310\u0000e\u0001\u0000\u0000\u0000\u0002m\u0001\u0000\u0000\u0000"+
		"\u0004{\u0001\u0000\u0000\u0000\u0006}\u0001\u0000\u0000\u0000\b\u00aa"+
		"\u0001\u0000\u0000\u0000\n\u00ac\u0001\u0000\u0000\u0000\f\u00b3\u0001"+
		"\u0000\u0000\u0000\u000e\u00b7\u0001\u0000\u0000\u0000\u0010\u00ed\u0001"+
		"\u0000\u0000\u0000\u0012\u00ef\u0001\u0000\u0000\u0000\u0014\u00f6\u0001"+
		"\u0000\u0000\u0000\u0016\u00fd\u0001\u0000\u0000\u0000\u0018\u0104\u0001"+
		"\u0000\u0000\u0000\u001a\u011a\u0001\u0000\u0000\u0000\u001c\u0123\u0001"+
		"\u0000\u0000\u0000\u001e\u012b\u0001\u0000\u0000\u0000 \u0130\u0001\u0000"+
		"\u0000\u0000\"\u0139\u0001\u0000\u0000\u0000$\u0140\u0001\u0000\u0000"+
		"\u0000&\u0143\u0001\u0000\u0000\u0000(\u015c\u0001\u0000\u0000\u0000*"+
		"\u015e\u0001\u0000\u0000\u0000,\u0166\u0001\u0000\u0000\u0000.\u016d\u0001"+
		"\u0000\u0000\u00000\u0187\u0001\u0000\u0000\u00002\u018a\u0001\u0000\u0000"+
		"\u00004\u0198\u0001\u0000\u0000\u00006\u01a6\u0001\u0000\u0000\u00008"+
		"\u01b5\u0001\u0000\u0000\u0000:\u01b7\u0001\u0000\u0000\u0000<\u01b9\u0001"+
		"\u0000\u0000\u0000>\u01c1\u0001\u0000\u0000\u0000@\u01ff\u0001\u0000\u0000"+
		"\u0000B\u0208\u0001\u0000\u0000\u0000D\u020c\u0001\u0000\u0000\u0000F"+
		"\u0211\u0001\u0000\u0000\u0000H\u0219\u0001\u0000\u0000\u0000J\u022b\u0001"+
		"\u0000\u0000\u0000L\u0241\u0001\u0000\u0000\u0000N\u0247\u0001\u0000\u0000"+
		"\u0000P\u025a\u0001\u0000\u0000\u0000R\u0271\u0001\u0000\u0000\u0000T"+
		"\u0273\u0001\u0000\u0000\u0000V\u0280\u0001\u0000\u0000\u0000X\u0299\u0001"+
		"\u0000\u0000\u0000Z\u02a2\u0001\u0000\u0000\u0000\\\u02ab\u0001\u0000"+
		"\u0000\u0000^\u02ad\u0001\u0000\u0000\u0000`\u02bb\u0001\u0000\u0000\u0000"+
		"bd\u0003\u0002\u0001\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0005\u0000\u0000\u0001i\u0001"+
		"\u0001\u0000\u0000\u0000jn\u0003\u0004\u0002\u0000kn\u0003(\u0014\u0000"+
		"ln\u0003.\u0017\u0000mj\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000n\u0003\u0001\u0000\u0000\u0000o|\u0003\u0006"+
		"\u0003\u0000p|\u0003\b\u0004\u0000q|\u0003\f\u0006\u0000r|\u0003\u000e"+
		"\u0007\u0000s|\u0003\u0010\b\u0000t|\u0003\u0012\t\u0000u|\u0003\u0014"+
		"\n\u0000v|\u0003\u0016\u000b\u0000w|\u0003\u0018\f\u0000x|\u0003\u001e"+
		"\u000f\u0000y|\u0003 \u0010\u0000z|\u0003&\u0013\u0000{o\u0001\u0000\u0000"+
		"\u0000{p\u0001\u0000\u0000\u0000{q\u0001\u0000\u0000\u0000{r\u0001\u0000"+
		"\u0000\u0000{s\u0001\u0000\u0000\u0000{t\u0001\u0000\u0000\u0000{u\u0001"+
		"\u0000\u0000\u0000{v\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000"+
		"{x\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000"+
		"\u0000|\u0005\u0001\u0000\u0000\u0000}\u0081\u0005^\u0000\u0000~\u0080"+
		"\u0003\u0004\u0002\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005_\u0000\u0000\u0085\u0007\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005\u001e\u0000\u0000\u0087\u008c\u0003\n\u0005"+
		"\u0000\u0088\u0089\u0005V\u0000\u0000\u0089\u008b\u0003\n\u0005\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008f\u0091\u0005U\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u00ab\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005\u0015\u0000\u0000\u0093\u0098\u0003\n\u0005\u0000\u0094\u0095"+
		"\u0005V\u0000\u0000\u0095\u0097\u0003\n\u0005\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009c\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009d\u0005"+
		"U\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009d\u00ab\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0005"+
		"\u0000\u0000\u009f\u00a4\u0003\n\u0005\u0000\u00a0\u00a1\u0005V\u0000"+
		"\u0000\u00a1\u00a3\u0003\n\u0005\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a9\u0005U\u0000\u0000\u00a8"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ab\u0001\u0000\u0000\u0000\u00aa\u0086\u0001\u0000\u0000\u0000\u00aa"+
		"\u0092\u0001\u0000\u0000\u0000\u00aa\u009e\u0001\u0000\u0000\u0000\u00ab"+
		"\t\u0001\u0000\u0000\u0000\u00ac\u00af\u0005e\u0000\u0000\u00ad\u00ae"+
		"\u0005,\u0000\u0000\u00ae\u00b0\u00036\u001b\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0006\u0005\uffff\uffff\u0000\u00b2\u000b\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b5\u00034\u001a\u0000\u00b4\u00b6\u0005U\u0000"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\r\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0011\u0000\u0000"+
		"\u00b8\u00b9\u0005\\\u0000\u0000\u00b9\u00ba\u00034\u001a\u0000\u00ba"+
		"\u00bb\u0005]\u0000\u0000\u00bb\u00be\u0003\u0004\u0002\u0000\u00bc\u00bd"+
		"\u0005\u000b\u0000\u0000\u00bd\u00bf\u0003\u0004\u0002\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u000f"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\n\u0000\u0000\u00c1\u00c2\u0003"+
		"\u0004\u0002\u0000\u00c2\u00c3\u0005 \u0000\u0000\u00c3\u00c4\u0005\\"+
		"\u0000\u0000\u00c4\u00c5\u00034\u001a\u0000\u00c5\u00c7\u0005]\u0000\u0000"+
		"\u00c6\u00c8\u0005U\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ee\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0005 \u0000\u0000\u00ca\u00cb\u0005\\\u0000\u0000\u00cb\u00cc"+
		"\u00034\u001a\u0000\u00cc\u00cd\u0005]\u0000\u0000\u00cd\u00ce\u0003\u0004"+
		"\u0002\u0000\u00ce\u00ee\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u000f"+
		"\u0000\u0000\u00d0\u00d6\u0005\\\u0000\u0000\u00d1\u00d7\u0003\b\u0004"+
		"\u0000\u00d2\u00d3\u00034\u001a\u0000\u00d3\u00d4\u0005U\u0000\u0000\u00d4"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d7\u0005U\u0000\u0000\u00d6\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00dc\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u00034\u001a\u0000\u00d9\u00da\u0005U\u0000\u0000\u00da\u00dd\u0001\u0000"+
		"\u0000\u0000\u00db\u00dd\u0005U\u0000\u0000\u00dc\u00d8\u0001\u0000\u0000"+
		"\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000"+
		"\u0000\u00de\u00e0\u00034\u001a\u0000\u00df\u00de\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0005]\u0000\u0000\u00e2\u00ee\u0003\u0004\u0002\u0000\u00e3"+
		"\u00e4\u0005\u000f\u0000\u0000\u00e4\u00e5\u0005\\\u0000\u0000\u00e5\u00e6"+
		"\u0007\u0000\u0000\u0000\u00e6\u00e7\u0005e\u0000\u0000\u00e7\u00e8\u0007"+
		"\u0001\u0000\u0000\u00e8\u00e9\u00034\u001a\u0000\u00e9\u00ea\u0005]\u0000"+
		"\u0000\u00ea\u00eb\u0003\u0004\u0002\u0000\u00eb\u00ec\u0006\b\uffff\uffff"+
		"\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00c0\u0001\u0000\u0000"+
		"\u0000\u00ed\u00c9\u0001\u0000\u0000\u0000\u00ed\u00cf\u0001\u0000\u0000"+
		"\u0000\u00ed\u00e3\u0001\u0000\u0000\u0000\u00ee\u0011\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f1\u0005\u0006\u0000\u0000\u00f0\u00f2\u0005e\u0000\u0000"+
		"\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f5\u0005U\u0000\u0000\u00f4"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5"+
		"\u0013\u0001\u0000\u0000\u0000\u00f6\u00f8\u0005\u0001\u0000\u0000\u00f7"+
		"\u00f9\u0005e\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00fc"+
		"\u0005U\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u0015\u0001\u0000\u0000\u0000\u00fd\u00ff\u0005"+
		"\u0017\u0000\u0000\u00fe\u0100\u00034\u001a\u0000\u00ff\u00fe\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000"+
		"\u0000\u0000\u0101\u0103\u0005U\u0000\u0000\u0102\u0101\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0017\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0005\u0019\u0000\u0000\u0105\u0106\u0005\\\u0000\u0000"+
		"\u0106\u0107\u00034\u001a\u0000\u0107\u0108\u0005]\u0000\u0000\u0108\u010c"+
		"\u0005^\u0000\u0000\u0109\u010b\u0003\u001a\r\u0000\u010a\u0109\u0001"+
		"\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u0110\u0001"+
		"\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0111\u0003"+
		"\u001c\u000e\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110\u0111\u0001"+
		"\u0000\u0000\u0000\u0111\u0115\u0001\u0000\u0000\u0000\u0112\u0114\u0003"+
		"\u001a\r\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000"+
		"\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0005_\u0000\u0000\u0119\u0019\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0005\u0002\u0000\u0000\u011b\u011c\u00034\u001a\u0000"+
		"\u011c\u0120\u0005Y\u0000\u0000\u011d\u011f\u0003\u0004\u0002\u0000\u011e"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121"+
		"\u001b\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0005\b\u0000\u0000\u0124\u0128\u0005Y\u0000\u0000\u0125\u0127"+
		"\u0003\u0004\u0002\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u012a"+
		"\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0001\u0000\u0000\u0000\u0129\u001d\u0001\u0000\u0000\u0000\u012a\u0128"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u001b\u0000\u0000\u012c\u012e"+
		"\u00034\u001a\u0000\u012d\u012f\u0005U\u0000\u0000\u012e\u012d\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u001f\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0005\u001c\u0000\u0000\u0131\u0137\u0003\u0006"+
		"\u0003\u0000\u0132\u0134\u0003\"\u0011\u0000\u0133\u0135\u0003$\u0012"+
		"\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0138\u0003$\u0012\u0000"+
		"\u0137\u0132\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000"+
		"\u0138!\u0001\u0000\u0000\u0000\u0139\u013a\u0005\u0003\u0000\u0000\u013a"+
		"\u013b\u0005\\\u0000\u0000\u013b\u013c\u0005e\u0000\u0000\u013c\u013d"+
		"\u0005]\u0000\u0000\u013d\u013e\u0003\u0006\u0003\u0000\u013e\u013f\u0006"+
		"\u0011\uffff\uffff\u0000\u013f#\u0001\u0000\u0000\u0000\u0140\u0141\u0005"+
		"\u000e\u0000\u0000\u0141\u0142\u0003\u0006\u0003\u0000\u0142%\u0001\u0000"+
		"\u0000\u0000\u0143\u0145\u0005\u0007\u0000\u0000\u0144\u0146\u0005U\u0000"+
		"\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000"+
		"\u0000\u0146\'\u0001\u0000\u0000\u0000\u0147\u0148\u0005\u0010\u0000\u0000"+
		"\u0148\u0149\u0005e\u0000\u0000\u0149\u014b\u0005\\\u0000\u0000\u014a"+
		"\u014c\u0003*\u0015\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0005]\u0000\u0000\u014e\u014f\u0003\u0006\u0003\u0000\u014f\u0150\u0006"+
		"\u0014\uffff\uffff\u0000\u0150\u015d\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0005#\u0000\u0000\u0152\u0153\u0005\u0010\u0000\u0000\u0153\u0154\u0005"+
		"e\u0000\u0000\u0154\u0156\u0005\\\u0000\u0000\u0155\u0157\u0003*\u0015"+
		"\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0005]\u0000\u0000"+
		"\u0159\u015a\u0003\u0006\u0003\u0000\u015a\u015b\u0006\u0014\uffff\uffff"+
		"\u0000\u015b\u015d\u0001\u0000\u0000\u0000\u015c\u0147\u0001\u0000\u0000"+
		"\u0000\u015c\u0151\u0001\u0000\u0000\u0000\u015d)\u0001\u0000\u0000\u0000"+
		"\u015e\u0163\u0003,\u0016\u0000\u015f\u0160\u0005V\u0000\u0000\u0160\u0162"+
		"\u0003,\u0016\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0165\u0001"+
		"\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164+\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000"+
		"\u0000\u0000\u0166\u0169\u0005e\u0000\u0000\u0167\u0168\u0005,\u0000\u0000"+
		"\u0168\u016a\u00036\u001b\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0006\u0016\uffff\uffff\u0000\u016c-\u0001\u0000\u0000\u0000\u016d"+
		"\u016e\u0005\u0004\u0000\u0000\u016e\u0171\u0005e\u0000\u0000\u016f\u0170"+
		"\u0005\r\u0000\u0000\u0170\u0172\u0005e\u0000\u0000\u0171\u016f\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0001"+
		"\u0000\u0000\u0000\u0173\u0177\u0005^\u0000\u0000\u0174\u0176\u00030\u0018"+
		"\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000\u0000"+
		"\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000"+
		"\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0005_\u0000\u0000\u017b\u017c\u0006\u0017\uffff\uffff"+
		"\u0000\u017c/\u0001\u0000\u0000\u0000\u017d\u0188\u00032\u0019\u0000\u017e"+
		"\u0180\u0005\'\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0003Z-\u0000\u0182\u0183\u0005,\u0000\u0000\u0183\u0185\u00036\u001b"+
		"\u0000\u0184\u0186\u0005U\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0188\u0001\u0000\u0000\u0000"+
		"\u0187\u017d\u0001\u0000\u0000\u0000\u0187\u017f\u0001\u0000\u0000\u0000"+
		"\u01881\u0001\u0000\u0000\u0000\u0189\u018b\u0005\'\u0000\u0000\u018a"+
		"\u0189\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b"+
		"\u018d\u0001\u0000\u0000\u0000\u018c\u018e\u0005#\u0000\u0000\u018d\u018c"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0003Z-\u0000\u0190\u0192\u0005\\"+
		"\u0000\u0000\u0191\u0193\u0003*\u0015\u0000\u0192\u0191\u0001\u0000\u0000"+
		"\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0005]\u0000\u0000\u0195\u0196\u0003\u0006\u0003\u0000"+
		"\u0196\u0197\u0006\u0019\uffff\uffff\u0000\u01973\u0001\u0000\u0000\u0000"+
		"\u0198\u019d\u00036\u001b\u0000\u0199\u019a\u0005V\u0000\u0000\u019a\u019c"+
		"\u00036\u001b\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019f\u0001"+
		"\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001"+
		"\u0000\u0000\u0000\u019e5\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a7\u0003<\u001e\u0000\u01a1\u01a7\u00038\u001c\u0000"+
		"\u01a2\u01a3\u0003D\"\u0000\u01a3\u01a4\u0003:\u001d\u0000\u01a4\u01a5"+
		"\u00036\u001b\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a1\u0001\u0000\u0000\u0000\u01a6\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a77\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005e\u0000"+
		"\u0000\u01a9\u01aa\u0005S\u0000\u0000\u01aa\u01b6\u00036\u001b\u0000\u01ab"+
		"\u01ad\u0005\\\u0000\u0000\u01ac\u01ae\u0003*\u0015\u0000\u01ad\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0005]\u0000\u0000\u01b0\u01b3\u0005"+
		"S\u0000\u0000\u01b1\u01b4\u00036\u001b\u0000\u01b2\u01b4\u0003\u0006\u0003"+
		"\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01a8\u0001\u0000\u0000"+
		"\u0000\u01b5\u01ab\u0001\u0000\u0000\u0000\u01b69\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0007\u0002\u0000\u0000\u01b8;\u0001\u0000\u0000\u0000\u01b9"+
		"\u01bf\u0003>\u001f\u0000\u01ba\u01bb\u0005X\u0000\u0000\u01bb\u01bc\u0003"+
		"6\u001b\u0000\u01bc\u01bd\u0005Y\u0000\u0000\u01bd\u01be\u00036\u001b"+
		"\u0000\u01be\u01c0\u0001\u0000\u0000\u0000\u01bf\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0=\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\u0006\u001f\uffff\uffff\u0000\u01c2\u01c3\u0003@ \u0000\u01c3"+
		"\u01e7\u0001\u0000\u0000\u0000\u01c4\u01c5\n\u000b\u0000\u0000\u01c5\u01c6"+
		"\u0007\u0003\u0000\u0000\u01c6\u01e6\u0003>\u001f\f\u01c7\u01c8\n\n\u0000"+
		"\u0000\u01c8\u01c9\u0007\u0004\u0000\u0000\u01c9\u01e6\u0003>\u001f\u000b"+
		"\u01ca\u01cb\n\t\u0000\u0000\u01cb\u01cc\u0007\u0005\u0000\u0000\u01cc"+
		"\u01e6\u0003>\u001f\n\u01cd\u01ce\n\b\u0000\u0000\u01ce\u01cf\u0007\u0006"+
		"\u0000\u0000\u01cf\u01e6\u0003>\u001f\t\u01d0\u01d1\n\u0007\u0000\u0000"+
		"\u01d1\u01d2\u0007\u0007\u0000\u0000\u01d2\u01e6\u0003>\u001f\b\u01d3"+
		"\u01d4\n\u0006\u0000\u0000\u01d4\u01d5\u0005L\u0000\u0000\u01d5\u01e6"+
		"\u0003>\u001f\u0007\u01d6\u01d7\n\u0005\u0000\u0000\u01d7\u01d8\u0005"+
		"N\u0000\u0000\u01d8\u01e6\u0003>\u001f\u0006\u01d9\u01da\n\u0004\u0000"+
		"\u0000\u01da\u01db\u0005M\u0000\u0000\u01db\u01e6\u0003>\u001f\u0005\u01dc"+
		"\u01dd\n\u0003\u0000\u0000\u01dd\u01de\u0005I\u0000\u0000\u01de\u01e6"+
		"\u0003>\u001f\u0004\u01df\u01e0\n\u0002\u0000\u0000\u01e0\u01e1\u0005"+
		"J\u0000\u0000\u01e1\u01e6\u0003>\u001f\u0003\u01e2\u01e3\n\u0001\u0000"+
		"\u0000\u01e3\u01e4\u0005[\u0000\u0000\u01e4\u01e6\u0003>\u001f\u0002\u01e5"+
		"\u01c4\u0001\u0000\u0000\u0000\u01e5\u01c7\u0001\u0000\u0000\u0000\u01e5"+
		"\u01ca\u0001\u0000\u0000\u0000\u01e5\u01cd\u0001\u0000\u0000\u0000\u01e5"+
		"\u01d0\u0001\u0000\u0000\u0000\u01e5\u01d3\u0001\u0000\u0000\u0000\u01e5"+
		"\u01d6\u0001\u0000\u0000\u0000\u01e5\u01d9\u0001\u0000\u0000\u0000\u01e5"+
		"\u01dc\u0001\u0000\u0000\u0000\u01e5\u01df\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8"+
		"?\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea\u0200"+
		"\u0003B!\u0000\u01eb\u01ec\u0005\t\u0000\u0000\u01ec\u0200\u0003@ \u0000"+
		"\u01ed\u01ee\u0005\u001f\u0000\u0000\u01ee\u0200\u0003@ \u0000\u01ef\u01f0"+
		"\u0005\u001d\u0000\u0000\u01f0\u0200\u0003@ \u0000\u01f1\u01f2\u0005?"+
		"\u0000\u0000\u01f2\u0200\u0003@ \u0000\u01f3\u01f4\u0005@\u0000\u0000"+
		"\u01f4\u0200\u0003@ \u0000\u01f5\u01f6\u00059\u0000\u0000\u01f6\u0200"+
		"\u0003@ \u0000\u01f7\u01f8\u0005:\u0000\u0000\u01f8\u0200\u0003@ \u0000"+
		"\u01f9\u01fa\u0005O\u0000\u0000\u01fa\u0200\u0003@ \u0000\u01fb\u01fc"+
		"\u0005K\u0000\u0000\u01fc\u0200\u0003@ \u0000\u01fd\u01fe\u0005$\u0000"+
		"\u0000\u01fe\u0200\u0003@ \u0000\u01ff\u01ea\u0001\u0000\u0000\u0000\u01ff"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ff\u01ed\u0001\u0000\u0000\u0000\u01ff"+
		"\u01ef\u0001\u0000\u0000\u0000\u01ff\u01f1\u0001\u0000\u0000\u0000\u01ff"+
		"\u01f3\u0001\u0000\u0000\u0000\u01ff\u01f5\u0001\u0000\u0000\u0000\u01ff"+
		"\u01f7\u0001\u0000\u0000\u0000\u01ff\u01f9\u0001\u0000\u0000\u0000\u01ff"+
		"\u01fb\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200"+
		"A\u0001\u0000\u0000\u0000\u0201\u0209\u0003D\"\u0000\u0202\u0203\u0003"+
		"D\"\u0000\u0203\u0204\u0005?\u0000\u0000\u0204\u0209\u0001\u0000\u0000"+
		"\u0000\u0205\u0206\u0003D\"\u0000\u0206\u0207\u0005@\u0000\u0000\u0207"+
		"\u0209\u0001\u0000\u0000\u0000\u0208\u0201\u0001\u0000\u0000\u0000\u0208"+
		"\u0202\u0001\u0000\u0000\u0000\u0208\u0205\u0001\u0000\u0000\u0000\u0209"+
		"C\u0001\u0000\u0000\u0000\u020a\u020d\u0003F#\u0000\u020b\u020d\u0003"+
		"J%\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020b\u0001\u0000\u0000"+
		"\u0000\u020dE\u0001\u0000\u0000\u0000\u020e\u0212\u0003H$\u0000\u020f"+
		"\u0210\u0005\u0016\u0000\u0000\u0210\u0212\u0003F#\u0000\u0211\u020e\u0001"+
		"\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0212G\u0001\u0000"+
		"\u0000\u0000\u0213\u0214\u0006$\uffff\uffff\u0000\u0214\u021a\u0003P("+
		"\u0000\u0215\u0216\u0005\u0016\u0000\u0000\u0216\u0217\u0003H$\u0000\u0217"+
		"\u0218\u0003L&\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219\u0213\u0001"+
		"\u0000\u0000\u0000\u0219\u0215\u0001\u0000\u0000\u0000\u021a\u0228\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\n\u0004\u0000\u0000\u021c\u021d\u0005`"+
		"\u0000\u0000\u021d\u021e\u00034\u001a\u0000\u021e\u021f\u0005a\u0000\u0000"+
		"\u021f\u0227\u0001\u0000\u0000\u0000\u0220\u0221\n\u0003\u0000\u0000\u0221"+
		"\u0222\u0005W\u0000\u0000\u0222\u0227\u0005e\u0000\u0000\u0223\u0224\n"+
		"\u0002\u0000\u0000\u0224\u0225\u0005Z\u0000\u0000\u0225\u0227\u0005e\u0000"+
		"\u0000\u0226\u021b\u0001\u0000\u0000\u0000\u0226\u0220\u0001\u0000\u0000"+
		"\u0000\u0226\u0223\u0001\u0000\u0000\u0000\u0227\u022a\u0001\u0000\u0000"+
		"\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000"+
		"\u0000\u0229I\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0006%\uffff\uffff\u0000\u022c\u022d\u0003H$\u0000\u022d"+
		"\u022e\u0003L&\u0000\u022e\u023e\u0001\u0000\u0000\u0000\u022f\u0230\n"+
		"\u0004\u0000\u0000\u0230\u023d\u0003L&\u0000\u0231\u0232\n\u0003\u0000"+
		"\u0000\u0232\u0233\u0005`\u0000\u0000\u0233\u0234\u00034\u001a\u0000\u0234"+
		"\u0235\u0005a\u0000\u0000\u0235\u023d\u0001\u0000\u0000\u0000\u0236\u0237"+
		"\n\u0002\u0000\u0000\u0237\u0238\u0005W\u0000\u0000\u0238\u023d\u0005"+
		"e\u0000\u0000\u0239\u023a\n\u0001\u0000\u0000\u023a\u023b\u0005Z\u0000"+
		"\u0000\u023b\u023d\u0005e\u0000\u0000\u023c\u022f\u0001\u0000\u0000\u0000"+
		"\u023c\u0231\u0001\u0000\u0000\u0000\u023c\u0236\u0001\u0000\u0000\u0000"+
		"\u023c\u0239\u0001\u0000\u0000\u0000\u023d\u0240\u0001\u0000\u0000\u0000"+
		"\u023e\u023c\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000"+
		"\u023fK\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0241"+
		"\u0243\u0005\\\u0000\u0000\u0242\u0244\u0003N\'\u0000\u0243\u0242\u0001"+
		"\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0245\u0001"+
		"\u0000\u0000\u0000\u0245\u0246\u0005]\u0000\u0000\u0246M\u0001\u0000\u0000"+
		"\u0000\u0247\u024c\u00036\u001b\u0000\u0248\u0249\u0005V\u0000\u0000\u0249"+
		"\u024b\u00036\u001b\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024b\u024e"+
		"\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024c\u024d"+
		"\u0001\u0000\u0000\u0000\u024dO\u0001\u0000\u0000\u0000\u024e\u024c\u0001"+
		"\u0000\u0000\u0000\u024f\u025b\u0005\u001a\u0000\u0000\u0250\u0251\u0005"+
		"e\u0000\u0000\u0251\u025b\u0006(\uffff\uffff\u0000\u0252\u025b\u0003\\"+
		".\u0000\u0253\u025b\u0003T*\u0000\u0254\u025b\u0003V+\u0000\u0255\u0256"+
		"\u0005\\\u0000\u0000\u0256\u0257\u00034\u001a\u0000\u0257\u0258\u0005"+
		"]\u0000\u0000\u0258\u025b\u0001\u0000\u0000\u0000\u0259\u025b\u0003R)"+
		"\u0000\u025a\u024f\u0001\u0000\u0000\u0000\u025a\u0250\u0001\u0000\u0000"+
		"\u0000\u025a\u0252\u0001\u0000\u0000\u0000\u025a\u0253\u0001\u0000\u0000"+
		"\u0000\u025a\u0254\u0001\u0000\u0000\u0000\u025a\u0255\u0001\u0000\u0000"+
		"\u0000\u025a\u0259\u0001\u0000\u0000\u0000\u025bQ\u0001\u0000\u0000\u0000"+
		"\u025c\u025e\u0005\u0010\u0000\u0000\u025d\u025f\u0005e\u0000\u0000\u025e"+
		"\u025d\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f"+
		"\u0260\u0001\u0000\u0000\u0000\u0260\u0262\u0005\\\u0000\u0000\u0261\u0263"+
		"\u0003*\u0015\u0000\u0262\u0261\u0001\u0000\u0000\u0000\u0262\u0263\u0001"+
		"\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264\u0265\u0005"+
		"]\u0000\u0000\u0265\u0272\u0003\u0006\u0003\u0000\u0266\u0267\u0005#\u0000"+
		"\u0000\u0267\u0269\u0005\u0010\u0000\u0000\u0268\u026a\u0005e\u0000\u0000"+
		"\u0269\u0268\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000"+
		"\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026d\u0005\\\u0000\u0000\u026c"+
		"\u026e\u0003*\u0015\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026d\u026e"+
		"\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0270"+
		"\u0005]\u0000\u0000\u0270\u0272\u0003\u0006\u0003\u0000\u0271\u025c\u0001"+
		"\u0000\u0000\u0000\u0271\u0266\u0001\u0000\u0000\u0000\u0272S\u0001\u0000"+
		"\u0000\u0000\u0273\u027c\u0005`\u0000\u0000\u0274\u0279\u00036\u001b\u0000"+
		"\u0275\u0276\u0005V\u0000\u0000\u0276\u0278\u00036\u001b\u0000\u0277\u0275"+
		"\u0001\u0000\u0000\u0000\u0278\u027b\u0001\u0000\u0000\u0000\u0279\u0277"+
		"\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u027d"+
		"\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027c\u0274"+
		"\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u027e"+
		"\u0001\u0000\u0000\u0000\u027e\u027f\u0005a\u0000\u0000\u027fU\u0001\u0000"+
		"\u0000\u0000\u0280\u0289\u0005^\u0000\u0000\u0281\u0286\u0003X,\u0000"+
		"\u0282\u0283\u0005V\u0000\u0000\u0283\u0285\u0003X,\u0000\u0284\u0282"+
		"\u0001\u0000\u0000\u0000\u0285\u0288\u0001\u0000\u0000\u0000\u0286\u0284"+
		"\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u028a"+
		"\u0001\u0000\u0000\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0289\u0281"+
		"\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028b"+
		"\u0001\u0000\u0000\u0000\u028b\u028c\u0005_\u0000\u0000\u028cW\u0001\u0000"+
		"\u0000\u0000\u028d\u028e\u0003Z-\u0000\u028e\u028f\u0005Y\u0000\u0000"+
		"\u028f\u0290\u00036\u001b\u0000\u0290\u029a\u0001\u0000\u0000\u0000\u0291"+
		"\u0292\u0003Z-\u0000\u0292\u0294\u0005\\\u0000\u0000\u0293\u0295\u0003"+
		"*\u0015\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000"+
		"\u0000\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u0297\u0005]\u0000"+
		"\u0000\u0297\u0298\u0003\u0006\u0003\u0000\u0298\u029a\u0001\u0000\u0000"+
		"\u0000\u0299\u028d\u0001\u0000\u0000\u0000\u0299\u0291\u0001\u0000\u0000"+
		"\u0000\u029aY\u0001\u0000\u0000\u0000\u029b\u02a3\u0005e\u0000\u0000\u029c"+
		"\u02a3\u0005c\u0000\u0000\u029d\u02a3\u0005b\u0000\u0000\u029e\u029f\u0005"+
		"`\u0000\u0000\u029f\u02a0\u00034\u001a\u0000\u02a0\u02a1\u0005a\u0000"+
		"\u0000\u02a1\u02a3\u0001\u0000\u0000\u0000\u02a2\u029b\u0001\u0000\u0000"+
		"\u0000\u02a2\u029c\u0001\u0000\u0000\u0000\u02a2\u029d\u0001\u0000\u0000"+
		"\u0000\u02a2\u029e\u0001\u0000\u0000\u0000\u02a3[\u0001\u0000\u0000\u0000"+
		"\u02a4\u02ac\u0005*\u0000\u0000\u02a5\u02ac\u0005(\u0000\u0000\u02a6\u02ac"+
		"\u0005)\u0000\u0000\u02a7\u02ac\u0005b\u0000\u0000\u02a8\u02ac\u0005c"+
		"\u0000\u0000\u02a9\u02ac\u0005d\u0000\u0000\u02aa\u02ac\u0003^/\u0000"+
		"\u02ab\u02a4\u0001\u0000\u0000\u0000\u02ab\u02a5\u0001\u0000\u0000\u0000"+
		"\u02ab\u02a6\u0001\u0000\u0000\u0000\u02ab\u02a7\u0001\u0000\u0000\u0000"+
		"\u02ab\u02a8\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000"+
		"\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ac]\u0001\u0000\u0000\u0000\u02ad"+
		"\u02b1\u0005T\u0000\u0000\u02ae\u02b0\u0003`0\u0000\u02af\u02ae\u0001"+
		"\u0000\u0000\u0000\u02b0\u02b3\u0001\u0000\u0000\u0000\u02b1\u02af\u0001"+
		"\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b4\u0001"+
		"\u0000\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b4\u02b5\u0005"+
		"i\u0000\u0000\u02b5_\u0001\u0000\u0000\u0000\u02b6\u02bc\u0005k\u0000"+
		"\u0000\u02b7\u02b8\u0005j\u0000\u0000\u02b8\u02b9\u00034\u001a\u0000\u02b9"+
		"\u02ba\u0005_\u0000\u0000\u02ba\u02bc\u0001\u0000\u0000\u0000\u02bb\u02b6"+
		"\u0001\u0000\u0000\u0000\u02bb\u02b7\u0001\u0000\u0000\u0000\u02bca\u0001"+
		"\u0000\u0000\u0000Rem{\u0081\u008c\u0090\u0098\u009c\u00a4\u00a8\u00aa"+
		"\u00af\u00b5\u00be\u00c7\u00d6\u00dc\u00df\u00ed\u00f1\u00f4\u00f8\u00fb"+
		"\u00ff\u0102\u010c\u0110\u0115\u0120\u0128\u012e\u0134\u0137\u0145\u014b"+
		"\u0156\u015c\u0163\u0169\u0171\u0177\u017f\u0185\u0187\u018a\u018d\u0192"+
		"\u019d\u01a6\u01ad\u01b3\u01b5\u01bf\u01e5\u01e7\u01ff\u0208\u020c\u0211"+
		"\u0219\u0226\u0228\u023c\u023e\u0243\u024c\u025a\u025e\u0262\u0269\u026d"+
		"\u0271\u0279\u027c\u0286\u0289\u0294\u0299\u02a2\u02ab\u02b1\u02bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}