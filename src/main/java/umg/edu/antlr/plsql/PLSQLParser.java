// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/plsql/PLSQLParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.plsql;

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
public class PLSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DECLARE=1, BEGIN=2, END=3, EXCEPTION=4, IF=5, THEN=6, ELSE=7, ELSIF=8, 
		CASE=9, WHEN=10, WHILE=11, FOR=12, LOOP=13, EXIT=14, CONTINUE=15, GOTO=16, 
		SELECT=17, INSERT=18, UPDATE=19, DELETE=20, FROM=21, WHERE=22, INTO=23, 
		VALUES=24, SET=25, CREATE=26, ALTER=27, DROP=28, TABLE=29, INDEX=30, VIEW=31, 
		SEQUENCE=32, TRIGGER=33, PROCEDURE=34, FUNCTION=35, PACKAGE=36, BODY=37, 
		TYPE=38, CURSOR=39, RECORD=40, VARRAY=41, RETURN=42, RETURNS=43, CONSTANT=44, 
		DEFAULT=45, NOT_NULL=46, IN=47, OUT=48, IN_OUT=49, OR=50, ON=51, REPLACE=52, 
		AS=53, IS=54, OTHERS=55, REVERSE=56, DOTDOT=57, MULT=58, BEFORE=59, AFTER=60, 
		INSTEAD=61, OF=62, EACH=63, ROW=64, START=65, WITH=66, INCREMENT=67, BY=68, 
		MAXVALUE=69, MINVALUE=70, CYCLE=71, NOCYCLE=72, CACHE=73, NOCACHE=74, 
		VARCHAR2=75, VARCHAR=76, CHAR=77, NUMBER=78, INTEGER=79, DATE=80, TIMESTAMP=81, 
		BOOLEAN=82, BLOB=83, CLOB=84, ROWTYPE=85, TYPE_ATTR=86, TRUE=87, FALSE=88, 
		NULL=89, AND=90, NOT=91, BETWEEN=92, LIKE=93, EXISTS=94, ASSIGN=95, ARROW=96, 
		CONCAT=97, PLUS=98, MINUS=99, DIV=100, POWER=101, EQ=102, NE=103, LT=104, 
		LE=105, GT=106, GE=107, SEMICOLON=108, COMMA=109, DOT=110, COLON=111, 
		LPAREN=112, RPAREN=113, LBRACKET=114, RBRACKET=115, PERCENT=116, AT=117, 
		DOLLAR=118, NUMBER_LITERAL=119, STRING_LITERAL=120, QUOTED_IDENTIFIER=121, 
		IDENTIFIER=122, HOST_VARIABLE=123, LINE_COMMENT=124, BLOCK_COMMENT=125, 
		SQLPLUS_COMMAND=126, WS=127;
	public static final int
		RULE_plsqlUnit = 0, RULE_anonymousBlock = 1, RULE_createStatement = 2, 
		RULE_dropStatement = 3, RULE_objectType = 4, RULE_createTable = 5, RULE_columnDefinition = 6, 
		RULE_createProcedure = 7, RULE_createFunction = 8, RULE_createPackage = 9, 
		RULE_packageSpec = 10, RULE_packageBody = 11, RULE_procedureDeclaration = 12, 
		RULE_functionDeclaration = 13, RULE_procedureImplementation = 14, RULE_functionImplementation = 15, 
		RULE_parameterList = 16, RULE_parameter = 17, RULE_declarationSection = 18, 
		RULE_variableDeclaration = 19, RULE_constantDeclaration = 20, RULE_cursorDeclaration = 21, 
		RULE_typeDeclaration = 22, RULE_recordType = 23, RULE_recordField = 24, 
		RULE_dataType = 25, RULE_executableSection = 26, RULE_exceptionSection = 27, 
		RULE_whenClause = 28, RULE_exceptionName = 29, RULE_statement = 30, RULE_assignmentStatement = 31, 
		RULE_variable = 32, RULE_plsqlStatement = 33, RULE_procedureCall = 34, 
		RULE_argumentList = 35, RULE_controlStatement = 36, RULE_ifStatement = 37, 
		RULE_caseStatement = 38, RULE_loopStatement = 39, RULE_forStatement = 40, 
		RULE_whileStatement = 41, RULE_cursorName = 42, RULE_sqlStatement = 43, 
		RULE_selectStatement = 44, RULE_selectList = 45, RULE_tableReference = 46, 
		RULE_whereClause = 47, RULE_insertStatement = 48, RULE_columnList = 49, 
		RULE_valueList = 50, RULE_updateStatement = 51, RULE_assignmentList = 52, 
		RULE_columnAssignment = 53, RULE_deleteStatement = 54, RULE_createIndex = 55, 
		RULE_createView = 56, RULE_createSequence = 57, RULE_sequenceOption = 58, 
		RULE_createTrigger = 59, RULE_triggerEvent = 60, RULE_expression = 61, 
		RULE_conditionalExpression = 62, RULE_logicalOrExpression = 63, RULE_logicalAndExpression = 64, 
		RULE_relationalExpression = 65, RULE_relationalOperator = 66, RULE_additiveExpression = 67, 
		RULE_multiplicativeExpression = 68, RULE_unaryExpression = 69, RULE_primaryExpression = 70, 
		RULE_functionCall = 71, RULE_literal = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"plsqlUnit", "anonymousBlock", "createStatement", "dropStatement", "objectType", 
			"createTable", "columnDefinition", "createProcedure", "createFunction", 
			"createPackage", "packageSpec", "packageBody", "procedureDeclaration", 
			"functionDeclaration", "procedureImplementation", "functionImplementation", 
			"parameterList", "parameter", "declarationSection", "variableDeclaration", 
			"constantDeclaration", "cursorDeclaration", "typeDeclaration", "recordType", 
			"recordField", "dataType", "executableSection", "exceptionSection", "whenClause", 
			"exceptionName", "statement", "assignmentStatement", "variable", "plsqlStatement", 
			"procedureCall", "argumentList", "controlStatement", "ifStatement", "caseStatement", 
			"loopStatement", "forStatement", "whileStatement", "cursorName", "sqlStatement", 
			"selectStatement", "selectList", "tableReference", "whereClause", "insertStatement", 
			"columnList", "valueList", "updateStatement", "assignmentList", "columnAssignment", 
			"deleteStatement", "createIndex", "createView", "createSequence", "sequenceOption", 
			"createTrigger", "triggerEvent", "expression", "conditionalExpression", 
			"logicalOrExpression", "logicalAndExpression", "relationalExpression", 
			"relationalOperator", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "primaryExpression", "functionCall", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'..'", "'*'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"':='", "'=>'", "'||'", "'+'", "'-'", "'/'", "'**'", "'='", null, "'<'", 
			"'<='", "'>'", "'>='", "';'", "','", "'.'", "':'", "'('", "')'", "'['", 
			"']'", "'%'", "'@'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECLARE", "BEGIN", "END", "EXCEPTION", "IF", "THEN", "ELSE", "ELSIF", 
			"CASE", "WHEN", "WHILE", "FOR", "LOOP", "EXIT", "CONTINUE", "GOTO", "SELECT", 
			"INSERT", "UPDATE", "DELETE", "FROM", "WHERE", "INTO", "VALUES", "SET", 
			"CREATE", "ALTER", "DROP", "TABLE", "INDEX", "VIEW", "SEQUENCE", "TRIGGER", 
			"PROCEDURE", "FUNCTION", "PACKAGE", "BODY", "TYPE", "CURSOR", "RECORD", 
			"VARRAY", "RETURN", "RETURNS", "CONSTANT", "DEFAULT", "NOT_NULL", "IN", 
			"OUT", "IN_OUT", "OR", "ON", "REPLACE", "AS", "IS", "OTHERS", "REVERSE", 
			"DOTDOT", "MULT", "BEFORE", "AFTER", "INSTEAD", "OF", "EACH", "ROW", 
			"START", "WITH", "INCREMENT", "BY", "MAXVALUE", "MINVALUE", "CYCLE", 
			"NOCYCLE", "CACHE", "NOCACHE", "VARCHAR2", "VARCHAR", "CHAR", "NUMBER", 
			"INTEGER", "DATE", "TIMESTAMP", "BOOLEAN", "BLOB", "CLOB", "ROWTYPE", 
			"TYPE_ATTR", "TRUE", "FALSE", "NULL", "AND", "NOT", "BETWEEN", "LIKE", 
			"EXISTS", "ASSIGN", "ARROW", "CONCAT", "PLUS", "MINUS", "DIV", "POWER", 
			"EQ", "NE", "LT", "LE", "GT", "GE", "SEMICOLON", "COMMA", "DOT", "COLON", 
			"LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "PERCENT", "AT", "DOLLAR", 
			"NUMBER_LITERAL", "STRING_LITERAL", "QUOTED_IDENTIFIER", "IDENTIFIER", 
			"HOST_VARIABLE", "LINE_COMMENT", "BLOCK_COMMENT", "SQLPLUS_COMMAND", 
			"WS"
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
	public String getGrammarFileName() { return "PLSQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private SymbolTable symbolTable = new SymbolTable();
	    private ErrorTable errorTable = new ErrorTable();
	    private Set<String> declaredTables = new HashSet<>();
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
	    
	    private void checkTableExists(String tableName, int line, int column) {
	        if (!declaredTables.contains(tableName.toLowerCase())) {
	            addError("Table '" + tableName + "' does not exist", line, column, "SEMANTIC");
	        }
	    }
	    
	    private void addTable(String tableName) {
	        declaredTables.add(tableName.toLowerCase());
	    }
	    
	    private void checkVariableExists(String varName, int line, int column) {
	        if (!declaredVariables.contains(varName.toLowerCase())) {
	            addError("Variable '" + varName + "' not declared", line, column, "SEMANTIC");
	        }
	    }
	    
	    private void addVariable(String varName) {
	        declaredVariables.add(varName.toLowerCase());
	    }

	public PLSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlsqlUnitContext extends ParserRuleContext {
		public AnonymousBlockContext anonymousBlock() {
			return getRuleContext(AnonymousBlockContext.class,0);
		}
		public CreateStatementContext createStatement() {
			return getRuleContext(CreateStatementContext.class,0);
		}
		public DropStatementContext dropStatement() {
			return getRuleContext(DropStatementContext.class,0);
		}
		public SqlStatementContext sqlStatement() {
			return getRuleContext(SqlStatementContext.class,0);
		}
		public PlsqlUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plsqlUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterPlsqlUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitPlsqlUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitPlsqlUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlsqlUnitContext plsqlUnit() throws RecognitionException {
		PlsqlUnitContext _localctx = new PlsqlUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_plsqlUnit);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				anonymousBlock();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				createStatement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				dropStatement();
				}
				break;
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				sqlStatement();
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
	public static class AnonymousBlockContext extends ParserRuleContext {
		public ExecutableSectionContext executableSection() {
			return getRuleContext(ExecutableSectionContext.class,0);
		}
		public TerminalNode END() { return getToken(PLSQLParser.END, 0); }
		public TerminalNode DECLARE() { return getToken(PLSQLParser.DECLARE, 0); }
		public DeclarationSectionContext declarationSection() {
			return getRuleContext(DeclarationSectionContext.class,0);
		}
		public ExceptionSectionContext exceptionSection() {
			return getRuleContext(ExceptionSectionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public AnonymousBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterAnonymousBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitAnonymousBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitAnonymousBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousBlockContext anonymousBlock() throws RecognitionException {
		AnonymousBlockContext _localctx = new AnonymousBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_anonymousBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(152);
				match(DECLARE);
				setState(153);
				declarationSection();
				}
			}

			setState(156);
			executableSection();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(157);
				exceptionSection();
				}
			}

			setState(160);
			match(END);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(161);
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
	public static class CreateStatementContext extends ParserRuleContext {
		public CreateProcedureContext createProcedure() {
			return getRuleContext(CreateProcedureContext.class,0);
		}
		public CreateFunctionContext createFunction() {
			return getRuleContext(CreateFunctionContext.class,0);
		}
		public CreatePackageContext createPackage() {
			return getRuleContext(CreatePackageContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public CreateViewContext createView() {
			return getRuleContext(CreateViewContext.class,0);
		}
		public CreateSequenceContext createSequence() {
			return getRuleContext(CreateSequenceContext.class,0);
		}
		public CreateTriggerContext createTrigger() {
			return getRuleContext(CreateTriggerContext.class,0);
		}
		public CreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterCreateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitCreateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStatementContext createStatement() throws RecognitionException {
		CreateStatementContext _localctx = new CreateStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createStatement);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				createProcedure();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				createFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				createPackage();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				createTable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				createIndex();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				createView();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				createSequence();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(171);
				createTrigger();
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
	public static class DropStatementContext extends ParserRuleContext {
		public ObjectTypeContext objectType;
		public Token IDENTIFIER;
		public TerminalNode DROP() { return getToken(PLSQLParser.DROP, 0); }
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public DropStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterDropStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitDropStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitDropStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropStatementContext dropStatement() throws RecognitionException {
		DropStatementContext _localctx = new DropStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dropStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(DROP);
			setState(175);
			((DropStatementContext)_localctx).objectType = objectType();
			setState(176);
			((DropStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(177);
				match(SEMICOLON);
				}
			}


			        addSymbol(((DropStatementContext)_localctx).IDENTIFIER.getText(), "dropped_" + (((DropStatementContext)_localctx).objectType!=null?_input.getText(((DropStatementContext)_localctx).objectType.start,((DropStatementContext)_localctx).objectType.stop):null), ((DropStatementContext)_localctx).IDENTIFIER.getLine(), ((DropStatementContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(PLSQLParser.TABLE, 0); }
		public TerminalNode PROCEDURE() { return getToken(PLSQLParser.PROCEDURE, 0); }
		public TerminalNode FUNCTION() { return getToken(PLSQLParser.FUNCTION, 0); }
		public TerminalNode PACKAGE() { return getToken(PLSQLParser.PACKAGE, 0); }
		public TerminalNode INDEX() { return getToken(PLSQLParser.INDEX, 0); }
		public TerminalNode VIEW() { return getToken(PLSQLParser.VIEW, 0); }
		public TerminalNode SEQUENCE() { return getToken(PLSQLParser.SEQUENCE, 0); }
		public TerminalNode TRIGGER() { return getToken(PLSQLParser.TRIGGER, 0); }
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 136902082560L) != 0)) ) {
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
	public static class CreateTableContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode CREATE() { return getToken(PLSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(PLSQLParser.TABLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public List<ColumnDefinitionContext> columnDefinition() {
			return getRuleContexts(ColumnDefinitionContext.class);
		}
		public ColumnDefinitionContext columnDefinition(int i) {
			return getRuleContext(ColumnDefinitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(CREATE);
			setState(185);
			match(TABLE);
			setState(186);
			((CreateTableContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(187);
			match(LPAREN);
			setState(188);
			columnDefinition();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(189);
				match(COMMA);
				setState(190);
				columnDefinition();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(RPAREN);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(197);
				match(SEMICOLON);
				}
			}


			        addTable(((CreateTableContext)_localctx).IDENTIFIER.getText());
			        addSymbol(((CreateTableContext)_localctx).IDENTIFIER.getText(), "table", ((CreateTableContext)_localctx).IDENTIFIER.getLine(), ((CreateTableContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class ColumnDefinitionContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode NOT_NULL() { return getToken(PLSQLParser.NOT_NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(PLSQLParser.DEFAULT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((ColumnDefinitionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(203);
			dataType();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT_NULL) {
				{
				setState(204);
				match(NOT_NULL);
				}
			}

			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(207);
				match(DEFAULT);
				setState(208);
				expression();
				}
			}


			        addSymbol(((ColumnDefinitionContext)_localctx).IDENTIFIER.getText(), "column", ((ColumnDefinitionContext)_localctx).IDENTIFIER.getLine(), ((ColumnDefinitionContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class CreateProcedureContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode CREATE() { return getToken(PLSQLParser.CREATE, 0); }
		public TerminalNode PROCEDURE() { return getToken(PLSQLParser.PROCEDURE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PLSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PLSQLParser.IDENTIFIER, i);
		}
		public ExecutableSectionContext executableSection() {
			return getRuleContext(ExecutableSectionContext.class,0);
		}
		public TerminalNode END() { return getToken(PLSQLParser.END, 0); }
		public TerminalNode IS() { return getToken(PLSQLParser.IS, 0); }
		public TerminalNode AS() { return getToken(PLSQLParser.AS, 0); }
		public TerminalNode OR() { return getToken(PLSQLParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(PLSQLParser.REPLACE, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public DeclarationSectionContext declarationSection() {
			return getRuleContext(DeclarationSectionContext.class,0);
		}
		public ExceptionSectionContext exceptionSection() {
			return getRuleContext(ExceptionSectionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public CreateProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createProcedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterCreateProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitCreateProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitCreateProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateProcedureContext createProcedure() throws RecognitionException {
		CreateProcedureContext _localctx = new CreateProcedureContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createProcedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(CREATE);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(214);
				match(OR);
				setState(215);
				match(REPLACE);
				}
			}

			setState(218);
			match(PROCEDURE);
			setState(219);
			((CreateProcedureContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(220);
				match(LPAREN);
				setState(221);
				parameterList();
				setState(222);
				match(RPAREN);
				}
			}

			setState(226);
			_la = _input.LA(1);
			if ( !(_la==AS || _la==IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(227);
				declarationSection();
				}
				break;
			}
			setState(230);
			executableSection();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(231);
				exceptionSection();
				}
			}

			setState(234);
			match(END);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(235);
				((CreateProcedureContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				}
			}

			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(238);
				match(SEMICOLON);
				}
			}


			        addSymbol(((CreateProcedureContext)_localctx).IDENTIFIER.getText(), "procedure", ((CreateProcedureContext)_localctx).IDENTIFIER.getLine(), ((CreateProcedureContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class CreateFunctionContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode CREATE() { return getToken(PLSQLParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(PLSQLParser.FUNCTION, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PLSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PLSQLParser.IDENTIFIER, i);
		}
		public TerminalNode RETURN() { return getToken(PLSQLParser.RETURN, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ExecutableSectionContext executableSection() {
			return getRuleContext(ExecutableSectionContext.class,0);
		}
		public TerminalNode END() { return getToken(PLSQLParser.END, 0); }
		public TerminalNode IS() { return getToken(PLSQLParser.IS, 0); }
		public TerminalNode AS() { return getToken(PLSQLParser.AS, 0); }
		public TerminalNode OR() { return getToken(PLSQLParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(PLSQLParser.REPLACE, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public DeclarationSectionContext declarationSection() {
			return getRuleContext(DeclarationSectionContext.class,0);
		}
		public ExceptionSectionContext exceptionSection() {
			return getRuleContext(ExceptionSectionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public CreateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFunctionContext createFunction() throws RecognitionException {
		CreateFunctionContext _localctx = new CreateFunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(CREATE);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(244);
				match(OR);
				setState(245);
				match(REPLACE);
				}
			}

			setState(248);
			match(FUNCTION);
			setState(249);
			((CreateFunctionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(250);
				match(LPAREN);
				setState(251);
				parameterList();
				setState(252);
				match(RPAREN);
				}
			}

			setState(256);
			match(RETURN);
			setState(257);
			dataType();
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==AS || _la==IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(259);
				declarationSection();
				}
				break;
			}
			setState(262);
			executableSection();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(263);
				exceptionSection();
				}
			}

			setState(266);
			match(END);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(267);
				((CreateFunctionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				}
			}

			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(270);
				match(SEMICOLON);
				}
			}


			        addSymbol(((CreateFunctionContext)_localctx).IDENTIFIER.getText(), "function", ((CreateFunctionContext)_localctx).IDENTIFIER.getLine(), ((CreateFunctionContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class CreatePackageContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode CREATE() { return getToken(PLSQLParser.CREATE, 0); }
		public TerminalNode PACKAGE() { return getToken(PLSQLParser.PACKAGE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PLSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PLSQLParser.IDENTIFIER, i);
		}
		public PackageSpecContext packageSpec() {
			return getRuleContext(PackageSpecContext.class,0);
		}
		public TerminalNode END() { return getToken(PLSQLParser.END, 0); }
		public TerminalNode IS() { return getToken(PLSQLParser.IS, 0); }
		public TerminalNode AS() { return getToken(PLSQLParser.AS, 0); }
		public TerminalNode OR() { return getToken(PLSQLParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(PLSQLParser.REPLACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public TerminalNode BODY() { return getToken(PLSQLParser.BODY, 0); }
		public PackageBodyContext packageBody() {
			return getRuleContext(PackageBodyContext.class,0);
		}
		public CreatePackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createPackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterCreatePackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitCreatePackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitCreatePackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatePackageContext createPackage() throws RecognitionException {
		CreatePackageContext _localctx = new CreatePackageContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createPackage);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(CREATE);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(276);
					match(OR);
					setState(277);
					match(REPLACE);
					}
				}

				setState(280);
				match(PACKAGE);
				setState(281);
				match(IDENTIFIER);
				setState(282);
				_la = _input.LA(1);
				if ( !(_la==AS || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(283);
				packageSpec();
				setState(284);
				match(END);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(285);
					match(IDENTIFIER);
					}
				}

				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(288);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(CREATE);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(292);
					match(OR);
					setState(293);
					match(REPLACE);
					}
				}

				setState(296);
				match(PACKAGE);
				setState(297);
				match(BODY);
				setState(298);
				((CreatePackageContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(299);
				_la = _input.LA(1);
				if ( !(_la==AS || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(300);
				packageBody();
				setState(301);
				match(END);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(302);
					((CreatePackageContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					}
				}

				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(305);
					match(SEMICOLON);
					}
				}


				        addSymbol(((CreatePackageContext)_localctx).IDENTIFIER.getText(), "package", ((CreatePackageContext)_localctx).IDENTIFIER.getLine(), ((CreatePackageContext)_localctx).IDENTIFIER.getCharPositionInLine());
				    
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
	public static class PackageSpecContext extends ParserRuleContext {
		public List<ProcedureDeclarationContext> procedureDeclaration() {
			return getRuleContexts(ProcedureDeclarationContext.class);
		}
		public ProcedureDeclarationContext procedureDeclaration(int i) {
			return getRuleContext(ProcedureDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public PackageSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterPackageSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitPackageSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitPackageSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageSpecContext packageSpec() throws RecognitionException {
		PackageSpecContext _localctx = new PackageSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_packageSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE || _la==FUNCTION || _la==IDENTIFIER) {
				{
				setState(315);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PROCEDURE:
					{
					setState(312);
					procedureDeclaration();
					}
					break;
				case FUNCTION:
					{
					setState(313);
					functionDeclaration();
					}
					break;
				case IDENTIFIER:
					{
					setState(314);
					variableDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(319);
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
	public static class PackageBodyContext extends ParserRuleContext {
		public List<ProcedureImplementationContext> procedureImplementation() {
			return getRuleContexts(ProcedureImplementationContext.class);
		}
		public ProcedureImplementationContext procedureImplementation(int i) {
			return getRuleContext(ProcedureImplementationContext.class,i);
		}
		public List<FunctionImplementationContext> functionImplementation() {
			return getRuleContexts(FunctionImplementationContext.class);
		}
		public FunctionImplementationContext functionImplementation(int i) {
			return getRuleContext(FunctionImplementationContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public PackageBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterPackageBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitPackageBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitPackageBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageBodyContext packageBody() throws RecognitionException {
		PackageBodyContext _localctx = new PackageBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_packageBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE || _la==FUNCTION || _la==IDENTIFIER) {
				{
				setState(323);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PROCEDURE:
					{
					setState(320);
					procedureImplementation();
					}
					break;
				case FUNCTION:
					{
					setState(321);
					functionImplementation();
					}
					break;
				case IDENTIFIER:
					{
					setState(322);
					variableDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(327);
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
	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode PROCEDURE() { return getToken(PLSQLParser.PROCEDURE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitProcedureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(PROCEDURE);
			setState(329);
			((ProcedureDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(330);
				match(LPAREN);
				setState(331);
				parameterList();
				setState(332);
				match(RPAREN);
				}
			}

			setState(336);
			match(SEMICOLON);

			        addSymbol(((ProcedureDeclarationContext)_localctx).IDENTIFIER.getText(), "procedure_declaration", ((ProcedureDeclarationContext)_localctx).IDENTIFIER.getLine(), ((ProcedureDeclarationContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
		public TerminalNode FUNCTION() { return getToken(PLSQLParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode RETURN() { return getToken(PLSQLParser.RETURN, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(FUNCTION);
			setState(340);
			((FunctionDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(341);
				match(LPAREN);
				setState(342);
				parameterList();
				setState(343);
				match(RPAREN);
				}
			}

			setState(347);
			match(RETURN);
			setState(348);
			dataType();
			setState(349);
			match(SEMICOLON);

			        addSymbol(((FunctionDeclarationContext)_localctx).IDENTIFIER.getText(), "function_declaration", ((FunctionDeclarationContext)_localctx).IDENTIFIER.getLine(), ((FunctionDeclarationContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class ProcedureImplementationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode PROCEDURE() { return getToken(PLSQLParser.PROCEDURE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PLSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PLSQLParser.IDENTIFIER, i);
		}
		public ExecutableSectionContext executableSection() {
			return getRuleContext(ExecutableSectionContext.class,0);
		}
		public TerminalNode END() { return getToken(PLSQLParser.END, 0); }
		public TerminalNode IS() { return getToken(PLSQLParser.IS, 0); }
		public TerminalNode AS() { return getToken(PLSQLParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public DeclarationSectionContext declarationSection() {
			return getRuleContext(DeclarationSectionContext.class,0);
		}
		public ExceptionSectionContext exceptionSection() {
			return getRuleContext(ExceptionSectionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public ProcedureImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureImplementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterProcedureImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitProcedureImplementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitProcedureImplementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureImplementationContext procedureImplementation() throws RecognitionException {
		ProcedureImplementationContext _localctx = new ProcedureImplementationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_procedureImplementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(PROCEDURE);
			setState(353);
			((ProcedureImplementationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(354);
				match(LPAREN);
				setState(355);
				parameterList();
				setState(356);
				match(RPAREN);
				}
			}

			setState(360);
			_la = _input.LA(1);
			if ( !(_la==AS || _la==IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(361);
				declarationSection();
				}
				break;
			}
			setState(364);
			executableSection();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(365);
				exceptionSection();
				}
			}

			setState(368);
			match(END);
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(369);
				((ProcedureImplementationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				}
				break;
			}
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(372);
				match(SEMICOLON);
				}
			}


			        addSymbol(((ProcedureImplementationContext)_localctx).IDENTIFIER.getText(), "procedure_implementation", ((ProcedureImplementationContext)_localctx).IDENTIFIER.getLine(), ((ProcedureImplementationContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class FunctionImplementationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode FUNCTION() { return getToken(PLSQLParser.FUNCTION, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PLSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PLSQLParser.IDENTIFIER, i);
		}
		public TerminalNode RETURN() { return getToken(PLSQLParser.RETURN, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ExecutableSectionContext executableSection() {
			return getRuleContext(ExecutableSectionContext.class,0);
		}
		public TerminalNode END() { return getToken(PLSQLParser.END, 0); }
		public TerminalNode IS() { return getToken(PLSQLParser.IS, 0); }
		public TerminalNode AS() { return getToken(PLSQLParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public DeclarationSectionContext declarationSection() {
			return getRuleContext(DeclarationSectionContext.class,0);
		}
		public ExceptionSectionContext exceptionSection() {
			return getRuleContext(ExceptionSectionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public FunctionImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionImplementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterFunctionImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitFunctionImplementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitFunctionImplementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionImplementationContext functionImplementation() throws RecognitionException {
		FunctionImplementationContext _localctx = new FunctionImplementationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionImplementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(FUNCTION);
			setState(378);
			((FunctionImplementationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(379);
				match(LPAREN);
				setState(380);
				parameterList();
				setState(381);
				match(RPAREN);
				}
			}

			setState(385);
			match(RETURN);
			setState(386);
			dataType();
			setState(387);
			_la = _input.LA(1);
			if ( !(_la==AS || _la==IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(388);
				declarationSection();
				}
				break;
			}
			setState(391);
			executableSection();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(392);
				exceptionSection();
				}
			}

			setState(395);
			match(END);
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(396);
				((FunctionImplementationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				}
				break;
			}
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(399);
				match(SEMICOLON);
				}
			}


			        addSymbol(((FunctionImplementationContext)_localctx).IDENTIFIER.getText(), "function_implementation", ((FunctionImplementationContext)_localctx).IDENTIFIER.getLine(), ((FunctionImplementationContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			parameter();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(405);
				match(COMMA);
				setState(406);
				parameter();
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
	public static class ParameterContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(PLSQLParser.DEFAULT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(PLSQLParser.IN, 0); }
		public TerminalNode OUT() { return getToken(PLSQLParser.OUT, 0); }
		public TerminalNode IN_OUT() { return getToken(PLSQLParser.IN_OUT, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			((ParameterContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) {
				{
				setState(413);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(416);
			dataType();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(417);
				match(DEFAULT);
				setState(418);
				expression();
				}
			}


			        addVariable(((ParameterContext)_localctx).IDENTIFIER.getText());
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
	public static class DeclarationSectionContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<ConstantDeclarationContext> constantDeclaration() {
			return getRuleContexts(ConstantDeclarationContext.class);
		}
		public ConstantDeclarationContext constantDeclaration(int i) {
			return getRuleContext(ConstantDeclarationContext.class,i);
		}
		public List<CursorDeclarationContext> cursorDeclaration() {
			return getRuleContexts(CursorDeclarationContext.class);
		}
		public CursorDeclarationContext cursorDeclaration(int i) {
			return getRuleContext(CursorDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public DeclarationSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterDeclarationSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitDeclarationSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitDeclarationSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSectionContext declarationSection() throws RecognitionException {
		DeclarationSectionContext _localctx = new DeclarationSectionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declarationSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE || _la==CURSOR || _la==IDENTIFIER) {
				{
				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(423);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(424);
					constantDeclaration();
					}
					break;
				case 3:
					{
					setState(425);
					cursorDeclaration();
					}
					break;
				case 4:
					{
					setState(426);
					typeDeclaration();
					}
					break;
				}
				}
				setState(431);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public TerminalNode NOT_NULL() { return getToken(PLSQLParser.NOT_NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(PLSQLParser.DEFAULT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			((VariableDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(433);
			dataType();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT_NULL) {
				{
				setState(434);
				match(NOT_NULL);
				}
			}

			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(437);
				match(DEFAULT);
				setState(438);
				expression();
				}
			}

			setState(441);
			match(SEMICOLON);

			        addVariable(((VariableDeclarationContext)_localctx).IDENTIFIER.getText());
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
	public static class ConstantDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode CONSTANT() { return getToken(PLSQLParser.CONSTANT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public TerminalNode NOT_NULL() { return getToken(PLSQLParser.NOT_NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(PLSQLParser.DEFAULT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			((ConstantDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(445);
			match(CONSTANT);
			setState(446);
			dataType();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT_NULL) {
				{
				setState(447);
				match(NOT_NULL);
				}
			}

			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(450);
				match(DEFAULT);
				setState(451);
				expression();
				}
			}

			setState(454);
			match(SEMICOLON);

			        addVariable(((ConstantDeclarationContext)_localctx).IDENTIFIER.getText());
			        addSymbol(((ConstantDeclarationContext)_localctx).IDENTIFIER.getText(), "constant", ((ConstantDeclarationContext)_localctx).IDENTIFIER.getLine(), ((ConstantDeclarationContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class CursorDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode CURSOR() { return getToken(PLSQLParser.CURSOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode IS() { return getToken(PLSQLParser.IS, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public CursorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterCursorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitCursorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitCursorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CursorDeclarationContext cursorDeclaration() throws RecognitionException {
		CursorDeclarationContext _localctx = new CursorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cursorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(CURSOR);
			setState(458);
			((CursorDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(459);
				match(LPAREN);
				setState(460);
				parameterList();
				setState(461);
				match(RPAREN);
				}
			}

			setState(465);
			match(IS);
			setState(466);
			selectStatement();
			setState(467);
			match(SEMICOLON);

			        addSymbol(((CursorDeclarationContext)_localctx).IDENTIFIER.getText(), "cursor", ((CursorDeclarationContext)_localctx).IDENTIFIER.getLine(), ((CursorDeclarationContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class TypeDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode TYPE() { return getToken(PLSQLParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode IS() { return getToken(PLSQLParser.IS, 0); }
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public TerminalNode VARRAY() { return getToken(PLSQLParser.VARRAY, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(PLSQLParser.NUMBER_LITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public TerminalNode OF() { return getToken(PLSQLParser.OF, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeDeclaration);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(TYPE);
				setState(471);
				match(IDENTIFIER);
				setState(472);
				match(IS);
				setState(473);
				recordType();
				setState(474);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(TYPE);
				setState(477);
				((TypeDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(478);
				match(IS);
				setState(479);
				match(VARRAY);
				setState(480);
				match(LPAREN);
				setState(481);
				match(NUMBER_LITERAL);
				setState(482);
				match(RPAREN);
				setState(483);
				match(OF);
				setState(484);
				dataType();
				setState(485);
				match(SEMICOLON);

				        addSymbol(((TypeDeclarationContext)_localctx).IDENTIFIER.getText(), "type", ((TypeDeclarationContext)_localctx).IDENTIFIER.getLine(), ((TypeDeclarationContext)_localctx).IDENTIFIER.getCharPositionInLine());
				    
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
	public static class RecordTypeContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(PLSQLParser.RECORD, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public List<RecordFieldContext> recordField() {
			return getRuleContexts(RecordFieldContext.class);
		}
		public RecordFieldContext recordField(int i) {
			return getRuleContext(RecordFieldContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterRecordType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitRecordType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitRecordType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_recordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(RECORD);
			setState(491);
			match(LPAREN);
			setState(492);
			recordField();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(493);
				match(COMMA);
				setState(494);
				recordField();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
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
	public static class RecordFieldContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode NOT_NULL() { return getToken(PLSQLParser.NOT_NULL, 0); }
		public RecordFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterRecordField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitRecordField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitRecordField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordFieldContext recordField() throws RecognitionException {
		RecordFieldContext _localctx = new RecordFieldContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_recordField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			((RecordFieldContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(503);
			dataType();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT_NULL) {
				{
				setState(504);
				match(NOT_NULL);
				}
			}


			        addSymbol(((RecordFieldContext)_localctx).IDENTIFIER.getText(), "record_field", ((RecordFieldContext)_localctx).IDENTIFIER.getLine(), ((RecordFieldContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode VARCHAR2() { return getToken(PLSQLParser.VARCHAR2, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public List<TerminalNode> NUMBER_LITERAL() { return getTokens(PLSQLParser.NUMBER_LITERAL); }
		public TerminalNode NUMBER_LITERAL(int i) {
			return getToken(PLSQLParser.NUMBER_LITERAL, i);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public TerminalNode VARCHAR() { return getToken(PLSQLParser.VARCHAR, 0); }
		public TerminalNode CHAR() { return getToken(PLSQLParser.CHAR, 0); }
		public TerminalNode NUMBER() { return getToken(PLSQLParser.NUMBER, 0); }
		public TerminalNode COMMA() { return getToken(PLSQLParser.COMMA, 0); }
		public TerminalNode INTEGER() { return getToken(PLSQLParser.INTEGER, 0); }
		public TerminalNode DATE() { return getToken(PLSQLParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(PLSQLParser.TIMESTAMP, 0); }
		public TerminalNode BOOLEAN() { return getToken(PLSQLParser.BOOLEAN, 0); }
		public TerminalNode BLOB() { return getToken(PLSQLParser.BLOB, 0); }
		public TerminalNode CLOB() { return getToken(PLSQLParser.CLOB, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode ROWTYPE() { return getToken(PLSQLParser.ROWTYPE, 0); }
		public TerminalNode TYPE_ATTR() { return getToken(PLSQLParser.TYPE_ATTR, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dataType);
		int _la;
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARCHAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(VARCHAR2);
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(510);
					match(LPAREN);
					setState(511);
					match(NUMBER_LITERAL);
					setState(512);
					match(RPAREN);
					}
				}

				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(VARCHAR);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(516);
					match(LPAREN);
					setState(517);
					match(NUMBER_LITERAL);
					setState(518);
					match(RPAREN);
					}
				}

				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
				match(CHAR);
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(522);
					match(LPAREN);
					setState(523);
					match(NUMBER_LITERAL);
					setState(524);
					match(RPAREN);
					}
				}

				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(527);
				match(NUMBER);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(528);
					match(LPAREN);
					setState(529);
					match(NUMBER_LITERAL);
					setState(532);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(530);
						match(COMMA);
						setState(531);
						match(NUMBER_LITERAL);
						}
					}

					setState(534);
					match(RPAREN);
					}
				}

				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(537);
				match(INTEGER);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(538);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(539);
				match(TIMESTAMP);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 8);
				{
				setState(540);
				match(BOOLEAN);
				}
				break;
			case BLOB:
				enterOuterAlt(_localctx, 9);
				{
				setState(541);
				match(BLOB);
				}
				break;
			case CLOB:
				enterOuterAlt(_localctx, 10);
				{
				setState(542);
				match(CLOB);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 11);
				{
				setState(543);
				match(IDENTIFIER);
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROWTYPE || _la==TYPE_ATTR) {
					{
					setState(544);
					_la = _input.LA(1);
					if ( !(_la==ROWTYPE || _la==TYPE_ATTR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
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
	public static class ExecutableSectionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PLSQLParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PLSQLParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExecutableSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executableSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterExecutableSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitExecutableSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitExecutableSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecutableSectionContext executableSection() throws RecognitionException {
		ExecutableSectionContext _localctx = new ExecutableSectionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_executableSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(BEGIN);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048606752L) != 0) || _la==SEMICOLON || _la==IDENTIFIER) {
				{
				{
				setState(550);
				statement();
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(556);
			match(END);
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
	public static class ExceptionSectionContext extends ParserRuleContext {
		public TerminalNode EXCEPTION() { return getToken(PLSQLParser.EXCEPTION, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public ExceptionSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterExceptionSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitExceptionSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitExceptionSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionSectionContext exceptionSection() throws RecognitionException {
		ExceptionSectionContext _localctx = new ExceptionSectionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exceptionSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(EXCEPTION);
			setState(560); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(559);
				whenClause();
				}
				}
				setState(562); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
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
	public static class WhenClauseContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(PLSQLParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(PLSQLParser.THEN, 0); }
		public ExceptionNameContext exceptionName() {
			return getRuleContext(ExceptionNameContext.class,0);
		}
		public TerminalNode OTHERS() { return getToken(PLSQLParser.OTHERS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_whenClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(WHEN);
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(565);
				exceptionName();
				}
				break;
			case OTHERS:
				{
				setState(566);
				match(OTHERS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(569);
			match(THEN);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048606752L) != 0) || _la==SEMICOLON || _la==IDENTIFIER) {
				{
				{
				setState(570);
				statement();
				}
				}
				setState(575);
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
	public static class ExceptionNameContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public ExceptionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterExceptionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitExceptionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitExceptionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionNameContext exceptionName() throws RecognitionException {
		ExceptionNameContext _localctx = new ExceptionNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exceptionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			((ExceptionNameContext)_localctx).IDENTIFIER = match(IDENTIFIER);

			        addSymbol(((ExceptionNameContext)_localctx).IDENTIFIER.getText(), "exception", ((ExceptionNameContext)_localctx).IDENTIFIER.getLine(), ((ExceptionNameContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public SqlStatementContext sqlStatement() {
			return getRuleContext(SqlStatementContext.class,0);
		}
		public PlsqlStatementContext plsqlStatement() {
			return getRuleContext(PlsqlStatementContext.class,0);
		}
		public ControlStatementContext controlStatement() {
			return getRuleContext(ControlStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				sqlStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				plsqlStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(582);
				controlStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(583);
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
	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PLSQLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			variable();
			setState(587);
			match(ASSIGN);
			setState(588);
			expression();
			setState(589);
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
	public static class VariableContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<TerminalNode> IDENTIFIER() { return getTokens(PLSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PLSQLParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(PLSQLParser.DOT, 0); }
		public TerminalNode LBRACKET() { return getToken(PLSQLParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(PLSQLParser.RBRACKET, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variable);
		try {
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				((VariableContext)_localctx).IDENTIFIER = match(IDENTIFIER);

				        checkVariableExists(((VariableContext)_localctx).IDENTIFIER.getText(), ((VariableContext)_localctx).IDENTIFIER.getLine(), ((VariableContext)_localctx).IDENTIFIER.getCharPositionInLine());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				match(IDENTIFIER);
				setState(594);
				match(DOT);
				setState(595);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(596);
				match(IDENTIFIER);
				setState(597);
				match(LBRACKET);
				setState(598);
				expression();
				setState(599);
				match(RBRACKET);
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
	public static class PlsqlStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PLSQLParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EXIT() { return getToken(PLSQLParser.EXIT, 0); }
		public TerminalNode WHEN() { return getToken(PLSQLParser.WHEN, 0); }
		public TerminalNode CONTINUE() { return getToken(PLSQLParser.CONTINUE, 0); }
		public TerminalNode GOTO() { return getToken(PLSQLParser.GOTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public ProcedureCallContext procedureCall() {
			return getRuleContext(ProcedureCallContext.class,0);
		}
		public PlsqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plsqlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterPlsqlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitPlsqlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitPlsqlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlsqlStatementContext plsqlStatement() throws RecognitionException {
		PlsqlStatementContext _localctx = new PlsqlStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_plsqlStatement);
		int _la;
		try {
			setState(626);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				match(RETURN);
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 47278200983L) != 0)) {
					{
					setState(604);
					expression();
					}
				}

				setState(607);
				match(SEMICOLON);
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				match(EXIT);
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(609);
					match(WHEN);
					setState(610);
					expression();
					}
				}

				setState(613);
				match(SEMICOLON);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				match(CONTINUE);
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(615);
					match(WHEN);
					setState(616);
					expression();
					}
				}

				setState(619);
				match(SEMICOLON);
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(620);
				match(GOTO);
				setState(621);
				match(IDENTIFIER);
				setState(622);
				match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(623);
				procedureCall();
				setState(624);
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
	public static class ProcedureCallContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public ProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterProcedureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitProcedureCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitProcedureCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureCallContext procedureCall() throws RecognitionException {
		ProcedureCallContext _localctx = new ProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_procedureCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			((ProcedureCallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(629);
				match(LPAREN);
				setState(630);
				argumentList();
				setState(631);
				match(RPAREN);
				}
			}


			        addSymbol(((ProcedureCallContext)_localctx).IDENTIFIER.getText(), "procedure_call", ((ProcedureCallContext)_localctx).IDENTIFIER.getLine(), ((ProcedureCallContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			expression();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(638);
				match(COMMA);
				setState(639);
				expression();
				}
				}
				setState(644);
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
	public static class ControlStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitControlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitControlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlStatementContext controlStatement() throws RecognitionException {
		ControlStatementContext _localctx = new ControlStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_controlStatement);
		try {
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				caseStatement();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 3);
				{
				setState(647);
				loopStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(648);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(649);
				whileStatement();
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
	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(PLSQLParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(PLSQLParser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(PLSQLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(PLSQLParser.THEN, i);
		}
		public TerminalNode END() { return getToken(PLSQLParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSIF() { return getTokens(PLSQLParser.ELSIF); }
		public TerminalNode ELSIF(int i) {
			return getToken(PLSQLParser.ELSIF, i);
		}
		public TerminalNode ELSE() { return getToken(PLSQLParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(IF);
			setState(653);
			expression();
			setState(654);
			match(THEN);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048606752L) != 0) || _la==SEMICOLON || _la==IDENTIFIER) {
				{
				{
				setState(655);
				statement();
				}
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(661);
				match(ELSIF);
				setState(662);
				expression();
				setState(663);
				match(THEN);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048606752L) != 0) || _la==SEMICOLON || _la==IDENTIFIER) {
					{
					{
					setState(664);
					statement();
					}
					}
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(675);
				match(ELSE);
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048606752L) != 0) || _la==SEMICOLON || _la==IDENTIFIER) {
					{
					{
					setState(676);
					statement();
					}
					}
					setState(681);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(684);
			match(END);
			setState(685);
			match(IF);
			setState(686);
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
	public static class CaseStatementContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(PLSQLParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(PLSQLParser.CASE, i);
		}
		public TerminalNode END() { return getToken(PLSQLParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(PLSQLParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(PLSQLParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(PLSQLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(PLSQLParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(PLSQLParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_caseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(CASE);
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 47278200983L) != 0)) {
				{
				setState(689);
				expression();
				}
			}

			setState(701); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(692);
				match(WHEN);
				setState(693);
				expression();
				setState(694);
				match(THEN);
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048606752L) != 0) || _la==SEMICOLON || _la==IDENTIFIER) {
					{
					{
					setState(695);
					statement();
					}
					}
					setState(700);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(703); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(705);
				match(ELSE);
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048606752L) != 0) || _la==SEMICOLON || _la==IDENTIFIER) {
					{
					{
					setState(706);
					statement();
					}
					}
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(714);
			match(END);
			setState(715);
			match(CASE);
			setState(716);
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
	public static class LoopStatementContext extends ParserRuleContext {
		public List<TerminalNode> LOOP() { return getTokens(PLSQLParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(PLSQLParser.LOOP, i);
		}
		public TerminalNode END() { return getToken(PLSQLParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(LOOP);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048606752L) != 0) || _la==SEMICOLON || _la==IDENTIFIER) {
				{
				{
				setState(719);
				statement();
				}
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(725);
			match(END);
			setState(726);
			match(LOOP);
			setState(727);
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
	public static class ForStatementContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode FOR() { return getToken(PLSQLParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(PLSQLParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(PLSQLParser.DOTDOT, 0); }
		public List<TerminalNode> LOOP() { return getTokens(PLSQLParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(PLSQLParser.LOOP, i);
		}
		public TerminalNode END() { return getToken(PLSQLParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public TerminalNode REVERSE() { return getToken(PLSQLParser.REVERSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_forStatement);
		int _la;
		try {
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				match(FOR);
				setState(730);
				match(IDENTIFIER);
				setState(731);
				match(IN);
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REVERSE) {
					{
					setState(732);
					match(REVERSE);
					}
				}

				setState(735);
				expression();
				setState(736);
				match(DOTDOT);
				setState(737);
				expression();
				setState(738);
				match(LOOP);
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048606752L) != 0) || _la==SEMICOLON || _la==IDENTIFIER) {
					{
					{
					setState(739);
					statement();
					}
					}
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(745);
				match(END);
				setState(746);
				match(LOOP);
				setState(747);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				match(FOR);
				setState(750);
				((ForStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(751);
				match(IN);
				setState(752);
				cursorName();
				setState(753);
				match(LOOP);
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048606752L) != 0) || _la==SEMICOLON || _la==IDENTIFIER) {
					{
					{
					setState(754);
					statement();
					}
					}
					setState(759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(760);
				match(END);
				setState(761);
				match(LOOP);
				setState(762);
				match(SEMICOLON);

				        addSymbol(((ForStatementContext)_localctx).IDENTIFIER.getText(), "loop_variable", ((ForStatementContext)_localctx).IDENTIFIER.getLine(), ((ForStatementContext)_localctx).IDENTIFIER.getCharPositionInLine());
				    
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PLSQLParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> LOOP() { return getTokens(PLSQLParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(PLSQLParser.LOOP, i);
		}
		public TerminalNode END() { return getToken(PLSQLParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(WHILE);
			setState(768);
			expression();
			setState(769);
			match(LOOP);
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048606752L) != 0) || _la==SEMICOLON || _la==IDENTIFIER) {
				{
				{
				setState(770);
				statement();
				}
				}
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(776);
			match(END);
			setState(777);
			match(LOOP);
			setState(778);
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
	public static class CursorNameContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public CursorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterCursorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitCursorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitCursorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CursorNameContext cursorName() throws RecognitionException {
		CursorNameContext _localctx = new CursorNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_cursorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			((CursorNameContext)_localctx).IDENTIFIER = match(IDENTIFIER);

			        checkVariableExists(((CursorNameContext)_localctx).IDENTIFIER.getText(), ((CursorNameContext)_localctx).IDENTIFIER.getLine(), ((CursorNameContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class SqlStatementContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public SqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterSqlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitSqlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitSqlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementContext sqlStatement() throws RecognitionException {
		SqlStatementContext _localctx = new SqlStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_sqlStatement);
		try {
			setState(799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				selectStatement();
				setState(785);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(784);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				insertStatement();
				setState(789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(788);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(791);
				updateStatement();
				setState(793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(792);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(795);
				deleteStatement();
				setState(797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(796);
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
	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(PLSQLParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PLSQLParser.FROM, 0); }
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(SELECT);
			setState(802);
			selectList();
			setState(803);
			match(FROM);
			setState(804);
			tableReference();
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(805);
				whereClause();
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
	public static class SelectListContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(PLSQLParser.MULT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_selectList);
		int _la;
		try {
			setState(817);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				match(MULT);
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case NOT:
			case EXISTS:
			case PLUS:
			case MINUS:
			case LPAREN:
			case NUMBER_LITERAL:
			case STRING_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				expression();
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(810);
					match(COMMA);
					setState(811);
					expression();
					}
					}
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class TableReferenceContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<TerminalNode> IDENTIFIER() { return getTokens(PLSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PLSQLParser.IDENTIFIER, i);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterTableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitTableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tableReference);
		try {
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				((TableReferenceContext)_localctx).IDENTIFIER = match(IDENTIFIER);

				        checkTableExists(((TableReferenceContext)_localctx).IDENTIFIER.getText(), ((TableReferenceContext)_localctx).IDENTIFIER.getLine(), ((TableReferenceContext)_localctx).IDENTIFIER.getCharPositionInLine());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				match(IDENTIFIER);
				setState(822);
				match(IDENTIFIER);
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
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(PLSQLParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(WHERE);
			setState(826);
			expression();
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
	public static class InsertStatementContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode INSERT() { return getToken(PLSQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(PLSQLParser.INTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode VALUES() { return getToken(PLSQLParser.VALUES, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(PLSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PLSQLParser.LPAREN, i);
		}
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PLSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PLSQLParser.RPAREN, i);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_insertStatement);
		int _la;
		try {
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				match(INSERT);
				setState(829);
				match(INTO);
				setState(830);
				match(IDENTIFIER);
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(831);
					match(LPAREN);
					setState(832);
					columnList();
					setState(833);
					match(RPAREN);
					}
				}

				setState(837);
				match(VALUES);
				setState(838);
				match(LPAREN);
				setState(839);
				valueList();
				setState(840);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				match(INSERT);
				setState(843);
				match(INTO);
				setState(844);
				((InsertStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(845);
					match(LPAREN);
					setState(846);
					columnList();
					setState(847);
					match(RPAREN);
					}
				}

				setState(851);
				selectStatement();

				        checkTableExists(((InsertStatementContext)_localctx).IDENTIFIER.getText(), ((InsertStatementContext)_localctx).IDENTIFIER.getLine(), ((InsertStatementContext)_localctx).IDENTIFIER.getCharPositionInLine());
				    
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
	public static class ColumnListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(PLSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PLSQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitColumnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(IDENTIFIER);
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(857);
				match(COMMA);
				setState(858);
				match(IDENTIFIER);
				}
				}
				setState(863);
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
	public static class ValueListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			expression();
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(865);
				match(COMMA);
				setState(866);
				expression();
				}
				}
				setState(871);
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
	public static class UpdateStatementContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode UPDATE() { return getToken(PLSQLParser.UPDATE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode SET() { return getToken(PLSQLParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterUpdateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitUpdateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitUpdateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_updateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(UPDATE);
			setState(873);
			((UpdateStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(874);
			match(SET);
			setState(875);
			assignmentList();
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(876);
				whereClause();
				}
			}


			        checkTableExists(((UpdateStatementContext)_localctx).IDENTIFIER.getText(), ((UpdateStatementContext)_localctx).IDENTIFIER.getLine(), ((UpdateStatementContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class AssignmentListContext extends ParserRuleContext {
		public List<ColumnAssignmentContext> columnAssignment() {
			return getRuleContexts(ColumnAssignmentContext.class);
		}
		public ColumnAssignmentContext columnAssignment(int i) {
			return getRuleContext(ColumnAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			columnAssignment();
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(882);
				match(COMMA);
				setState(883);
				columnAssignment();
				}
				}
				setState(888);
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
	public static class ColumnAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(PLSQLParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ColumnAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterColumnAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitColumnAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitColumnAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAssignmentContext columnAssignment() throws RecognitionException {
		ColumnAssignmentContext _localctx = new ColumnAssignmentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_columnAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(IDENTIFIER);
			setState(890);
			match(EQ);
			setState(891);
			expression();
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
	public static class DeleteStatementContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode DELETE() { return getToken(PLSQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(PLSQLParser.FROM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_deleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(DELETE);
			setState(894);
			match(FROM);
			setState(895);
			((DeleteStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(896);
				whereClause();
				}
			}


			        checkTableExists(((DeleteStatementContext)_localctx).IDENTIFIER.getText(), ((DeleteStatementContext)_localctx).IDENTIFIER.getLine(), ((DeleteStatementContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class CreateIndexContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode CREATE() { return getToken(PLSQLParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(PLSQLParser.INDEX, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PLSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PLSQLParser.IDENTIFIER, i);
		}
		public TerminalNode ON() { return getToken(PLSQLParser.ON, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterCreateIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitCreateIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(CREATE);
			setState(902);
			match(INDEX);
			setState(903);
			((CreateIndexContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(904);
			match(ON);
			setState(905);
			((CreateIndexContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(906);
			match(LPAREN);
			setState(907);
			columnList();
			setState(908);
			match(RPAREN);
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(909);
				match(SEMICOLON);
				}
			}


			        addSymbol(((CreateIndexContext)_localctx).IDENTIFIER.getText(), "index", ((CreateIndexContext)_localctx).IDENTIFIER.getLine(), ((CreateIndexContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class CreateViewContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode CREATE() { return getToken(PLSQLParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(PLSQLParser.VIEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode AS() { return getToken(PLSQLParser.AS, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public CreateViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateViewContext createView() throws RecognitionException {
		CreateViewContext _localctx = new CreateViewContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_createView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(CREATE);
			setState(915);
			match(VIEW);
			setState(916);
			((CreateViewContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(917);
			match(AS);
			setState(918);
			selectStatement();
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(919);
				match(SEMICOLON);
				}
			}


			        addSymbol(((CreateViewContext)_localctx).IDENTIFIER.getText(), "view", ((CreateViewContext)_localctx).IDENTIFIER.getLine(), ((CreateViewContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class CreateSequenceContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode CREATE() { return getToken(PLSQLParser.CREATE, 0); }
		public TerminalNode SEQUENCE() { return getToken(PLSQLParser.SEQUENCE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public List<SequenceOptionContext> sequenceOption() {
			return getRuleContexts(SequenceOptionContext.class);
		}
		public SequenceOptionContext sequenceOption(int i) {
			return getRuleContext(SequenceOptionContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public CreateSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterCreateSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitCreateSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitCreateSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSequenceContext createSequence() throws RecognitionException {
		CreateSequenceContext _localctx = new CreateSequenceContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_createSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(CREATE);
			setState(925);
			match(SEQUENCE);
			setState(926);
			((CreateSequenceContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1013L) != 0)) {
				{
				{
				setState(927);
				sequenceOption();
				}
				}
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(933);
				match(SEMICOLON);
				}
			}


			        addSymbol(((CreateSequenceContext)_localctx).IDENTIFIER.getText(), "sequence", ((CreateSequenceContext)_localctx).IDENTIFIER.getLine(), ((CreateSequenceContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class SequenceOptionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(PLSQLParser.START, 0); }
		public TerminalNode WITH() { return getToken(PLSQLParser.WITH, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(PLSQLParser.NUMBER_LITERAL, 0); }
		public TerminalNode INCREMENT() { return getToken(PLSQLParser.INCREMENT, 0); }
		public TerminalNode BY() { return getToken(PLSQLParser.BY, 0); }
		public TerminalNode MAXVALUE() { return getToken(PLSQLParser.MAXVALUE, 0); }
		public TerminalNode MINVALUE() { return getToken(PLSQLParser.MINVALUE, 0); }
		public TerminalNode CYCLE() { return getToken(PLSQLParser.CYCLE, 0); }
		public TerminalNode NOCYCLE() { return getToken(PLSQLParser.NOCYCLE, 0); }
		public TerminalNode CACHE() { return getToken(PLSQLParser.CACHE, 0); }
		public TerminalNode NOCACHE() { return getToken(PLSQLParser.NOCACHE, 0); }
		public SequenceOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterSequenceOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitSequenceOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitSequenceOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceOptionContext sequenceOption() throws RecognitionException {
		SequenceOptionContext _localctx = new SequenceOptionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_sequenceOption);
		try {
			setState(953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				match(START);
				setState(939);
				match(WITH);
				setState(940);
				match(NUMBER_LITERAL);
				}
				break;
			case INCREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				match(INCREMENT);
				setState(942);
				match(BY);
				setState(943);
				match(NUMBER_LITERAL);
				}
				break;
			case MAXVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(944);
				match(MAXVALUE);
				setState(945);
				match(NUMBER_LITERAL);
				}
				break;
			case MINVALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(946);
				match(MINVALUE);
				setState(947);
				match(NUMBER_LITERAL);
				}
				break;
			case CYCLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(948);
				match(CYCLE);
				}
				break;
			case NOCYCLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(949);
				match(NOCYCLE);
				}
				break;
			case CACHE:
				enterOuterAlt(_localctx, 7);
				{
				setState(950);
				match(CACHE);
				setState(951);
				match(NUMBER_LITERAL);
				}
				break;
			case NOCACHE:
				enterOuterAlt(_localctx, 8);
				{
				setState(952);
				match(NOCACHE);
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
	public static class CreateTriggerContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode CREATE() { return getToken(PLSQLParser.CREATE, 0); }
		public TerminalNode TRIGGER() { return getToken(PLSQLParser.TRIGGER, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PLSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PLSQLParser.IDENTIFIER, i);
		}
		public TriggerEventContext triggerEvent() {
			return getRuleContext(TriggerEventContext.class,0);
		}
		public TerminalNode ON() { return getToken(PLSQLParser.ON, 0); }
		public ExecutableSectionContext executableSection() {
			return getRuleContext(ExecutableSectionContext.class,0);
		}
		public TerminalNode END() { return getToken(PLSQLParser.END, 0); }
		public TerminalNode BEFORE() { return getToken(PLSQLParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(PLSQLParser.AFTER, 0); }
		public TerminalNode INSTEAD() { return getToken(PLSQLParser.INSTEAD, 0); }
		public TerminalNode OF() { return getToken(PLSQLParser.OF, 0); }
		public TerminalNode OR() { return getToken(PLSQLParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(PLSQLParser.REPLACE, 0); }
		public TerminalNode FOR() { return getToken(PLSQLParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(PLSQLParser.EACH, 0); }
		public TerminalNode ROW() { return getToken(PLSQLParser.ROW, 0); }
		public TerminalNode WHEN() { return getToken(PLSQLParser.WHEN, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public DeclarationSectionContext declarationSection() {
			return getRuleContext(DeclarationSectionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PLSQLParser.SEMICOLON, 0); }
		public CreateTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTrigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterCreateTrigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitCreateTrigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitCreateTrigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTriggerContext createTrigger() throws RecognitionException {
		CreateTriggerContext _localctx = new CreateTriggerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_createTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(CREATE);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(956);
				match(OR);
				setState(957);
				match(REPLACE);
				}
			}

			setState(960);
			match(TRIGGER);
			setState(961);
			((CreateTriggerContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEFORE:
				{
				setState(962);
				match(BEFORE);
				}
				break;
			case AFTER:
				{
				setState(963);
				match(AFTER);
				}
				break;
			case INSTEAD:
				{
				setState(964);
				match(INSTEAD);
				setState(965);
				match(OF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(968);
			triggerEvent();
			setState(969);
			match(ON);
			setState(970);
			((CreateTriggerContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(971);
				match(FOR);
				setState(972);
				match(EACH);
				setState(973);
				match(ROW);
				}
			}

			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(976);
				match(WHEN);
				setState(977);
				match(LPAREN);
				setState(978);
				expression();
				setState(979);
				match(RPAREN);
				}
			}

			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(983);
				declarationSection();
				}
				break;
			}
			setState(986);
			executableSection();
			setState(987);
			match(END);
			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(988);
				((CreateTriggerContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				}
			}

			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(991);
				match(SEMICOLON);
				}
			}


			        addSymbol(((CreateTriggerContext)_localctx).IDENTIFIER.getText(), "trigger", ((CreateTriggerContext)_localctx).IDENTIFIER.getLine(), ((CreateTriggerContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
	public static class TriggerEventContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(PLSQLParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(PLSQLParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(PLSQLParser.DELETE, 0); }
		public List<TerminalNode> OR() { return getTokens(PLSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PLSQLParser.OR, i);
		}
		public TriggerEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterTriggerEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitTriggerEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitTriggerEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggerEventContext triggerEvent() throws RecognitionException {
		TriggerEventContext _localctx = new TriggerEventContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_triggerEvent);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(996);
				match(INSERT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				match(UPDATE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(998);
				match(DELETE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(999);
				match(INSERT);
				setState(1000);
				match(OR);
				setState(1001);
				match(UPDATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1002);
				match(INSERT);
				setState(1003);
				match(OR);
				setState(1004);
				match(DELETE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1005);
				match(UPDATE);
				setState(1006);
				match(OR);
				setState(1007);
				match(DELETE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1008);
				match(INSERT);
				setState(1009);
				match(OR);
				setState(1010);
				match(UPDATE);
				setState(1011);
				match(OR);
				setState(1012);
				match(DELETE);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			conditionalExpression();
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
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			logicalOrExpression();
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
		public List<TerminalNode> OR() { return getTokens(PLSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PLSQLParser.OR, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			logicalAndExpression();
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1020);
				match(OR);
				setState(1021);
				logicalAndExpression();
				}
				}
				setState(1026);
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
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(PLSQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PLSQLParser.AND, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			relationalExpression();
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1028);
				match(AND);
				setState(1029);
				relationalExpression();
				}
				}
				setState(1034);
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
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<RelationalOperatorContext> relationalOperator() {
			return getRuleContexts(RelationalOperatorContext.class);
		}
		public RelationalOperatorContext relationalOperator(int i) {
			return getRuleContext(RelationalOperatorContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(PLSQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PLSQLParser.AND, 0); }
		public TerminalNode IN() { return getToken(PLSQLParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(PLSQLParser.NOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PLSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLSQLParser.COMMA, i);
		}
		public TerminalNode IS() { return getToken(PLSQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(PLSQLParser.NULL, 0); }
		public TerminalNode LIKE() { return getToken(PLSQLParser.LIKE, 0); }
		public TerminalNode EXISTS() { return getToken(PLSQLParser.EXISTS, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_relationalExpression);
		int _la;
		try {
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1035);
				additiveExpression();
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 63L) != 0)) {
					{
					{
					setState(1036);
					relationalOperator();
					setState(1037);
					additiveExpression();
					}
					}
					setState(1043);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				additiveExpression();
				setState(1045);
				match(BETWEEN);
				setState(1046);
				additiveExpression();
				setState(1047);
				match(AND);
				setState(1048);
				additiveExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1050);
				additiveExpression();
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1051);
					match(NOT);
					}
				}

				setState(1054);
				match(IN);
				setState(1055);
				match(LPAREN);
				setState(1056);
				expression();
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1057);
					match(COMMA);
					setState(1058);
					expression();
					}
					}
					setState(1063);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1064);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1066);
				additiveExpression();
				setState(1067);
				match(IS);
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1068);
					match(NOT);
					}
				}

				setState(1071);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1073);
				additiveExpression();
				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1074);
					match(NOT);
					}
				}

				setState(1077);
				match(LIKE);
				setState(1078);
				additiveExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1080);
				match(EXISTS);
				setState(1081);
				match(LPAREN);
				setState(1082);
				selectStatement();
				setState(1083);
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
	public static class RelationalOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(PLSQLParser.EQ, 0); }
		public TerminalNode NE() { return getToken(PLSQLParser.NE, 0); }
		public TerminalNode LT() { return getToken(PLSQLParser.LT, 0); }
		public TerminalNode LE() { return getToken(PLSQLParser.LE, 0); }
		public TerminalNode GT() { return getToken(PLSQLParser.GT, 0); }
		public TerminalNode GE() { return getToken(PLSQLParser.GE, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitRelationalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 63L) != 0)) ) {
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
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PLSQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PLSQLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PLSQLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PLSQLParser.MINUS, i);
		}
		public List<TerminalNode> CONCAT() { return getTokens(PLSQLParser.CONCAT); }
		public TerminalNode CONCAT(int i) {
			return getToken(PLSQLParser.CONCAT, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			multiplicativeExpression();
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0)) {
				{
				{
				setState(1090);
				_la = _input.LA(1);
				if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1091);
				multiplicativeExpression();
				}
				}
				setState(1096);
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
		public List<TerminalNode> MULT() { return getTokens(PLSQLParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(PLSQLParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(PLSQLParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(PLSQLParser.DIV, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			unaryExpression();
			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(1098);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1099);
				unaryExpression();
				}
				}
				setState(1104);
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
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PLSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PLSQLParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(PLSQLParser.NOT, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unaryExpression);
		int _la;
		try {
			setState(1108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case NUMBER_LITERAL:
			case STRING_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				primaryExpression();
				}
				break;
			case NOT:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				_la = _input.LA(1);
				if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 385L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1107);
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_primaryExpression);
		try {
			setState(1121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1111);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1112);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1113);
				match(LPAREN);
				setState(1114);
				expression();
				setState(1115);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1117);
				match(LPAREN);
				setState(1118);
				selectStatement();
				setState(1119);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PLSQLParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(PLSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PLSQLParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			((FunctionCallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(1124);
			match(LPAREN);
			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 47278200983L) != 0)) {
				{
				setState(1125);
				argumentList();
				}
			}

			setState(1128);
			match(RPAREN);

			        addSymbol(((FunctionCallContext)_localctx).IDENTIFIER.getText(), "function_call", ((FunctionCallContext)_localctx).IDENTIFIER.getLine(), ((FunctionCallContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
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
		public TerminalNode NUMBER_LITERAL() { return getToken(PLSQLParser.NUMBER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PLSQLParser.STRING_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(PLSQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PLSQLParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(PLSQLParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLParserListener ) ((PLSQLParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLParserVisitor ) return ((PLSQLParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 12884901895L) != 0)) ) {
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
		"\u0004\u0001\u007f\u046e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u0097\b\u0000\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u009b\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u009f\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u00a3\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00ad\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00b3\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00c0\b\u0005\n\u0005\f\u0005\u00c3\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00c7\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ce\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00d2\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00d9\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00e1\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00e5\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00e9\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ed\b\u0007"+
		"\u0001\u0007\u0003\u0007\u00f0\b\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u00f7\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00ff\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0105"+
		"\b\b\u0001\b\u0001\b\u0003\b\u0109\b\b\u0001\b\u0001\b\u0003\b\u010d\b"+
		"\b\u0001\b\u0003\b\u0110\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0117\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u011f"+
		"\b\t\u0001\t\u0003\t\u0122\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0127\b"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0130"+
		"\b\t\u0001\t\u0003\t\u0133\b\t\u0001\t\u0001\t\u0003\t\u0137\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u013c\b\n\n\n\f\n\u013f\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0144\b\u000b\n\u000b\f\u000b\u0147\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u014f\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u015a\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0167"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u016b\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u016f\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0173\b\u000e\u0001\u000e\u0003\u000e\u0176\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0180\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0186\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u018a"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u018e\b\u000f\u0001\u000f"+
		"\u0003\u000f\u0191\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0198\b\u0010\n\u0010\f\u0010\u019b\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u019f\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u01a4\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01ac\b\u0012\n\u0012\f\u0012"+
		"\u01af\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01b4\b"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01b8\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u01c1\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01c5\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01d0\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01e9\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u01f0\b\u0017\n\u0017\f\u0017\u01f3\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01fa\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0202"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0208"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u020e"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0215\b\u0019\u0001\u0019\u0003\u0019\u0218\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0222\b\u0019\u0003\u0019\u0224\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u0228\b\u001a\n\u001a\f\u001a\u022b\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0004\u001b\u0231\b\u001b"+
		"\u000b\u001b\f\u001b\u0232\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0238\b\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u023c\b\u001c\n\u001c"+
		"\f\u001c\u023f\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0249\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u025a"+
		"\b \u0001!\u0001!\u0003!\u025e\b!\u0001!\u0001!\u0001!\u0001!\u0003!\u0264"+
		"\b!\u0001!\u0001!\u0001!\u0001!\u0003!\u026a\b!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u0273\b!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0003\"\u027a\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005"+
		"#\u0281\b#\n#\f#\u0284\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u028b"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0005%\u0291\b%\n%\f%\u0294\t%\u0001%"+
		"\u0001%\u0001%\u0001%\u0005%\u029a\b%\n%\f%\u029d\t%\u0005%\u029f\b%\n"+
		"%\f%\u02a2\t%\u0001%\u0001%\u0005%\u02a6\b%\n%\f%\u02a9\t%\u0003%\u02ab"+
		"\b%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0003&\u02b3\b&\u0001&\u0001"+
		"&\u0001&\u0001&\u0005&\u02b9\b&\n&\f&\u02bc\t&\u0004&\u02be\b&\u000b&"+
		"\f&\u02bf\u0001&\u0001&\u0005&\u02c4\b&\n&\f&\u02c7\t&\u0003&\u02c9\b"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0005\'\u02d1\b\'\n\'\f"+
		"\'\u02d4\t\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0003(\u02de\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u02e5\b(\n"+
		"(\f(\u02e8\t(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0001(\u0005(\u02f4\b(\n(\f(\u02f7\t(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u02fe\b(\u0001)\u0001)\u0001)\u0001)\u0005)\u0304\b)\n"+
		")\f)\u0307\t)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+"+
		"\u0001+\u0003+\u0312\b+\u0001+\u0001+\u0003+\u0316\b+\u0001+\u0001+\u0003"+
		"+\u031a\b+\u0001+\u0001+\u0003+\u031e\b+\u0003+\u0320\b+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0003,\u0327\b,\u0001-\u0001-\u0001-\u0001-\u0005"+
		"-\u032d\b-\n-\f-\u0330\t-\u0003-\u0332\b-\u0001.\u0001.\u0001.\u0001."+
		"\u0003.\u0338\b.\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u0344\b0\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u0352\b0\u00010\u0001"+
		"0\u00010\u00030\u0357\b0\u00011\u00011\u00011\u00051\u035c\b1\n1\f1\u035f"+
		"\t1\u00012\u00012\u00012\u00052\u0364\b2\n2\f2\u0367\t2\u00013\u00013"+
		"\u00013\u00013\u00013\u00033\u036e\b3\u00013\u00013\u00014\u00014\u0001"+
		"4\u00054\u0375\b4\n4\f4\u0378\t4\u00015\u00015\u00015\u00015\u00016\u0001"+
		"6\u00016\u00016\u00036\u0382\b6\u00016\u00016\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00037\u038f\b7\u00017\u00017\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00038\u0399\b8\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u00059\u03a1\b9\n9\f9\u03a4\t9\u00019\u00039\u03a7"+
		"\b9\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u03ba\b:\u0001"+
		";\u0001;\u0001;\u0003;\u03bf\b;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0003;\u03c7\b;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u03cf"+
		"\b;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u03d6\b;\u0001;\u0003;\u03d9"+
		"\b;\u0001;\u0001;\u0001;\u0003;\u03de\b;\u0001;\u0003;\u03e1\b;\u0001"+
		";\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u03f6"+
		"\b<\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001?\u0005?\u03ff\b?\n"+
		"?\f?\u0402\t?\u0001@\u0001@\u0001@\u0005@\u0407\b@\n@\f@\u040a\t@\u0001"+
		"A\u0001A\u0001A\u0001A\u0005A\u0410\bA\nA\fA\u0413\tA\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u041d\bA\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0005A\u0424\bA\nA\fA\u0427\tA\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0003A\u042e\bA\u0001A\u0001A\u0001A\u0001A\u0003A\u0434\bA\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u043e\bA\u0001"+
		"B\u0001B\u0001C\u0001C\u0001C\u0005C\u0445\bC\nC\fC\u0448\tC\u0001D\u0001"+
		"D\u0001D\u0005D\u044d\bD\nD\fD\u0450\tD\u0001E\u0001E\u0001E\u0003E\u0455"+
		"\bE\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0003F\u0462\bF\u0001G\u0001G\u0001G\u0003G\u0467\bG\u0001G\u0001"+
		"G\u0001G\u0001H\u0001H\u0001H\u0000\u0000I\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0000\t\u0001\u0000\u001d$\u0001\u000056\u0001\u0000"+
		"/1\u0001\u0000UV\u0001\u0000fk\u0001\u0000ac\u0002\u0000::dd\u0002\u0000"+
		"[[bc\u0002\u0000WYwx\u04e1\u0000\u0096\u0001\u0000\u0000\u0000\u0002\u009a"+
		"\u0001\u0000\u0000\u0000\u0004\u00ac\u0001\u0000\u0000\u0000\u0006\u00ae"+
		"\u0001\u0000\u0000\u0000\b\u00b6\u0001\u0000\u0000\u0000\n\u00b8\u0001"+
		"\u0000\u0000\u0000\f\u00ca\u0001\u0000\u0000\u0000\u000e\u00d5\u0001\u0000"+
		"\u0000\u0000\u0010\u00f3\u0001\u0000\u0000\u0000\u0012\u0136\u0001\u0000"+
		"\u0000\u0000\u0014\u013d\u0001\u0000\u0000\u0000\u0016\u0145\u0001\u0000"+
		"\u0000\u0000\u0018\u0148\u0001\u0000\u0000\u0000\u001a\u0153\u0001\u0000"+
		"\u0000\u0000\u001c\u0160\u0001\u0000\u0000\u0000\u001e\u0179\u0001\u0000"+
		"\u0000\u0000 \u0194\u0001\u0000\u0000\u0000\"\u019c\u0001\u0000\u0000"+
		"\u0000$\u01ad\u0001\u0000\u0000\u0000&\u01b0\u0001\u0000\u0000\u0000("+
		"\u01bc\u0001\u0000\u0000\u0000*\u01c9\u0001\u0000\u0000\u0000,\u01e8\u0001"+
		"\u0000\u0000\u0000.\u01ea\u0001\u0000\u0000\u00000\u01f6\u0001\u0000\u0000"+
		"\u00002\u0223\u0001\u0000\u0000\u00004\u0225\u0001\u0000\u0000\u00006"+
		"\u022e\u0001\u0000\u0000\u00008\u0234\u0001\u0000\u0000\u0000:\u0240\u0001"+
		"\u0000\u0000\u0000<\u0248\u0001\u0000\u0000\u0000>\u024a\u0001\u0000\u0000"+
		"\u0000@\u0259\u0001\u0000\u0000\u0000B\u0272\u0001\u0000\u0000\u0000D"+
		"\u0274\u0001\u0000\u0000\u0000F\u027d\u0001\u0000\u0000\u0000H\u028a\u0001"+
		"\u0000\u0000\u0000J\u028c\u0001\u0000\u0000\u0000L\u02b0\u0001\u0000\u0000"+
		"\u0000N\u02ce\u0001\u0000\u0000\u0000P\u02fd\u0001\u0000\u0000\u0000R"+
		"\u02ff\u0001\u0000\u0000\u0000T\u030c\u0001\u0000\u0000\u0000V\u031f\u0001"+
		"\u0000\u0000\u0000X\u0321\u0001\u0000\u0000\u0000Z\u0331\u0001\u0000\u0000"+
		"\u0000\\\u0337\u0001\u0000\u0000\u0000^\u0339\u0001\u0000\u0000\u0000"+
		"`\u0356\u0001\u0000\u0000\u0000b\u0358\u0001\u0000\u0000\u0000d\u0360"+
		"\u0001\u0000\u0000\u0000f\u0368\u0001\u0000\u0000\u0000h\u0371\u0001\u0000"+
		"\u0000\u0000j\u0379\u0001\u0000\u0000\u0000l\u037d\u0001\u0000\u0000\u0000"+
		"n\u0385\u0001\u0000\u0000\u0000p\u0392\u0001\u0000\u0000\u0000r\u039c"+
		"\u0001\u0000\u0000\u0000t\u03b9\u0001\u0000\u0000\u0000v\u03bb\u0001\u0000"+
		"\u0000\u0000x\u03f5\u0001\u0000\u0000\u0000z\u03f7\u0001\u0000\u0000\u0000"+
		"|\u03f9\u0001\u0000\u0000\u0000~\u03fb\u0001\u0000\u0000\u0000\u0080\u0403"+
		"\u0001\u0000\u0000\u0000\u0082\u043d\u0001\u0000\u0000\u0000\u0084\u043f"+
		"\u0001\u0000\u0000\u0000\u0086\u0441\u0001\u0000\u0000\u0000\u0088\u0449"+
		"\u0001\u0000\u0000\u0000\u008a\u0454\u0001\u0000\u0000\u0000\u008c\u0461"+
		"\u0001\u0000\u0000\u0000\u008e\u0463\u0001\u0000\u0000\u0000\u0090\u046b"+
		"\u0001\u0000\u0000\u0000\u0092\u0097\u0003\u0002\u0001\u0000\u0093\u0097"+
		"\u0003\u0004\u0002\u0000\u0094\u0097\u0003\u0006\u0003\u0000\u0095\u0097"+
		"\u0003V+\u0000\u0096\u0092\u0001\u0000\u0000\u0000\u0096\u0093\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0001\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0001"+
		"\u0000\u0000\u0099\u009b\u0003$\u0012\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009e\u00034\u001a\u0000\u009d\u009f\u00036\u001b\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0005\u0003\u0000\u0000\u00a1"+
		"\u00a3\u0005l\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u0003\u0001\u0000\u0000\u0000\u00a4\u00ad"+
		"\u0003\u000e\u0007\u0000\u00a5\u00ad\u0003\u0010\b\u0000\u00a6\u00ad\u0003"+
		"\u0012\t\u0000\u00a7\u00ad\u0003\n\u0005\u0000\u00a8\u00ad\u0003n7\u0000"+
		"\u00a9\u00ad\u0003p8\u0000\u00aa\u00ad\u0003r9\u0000\u00ab\u00ad\u0003"+
		"v;\u0000\u00ac\u00a4\u0001\u0000\u0000\u0000\u00ac\u00a5\u0001\u0000\u0000"+
		"\u0000\u00ac\u00a6\u0001\u0000\u0000\u0000\u00ac\u00a7\u0001\u0000\u0000"+
		"\u0000\u00ac\u00a8\u0001\u0000\u0000\u0000\u00ac\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u0005\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u001c\u0000"+
		"\u0000\u00af\u00b0\u0003\b\u0004\u0000\u00b0\u00b2\u0005z\u0000\u0000"+
		"\u00b1\u00b3\u0005l\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0006\u0003\uffff\uffff\u0000\u00b5\u0007\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0007\u0000\u0000\u0000\u00b7\t\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0005\u001a\u0000\u0000\u00b9\u00ba\u0005\u001d\u0000\u0000\u00ba"+
		"\u00bb\u0005z\u0000\u0000\u00bb\u00bc\u0005p\u0000\u0000\u00bc\u00c1\u0003"+
		"\f\u0006\u0000\u00bd\u00be\u0005m\u0000\u0000\u00be\u00c0\u0003\f\u0006"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c6\u0005q\u0000\u0000\u00c5\u00c7\u0005l\u0000\u0000\u00c6"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0006\u0005\uffff\uffff\u0000"+
		"\u00c9\u000b\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005z\u0000\u0000\u00cb"+
		"\u00cd\u00032\u0019\u0000\u00cc\u00ce\u0005.\u0000\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0005-\u0000\u0000\u00d0\u00d2\u0003z="+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0006\u0006\uffff"+
		"\uffff\u0000\u00d4\r\u0001\u0000\u0000\u0000\u00d5\u00d8\u0005\u001a\u0000"+
		"\u0000\u00d6\u00d7\u00052\u0000\u0000\u00d7\u00d9\u00054\u0000\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0005\"\u0000\u0000\u00db\u00e0"+
		"\u0005z\u0000\u0000\u00dc\u00dd\u0005p\u0000\u0000\u00dd\u00de\u0003 "+
		"\u0010\u0000\u00de\u00df\u0005q\u0000\u0000\u00df\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0007\u0001\u0000"+
		"\u0000\u00e3\u00e5\u0003$\u0012\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e8\u00034\u001a\u0000\u00e7\u00e9\u00036\u001b\u0000\u00e8\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00ec\u0005\u0003\u0000\u0000\u00eb\u00ed"+
		"\u0005z\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00f0\u0005"+
		"l\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0006\u0007"+
		"\uffff\uffff\u0000\u00f2\u000f\u0001\u0000\u0000\u0000\u00f3\u00f6\u0005"+
		"\u001a\u0000\u0000\u00f4\u00f5\u00052\u0000\u0000\u00f5\u00f7\u00054\u0000"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005#\u0000\u0000"+
		"\u00f9\u00fe\u0005z\u0000\u0000\u00fa\u00fb\u0005p\u0000\u0000\u00fb\u00fc"+
		"\u0003 \u0010\u0000\u00fc\u00fd\u0005q\u0000\u0000\u00fd\u00ff\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005*\u0000"+
		"\u0000\u0101\u0102\u00032\u0019\u0000\u0102\u0104\u0007\u0001\u0000\u0000"+
		"\u0103\u0105\u0003$\u0012\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0108\u00034\u001a\u0000\u0107\u0109\u00036\u001b\u0000\u0108\u0107\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u010c\u0005\u0003\u0000\u0000\u010b\u010d\u0005"+
		"z\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0110\u0005l\u0000"+
		"\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0006\b\uffff\uffff"+
		"\u0000\u0112\u0011\u0001\u0000\u0000\u0000\u0113\u0116\u0005\u001a\u0000"+
		"\u0000\u0114\u0115\u00052\u0000\u0000\u0115\u0117\u00054\u0000\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0005$\u0000\u0000\u0119\u011a"+
		"\u0005z\u0000\u0000\u011a\u011b\u0007\u0001\u0000\u0000\u011b\u011c\u0003"+
		"\u0014\n\u0000\u011c\u011e\u0005\u0003\u0000\u0000\u011d\u011f\u0005z"+
		"\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u0122\u0005l\u0000"+
		"\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122\u0137\u0001\u0000\u0000\u0000\u0123\u0126\u0005\u001a\u0000"+
		"\u0000\u0124\u0125\u00052\u0000\u0000\u0125\u0127\u00054\u0000\u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0005$\u0000\u0000\u0129\u012a"+
		"\u0005%\u0000\u0000\u012a\u012b\u0005z\u0000\u0000\u012b\u012c\u0007\u0001"+
		"\u0000\u0000\u012c\u012d\u0003\u0016\u000b\u0000\u012d\u012f\u0005\u0003"+
		"\u0000\u0000\u012e\u0130\u0005z\u0000\u0000\u012f\u012e\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000\u0000"+
		"\u0000\u0131\u0133\u0005l\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0006\t\uffff\uffff\u0000\u0135\u0137\u0001\u0000\u0000\u0000"+
		"\u0136\u0113\u0001\u0000\u0000\u0000\u0136\u0123\u0001\u0000\u0000\u0000"+
		"\u0137\u0013\u0001\u0000\u0000\u0000\u0138\u013c\u0003\u0018\f\u0000\u0139"+
		"\u013c\u0003\u001a\r\u0000\u013a\u013c\u0003&\u0013\u0000\u013b\u0138"+
		"\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013a"+
		"\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0015"+
		"\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0144"+
		"\u0003\u001c\u000e\u0000\u0141\u0144\u0003\u001e\u000f\u0000\u0142\u0144"+
		"\u0003&\u0013\u0000\u0143\u0140\u0001\u0000\u0000\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0147\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146\u0017\u0001\u0000\u0000\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0005\"\u0000\u0000\u0149\u014e\u0005z"+
		"\u0000\u0000\u014a\u014b\u0005p\u0000\u0000\u014b\u014c\u0003 \u0010\u0000"+
		"\u014c\u014d\u0005q\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e"+
		"\u014a\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0005l\u0000\u0000\u0151\u0152"+
		"\u0006\f\uffff\uffff\u0000\u0152\u0019\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0005#\u0000\u0000\u0154\u0159\u0005z\u0000\u0000\u0155\u0156\u0005p"+
		"\u0000\u0000\u0156\u0157\u0003 \u0010\u0000\u0157\u0158\u0005q\u0000\u0000"+
		"\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0155\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0005*\u0000\u0000\u015c\u015d\u00032\u0019\u0000\u015d\u015e"+
		"\u0005l\u0000\u0000\u015e\u015f\u0006\r\uffff\uffff\u0000\u015f\u001b"+
		"\u0001\u0000\u0000\u0000\u0160\u0161\u0005\"\u0000\u0000\u0161\u0166\u0005"+
		"z\u0000\u0000\u0162\u0163\u0005p\u0000\u0000\u0163\u0164\u0003 \u0010"+
		"\u0000\u0164\u0165\u0005q\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000"+
		"\u0166\u0162\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0007\u0001\u0000\u0000"+
		"\u0169\u016b\u0003$\u0012\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c"+
		"\u016e\u00034\u001a\u0000\u016d\u016f\u00036\u001b\u0000\u016e\u016d\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0001"+
		"\u0000\u0000\u0000\u0170\u0172\u0005\u0003\u0000\u0000\u0171\u0173\u0005"+
		"z\u0000\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000"+
		"\u0000\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174\u0176\u0005l\u0000"+
		"\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0006\u000e\uffff"+
		"\uffff\u0000\u0178\u001d\u0001\u0000\u0000\u0000\u0179\u017a\u0005#\u0000"+
		"\u0000\u017a\u017f\u0005z\u0000\u0000\u017b\u017c\u0005p\u0000\u0000\u017c"+
		"\u017d\u0003 \u0010\u0000\u017d\u017e\u0005q\u0000\u0000\u017e\u0180\u0001"+
		"\u0000\u0000\u0000\u017f\u017b\u0001\u0000\u0000\u0000\u017f\u0180\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0005"+
		"*\u0000\u0000\u0182\u0183\u00032\u0019\u0000\u0183\u0185\u0007\u0001\u0000"+
		"\u0000\u0184\u0186\u0003$\u0012\u0000\u0185\u0184\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187\u0189\u00034\u001a\u0000\u0188\u018a\u00036\u001b\u0000\u0189\u0188"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0001\u0000\u0000\u0000\u018b\u018d\u0005\u0003\u0000\u0000\u018c\u018e"+
		"\u0005z\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001"+
		"\u0000\u0000\u0000\u018e\u0190\u0001\u0000\u0000\u0000\u018f\u0191\u0005"+
		"l\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0006\u000f"+
		"\uffff\uffff\u0000\u0193\u001f\u0001\u0000\u0000\u0000\u0194\u0199\u0003"+
		"\"\u0011\u0000\u0195\u0196\u0005m\u0000\u0000\u0196\u0198\u0003\"\u0011"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000"+
		"\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000"+
		"\u0000\u019a!\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000"+
		"\u019c\u019e\u0005z\u0000\u0000\u019d\u019f\u0007\u0002\u0000\u0000\u019e"+
		"\u019d\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a3\u00032\u0019\u0000\u01a1\u01a2"+
		"\u0005-\u0000\u0000\u01a2\u01a4\u0003z=\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0006\u0011\uffff\uffff\u0000\u01a6#\u0001\u0000"+
		"\u0000\u0000\u01a7\u01ac\u0003&\u0013\u0000\u01a8\u01ac\u0003(\u0014\u0000"+
		"\u01a9\u01ac\u0003*\u0015\u0000\u01aa\u01ac\u0003,\u0016\u0000\u01ab\u01a7"+
		"\u0001\u0000\u0000\u0000\u01ab\u01a8\u0001\u0000\u0000\u0000\u01ab\u01a9"+
		"\u0001\u0000\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac\u01af"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ae%\u0001\u0000\u0000\u0000\u01af\u01ad\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b1\u0005z\u0000\u0000\u01b1\u01b3\u00032\u0019"+
		"\u0000\u01b2\u01b4\u0005.\u0000\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b6\u0005-\u0000\u0000\u01b6\u01b8\u0003z=\u0000\u01b7\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005l\u0000\u0000\u01ba\u01bb\u0006"+
		"\u0013\uffff\uffff\u0000\u01bb\'\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005"+
		"z\u0000\u0000\u01bd\u01be\u0005,\u0000\u0000\u01be\u01c0\u00032\u0019"+
		"\u0000\u01bf\u01c1\u0005.\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0005-\u0000\u0000\u01c3\u01c5\u0003z=\u0000\u01c4\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005l\u0000\u0000\u01c7\u01c8\u0006"+
		"\u0014\uffff\uffff\u0000\u01c8)\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005"+
		"\'\u0000\u0000\u01ca\u01cf\u0005z\u0000\u0000\u01cb\u01cc\u0005p\u0000"+
		"\u0000\u01cc\u01cd\u0003 \u0010\u0000\u01cd\u01ce\u0005q\u0000\u0000\u01ce"+
		"\u01d0\u0001\u0000\u0000\u0000\u01cf\u01cb\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u00056\u0000\u0000\u01d2\u01d3\u0003X,\u0000\u01d3\u01d4\u0005"+
		"l\u0000\u0000\u01d4\u01d5\u0006\u0015\uffff\uffff\u0000\u01d5+\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d7\u0005&\u0000\u0000\u01d7\u01d8\u0005z\u0000\u0000"+
		"\u01d8\u01d9\u00056\u0000\u0000\u01d9\u01da\u0003.\u0017\u0000\u01da\u01db"+
		"\u0005l\u0000\u0000\u01db\u01e9\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005"+
		"&\u0000\u0000\u01dd\u01de\u0005z\u0000\u0000\u01de\u01df\u00056\u0000"+
		"\u0000\u01df\u01e0\u0005)\u0000\u0000\u01e0\u01e1\u0005p\u0000\u0000\u01e1"+
		"\u01e2\u0005w\u0000\u0000\u01e2\u01e3\u0005q\u0000\u0000\u01e3\u01e4\u0005"+
		">\u0000\u0000\u01e4\u01e5\u00032\u0019\u0000\u01e5\u01e6\u0005l\u0000"+
		"\u0000\u01e6\u01e7\u0006\u0016\uffff\uffff\u0000\u01e7\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e8\u01d6\u0001\u0000\u0000\u0000\u01e8\u01dc\u0001\u0000"+
		"\u0000\u0000\u01e9-\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005(\u0000\u0000"+
		"\u01eb\u01ec\u0005p\u0000\u0000\u01ec\u01f1\u00030\u0018\u0000\u01ed\u01ee"+
		"\u0005m\u0000\u0000\u01ee\u01f0\u00030\u0018\u0000\u01ef\u01ed\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f3\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005q\u0000"+
		"\u0000\u01f5/\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005z\u0000\u0000\u01f7"+
		"\u01f9\u00032\u0019\u0000\u01f8\u01fa\u0005.\u0000\u0000\u01f9\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u0006\u0018\uffff\uffff\u0000\u01fc1\u0001"+
		"\u0000\u0000\u0000\u01fd\u0201\u0005K\u0000\u0000\u01fe\u01ff\u0005p\u0000"+
		"\u0000\u01ff\u0200\u0005w\u0000\u0000\u0200\u0202\u0005q\u0000\u0000\u0201"+
		"\u01fe\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202"+
		"\u0224\u0001\u0000\u0000\u0000\u0203\u0207\u0005L\u0000\u0000\u0204\u0205"+
		"\u0005p\u0000\u0000\u0205\u0206\u0005w\u0000\u0000\u0206\u0208\u0005q"+
		"\u0000\u0000\u0207\u0204\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000"+
		"\u0000\u0000\u0208\u0224\u0001\u0000\u0000\u0000\u0209\u020d\u0005M\u0000"+
		"\u0000\u020a\u020b\u0005p\u0000\u0000\u020b\u020c\u0005w\u0000\u0000\u020c"+
		"\u020e\u0005q\u0000\u0000\u020d\u020a\u0001\u0000\u0000\u0000\u020d\u020e"+
		"\u0001\u0000\u0000\u0000\u020e\u0224\u0001\u0000\u0000\u0000\u020f\u0217"+
		"\u0005N\u0000\u0000\u0210\u0211\u0005p\u0000\u0000\u0211\u0214\u0005w"+
		"\u0000\u0000\u0212\u0213\u0005m\u0000\u0000\u0213\u0215\u0005w\u0000\u0000"+
		"\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000"+
		"\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0218\u0005q\u0000\u0000\u0217"+
		"\u0210\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218"+
		"\u0224\u0001\u0000\u0000\u0000\u0219\u0224\u0005O\u0000\u0000\u021a\u0224"+
		"\u0005P\u0000\u0000\u021b\u0224\u0005Q\u0000\u0000\u021c\u0224\u0005R"+
		"\u0000\u0000\u021d\u0224\u0005S\u0000\u0000\u021e\u0224\u0005T\u0000\u0000"+
		"\u021f\u0221\u0005z\u0000\u0000\u0220\u0222\u0007\u0003\u0000\u0000\u0221"+
		"\u0220\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222"+
		"\u0224\u0001\u0000\u0000\u0000\u0223\u01fd\u0001\u0000\u0000\u0000\u0223"+
		"\u0203\u0001\u0000\u0000\u0000\u0223\u0209\u0001\u0000\u0000\u0000\u0223"+
		"\u020f\u0001\u0000\u0000\u0000\u0223\u0219\u0001\u0000\u0000\u0000\u0223"+
		"\u021a\u0001\u0000\u0000\u0000\u0223\u021b\u0001\u0000\u0000\u0000\u0223"+
		"\u021c\u0001\u0000\u0000\u0000\u0223\u021d\u0001\u0000\u0000\u0000\u0223"+
		"\u021e\u0001\u0000\u0000\u0000\u0223\u021f\u0001\u0000\u0000\u0000\u0224"+
		"3\u0001\u0000\u0000\u0000\u0225\u0229\u0005\u0002\u0000\u0000\u0226\u0228"+
		"\u0003<\u001e\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0228\u022b\u0001"+
		"\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u022a\u0001"+
		"\u0000\u0000\u0000\u022a\u022c\u0001\u0000\u0000\u0000\u022b\u0229\u0001"+
		"\u0000\u0000\u0000\u022c\u022d\u0005\u0003\u0000\u0000\u022d5\u0001\u0000"+
		"\u0000\u0000\u022e\u0230\u0005\u0004\u0000\u0000\u022f\u0231\u00038\u001c"+
		"\u0000\u0230\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000"+
		"\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000"+
		"\u0000\u02337\u0001\u0000\u0000\u0000\u0234\u0237\u0005\n\u0000\u0000"+
		"\u0235\u0238\u0003:\u001d\u0000\u0236\u0238\u00057\u0000\u0000\u0237\u0235"+
		"\u0001\u0000\u0000\u0000\u0237\u0236\u0001\u0000\u0000\u0000\u0238\u0239"+
		"\u0001\u0000\u0000\u0000\u0239\u023d\u0005\u0006\u0000\u0000\u023a\u023c"+
		"\u0003<\u001e\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023c\u023f\u0001"+
		"\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023e\u0001"+
		"\u0000\u0000\u0000\u023e9\u0001\u0000\u0000\u0000\u023f\u023d\u0001\u0000"+
		"\u0000\u0000\u0240\u0241\u0005z\u0000\u0000\u0241\u0242\u0006\u001d\uffff"+
		"\uffff\u0000\u0242;\u0001\u0000\u0000\u0000\u0243\u0249\u0003>\u001f\u0000"+
		"\u0244\u0249\u0003V+\u0000\u0245\u0249\u0003B!\u0000\u0246\u0249\u0003"+
		"H$\u0000\u0247\u0249\u0005l\u0000\u0000\u0248\u0243\u0001\u0000\u0000"+
		"\u0000\u0248\u0244\u0001\u0000\u0000\u0000\u0248\u0245\u0001\u0000\u0000"+
		"\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0248\u0247\u0001\u0000\u0000"+
		"\u0000\u0249=\u0001\u0000\u0000\u0000\u024a\u024b\u0003@ \u0000\u024b"+
		"\u024c\u0005_\u0000\u0000\u024c\u024d\u0003z=\u0000\u024d\u024e\u0005"+
		"l\u0000\u0000\u024e?\u0001\u0000\u0000\u0000\u024f\u0250\u0005z\u0000"+
		"\u0000\u0250\u025a\u0006 \uffff\uffff\u0000\u0251\u0252\u0005z\u0000\u0000"+
		"\u0252\u0253\u0005n\u0000\u0000\u0253\u025a\u0005z\u0000\u0000\u0254\u0255"+
		"\u0005z\u0000\u0000\u0255\u0256\u0005r\u0000\u0000\u0256\u0257\u0003z"+
		"=\u0000\u0257\u0258\u0005s\u0000\u0000\u0258\u025a\u0001\u0000\u0000\u0000"+
		"\u0259\u024f\u0001\u0000\u0000\u0000\u0259\u0251\u0001\u0000\u0000\u0000"+
		"\u0259\u0254\u0001\u0000\u0000\u0000\u025aA\u0001\u0000\u0000\u0000\u025b"+
		"\u025d\u0005*\u0000\u0000\u025c\u025e\u0003z=\u0000\u025d\u025c\u0001"+
		"\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0001"+
		"\u0000\u0000\u0000\u025f\u0273\u0005l\u0000\u0000\u0260\u0263\u0005\u000e"+
		"\u0000\u0000\u0261\u0262\u0005\n\u0000\u0000\u0262\u0264\u0003z=\u0000"+
		"\u0263\u0261\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000"+
		"\u0264\u0265\u0001\u0000\u0000\u0000\u0265\u0273\u0005l\u0000\u0000\u0266"+
		"\u0269\u0005\u000f\u0000\u0000\u0267\u0268\u0005\n\u0000\u0000\u0268\u026a"+
		"\u0003z=\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000"+
		"\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u0273\u0005l\u0000"+
		"\u0000\u026c\u026d\u0005\u0010\u0000\u0000\u026d\u026e\u0005z\u0000\u0000"+
		"\u026e\u0273\u0005l\u0000\u0000\u026f\u0270\u0003D\"\u0000\u0270\u0271"+
		"\u0005l\u0000\u0000\u0271\u0273\u0001\u0000\u0000\u0000\u0272\u025b\u0001"+
		"\u0000\u0000\u0000\u0272\u0260\u0001\u0000\u0000\u0000\u0272\u0266\u0001"+
		"\u0000\u0000\u0000\u0272\u026c\u0001\u0000\u0000\u0000\u0272\u026f\u0001"+
		"\u0000\u0000\u0000\u0273C\u0001\u0000\u0000\u0000\u0274\u0279\u0005z\u0000"+
		"\u0000\u0275\u0276\u0005p\u0000\u0000\u0276\u0277\u0003F#\u0000\u0277"+
		"\u0278\u0005q\u0000\u0000\u0278\u027a\u0001\u0000\u0000\u0000\u0279\u0275"+
		"\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u027b"+
		"\u0001\u0000\u0000\u0000\u027b\u027c\u0006\"\uffff\uffff\u0000\u027cE"+
		"\u0001\u0000\u0000\u0000\u027d\u0282\u0003z=\u0000\u027e\u027f\u0005m"+
		"\u0000\u0000\u027f\u0281\u0003z=\u0000\u0280\u027e\u0001\u0000\u0000\u0000"+
		"\u0281\u0284\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000"+
		"\u0282\u0283\u0001\u0000\u0000\u0000\u0283G\u0001\u0000\u0000\u0000\u0284"+
		"\u0282\u0001\u0000\u0000\u0000\u0285\u028b\u0003J%\u0000\u0286\u028b\u0003"+
		"L&\u0000\u0287\u028b\u0003N\'\u0000\u0288\u028b\u0003P(\u0000\u0289\u028b"+
		"\u0003R)\u0000\u028a\u0285\u0001\u0000\u0000\u0000\u028a\u0286\u0001\u0000"+
		"\u0000\u0000\u028a\u0287\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000"+
		"\u0000\u0000\u028a\u0289\u0001\u0000\u0000\u0000\u028bI\u0001\u0000\u0000"+
		"\u0000\u028c\u028d\u0005\u0005\u0000\u0000\u028d\u028e\u0003z=\u0000\u028e"+
		"\u0292\u0005\u0006\u0000\u0000\u028f\u0291\u0003<\u001e\u0000\u0290\u028f"+
		"\u0001\u0000\u0000\u0000\u0291\u0294\u0001\u0000\u0000\u0000\u0292\u0290"+
		"\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u02a0"+
		"\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0295\u0296"+
		"\u0005\b\u0000\u0000\u0296\u0297\u0003z=\u0000\u0297\u029b\u0005\u0006"+
		"\u0000\u0000\u0298\u029a\u0003<\u001e\u0000\u0299\u0298\u0001\u0000\u0000"+
		"\u0000\u029a\u029d\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000"+
		"\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029f\u0001\u0000\u0000"+
		"\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u0295\u0001\u0000\u0000"+
		"\u0000\u029f\u02a2\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02aa\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a3\u02a7\u0005\u0007\u0000"+
		"\u0000\u02a4\u02a6\u0003<\u001e\u0000\u02a5\u02a4\u0001\u0000\u0000\u0000"+
		"\u02a6\u02a9\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02ab\u0001\u0000\u0000\u0000"+
		"\u02a9\u02a7\u0001\u0000\u0000\u0000\u02aa\u02a3\u0001\u0000\u0000\u0000"+
		"\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000"+
		"\u02ac\u02ad\u0005\u0003\u0000\u0000\u02ad\u02ae\u0005\u0005\u0000\u0000"+
		"\u02ae\u02af\u0005l\u0000\u0000\u02afK\u0001\u0000\u0000\u0000\u02b0\u02b2"+
		"\u0005\t\u0000\u0000\u02b1\u02b3\u0003z=\u0000\u02b2\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02bd\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b5\u0005\n\u0000\u0000\u02b5\u02b6\u0003z=\u0000"+
		"\u02b6\u02ba\u0005\u0006\u0000\u0000\u02b7\u02b9\u0003<\u001e\u0000\u02b8"+
		"\u02b7\u0001\u0000\u0000\u0000\u02b9\u02bc\u0001\u0000\u0000\u0000\u02ba"+
		"\u02b8\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb"+
		"\u02be\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bd"+
		"\u02b4\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0"+
		"\u02c8\u0001\u0000\u0000\u0000\u02c1\u02c5\u0005\u0007\u0000\u0000\u02c2"+
		"\u02c4\u0003<\u001e\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c7"+
		"\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c6"+
		"\u0001\u0000\u0000\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c8\u02c1\u0001\u0000\u0000\u0000\u02c8\u02c9"+
		"\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02cb"+
		"\u0005\u0003\u0000\u0000\u02cb\u02cc\u0005\t\u0000\u0000\u02cc\u02cd\u0005"+
		"l\u0000\u0000\u02cdM\u0001\u0000\u0000\u0000\u02ce\u02d2\u0005\r\u0000"+
		"\u0000\u02cf\u02d1\u0003<\u001e\u0000\u02d0\u02cf\u0001\u0000\u0000\u0000"+
		"\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d5\u02d6\u0005\u0003\u0000\u0000"+
		"\u02d6\u02d7\u0005\r\u0000\u0000\u02d7\u02d8\u0005l\u0000\u0000\u02d8"+
		"O\u0001\u0000\u0000\u0000\u02d9\u02da\u0005\f\u0000\u0000\u02da\u02db"+
		"\u0005z\u0000\u0000\u02db\u02dd\u0005/\u0000\u0000\u02dc\u02de\u00058"+
		"\u0000\u0000\u02dd\u02dc\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000"+
		"\u0000\u0000\u02de\u02df\u0001\u0000\u0000\u0000\u02df\u02e0\u0003z=\u0000"+
		"\u02e0\u02e1\u00059\u0000\u0000\u02e1\u02e2\u0003z=\u0000\u02e2\u02e6"+
		"\u0005\r\u0000\u0000\u02e3\u02e5\u0003<\u001e\u0000\u02e4\u02e3\u0001"+
		"\u0000\u0000\u0000\u02e5\u02e8\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001"+
		"\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e9\u0001"+
		"\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005"+
		"\u0003\u0000\u0000\u02ea\u02eb\u0005\r\u0000\u0000\u02eb\u02ec\u0005l"+
		"\u0000\u0000\u02ec\u02fe\u0001\u0000\u0000\u0000\u02ed\u02ee\u0005\f\u0000"+
		"\u0000\u02ee\u02ef\u0005z\u0000\u0000\u02ef\u02f0\u0005/\u0000\u0000\u02f0"+
		"\u02f1\u0003T*\u0000\u02f1\u02f5\u0005\r\u0000\u0000\u02f2\u02f4\u0003"+
		"<\u001e\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f7\u0001\u0000"+
		"\u0000\u0000\u02f5\u02f3\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f8\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f8\u02f9\u0005\u0003\u0000\u0000\u02f9\u02fa\u0005\r\u0000"+
		"\u0000\u02fa\u02fb\u0005l\u0000\u0000\u02fb\u02fc\u0006(\uffff\uffff\u0000"+
		"\u02fc\u02fe\u0001\u0000\u0000\u0000\u02fd\u02d9\u0001\u0000\u0000\u0000"+
		"\u02fd\u02ed\u0001\u0000\u0000\u0000\u02feQ\u0001\u0000\u0000\u0000\u02ff"+
		"\u0300\u0005\u000b\u0000\u0000\u0300\u0301\u0003z=\u0000\u0301\u0305\u0005"+
		"\r\u0000\u0000\u0302\u0304\u0003<\u001e\u0000\u0303\u0302\u0001\u0000"+
		"\u0000\u0000\u0304\u0307\u0001\u0000\u0000\u0000\u0305\u0303\u0001\u0000"+
		"\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0308\u0001\u0000"+
		"\u0000\u0000\u0307\u0305\u0001\u0000\u0000\u0000\u0308\u0309\u0005\u0003"+
		"\u0000\u0000\u0309\u030a\u0005\r\u0000\u0000\u030a\u030b\u0005l\u0000"+
		"\u0000\u030bS\u0001\u0000\u0000\u0000\u030c\u030d\u0005z\u0000\u0000\u030d"+
		"\u030e\u0006*\uffff\uffff\u0000\u030eU\u0001\u0000\u0000\u0000\u030f\u0311"+
		"\u0003X,\u0000\u0310\u0312\u0005l\u0000\u0000\u0311\u0310\u0001\u0000"+
		"\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0320\u0001\u0000"+
		"\u0000\u0000\u0313\u0315\u0003`0\u0000\u0314\u0316\u0005l\u0000\u0000"+
		"\u0315\u0314\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000"+
		"\u0316\u0320\u0001\u0000\u0000\u0000\u0317\u0319\u0003f3\u0000\u0318\u031a"+
		"\u0005l\u0000\u0000\u0319\u0318\u0001\u0000\u0000\u0000\u0319\u031a\u0001"+
		"\u0000\u0000\u0000\u031a\u0320\u0001\u0000\u0000\u0000\u031b\u031d\u0003"+
		"l6\u0000\u031c\u031e\u0005l\u0000\u0000\u031d\u031c\u0001\u0000\u0000"+
		"\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031e\u0320\u0001\u0000\u0000"+
		"\u0000\u031f\u030f\u0001\u0000\u0000\u0000\u031f\u0313\u0001\u0000\u0000"+
		"\u0000\u031f\u0317\u0001\u0000\u0000\u0000\u031f\u031b\u0001\u0000\u0000"+
		"\u0000\u0320W\u0001\u0000\u0000\u0000\u0321\u0322\u0005\u0011\u0000\u0000"+
		"\u0322\u0323\u0003Z-\u0000\u0323\u0324\u0005\u0015\u0000\u0000\u0324\u0326"+
		"\u0003\\.\u0000\u0325\u0327\u0003^/\u0000\u0326\u0325\u0001\u0000\u0000"+
		"\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327Y\u0001\u0000\u0000\u0000"+
		"\u0328\u0332\u0005:\u0000\u0000\u0329\u032e\u0003z=\u0000\u032a\u032b"+
		"\u0005m\u0000\u0000\u032b\u032d\u0003z=\u0000\u032c\u032a\u0001\u0000"+
		"\u0000\u0000\u032d\u0330\u0001\u0000\u0000\u0000\u032e\u032c\u0001\u0000"+
		"\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u0332\u0001\u0000"+
		"\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0331\u0328\u0001\u0000"+
		"\u0000\u0000\u0331\u0329\u0001\u0000\u0000\u0000\u0332[\u0001\u0000\u0000"+
		"\u0000\u0333\u0334\u0005z\u0000\u0000\u0334\u0338\u0006.\uffff\uffff\u0000"+
		"\u0335\u0336\u0005z\u0000\u0000\u0336\u0338\u0005z\u0000\u0000\u0337\u0333"+
		"\u0001\u0000\u0000\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0338]\u0001"+
		"\u0000\u0000\u0000\u0339\u033a\u0005\u0016\u0000\u0000\u033a\u033b\u0003"+
		"z=\u0000\u033b_\u0001\u0000\u0000\u0000\u033c\u033d\u0005\u0012\u0000"+
		"\u0000\u033d\u033e\u0005\u0017\u0000\u0000\u033e\u0343\u0005z\u0000\u0000"+
		"\u033f\u0340\u0005p\u0000\u0000\u0340\u0341\u0003b1\u0000\u0341\u0342"+
		"\u0005q\u0000\u0000\u0342\u0344\u0001\u0000\u0000\u0000\u0343\u033f\u0001"+
		"\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u0345\u0001"+
		"\u0000\u0000\u0000\u0345\u0346\u0005\u0018\u0000\u0000\u0346\u0347\u0005"+
		"p\u0000\u0000\u0347\u0348\u0003d2\u0000\u0348\u0349\u0005q\u0000\u0000"+
		"\u0349\u0357\u0001\u0000\u0000\u0000\u034a\u034b\u0005\u0012\u0000\u0000"+
		"\u034b\u034c\u0005\u0017\u0000\u0000\u034c\u0351\u0005z\u0000\u0000\u034d"+
		"\u034e\u0005p\u0000\u0000\u034e\u034f\u0003b1\u0000\u034f\u0350\u0005"+
		"q\u0000\u0000\u0350\u0352\u0001\u0000\u0000\u0000\u0351\u034d\u0001\u0000"+
		"\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000\u0352\u0353\u0001\u0000"+
		"\u0000\u0000\u0353\u0354\u0003X,\u0000\u0354\u0355\u00060\uffff\uffff"+
		"\u0000\u0355\u0357\u0001\u0000\u0000\u0000\u0356\u033c\u0001\u0000\u0000"+
		"\u0000\u0356\u034a\u0001\u0000\u0000\u0000\u0357a\u0001\u0000\u0000\u0000"+
		"\u0358\u035d\u0005z\u0000\u0000\u0359\u035a\u0005m\u0000\u0000\u035a\u035c"+
		"\u0005z\u0000\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035c\u035f\u0001"+
		"\u0000\u0000\u0000\u035d\u035b\u0001\u0000\u0000\u0000\u035d\u035e\u0001"+
		"\u0000\u0000\u0000\u035ec\u0001\u0000\u0000\u0000\u035f\u035d\u0001\u0000"+
		"\u0000\u0000\u0360\u0365\u0003z=\u0000\u0361\u0362\u0005m\u0000\u0000"+
		"\u0362\u0364\u0003z=\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0364\u0367"+
		"\u0001\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0365\u0366"+
		"\u0001\u0000\u0000\u0000\u0366e\u0001\u0000\u0000\u0000\u0367\u0365\u0001"+
		"\u0000\u0000\u0000\u0368\u0369\u0005\u0013\u0000\u0000\u0369\u036a\u0005"+
		"z\u0000\u0000\u036a\u036b\u0005\u0019\u0000\u0000\u036b\u036d\u0003h4"+
		"\u0000\u036c\u036e\u0003^/\u0000\u036d\u036c\u0001\u0000\u0000\u0000\u036d"+
		"\u036e\u0001\u0000\u0000\u0000\u036e\u036f\u0001\u0000\u0000\u0000\u036f"+
		"\u0370\u00063\uffff\uffff\u0000\u0370g\u0001\u0000\u0000\u0000\u0371\u0376"+
		"\u0003j5\u0000\u0372\u0373\u0005m\u0000\u0000\u0373\u0375\u0003j5\u0000"+
		"\u0374\u0372\u0001\u0000\u0000\u0000\u0375\u0378\u0001\u0000\u0000\u0000"+
		"\u0376\u0374\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000"+
		"\u0377i\u0001\u0000\u0000\u0000\u0378\u0376\u0001\u0000\u0000\u0000\u0379"+
		"\u037a\u0005z\u0000\u0000\u037a\u037b\u0005f\u0000\u0000\u037b\u037c\u0003"+
		"z=\u0000\u037ck\u0001\u0000\u0000\u0000\u037d\u037e\u0005\u0014\u0000"+
		"\u0000\u037e\u037f\u0005\u0015\u0000\u0000\u037f\u0381\u0005z\u0000\u0000"+
		"\u0380\u0382\u0003^/\u0000\u0381\u0380\u0001\u0000\u0000\u0000\u0381\u0382"+
		"\u0001\u0000\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u0384"+
		"\u00066\uffff\uffff\u0000\u0384m\u0001\u0000\u0000\u0000\u0385\u0386\u0005"+
		"\u001a\u0000\u0000\u0386\u0387\u0005\u001e\u0000\u0000\u0387\u0388\u0005"+
		"z\u0000\u0000\u0388\u0389\u00053\u0000\u0000\u0389\u038a\u0005z\u0000"+
		"\u0000\u038a\u038b\u0005p\u0000\u0000\u038b\u038c\u0003b1\u0000\u038c"+
		"\u038e\u0005q\u0000\u0000\u038d\u038f\u0005l\u0000\u0000\u038e\u038d\u0001"+
		"\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000\u0000\u038f\u0390\u0001"+
		"\u0000\u0000\u0000\u0390\u0391\u00067\uffff\uffff\u0000\u0391o\u0001\u0000"+
		"\u0000\u0000\u0392\u0393\u0005\u001a\u0000\u0000\u0393\u0394\u0005\u001f"+
		"\u0000\u0000\u0394\u0395\u0005z\u0000\u0000\u0395\u0396\u00055\u0000\u0000"+
		"\u0396\u0398\u0003X,\u0000\u0397\u0399\u0005l\u0000\u0000\u0398\u0397"+
		"\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399\u039a"+
		"\u0001\u0000\u0000\u0000\u039a\u039b\u00068\uffff\uffff\u0000\u039bq\u0001"+
		"\u0000\u0000\u0000\u039c\u039d\u0005\u001a\u0000\u0000\u039d\u039e\u0005"+
		" \u0000\u0000\u039e\u03a2\u0005z\u0000\u0000\u039f\u03a1\u0003t:\u0000"+
		"\u03a0\u039f\u0001\u0000\u0000\u0000\u03a1\u03a4\u0001\u0000\u0000\u0000"+
		"\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000"+
		"\u03a3\u03a6\u0001\u0000\u0000\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000"+
		"\u03a5\u03a7\u0005l\u0000\u0000\u03a6\u03a5\u0001\u0000\u0000\u0000\u03a6"+
		"\u03a7\u0001\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8"+
		"\u03a9\u00069\uffff\uffff\u0000\u03a9s\u0001\u0000\u0000\u0000\u03aa\u03ab"+
		"\u0005A\u0000\u0000\u03ab\u03ac\u0005B\u0000\u0000\u03ac\u03ba\u0005w"+
		"\u0000\u0000\u03ad\u03ae\u0005C\u0000\u0000\u03ae\u03af\u0005D\u0000\u0000"+
		"\u03af\u03ba\u0005w\u0000\u0000\u03b0\u03b1\u0005E\u0000\u0000\u03b1\u03ba"+
		"\u0005w\u0000\u0000\u03b2\u03b3\u0005F\u0000\u0000\u03b3\u03ba\u0005w"+
		"\u0000\u0000\u03b4\u03ba\u0005G\u0000\u0000\u03b5\u03ba\u0005H\u0000\u0000"+
		"\u03b6\u03b7\u0005I\u0000\u0000\u03b7\u03ba\u0005w\u0000\u0000\u03b8\u03ba"+
		"\u0005J\u0000\u0000\u03b9\u03aa\u0001\u0000\u0000\u0000\u03b9\u03ad\u0001"+
		"\u0000\u0000\u0000\u03b9\u03b0\u0001\u0000\u0000\u0000\u03b9\u03b2\u0001"+
		"\u0000\u0000\u0000\u03b9\u03b4\u0001\u0000\u0000\u0000\u03b9\u03b5\u0001"+
		"\u0000\u0000\u0000\u03b9\u03b6\u0001\u0000\u0000\u0000\u03b9\u03b8\u0001"+
		"\u0000\u0000\u0000\u03bau\u0001\u0000\u0000\u0000\u03bb\u03be\u0005\u001a"+
		"\u0000\u0000\u03bc\u03bd\u00052\u0000\u0000\u03bd\u03bf\u00054\u0000\u0000"+
		"\u03be\u03bc\u0001\u0000\u0000\u0000\u03be\u03bf\u0001\u0000\u0000\u0000"+
		"\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0\u03c1\u0005!\u0000\u0000\u03c1"+
		"\u03c6\u0005z\u0000\u0000\u03c2\u03c7\u0005;\u0000\u0000\u03c3\u03c7\u0005"+
		"<\u0000\u0000\u03c4\u03c5\u0005=\u0000\u0000\u03c5\u03c7\u0005>\u0000"+
		"\u0000\u03c6\u03c2\u0001\u0000\u0000\u0000\u03c6\u03c3\u0001\u0000\u0000"+
		"\u0000\u03c6\u03c4\u0001\u0000\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000"+
		"\u0000\u03c8\u03c9\u0003x<\u0000\u03c9\u03ca\u00053\u0000\u0000\u03ca"+
		"\u03ce\u0005z\u0000\u0000\u03cb\u03cc\u0005\f\u0000\u0000\u03cc\u03cd"+
		"\u0005?\u0000\u0000\u03cd\u03cf\u0005@\u0000\u0000\u03ce\u03cb\u0001\u0000"+
		"\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000\u0000\u03cf\u03d5\u0001\u0000"+
		"\u0000\u0000\u03d0\u03d1\u0005\n\u0000\u0000\u03d1\u03d2\u0005p\u0000"+
		"\u0000\u03d2\u03d3\u0003z=\u0000\u03d3\u03d4\u0005q\u0000\u0000\u03d4"+
		"\u03d6\u0001\u0000\u0000\u0000\u03d5\u03d0\u0001\u0000\u0000\u0000\u03d5"+
		"\u03d6\u0001\u0000\u0000\u0000\u03d6\u03d8\u0001\u0000\u0000\u0000\u03d7"+
		"\u03d9\u0003$\u0012\u0000\u03d8\u03d7\u0001\u0000\u0000\u0000\u03d8\u03d9"+
		"\u0001\u0000\u0000\u0000\u03d9\u03da\u0001\u0000\u0000\u0000\u03da\u03db"+
		"\u00034\u001a\u0000\u03db\u03dd\u0005\u0003\u0000\u0000\u03dc\u03de\u0005"+
		"z\u0000\u0000\u03dd\u03dc\u0001\u0000\u0000\u0000\u03dd\u03de\u0001\u0000"+
		"\u0000\u0000\u03de\u03e0\u0001\u0000\u0000\u0000\u03df\u03e1\u0005l\u0000"+
		"\u0000\u03e0\u03df\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000"+
		"\u0000\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e2\u03e3\u0006;\uffff\uffff"+
		"\u0000\u03e3w\u0001\u0000\u0000\u0000\u03e4\u03f6\u0005\u0012\u0000\u0000"+
		"\u03e5\u03f6\u0005\u0013\u0000\u0000\u03e6\u03f6\u0005\u0014\u0000\u0000"+
		"\u03e7\u03e8\u0005\u0012\u0000\u0000\u03e8\u03e9\u00052\u0000\u0000\u03e9"+
		"\u03f6\u0005\u0013\u0000\u0000\u03ea\u03eb\u0005\u0012\u0000\u0000\u03eb"+
		"\u03ec\u00052\u0000\u0000\u03ec\u03f6\u0005\u0014\u0000\u0000\u03ed\u03ee"+
		"\u0005\u0013\u0000\u0000\u03ee\u03ef\u00052\u0000\u0000\u03ef\u03f6\u0005"+
		"\u0014\u0000\u0000\u03f0\u03f1\u0005\u0012\u0000\u0000\u03f1\u03f2\u0005"+
		"2\u0000\u0000\u03f2\u03f3\u0005\u0013\u0000\u0000\u03f3\u03f4\u00052\u0000"+
		"\u0000\u03f4\u03f6\u0005\u0014\u0000\u0000\u03f5\u03e4\u0001\u0000\u0000"+
		"\u0000\u03f5\u03e5\u0001\u0000\u0000\u0000\u03f5\u03e6\u0001\u0000\u0000"+
		"\u0000\u03f5\u03e7\u0001\u0000\u0000\u0000\u03f5\u03ea\u0001\u0000\u0000"+
		"\u0000\u03f5\u03ed\u0001\u0000\u0000\u0000\u03f5\u03f0\u0001\u0000\u0000"+
		"\u0000\u03f6y\u0001\u0000\u0000\u0000\u03f7\u03f8\u0003|>\u0000\u03f8"+
		"{\u0001\u0000\u0000\u0000\u03f9\u03fa\u0003~?\u0000\u03fa}\u0001\u0000"+
		"\u0000\u0000\u03fb\u0400\u0003\u0080@\u0000\u03fc\u03fd\u00052\u0000\u0000"+
		"\u03fd\u03ff\u0003\u0080@\u0000\u03fe\u03fc\u0001\u0000\u0000\u0000\u03ff"+
		"\u0402\u0001\u0000\u0000\u0000\u0400\u03fe\u0001\u0000\u0000\u0000\u0400"+
		"\u0401\u0001\u0000\u0000\u0000\u0401\u007f\u0001\u0000\u0000\u0000\u0402"+
		"\u0400\u0001\u0000\u0000\u0000\u0403\u0408\u0003\u0082A\u0000\u0404\u0405"+
		"\u0005Z\u0000\u0000\u0405\u0407\u0003\u0082A\u0000\u0406\u0404\u0001\u0000"+
		"\u0000\u0000\u0407\u040a\u0001\u0000\u0000\u0000\u0408\u0406\u0001\u0000"+
		"\u0000\u0000\u0408\u0409\u0001\u0000\u0000\u0000\u0409\u0081\u0001\u0000"+
		"\u0000\u0000\u040a\u0408\u0001\u0000\u0000\u0000\u040b\u0411\u0003\u0086"+
		"C\u0000\u040c\u040d\u0003\u0084B\u0000\u040d\u040e\u0003\u0086C\u0000"+
		"\u040e\u0410\u0001\u0000\u0000\u0000\u040f\u040c\u0001\u0000\u0000\u0000"+
		"\u0410\u0413\u0001\u0000\u0000\u0000\u0411\u040f\u0001\u0000\u0000\u0000"+
		"\u0411\u0412\u0001\u0000\u0000\u0000\u0412\u043e\u0001\u0000\u0000\u0000"+
		"\u0413\u0411\u0001\u0000\u0000\u0000\u0414\u0415\u0003\u0086C\u0000\u0415"+
		"\u0416\u0005\\\u0000\u0000\u0416\u0417\u0003\u0086C\u0000\u0417\u0418"+
		"\u0005Z\u0000\u0000\u0418\u0419\u0003\u0086C\u0000\u0419\u043e\u0001\u0000"+
		"\u0000\u0000\u041a\u041c\u0003\u0086C\u0000\u041b\u041d\u0005[\u0000\u0000"+
		"\u041c\u041b\u0001\u0000\u0000\u0000\u041c\u041d\u0001\u0000\u0000\u0000"+
		"\u041d\u041e\u0001\u0000\u0000\u0000\u041e\u041f\u0005/\u0000\u0000\u041f"+
		"\u0420\u0005p\u0000\u0000\u0420\u0425\u0003z=\u0000\u0421\u0422\u0005"+
		"m\u0000\u0000\u0422\u0424\u0003z=\u0000\u0423\u0421\u0001\u0000\u0000"+
		"\u0000\u0424\u0427\u0001\u0000\u0000\u0000\u0425\u0423\u0001\u0000\u0000"+
		"\u0000\u0425\u0426\u0001\u0000\u0000\u0000\u0426\u0428\u0001\u0000\u0000"+
		"\u0000\u0427\u0425\u0001\u0000\u0000\u0000\u0428\u0429\u0005q\u0000\u0000"+
		"\u0429\u043e\u0001\u0000\u0000\u0000\u042a\u042b\u0003\u0086C\u0000\u042b"+
		"\u042d\u00056\u0000\u0000\u042c\u042e\u0005[\u0000\u0000\u042d\u042c\u0001"+
		"\u0000\u0000\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e\u042f\u0001"+
		"\u0000\u0000\u0000\u042f\u0430\u0005Y\u0000\u0000\u0430\u043e\u0001\u0000"+
		"\u0000\u0000\u0431\u0433\u0003\u0086C\u0000\u0432\u0434\u0005[\u0000\u0000"+
		"\u0433\u0432\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000\u0000"+
		"\u0434\u0435\u0001\u0000\u0000\u0000\u0435\u0436\u0005]\u0000\u0000\u0436"+
		"\u0437\u0003\u0086C\u0000\u0437\u043e\u0001\u0000\u0000\u0000\u0438\u0439"+
		"\u0005^\u0000\u0000\u0439\u043a\u0005p\u0000\u0000\u043a\u043b\u0003X"+
		",\u0000\u043b\u043c\u0005q\u0000\u0000\u043c\u043e\u0001\u0000\u0000\u0000"+
		"\u043d\u040b\u0001\u0000\u0000\u0000\u043d\u0414\u0001\u0000\u0000\u0000"+
		"\u043d\u041a\u0001\u0000\u0000\u0000\u043d\u042a\u0001\u0000\u0000\u0000"+
		"\u043d\u0431\u0001\u0000\u0000\u0000\u043d\u0438\u0001\u0000\u0000\u0000"+
		"\u043e\u0083\u0001\u0000\u0000\u0000\u043f\u0440\u0007\u0004\u0000\u0000"+
		"\u0440\u0085\u0001\u0000\u0000\u0000\u0441\u0446\u0003\u0088D\u0000\u0442"+
		"\u0443\u0007\u0005\u0000\u0000\u0443\u0445\u0003\u0088D\u0000\u0444\u0442"+
		"\u0001\u0000\u0000\u0000\u0445\u0448\u0001\u0000\u0000\u0000\u0446\u0444"+
		"\u0001\u0000\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447\u0087"+
		"\u0001\u0000\u0000\u0000\u0448\u0446\u0001\u0000\u0000\u0000\u0449\u044e"+
		"\u0003\u008aE\u0000\u044a\u044b\u0007\u0006\u0000\u0000\u044b\u044d\u0003"+
		"\u008aE\u0000\u044c\u044a\u0001\u0000\u0000\u0000\u044d\u0450\u0001\u0000"+
		"\u0000\u0000\u044e\u044c\u0001\u0000\u0000\u0000\u044e\u044f\u0001\u0000"+
		"\u0000\u0000\u044f\u0089\u0001\u0000\u0000\u0000\u0450\u044e\u0001\u0000"+
		"\u0000\u0000\u0451\u0455\u0003\u008cF\u0000\u0452\u0453\u0007\u0007\u0000"+
		"\u0000\u0453\u0455\u0003\u008aE\u0000\u0454\u0451\u0001\u0000\u0000\u0000"+
		"\u0454\u0452\u0001\u0000\u0000\u0000\u0455\u008b\u0001\u0000\u0000\u0000"+
		"\u0456\u0462\u0003\u0090H\u0000\u0457\u0462\u0003@ \u0000\u0458\u0462"+
		"\u0003\u008eG\u0000\u0459\u045a\u0005p\u0000\u0000\u045a\u045b\u0003z"+
		"=\u0000\u045b\u045c\u0005q\u0000\u0000\u045c\u0462\u0001\u0000\u0000\u0000"+
		"\u045d\u045e\u0005p\u0000\u0000\u045e\u045f\u0003X,\u0000\u045f\u0460"+
		"\u0005q\u0000\u0000\u0460\u0462\u0001\u0000\u0000\u0000\u0461\u0456\u0001"+
		"\u0000\u0000\u0000\u0461\u0457\u0001\u0000\u0000\u0000\u0461\u0458\u0001"+
		"\u0000\u0000\u0000\u0461\u0459\u0001\u0000\u0000\u0000\u0461\u045d\u0001"+
		"\u0000\u0000\u0000\u0462\u008d\u0001\u0000\u0000\u0000\u0463\u0464\u0005"+
		"z\u0000\u0000\u0464\u0466\u0005p\u0000\u0000\u0465\u0467\u0003F#\u0000"+
		"\u0466\u0465\u0001\u0000\u0000\u0000\u0466\u0467\u0001\u0000\u0000\u0000"+
		"\u0467\u0468\u0001\u0000\u0000\u0000\u0468\u0469\u0005q\u0000\u0000\u0469"+
		"\u046a\u0006G\uffff\uffff\u0000\u046a\u008f\u0001\u0000\u0000\u0000\u046b"+
		"\u046c\u0007\b\u0000\u0000\u046c\u0091\u0001\u0000\u0000\u0000\u0089\u0096"+
		"\u009a\u009e\u00a2\u00ac\u00b2\u00c1\u00c6\u00cd\u00d1\u00d8\u00e0\u00e4"+
		"\u00e8\u00ec\u00ef\u00f6\u00fe\u0104\u0108\u010c\u010f\u0116\u011e\u0121"+
		"\u0126\u012f\u0132\u0136\u013b\u013d\u0143\u0145\u014e\u0159\u0166\u016a"+
		"\u016e\u0172\u0175\u017f\u0185\u0189\u018d\u0190\u0199\u019e\u01a3\u01ab"+
		"\u01ad\u01b3\u01b7\u01c0\u01c4\u01cf\u01e8\u01f1\u01f9\u0201\u0207\u020d"+
		"\u0214\u0217\u0221\u0223\u0229\u0232\u0237\u023d\u0248\u0259\u025d\u0263"+
		"\u0269\u0272\u0279\u0282\u028a\u0292\u029b\u02a0\u02a7\u02aa\u02b2\u02ba"+
		"\u02bf\u02c5\u02c8\u02d2\u02dd\u02e6\u02f5\u02fd\u0305\u0311\u0315\u0319"+
		"\u031d\u031f\u0326\u032e\u0331\u0337\u0343\u0351\u0356\u035d\u0365\u036d"+
		"\u0376\u0381\u038e\u0398\u03a2\u03a6\u03b9\u03be\u03c6\u03ce\u03d5\u03d8"+
		"\u03dd\u03e0\u03f5\u0400\u0408\u0411\u041c\u0425\u042d\u0433\u043d\u0446"+
		"\u044e\u0454\u0461\u0466";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}