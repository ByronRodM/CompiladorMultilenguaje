// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/cpp/CPlusPlusParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.cpp;

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
public class CPlusPlusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AUTO=1, BREAK=2, CASE=3, CHAR=4, CONST=5, CONTINUE=6, DEFAULT=7, DO=8, 
		DOUBLE=9, ELSE=10, ENUM=11, EXTERN=12, FLOAT=13, FOR=14, GOTO=15, IF=16, 
		INT=17, LONG=18, REGISTER=19, RETURN=20, SHORT=21, SIGNED=22, SIZEOF=23, 
		STATIC=24, STRUCT=25, SWITCH=26, TYPEDEF=27, UNION=28, UNSIGNED=29, VOID=30, 
		VOLATILE=31, WHILE=32, BOOL=33, CLASS=34, NAMESPACE=35, NEW=36, DELETE=37, 
		PRIVATE=38, PUBLIC=39, PROTECTED=40, VIRTUAL=41, THIS=42, TRY=43, CATCH=44, 
		THROW=45, TEMPLATE=46, TYPENAME=47, USING=48, INLINE=49, FRIEND=50, OPERATOR=51, 
		ASSIGN=52, PLUS_ASSIGN=53, MINUS_ASSIGN=54, MULT_ASSIGN=55, DIV_ASSIGN=56, 
		MOD_ASSIGN=57, PLUS=58, MINUS=59, MULT=60, DIV=61, MOD=62, INCREMENT=63, 
		DECREMENT=64, EQ=65, NE=66, LT=67, LE=68, GT=69, GE=70, AND=71, OR=72, 
		NOT=73, BIT_AND=74, BIT_OR=75, BIT_XOR=76, BIT_NOT=77, LEFT_SHIFT=78, 
		RIGHT_SHIFT=79, SEMICOLON=80, COMMA=81, DOT=82, ARROW=83, SCOPE=84, LPAREN=85, 
		RPAREN=86, LBRACE=87, RBRACE=88, LBRACKET=89, RBRACKET=90, QUESTION=91, 
		COLON=92, INTEGER_LITERAL=93, FLOAT_LITERAL=94, CHARACTER_LITERAL=95, 
		STRING_LITERAL=96, IDENTIFIER=97, PREPROCESSOR=98, LINE_COMMENT=99, BLOCK_COMMENT=100, 
		WS=101;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_functionDeclaration = 2, 
		RULE_parameterList = 3, RULE_parameter = 4, RULE_variableDeclaration = 5, 
		RULE_variableDeclarator = 6, RULE_classDeclaration = 7, RULE_classBody = 8, 
		RULE_classMember = 9, RULE_methodDeclaration = 10, RULE_accessSpecifier = 11, 
		RULE_namespaceDeclaration = 12, RULE_usingDeclaration = 13, RULE_type = 14, 
		RULE_primitiveType = 15, RULE_classType = 16, RULE_pointer = 17, RULE_statement = 18, 
		RULE_compoundStatement = 19, RULE_expressionStatement = 20, RULE_declarationStatement = 21, 
		RULE_selectionStatement = 22, RULE_switchSection = 23, RULE_iterationStatement = 24, 
		RULE_jumpStatement = 25, RULE_expression = 26, RULE_assignmentExpression = 27, 
		RULE_assignmentOperator = 28, RULE_conditionalExpression = 29, RULE_logicalOrExpression = 30, 
		RULE_logicalAndExpression = 31, RULE_equalityExpression = 32, RULE_relationalExpression = 33, 
		RULE_shiftExpression = 34, RULE_additiveExpression = 35, RULE_multiplicativeExpression = 36, 
		RULE_unaryExpression = 37, RULE_unaryOperator = 38, RULE_postfixExpression = 39, 
		RULE_postfixSuffix = 40, RULE_primaryExpression = 41, RULE_argumentList = 42, 
		RULE_literal = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "functionDeclaration", "parameterList", "parameter", 
			"variableDeclaration", "variableDeclarator", "classDeclaration", "classBody", 
			"classMember", "methodDeclaration", "accessSpecifier", "namespaceDeclaration", 
			"usingDeclaration", "type", "primitiveType", "classType", "pointer", 
			"statement", "compoundStatement", "expressionStatement", "declarationStatement", 
			"selectionStatement", "switchSection", "iterationStatement", "jumpStatement", 
			"expression", "assignmentExpression", "assignmentOperator", "conditionalExpression", 
			"logicalOrExpression", "logicalAndExpression", "equalityExpression", 
			"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "unaryOperator", "postfixExpression", "postfixSuffix", 
			"primaryExpression", "argumentList", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'auto'", "'break'", "'case'", "'char'", "'const'", "'continue'", 
			"'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", "'float'", 
			"'for'", "'goto'", "'if'", "'int'", "'long'", "'register'", "'return'", 
			"'short'", "'signed'", "'sizeof'", "'static'", "'struct'", "'switch'", 
			"'typedef'", "'union'", "'unsigned'", "'void'", "'volatile'", "'while'", 
			"'bool'", "'class'", "'namespace'", "'new'", "'delete'", "'private'", 
			"'public'", "'protected'", "'virtual'", "'this'", "'try'", "'catch'", 
			"'throw'", "'template'", "'typename'", "'using'", "'inline'", "'friend'", 
			"'operator'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'++'", "'--'", "'=='", "'!='", "'<'", "'<='", "'>'", 
			"'>='", "'&&'", "'||'", "'!'", "'&'", "'|'", "'^'", "'~'", "'<<'", "'>>'", 
			"';'", "','", "'.'", "'->'", "'::'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AUTO", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "DOUBLE", "ELSE", "ENUM", "EXTERN", "FLOAT", "FOR", "GOTO", "IF", 
			"INT", "LONG", "REGISTER", "RETURN", "SHORT", "SIGNED", "SIZEOF", "STATIC", 
			"STRUCT", "SWITCH", "TYPEDEF", "UNION", "UNSIGNED", "VOID", "VOLATILE", 
			"WHILE", "BOOL", "CLASS", "NAMESPACE", "NEW", "DELETE", "PRIVATE", "PUBLIC", 
			"PROTECTED", "VIRTUAL", "THIS", "TRY", "CATCH", "THROW", "TEMPLATE", 
			"TYPENAME", "USING", "INLINE", "FRIEND", "OPERATOR", "ASSIGN", "PLUS_ASSIGN", 
			"MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "INCREMENT", "DECREMENT", "EQ", "NE", "LT", "LE", 
			"GT", "GE", "AND", "OR", "NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", 
			"LEFT_SHIFT", "RIGHT_SHIFT", "SEMICOLON", "COMMA", "DOT", "ARROW", "SCOPE", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "QUESTION", 
			"COLON", "INTEGER_LITERAL", "FLOAT_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL", 
			"IDENTIFIER", "PREPROCESSOR", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
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
	public String getGrammarFileName() { return "CPlusPlusParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private SymbolTable symbolTable = new SymbolTable();
	    private ErrorTable errorTable = new ErrorTable();
	    
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

	public CPlusPlusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CPlusPlusParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281536723558928L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(88);
				declaration();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
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
	public static class DeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public UsingDeclarationContext usingDeclaration() {
			return getRuleContext(UsingDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				namespaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				usingDeclaration();
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CPlusPlusParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CPlusPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CPlusPlusParser.RPAREN, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			type();
			setState(104);
			((FunctionDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(105);
			match(LPAREN);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10207240720L) != 0) || _la==IDENTIFIER) {
				{
				setState(106);
				parameterList();
				}
			}

			setState(109);
			match(RPAREN);
			setState(110);
			compoundStatement();

			        addSymbol(((FunctionDeclarationContext)_localctx).IDENTIFIER.getText(), "function", ((FunctionDeclarationContext)_localctx).IDENTIFIER.getLine(), ((FunctionDeclarationContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CPlusPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CPlusPlusParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			parameter();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(114);
				match(COMMA);
				setState(115);
				parameter();
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
	public static class ParameterContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CPlusPlusParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			type();
			setState(122);
			((ParameterContext)_localctx).IDENTIFIER = match(IDENTIFIER);

			        addSymbol(((ParameterContext)_localctx).IDENTIFIER.getText(), "parameter", ((ParameterContext)_localctx).IDENTIFIER.getLine(), ((ParameterContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(CPlusPlusParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CPlusPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CPlusPlusParser.COMMA, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
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
			setState(125);
			type();
			setState(126);
			variableDeclarator();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(127);
				match(COMMA);
				setState(128);
				variableDeclarator();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(SEMICOLON);
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
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(CPlusPlusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(CPlusPlusParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((VariableDeclaratorContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(137);
				match(ASSIGN);
				setState(138);
				expression();
				}
			}


			        addSymbol(((VariableDeclaratorContext)_localctx).IDENTIFIER.getText(), "variable", ((VariableDeclaratorContext)_localctx).IDENTIFIER.getLine(), ((VariableDeclaratorContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
		public TerminalNode CLASS() { return getToken(CPlusPlusParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CPlusPlusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CPlusPlusParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(CPlusPlusParser.LBRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CPlusPlusParser.RBRACE, 0); }
		public TerminalNode COLON() { return getToken(CPlusPlusParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(CPlusPlusParser.SEMICOLON, 0); }
		public AccessSpecifierContext accessSpecifier() {
			return getRuleContext(AccessSpecifierContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(CLASS);
			setState(144);
			((ClassDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(145);
				match(COLON);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145348608L) != 0)) {
					{
					setState(146);
					accessSpecifier();
					}
				}

				setState(149);
				((ClassDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				}
			}

			setState(152);
			match(LBRACE);
			setState(153);
			classBody();
			setState(154);
			match(RBRACE);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(155);
				match(SEMICOLON);
				}
			}


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
	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1934352589328L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(160);
				classMember();
				}
				}
				setState(165);
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
	public static class ClassMemberContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AccessSpecifierContext accessSpecifier() {
			return getRuleContext(AccessSpecifierContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145348608L) != 0)) {
				{
				setState(166);
				accessSpecifier();
				}
			}

			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(169);
				methodDeclaration();
				}
				break;
			case 2:
				{
				setState(170);
				variableDeclaration();
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CPlusPlusParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CPlusPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CPlusPlusParser.RPAREN, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			type();
			setState(174);
			((MethodDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(175);
			match(LPAREN);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10207240720L) != 0) || _la==IDENTIFIER) {
				{
				setState(176);
				parameterList();
				}
			}

			setState(179);
			match(RPAREN);
			setState(180);
			compoundStatement();

			        addSymbol(((MethodDeclarationContext)_localctx).IDENTIFIER.getText(), "method", ((MethodDeclarationContext)_localctx).IDENTIFIER.getLine(), ((MethodDeclarationContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class AccessSpecifierContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(CPlusPlusParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(CPlusPlusParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(CPlusPlusParser.PROTECTED, 0); }
		public AccessSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterAccessSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitAccessSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitAccessSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessSpecifierContext accessSpecifier() throws RecognitionException {
		AccessSpecifierContext _localctx = new AccessSpecifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_accessSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145348608L) != 0)) ) {
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
	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode NAMESPACE() { return getToken(CPlusPlusParser.NAMESPACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CPlusPlusParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(CPlusPlusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CPlusPlusParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterNamespaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitNamespaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitNamespaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_namespaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(NAMESPACE);
			setState(186);
			((NamespaceDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(187);
			match(LBRACE);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281536723558928L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(188);
				declaration();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(RBRACE);

			        addSymbol(((NamespaceDeclarationContext)_localctx).IDENTIFIER.getText(), "namespace", ((NamespaceDeclarationContext)_localctx).IDENTIFIER.getLine(), ((NamespaceDeclarationContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class UsingDeclarationContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(CPlusPlusParser.USING, 0); }
		public TerminalNode NAMESPACE() { return getToken(CPlusPlusParser.NAMESPACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CPlusPlusParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(CPlusPlusParser.SEMICOLON, 0); }
		public UsingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterUsingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitUsingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitUsingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDeclarationContext usingDeclaration() throws RecognitionException {
		UsingDeclarationContext _localctx = new UsingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_usingDeclaration);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(USING);
				setState(198);
				match(NAMESPACE);
				setState(199);
				match(IDENTIFIER);
				setState(200);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(USING);
				setState(202);
				match(IDENTIFIER);
				setState(203);
				match(SEMICOLON);
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
	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case SIGNED:
			case UNSIGNED:
			case VOID:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				primitiveType();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MULT) {
					{
					setState(207);
					pointer();
					}
				}

				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				classType();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MULT) {
					{
					setState(211);
					pointer();
					}
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
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(CPlusPlusParser.VOID, 0); }
		public TerminalNode BOOL() { return getToken(CPlusPlusParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(CPlusPlusParser.CHAR, 0); }
		public TerminalNode SHORT() { return getToken(CPlusPlusParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(CPlusPlusParser.INT, 0); }
		public TerminalNode LONG() { return getToken(CPlusPlusParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(CPlusPlusParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CPlusPlusParser.DOUBLE, 0); }
		public TerminalNode SIGNED() { return getToken(CPlusPlusParser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(CPlusPlusParser.UNSIGNED, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 10207240720L) != 0)) ) {
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
	public static class ClassTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CPlusPlusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CPlusPlusParser.IDENTIFIER, i);
		}
		public List<TerminalNode> SCOPE() { return getTokens(CPlusPlusParser.SCOPE); }
		public TerminalNode SCOPE(int i) {
			return getToken(CPlusPlusParser.SCOPE, i);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IDENTIFIER);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOPE) {
				{
				{
				setState(219);
				match(SCOPE);
				setState(220);
				match(IDENTIFIER);
				}
				}
				setState(225);
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
	public static class PointerContext extends ParserRuleContext {
		public List<TerminalNode> MULT() { return getTokens(CPlusPlusParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CPlusPlusParser.MULT, i);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(226);
				match(MULT);
				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MULT );
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
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				selectionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				iterationStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				jumpStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(236);
				declarationStatement();
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
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CPlusPlusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CPlusPlusParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(LBRACE);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -7205754991167413420L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 16653559297L) != 0)) {
				{
				{
				setState(240);
				statement();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(CPlusPlusParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -7205755005737893888L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 16645105153L) != 0)) {
				{
				setState(248);
				expression();
				}
			}

			setState(251);
			match(SEMICOLON);
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
	public static class DeclarationStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			variableDeclaration();
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
	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CPlusPlusParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CPlusPlusParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CPlusPlusParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CPlusPlusParser.ELSE, 0); }
		public TerminalNode SWITCH() { return getToken(CPlusPlusParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(CPlusPlusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CPlusPlusParser.RBRACE, 0); }
		public List<SwitchSectionContext> switchSection() {
			return getRuleContexts(SwitchSectionContext.class);
		}
		public SwitchSectionContext switchSection(int i) {
			return getRuleContext(SwitchSectionContext.class,i);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selectionStatement);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(IF);
				setState(256);
				match(LPAREN);
				setState(257);
				expression();
				setState(258);
				match(RPAREN);
				setState(259);
				statement();
				setState(262);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(260);
					match(ELSE);
					setState(261);
					statement();
					}
					break;
				}
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(SWITCH);
				setState(265);
				match(LPAREN);
				setState(266);
				expression();
				setState(267);
				match(RPAREN);
				setState(268);
				match(LBRACE);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(269);
					switchSection();
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(275);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchSectionContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CPlusPlusParser.COLON, 0); }
		public TerminalNode CASE() { return getToken(CPlusPlusParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CPlusPlusParser.DEFAULT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SwitchSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterSwitchSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitSwitchSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitSwitchSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchSectionContext switchSection() throws RecognitionException {
		SwitchSectionContext _localctx = new SwitchSectionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_switchSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				{
				setState(279);
				match(CASE);
				setState(280);
				expression();
				}
				break;
			case DEFAULT:
				{
				setState(281);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(284);
			match(COLON);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -7205754991167413420L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 16653559297L) != 0)) {
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
	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CPlusPlusParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CPlusPlusParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CPlusPlusParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode FOR() { return getToken(CPlusPlusParser.FOR, 0); }
		public TerminalNode SEMICOLON() { return getToken(CPlusPlusParser.SEMICOLON, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public TerminalNode DO() { return getToken(CPlusPlusParser.DO, 0); }
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_iterationStatement);
		int _la;
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(WHILE);
				setState(292);
				match(LPAREN);
				setState(293);
				expression();
				setState(294);
				match(RPAREN);
				setState(295);
				statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(FOR);
				setState(298);
				match(LPAREN);
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(299);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(300);
					expressionStatement();
					}
					break;
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -7205755005737893888L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 16645105153L) != 0)) {
					{
					setState(303);
					expression();
					}
				}

				setState(306);
				match(SEMICOLON);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -7205755005737893888L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 16645105153L) != 0)) {
					{
					setState(307);
					expression();
					}
				}

				setState(310);
				match(RPAREN);
				setState(311);
				statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(DO);
				setState(314);
				statement();
				setState(315);
				match(WHILE);
				setState(316);
				match(LPAREN);
				setState(317);
				expression();
				setState(318);
				match(RPAREN);
				setState(319);
				match(SEMICOLON);
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
	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CPlusPlusParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(CPlusPlusParser.SEMICOLON, 0); }
		public TerminalNode CONTINUE() { return getToken(CPlusPlusParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(CPlusPlusParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode GOTO() { return getToken(CPlusPlusParser.GOTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CPlusPlusParser.IDENTIFIER, 0); }
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jumpStatement);
		int _la;
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(BREAK);
				setState(324);
				match(SEMICOLON);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(CONTINUE);
				setState(326);
				match(SEMICOLON);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				match(RETURN);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -7205755005737893888L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 16645105153L) != 0)) {
					{
					setState(328);
					expression();
					}
				}

				setState(331);
				match(SEMICOLON);
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				match(GOTO);
				setState(333);
				match(IDENTIFIER);
				setState(334);
				match(SEMICOLON);
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
	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			assignmentExpression();
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
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
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
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignmentExpression);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				unaryExpression();
				setState(341);
				assignmentOperator();
				setState(342);
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
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(CPlusPlusParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(CPlusPlusParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(CPlusPlusParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(CPlusPlusParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CPlusPlusParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CPlusPlusParser.MOD_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 283726776524341248L) != 0)) ) {
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
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(CPlusPlusParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CPlusPlusParser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			logicalOrExpression();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(349);
				match(QUESTION);
				setState(350);
				expression();
				setState(351);
				match(COLON);
				setState(352);
				conditionalExpression();
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
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CPlusPlusParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CPlusPlusParser.OR, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			logicalAndExpression();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(357);
				match(OR);
				setState(358);
				logicalAndExpression();
				}
				}
				setState(363);
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
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CPlusPlusParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CPlusPlusParser.AND, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			equalityExpression();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(365);
				match(AND);
				setState(366);
				equalityExpression();
				}
				}
				setState(371);
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
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(CPlusPlusParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(CPlusPlusParser.EQ, i);
		}
		public List<TerminalNode> NE() { return getTokens(CPlusPlusParser.NE); }
		public TerminalNode NE(int i) {
			return getToken(CPlusPlusParser.NE, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			relationalExpression();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NE) {
				{
				{
				setState(373);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(374);
				relationalExpression();
				}
				}
				setState(379);
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
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(CPlusPlusParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CPlusPlusParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CPlusPlusParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CPlusPlusParser.GT, i);
		}
		public List<TerminalNode> LE() { return getTokens(CPlusPlusParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(CPlusPlusParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(CPlusPlusParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(CPlusPlusParser.GE, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			shiftExpression();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 15L) != 0)) {
				{
				{
				setState(381);
				_la = _input.LA(1);
				if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(382);
				shiftExpression();
				}
				}
				setState(387);
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
	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LEFT_SHIFT() { return getTokens(CPlusPlusParser.LEFT_SHIFT); }
		public TerminalNode LEFT_SHIFT(int i) {
			return getToken(CPlusPlusParser.LEFT_SHIFT, i);
		}
		public List<TerminalNode> RIGHT_SHIFT() { return getTokens(CPlusPlusParser.RIGHT_SHIFT); }
		public TerminalNode RIGHT_SHIFT(int i) {
			return getToken(CPlusPlusParser.RIGHT_SHIFT, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			additiveExpression();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_SHIFT || _la==RIGHT_SHIFT) {
				{
				{
				setState(389);
				_la = _input.LA(1);
				if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(390);
				additiveExpression();
				}
				}
				setState(395);
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
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CPlusPlusParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CPlusPlusParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CPlusPlusParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CPlusPlusParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			multiplicativeExpression();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(397);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(398);
				multiplicativeExpression();
				}
				}
				setState(403);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CPlusPlusParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CPlusPlusParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CPlusPlusParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CPlusPlusParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(CPlusPlusParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(CPlusPlusParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			unaryExpression();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247928832L) != 0)) {
				{
				{
				setState(405);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247928832L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(406);
				unaryExpression();
				}
				}
				setState(411);
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
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(CPlusPlusParser.INCREMENT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(CPlusPlusParser.DECREMENT, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(CPlusPlusParser.SIZEOF, 0); }
		public TerminalNode LPAREN() { return getToken(CPlusPlusParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CPlusPlusParser.RPAREN, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unaryExpression);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(INCREMENT);
				setState(414);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				match(DECREMENT);
				setState(416);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				unaryOperator();
				setState(418);
				unaryExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(420);
				match(SIZEOF);
				setState(421);
				unaryExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(422);
				match(SIZEOF);
				setState(423);
				match(LPAREN);
				setState(424);
				type();
				setState(425);
				match(RPAREN);
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
	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode BIT_AND() { return getToken(CPlusPlusParser.BIT_AND, 0); }
		public TerminalNode MULT() { return getToken(CPlusPlusParser.MULT, 0); }
		public TerminalNode PLUS() { return getToken(CPlusPlusParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CPlusPlusParser.MINUS, 0); }
		public TerminalNode BIT_NOT() { return getToken(CPlusPlusParser.BIT_NOT, 0); }
		public TerminalNode NOT() { return getToken(CPlusPlusParser.NOT, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 622599L) != 0)) ) {
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
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<PostfixSuffixContext> postfixSuffix() {
			return getRuleContexts(PostfixSuffixContext.class);
		}
		public PostfixSuffixContext postfixSuffix(int i) {
			return getRuleContext(PostfixSuffixContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			primaryExpression();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 72876035L) != 0)) {
				{
				{
				setState(432);
				postfixSuffix();
				}
				}
				setState(437);
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
	public static class PostfixSuffixContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(CPlusPlusParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(CPlusPlusParser.RBRACKET, 0); }
		public TerminalNode LPAREN() { return getToken(CPlusPlusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CPlusPlusParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CPlusPlusParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CPlusPlusParser.IDENTIFIER, 0); }
		public TerminalNode ARROW() { return getToken(CPlusPlusParser.ARROW, 0); }
		public TerminalNode INCREMENT() { return getToken(CPlusPlusParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(CPlusPlusParser.DECREMENT, 0); }
		public PostfixSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterPostfixSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitPostfixSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitPostfixSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixSuffixContext postfixSuffix() throws RecognitionException {
		PostfixSuffixContext _localctx = new PostfixSuffixContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_postfixSuffix);
		int _la;
		try {
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(LBRACKET);
				setState(439);
				expression();
				setState(440);
				match(RBRACKET);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(LPAREN);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -7205755005737893888L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 16645105153L) != 0)) {
					{
					setState(443);
					argumentList();
					}
				}

				setState(446);
				match(RPAREN);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				match(DOT);
				setState(448);
				match(IDENTIFIER);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				match(ARROW);
				setState(450);
				match(IDENTIFIER);
				}
				break;
			case INCREMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				match(INCREMENT);
				}
				break;
			case DECREMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(452);
				match(DECREMENT);
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CPlusPlusParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CPlusPlusParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CPlusPlusParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(CPlusPlusParser.THIS, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_primaryExpression);
		try {
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(IDENTIFIER);
				}
				break;
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				match(LPAREN);
				setState(458);
				expression();
				setState(459);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				match(THIS);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CPlusPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CPlusPlusParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			expression();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(465);
				match(COMMA);
				setState(466);
				expression();
				}
				}
				setState(471);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(CPlusPlusParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(CPlusPlusParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(CPlusPlusParser.CHARACTER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CPlusPlusParser.STRING_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPlusPlusParserListener ) ((CPlusPlusParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPlusPlusParserVisitor ) return ((CPlusPlusParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 15L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001e\u01db\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0005\u0000"+
		"Z\b\u0000\n\u0000\f\u0000]\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001f\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002l\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003u\b\u0003\n\u0003\f\u0003x\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u0082\b\u0005\n\u0005\f\u0005\u0085\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008c"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0094\b\u0007\u0001\u0007\u0003\u0007\u0097\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009d\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0005\b\u00a2\b\b\n\b\f\b\u00a5\t\b\u0001"+
		"\t\u0003\t\u00a8\b\t\u0001\t\u0001\t\u0003\t\u00ac\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u00b2\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00be\b\f\n"+
		"\f\f\f\u00c1\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00cd\b\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00d1\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d5\b\u000e"+
		"\u0003\u000e\u00d7\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00de\b\u0010\n\u0010\f\u0010\u00e1\t\u0010\u0001"+
		"\u0011\u0004\u0011\u00e4\b\u0011\u000b\u0011\f\u0011\u00e5\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00ee\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u00f2\b\u0013\n\u0013"+
		"\f\u0013\u00f5\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0003\u0014"+
		"\u00fa\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0107\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u010f\b\u0016\n\u0016\f\u0016\u0112"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0116\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u011b\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u011f\b\u0017\n\u0017\f\u0017\u0122\t\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u012e\b\u0018\u0001\u0018\u0003"+
		"\u0018\u0131\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0135\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0142\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u014a\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0150\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0159\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0163\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u0168\b\u001e\n\u001e\f\u001e\u016b\t\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0170\b\u001f\n\u001f\f\u001f"+
		"\u0173\t\u001f\u0001 \u0001 \u0001 \u0005 \u0178\b \n \f \u017b\t \u0001"+
		"!\u0001!\u0001!\u0005!\u0180\b!\n!\f!\u0183\t!\u0001\"\u0001\"\u0001\""+
		"\u0005\"\u0188\b\"\n\"\f\"\u018b\t\"\u0001#\u0001#\u0001#\u0005#\u0190"+
		"\b#\n#\f#\u0193\t#\u0001$\u0001$\u0001$\u0005$\u0198\b$\n$\f$\u019b\t"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01ac\b%\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0005\'\u01b2\b\'\n\'\f\'\u01b5\t\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u01bd\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u01c6\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u01cf\b)\u0001*\u0001*\u0001*\u0005*\u01d4\b*\n*\f*\u01d7\t*"+
		"\u0001+\u0001+\u0001+\u0000\u0000,\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTV\u0000\n\u0001\u0000&(\u0007\u0000\u0004\u0004\t\t\r\r\u0011\u0012"+
		"\u0015\u0016\u001d\u001e!!\u0001\u000049\u0001\u0000AB\u0001\u0000CF\u0001"+
		"\u0000NO\u0001\u0000:;\u0001\u0000<>\u0003\u0000:<IJMM\u0001\u0000]`\u01f3"+
		"\u0000[\u0001\u0000\u0000\u0000\u0002e\u0001\u0000\u0000\u0000\u0004g"+
		"\u0001\u0000\u0000\u0000\u0006q\u0001\u0000\u0000\u0000\by\u0001\u0000"+
		"\u0000\u0000\n}\u0001\u0000\u0000\u0000\f\u0088\u0001\u0000\u0000\u0000"+
		"\u000e\u008f\u0001\u0000\u0000\u0000\u0010\u00a3\u0001\u0000\u0000\u0000"+
		"\u0012\u00a7\u0001\u0000\u0000\u0000\u0014\u00ad\u0001\u0000\u0000\u0000"+
		"\u0016\u00b7\u0001\u0000\u0000\u0000\u0018\u00b9\u0001\u0000\u0000\u0000"+
		"\u001a\u00cc\u0001\u0000\u0000\u0000\u001c\u00d6\u0001\u0000\u0000\u0000"+
		"\u001e\u00d8\u0001\u0000\u0000\u0000 \u00da\u0001\u0000\u0000\u0000\""+
		"\u00e3\u0001\u0000\u0000\u0000$\u00ed\u0001\u0000\u0000\u0000&\u00ef\u0001"+
		"\u0000\u0000\u0000(\u00f9\u0001\u0000\u0000\u0000*\u00fd\u0001\u0000\u0000"+
		"\u0000,\u0115\u0001\u0000\u0000\u0000.\u011a\u0001\u0000\u0000\u00000"+
		"\u0141\u0001\u0000\u0000\u00002\u014f\u0001\u0000\u0000\u00004\u0151\u0001"+
		"\u0000\u0000\u00006\u0158\u0001\u0000\u0000\u00008\u015a\u0001\u0000\u0000"+
		"\u0000:\u015c\u0001\u0000\u0000\u0000<\u0164\u0001\u0000\u0000\u0000>"+
		"\u016c\u0001\u0000\u0000\u0000@\u0174\u0001\u0000\u0000\u0000B\u017c\u0001"+
		"\u0000\u0000\u0000D\u0184\u0001\u0000\u0000\u0000F\u018c\u0001\u0000\u0000"+
		"\u0000H\u0194\u0001\u0000\u0000\u0000J\u01ab\u0001\u0000\u0000\u0000L"+
		"\u01ad\u0001\u0000\u0000\u0000N\u01af\u0001\u0000\u0000\u0000P\u01c5\u0001"+
		"\u0000\u0000\u0000R\u01ce\u0001\u0000\u0000\u0000T\u01d0\u0001\u0000\u0000"+
		"\u0000V\u01d8\u0001\u0000\u0000\u0000XZ\u0003\u0002\u0001\u0000YX\u0001"+
		"\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^_\u0005\u0000\u0000\u0001_\u0001\u0001\u0000\u0000\u0000`f\u0003"+
		"\u0004\u0002\u0000af\u0003\n\u0005\u0000bf\u0003\u000e\u0007\u0000cf\u0003"+
		"\u0018\f\u0000df\u0003\u001a\r\u0000e`\u0001\u0000\u0000\u0000ea\u0001"+
		"\u0000\u0000\u0000eb\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000f\u0003\u0001\u0000\u0000\u0000gh\u0003\u001c"+
		"\u000e\u0000hi\u0005a\u0000\u0000ik\u0005U\u0000\u0000jl\u0003\u0006\u0003"+
		"\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mn\u0005V\u0000\u0000no\u0003&\u0013\u0000op\u0006\u0002\uffff"+
		"\uffff\u0000p\u0005\u0001\u0000\u0000\u0000qv\u0003\b\u0004\u0000rs\u0005"+
		"Q\u0000\u0000su\u0003\b\u0004\u0000tr\u0001\u0000\u0000\u0000ux\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"w\u0007\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0003\u001c"+
		"\u000e\u0000z{\u0005a\u0000\u0000{|\u0006\u0004\uffff\uffff\u0000|\t\u0001"+
		"\u0000\u0000\u0000}~\u0003\u001c\u000e\u0000~\u0083\u0003\f\u0006\u0000"+
		"\u007f\u0080\u0005Q\u0000\u0000\u0080\u0082\u0003\f\u0006\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005P\u0000\u0000\u0087\u000b\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0005a\u0000\u0000\u0089\u008a\u00054\u0000\u0000\u008a\u008c\u00034"+
		"\u001a\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0006\u0006"+
		"\uffff\uffff\u0000\u008e\r\u0001\u0000\u0000\u0000\u008f\u0090\u0005\""+
		"\u0000\u0000\u0090\u0096\u0005a\u0000\u0000\u0091\u0093\u0005\\\u0000"+
		"\u0000\u0092\u0094\u0003\u0016\u000b\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0097\u0005a\u0000\u0000\u0096\u0091\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005W\u0000\u0000\u0099\u009a\u0003\u0010\b\u0000\u009a"+
		"\u009c\u0005X\u0000\u0000\u009b\u009d\u0005P\u0000\u0000\u009c\u009b\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0006\u0007\uffff\uffff\u0000\u009f\u000f"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003\u0012\t\u0000\u00a1\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u0011\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a8\u0003"+
		"\u0016\u000b\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00ac\u0003"+
		"\u0014\n\u0000\u00aa\u00ac\u0003\n\u0005\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u0013\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0003\u001c\u000e\u0000\u00ae\u00af\u0005a\u0000"+
		"\u0000\u00af\u00b1\u0005U\u0000\u0000\u00b0\u00b2\u0003\u0006\u0003\u0000"+
		"\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005V\u0000\u0000\u00b4"+
		"\u00b5\u0003&\u0013\u0000\u00b5\u00b6\u0006\n\uffff\uffff\u0000\u00b6"+
		"\u0015\u0001\u0000\u0000\u0000\u00b7\u00b8\u0007\u0000\u0000\u0000\u00b8"+
		"\u0017\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005#\u0000\u0000\u00ba\u00bb"+
		"\u0005a\u0000\u0000\u00bb\u00bf\u0005W\u0000\u0000\u00bc\u00be\u0003\u0002"+
		"\u0001\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005X\u0000\u0000\u00c3\u00c4\u0006\f\uffff"+
		"\uffff\u0000\u00c4\u0019\u0001\u0000\u0000\u0000\u00c5\u00c6\u00050\u0000"+
		"\u0000\u00c6\u00c7\u0005#\u0000\u0000\u00c7\u00c8\u0005a\u0000\u0000\u00c8"+
		"\u00cd\u0005P\u0000\u0000\u00c9\u00ca\u00050\u0000\u0000\u00ca\u00cb\u0005"+
		"a\u0000\u0000\u00cb\u00cd\u0005P\u0000\u0000\u00cc\u00c5\u0001\u0000\u0000"+
		"\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cd\u001b\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d0\u0003\u001e\u000f\u0000\u00cf\u00d1\u0003\"\u0011\u0000"+
		"\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d7\u0001\u0000\u0000\u0000\u00d2\u00d4\u0003 \u0010\u0000\u00d3"+
		"\u00d5\u0003\"\u0011\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d7\u001d"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0007\u0001\u0000\u0000\u00d9\u001f"+
		"\u0001\u0000\u0000\u0000\u00da\u00df\u0005a\u0000\u0000\u00db\u00dc\u0005"+
		"T\u0000\u0000\u00dc\u00de\u0005a\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0!\u0001\u0000\u0000\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e4\u0005<\u0000\u0000\u00e3"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6"+
		"#\u0001\u0000\u0000\u0000\u00e7\u00ee\u0003&\u0013\u0000\u00e8\u00ee\u0003"+
		"(\u0014\u0000\u00e9\u00ee\u0003,\u0016\u0000\u00ea\u00ee\u00030\u0018"+
		"\u0000\u00eb\u00ee\u00032\u0019\u0000\u00ec\u00ee\u0003*\u0015\u0000\u00ed"+
		"\u00e7\u0001\u0000\u0000\u0000\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ed"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee"+
		"%\u0001\u0000\u0000\u0000\u00ef\u00f3\u0005W\u0000\u0000\u00f0\u00f2\u0003"+
		"$\u0012\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005X\u0000\u0000\u00f7\'\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fa\u00034\u001a\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0005P\u0000\u0000\u00fc)\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0003\n\u0005\u0000\u00fe+\u0001\u0000\u0000\u0000\u00ff\u0100\u0005"+
		"\u0010\u0000\u0000\u0100\u0101\u0005U\u0000\u0000\u0101\u0102\u00034\u001a"+
		"\u0000\u0102\u0103\u0005V\u0000\u0000\u0103\u0106\u0003$\u0012\u0000\u0104"+
		"\u0105\u0005\n\u0000\u0000\u0105\u0107\u0003$\u0012\u0000\u0106\u0104"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0116"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u001a\u0000\u0000\u0109\u010a"+
		"\u0005U\u0000\u0000\u010a\u010b\u00034\u001a\u0000\u010b\u010c\u0005V"+
		"\u0000\u0000\u010c\u0110\u0005W\u0000\u0000\u010d\u010f\u0003.\u0017\u0000"+
		"\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000"+
		"\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000"+
		"\u0111\u0113\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0005X\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115"+
		"\u00ff\u0001\u0000\u0000\u0000\u0115\u0108\u0001\u0000\u0000\u0000\u0116"+
		"-\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u0003\u0000\u0000\u0118\u011b"+
		"\u00034\u001a\u0000\u0119\u011b\u0005\u0007\u0000\u0000\u011a\u0117\u0001"+
		"\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u0120\u0005\\\u0000\u0000\u011d\u011f\u0003$"+
		"\u0012\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121/\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0005 \u0000\u0000\u0124\u0125\u0005U\u0000\u0000\u0125"+
		"\u0126\u00034\u001a\u0000\u0126\u0127\u0005V\u0000\u0000\u0127\u0128\u0003"+
		"$\u0012\u0000\u0128\u0142\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u000e"+
		"\u0000\u0000\u012a\u012d\u0005U\u0000\u0000\u012b\u012e\u0003\n\u0005"+
		"\u0000\u012c\u012e\u0003(\u0014\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012d\u012c\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000"+
		"\u012f\u0131\u00034\u001a\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\u0134\u0005P\u0000\u0000\u0133\u0135\u00034\u001a\u0000\u0134\u0133\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005V\u0000\u0000\u0137\u0138\u0003$\u0012"+
		"\u0000\u0138\u0142\u0001\u0000\u0000\u0000\u0139\u013a\u0005\b\u0000\u0000"+
		"\u013a\u013b\u0003$\u0012\u0000\u013b\u013c\u0005 \u0000\u0000\u013c\u013d"+
		"\u0005U\u0000\u0000\u013d\u013e\u00034\u001a\u0000\u013e\u013f\u0005V"+
		"\u0000\u0000\u013f\u0140\u0005P\u0000\u0000\u0140\u0142\u0001\u0000\u0000"+
		"\u0000\u0141\u0123\u0001\u0000\u0000\u0000\u0141\u0129\u0001\u0000\u0000"+
		"\u0000\u0141\u0139\u0001\u0000\u0000\u0000\u01421\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0005\u0002\u0000\u0000\u0144\u0150\u0005P\u0000\u0000\u0145"+
		"\u0146\u0005\u0006\u0000\u0000\u0146\u0150\u0005P\u0000\u0000\u0147\u0149"+
		"\u0005\u0014\u0000\u0000\u0148\u014a\u00034\u001a\u0000\u0149\u0148\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0001"+
		"\u0000\u0000\u0000\u014b\u0150\u0005P\u0000\u0000\u014c\u014d\u0005\u000f"+
		"\u0000\u0000\u014d\u014e\u0005a\u0000\u0000\u014e\u0150\u0005P\u0000\u0000"+
		"\u014f\u0143\u0001\u0000\u0000\u0000\u014f\u0145\u0001\u0000\u0000\u0000"+
		"\u014f\u0147\u0001\u0000\u0000\u0000\u014f\u014c\u0001\u0000\u0000\u0000"+
		"\u01503\u0001\u0000\u0000\u0000\u0151\u0152\u00036\u001b\u0000\u01525"+
		"\u0001\u0000\u0000\u0000\u0153\u0159\u0003:\u001d\u0000\u0154\u0155\u0003"+
		"J%\u0000\u0155\u0156\u00038\u001c\u0000\u0156\u0157\u00036\u001b\u0000"+
		"\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0153\u0001\u0000\u0000\u0000"+
		"\u0158\u0154\u0001\u0000\u0000\u0000\u01597\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0007\u0002\u0000\u0000\u015b9\u0001\u0000\u0000\u0000\u015c\u0162"+
		"\u0003<\u001e\u0000\u015d\u015e\u0005[\u0000\u0000\u015e\u015f\u00034"+
		"\u001a\u0000\u015f\u0160\u0005\\\u0000\u0000\u0160\u0161\u0003:\u001d"+
		"\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u015d\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163;\u0001\u0000\u0000\u0000"+
		"\u0164\u0169\u0003>\u001f\u0000\u0165\u0166\u0005H\u0000\u0000\u0166\u0168"+
		"\u0003>\u001f\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u016b\u0001"+
		"\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a=\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016c\u0171\u0003@ \u0000\u016d\u016e\u0005G\u0000\u0000"+
		"\u016e\u0170\u0003@ \u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0173"+
		"\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172"+
		"\u0001\u0000\u0000\u0000\u0172?\u0001\u0000\u0000\u0000\u0173\u0171\u0001"+
		"\u0000\u0000\u0000\u0174\u0179\u0003B!\u0000\u0175\u0176\u0007\u0003\u0000"+
		"\u0000\u0176\u0178\u0003B!\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178"+
		"\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0001\u0000\u0000\u0000\u017aA\u0001\u0000\u0000\u0000\u017b\u0179"+
		"\u0001\u0000\u0000\u0000\u017c\u0181\u0003D\"\u0000\u017d\u017e\u0007"+
		"\u0004\u0000\u0000\u017e\u0180\u0003D\"\u0000\u017f\u017d\u0001\u0000"+
		"\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182C\u0001\u0000\u0000"+
		"\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0189\u0003F#\u0000\u0185"+
		"\u0186\u0007\u0005\u0000\u0000\u0186\u0188\u0003F#\u0000\u0187\u0185\u0001"+
		"\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018aE\u0001\u0000"+
		"\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u0191\u0003H$\u0000"+
		"\u018d\u018e\u0007\u0006\u0000\u0000\u018e\u0190\u0003H$\u0000\u018f\u018d"+
		"\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191\u018f"+
		"\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192G\u0001"+
		"\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0199\u0003"+
		"J%\u0000\u0195\u0196\u0007\u0007\u0000\u0000\u0196\u0198\u0003J%\u0000"+
		"\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000"+
		"\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000"+
		"\u019aI\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c"+
		"\u01ac\u0003N\'\u0000\u019d\u019e\u0005?\u0000\u0000\u019e\u01ac\u0003"+
		"J%\u0000\u019f\u01a0\u0005@\u0000\u0000\u01a0\u01ac\u0003J%\u0000\u01a1"+
		"\u01a2\u0003L&\u0000\u01a2\u01a3\u0003J%\u0000\u01a3\u01ac\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0005\u0017\u0000\u0000\u01a5\u01ac\u0003J%\u0000"+
		"\u01a6\u01a7\u0005\u0017\u0000\u0000\u01a7\u01a8\u0005U\u0000\u0000\u01a8"+
		"\u01a9\u0003\u001c\u000e\u0000\u01a9\u01aa\u0005V\u0000\u0000\u01aa\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ab\u019c\u0001\u0000\u0000\u0000\u01ab\u019d"+
		"\u0001\u0000\u0000\u0000\u01ab\u019f\u0001\u0000\u0000\u0000\u01ab\u01a1"+
		"\u0001\u0000\u0000\u0000\u01ab\u01a4\u0001\u0000\u0000\u0000\u01ab\u01a6"+
		"\u0001\u0000\u0000\u0000\u01acK\u0001\u0000\u0000\u0000\u01ad\u01ae\u0007"+
		"\b\u0000\u0000\u01aeM\u0001\u0000\u0000\u0000\u01af\u01b3\u0003R)\u0000"+
		"\u01b0\u01b2\u0003P(\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b4O\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0005Y\u0000\u0000\u01b7\u01b8\u00034\u001a"+
		"\u0000\u01b8\u01b9\u0005Z\u0000\u0000\u01b9\u01c6\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bc\u0005U\u0000\u0000\u01bb\u01bd\u0003T*\u0000\u01bc\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0001\u0000\u0000\u0000\u01be\u01c6\u0005V\u0000\u0000\u01bf\u01c0\u0005"+
		"R\u0000\u0000\u01c0\u01c6\u0005a\u0000\u0000\u01c1\u01c2\u0005S\u0000"+
		"\u0000\u01c2\u01c6\u0005a\u0000\u0000\u01c3\u01c6\u0005?\u0000\u0000\u01c4"+
		"\u01c6\u0005@\u0000\u0000\u01c5\u01b6\u0001\u0000\u0000\u0000\u01c5\u01ba"+
		"\u0001\u0000\u0000\u0000\u01c5\u01bf\u0001\u0000\u0000\u0000\u01c5\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c6Q\u0001\u0000\u0000\u0000\u01c7\u01cf\u0005"+
		"a\u0000\u0000\u01c8\u01cf\u0003V+\u0000\u01c9\u01ca\u0005U\u0000\u0000"+
		"\u01ca\u01cb\u00034\u001a\u0000\u01cb\u01cc\u0005V\u0000\u0000\u01cc\u01cf"+
		"\u0001\u0000\u0000\u0000\u01cd\u01cf\u0005*\u0000\u0000\u01ce\u01c7\u0001"+
		"\u0000\u0000\u0000\u01ce\u01c8\u0001\u0000\u0000\u0000\u01ce\u01c9\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01cfS\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d5\u00034\u001a\u0000\u01d1\u01d2\u0005Q\u0000\u0000"+
		"\u01d2\u01d4\u00034\u001a\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d6U\u0001\u0000\u0000\u0000\u01d7\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d9\u0007\t\u0000\u0000\u01d9W\u0001"+
		"\u0000\u0000\u00001[ekv\u0083\u008b\u0093\u0096\u009c\u00a3\u00a7\u00ab"+
		"\u00b1\u00bf\u00cc\u00d0\u00d4\u00d6\u00df\u00e5\u00ed\u00f3\u00f9\u0106"+
		"\u0110\u0115\u011a\u0120\u012d\u0130\u0134\u0141\u0149\u014f\u0158\u0162"+
		"\u0169\u0171\u0179\u0181\u0189\u0191\u0199\u01ab\u01b3\u01bc\u01c5\u01ce"+
		"\u01d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}