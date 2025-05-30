// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/tsql/TSQLParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.tsql;

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
public class TSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, INSERT=2, UPDATE=3, DELETE=4, FROM=5, WHERE=6, INTO=7, VALUES=8, 
		SET=9, JOIN=10, LEFT=11, RIGHT=12, INNER=13, OUTER=14, FULL=15, ON=16, 
		AS=17, ORDER=18, GROUP=19, BY=20, HAVING=21, UNION=22, ALL=23, DISTINCT=24, 
		TOP=25, CREATE=26, ALTER=27, DROP=28, TABLE=29, INDEX=30, VIEW=31, PROCEDURE=32, 
		FUNCTION=33, TRIGGER=34, DATABASE=35, SCHEMA=36, PROC=37, BEGIN=38, END=39, 
		IF=40, ELSE=41, WHILE=42, FOR=43, BREAK=44, CONTINUE=45, RETURN=46, DECLARE=47, 
		EXEC=48, EXECUTE=49, TRY=50, CATCH=51, THROW=52, RAISERROR=53, ADD=54, 
		COLUMN=55, RETURNS=56, PRINT=57, USE=58, VARCHAR=59, NVARCHAR=60, CHAR=61, 
		NCHAR=62, TEXT=63, NTEXT=64, INT=65, INTEGER=66, BIGINT=67, SMALLINT=68, 
		TINYINT=69, DECIMAL=70, NUMERIC=71, FLOAT=72, REAL=73, MONEY=74, SMALLMONEY=75, 
		DATETIME=76, DATETIME2=77, DATE=78, TIME=79, TIMESTAMP=80, BIT=81, BINARY=82, 
		VARBINARY=83, IMAGE=84, UNIQUEIDENTIFIER=85, XML=86, PRIMARY=87, KEY=88, 
		FOREIGN=89, REFERENCES=90, UNIQUE=91, NOT=92, NULL=93, DEFAULT=94, CHECK=95, 
		CONSTRAINT=96, IDENTITY=97, AND=98, OR=99, IN=100, EXISTS=101, BETWEEN=102, 
		LIKE=103, IS=104, COLLATE=105, CASE=106, WHEN=107, THEN=108, WITH=109, 
		CTE=110, RECURSIVE=111, PIVOT=112, UNPIVOT=113, OVER=114, PARTITION=115, 
		ROW_NUMBER=116, RANK=117, DENSE_RANK=118, TRANSACTION=119, TRAN=120, COMMIT=121, 
		ROLLBACK=122, SAVE=123, SAVEPOINT=124, PLUS_ASSIGN=125, MINUS_ASSIGN=126, 
		MULT_ASSIGN=127, DIV_ASSIGN=128, MOD_ASSIGN=129, AND_ASSIGN=130, OR_ASSIGN=131, 
		XOR_ASSIGN=132, PLUS=133, MINUS=134, MULT=135, DIV=136, MOD=137, EQ=138, 
		NE=139, LT=140, LE=141, GT=142, GE=143, BIT_AND=144, BIT_OR=145, BIT_XOR=146, 
		BIT_NOT=147, SEMICOLON=148, COMMA=149, DOT=150, COLON=151, LPAREN=152, 
		RPAREN=153, LBRACKET=154, RBRACKET=155, GO=156, DOLLAR=157, AT=158, HASH=159, 
		NUMBER_LITERAL=160, MONEY_LITERAL=161, STRING_LITERAL=162, UNICODE_STRING_LITERAL=163, 
		QUOTED_IDENTIFIER=164, IDENTIFIER=165, GLOBAL_VARIABLE=166, LOCAL_VARIABLE=167, 
		ASC=168, DESC=169, OUTPUT=170, OUT=171, LINE_COMMENT=172, BLOCK_COMMENT=173, 
		WS=174;
	public static final int
		RULE_tsql_file = 0, RULE_batch = 1, RULE_sql_clauses = 2, RULE_sql_clause = 3, 
		RULE_dml_clause = 4, RULE_ddl_clause = 5, RULE_alter_statement = 6, RULE_alter_table_action = 7, 
		RULE_drop_statement = 8, RULE_procedural_clause = 9, RULE_transaction_clause = 10, 
		RULE_other_clause = 11, RULE_create_statement = 12, RULE_create_table = 13, 
		RULE_column_definition = 14, RULE_column_constraint = 15, RULE_create_procedure = 16, 
		RULE_create_function = 17, RULE_create_view = 18, RULE_create_index = 19, 
		RULE_create_database = 20, RULE_parameter_list = 21, RULE_parameter = 22, 
		RULE_default_value = 23, RULE_data_type = 24, RULE_select_statement = 25, 
		RULE_common_table_expression = 26, RULE_select_list = 27, RULE_select_list_elem = 28, 
		RULE_table_source = 29, RULE_join_type = 30, RULE_order_by_expression = 31, 
		RULE_insert_statement = 32, RULE_update_statement = 33, RULE_set_clause = 34, 
		RULE_delete_statement = 35, RULE_declare_statement = 36, RULE_variable_declaration = 37, 
		RULE_set_statement = 38, RULE_if_statement = 39, RULE_while_statement = 40, 
		RULE_try_catch_statement = 41, RULE_execute_statement = 42, RULE_argument_list = 43, 
		RULE_argument = 44, RULE_return_statement = 45, RULE_break_statement = 46, 
		RULE_continue_statement = 47, RULE_throw_statement = 48, RULE_error_number = 49, 
		RULE_error_message = 50, RULE_error_state = 51, RULE_begin_transaction = 52, 
		RULE_commit_transaction = 53, RULE_rollback_transaction = 54, RULE_save_transaction = 55, 
		RULE_use_statement = 56, RULE_print_statement = 57, RULE_expression = 58, 
		RULE_or_expression = 59, RULE_and_expression = 60, RULE_equality_expression = 61, 
		RULE_relational_expression = 62, RULE_additive_expression = 63, RULE_multiplicative_expression = 64, 
		RULE_unary_expression = 65, RULE_primary_expression = 66, RULE_function_call = 67, 
		RULE_case_expression = 68, RULE_search_condition = 69, RULE_literal = 70, 
		RULE_table_name = 71, RULE_view_name = 72, RULE_procedure_name = 73, RULE_function_name = 74, 
		RULE_index_name = 75, RULE_database_name = 76, RULE_schema_name = 77, 
		RULE_object_name = 78, RULE_column_name = 79, RULE_table_alias = 80, RULE_column_alias = 81, 
		RULE_cte_name = 82, RULE_variable_name = 83, RULE_parameter_name = 84, 
		RULE_transaction_name = 85, RULE_savepoint_name = 86, RULE_identifier = 87;
	private static String[] makeRuleNames() {
		return new String[] {
			"tsql_file", "batch", "sql_clauses", "sql_clause", "dml_clause", "ddl_clause", 
			"alter_statement", "alter_table_action", "drop_statement", "procedural_clause", 
			"transaction_clause", "other_clause", "create_statement", "create_table", 
			"column_definition", "column_constraint", "create_procedure", "create_function", 
			"create_view", "create_index", "create_database", "parameter_list", "parameter", 
			"default_value", "data_type", "select_statement", "common_table_expression", 
			"select_list", "select_list_elem", "table_source", "join_type", "order_by_expression", 
			"insert_statement", "update_statement", "set_clause", "delete_statement", 
			"declare_statement", "variable_declaration", "set_statement", "if_statement", 
			"while_statement", "try_catch_statement", "execute_statement", "argument_list", 
			"argument", "return_statement", "break_statement", "continue_statement", 
			"throw_statement", "error_number", "error_message", "error_state", "begin_transaction", 
			"commit_transaction", "rollback_transaction", "save_transaction", "use_statement", 
			"print_statement", "expression", "or_expression", "and_expression", "equality_expression", 
			"relational_expression", "additive_expression", "multiplicative_expression", 
			"unary_expression", "primary_expression", "function_call", "case_expression", 
			"search_condition", "literal", "table_name", "view_name", "procedure_name", 
			"function_name", "index_name", "database_name", "schema_name", "object_name", 
			"column_name", "table_alias", "column_alias", "cte_name", "variable_name", 
			"parameter_name", "transaction_name", "savepoint_name", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'&='", "'|='", "'^='", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", null, 
			"'<'", "'<='", "'>'", "'>='", "'&'", "'|'", "'^'", "'~'", "';'", "','", 
			"'.'", "':'", "'('", "')'", "'['", "']'", null, "'$'", "'@'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "INSERT", "UPDATE", "DELETE", "FROM", "WHERE", "INTO", 
			"VALUES", "SET", "JOIN", "LEFT", "RIGHT", "INNER", "OUTER", "FULL", "ON", 
			"AS", "ORDER", "GROUP", "BY", "HAVING", "UNION", "ALL", "DISTINCT", "TOP", 
			"CREATE", "ALTER", "DROP", "TABLE", "INDEX", "VIEW", "PROCEDURE", "FUNCTION", 
			"TRIGGER", "DATABASE", "SCHEMA", "PROC", "BEGIN", "END", "IF", "ELSE", 
			"WHILE", "FOR", "BREAK", "CONTINUE", "RETURN", "DECLARE", "EXEC", "EXECUTE", 
			"TRY", "CATCH", "THROW", "RAISERROR", "ADD", "COLUMN", "RETURNS", "PRINT", 
			"USE", "VARCHAR", "NVARCHAR", "CHAR", "NCHAR", "TEXT", "NTEXT", "INT", 
			"INTEGER", "BIGINT", "SMALLINT", "TINYINT", "DECIMAL", "NUMERIC", "FLOAT", 
			"REAL", "MONEY", "SMALLMONEY", "DATETIME", "DATETIME2", "DATE", "TIME", 
			"TIMESTAMP", "BIT", "BINARY", "VARBINARY", "IMAGE", "UNIQUEIDENTIFIER", 
			"XML", "PRIMARY", "KEY", "FOREIGN", "REFERENCES", "UNIQUE", "NOT", "NULL", 
			"DEFAULT", "CHECK", "CONSTRAINT", "IDENTITY", "AND", "OR", "IN", "EXISTS", 
			"BETWEEN", "LIKE", "IS", "COLLATE", "CASE", "WHEN", "THEN", "WITH", "CTE", 
			"RECURSIVE", "PIVOT", "UNPIVOT", "OVER", "PARTITION", "ROW_NUMBER", "RANK", 
			"DENSE_RANK", "TRANSACTION", "TRAN", "COMMIT", "ROLLBACK", "SAVE", "SAVEPOINT", 
			"PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "EQ", "NE", "LT", "LE", "GT", "GE", "BIT_AND", "BIT_OR", "BIT_XOR", 
			"BIT_NOT", "SEMICOLON", "COMMA", "DOT", "COLON", "LPAREN", "RPAREN", 
			"LBRACKET", "RBRACKET", "GO", "DOLLAR", "AT", "HASH", "NUMBER_LITERAL", 
			"MONEY_LITERAL", "STRING_LITERAL", "UNICODE_STRING_LITERAL", "QUOTED_IDENTIFIER", 
			"IDENTIFIER", "GLOBAL_VARIABLE", "LOCAL_VARIABLE", "ASC", "DESC", "OUTPUT", 
			"OUT", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
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
	public String getGrammarFileName() { return "TSQLParser.g4"; }

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
	    private Set<String> declaredProcedures = new HashSet<>();
	    
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
	    
	    private void addProcedure(String procName) {
	        declaredProcedures.add(procName.toLowerCase());
	    }
	    
	    private void checkProcedureExists(String procName, int line, int column) {
	        if (!declaredProcedures.contains(procName.toLowerCase())) {
	            addError("Procedure '" + procName + "' does not exist", line, column, "SEMANTIC");
	        }
	    }

	public TSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tsql_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TSQLParser.EOF, 0); }
		public List<BatchContext> batch() {
			return getRuleContexts(BatchContext.class);
		}
		public BatchContext batch(int i) {
			return getRuleContext(BatchContext.class,i);
		}
		public Tsql_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsql_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterTsql_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitTsql_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitTsql_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tsql_fileContext tsql_file() throws RecognitionException {
		Tsql_fileContext _localctx = new Tsql_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tsql_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 437963244481544734L) != 0) || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 28673L) != 0)) {
				{
				{
				setState(176);
				batch();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
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
	public static class BatchContext extends ParserRuleContext {
		public Sql_clausesContext sql_clauses() {
			return getRuleContext(Sql_clausesContext.class,0);
		}
		public TerminalNode GO() { return getToken(TSQLParser.GO, 0); }
		public BatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_batch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterBatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitBatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitBatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BatchContext batch() throws RecognitionException {
		BatchContext _localctx = new BatchContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_batch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			sql_clauses();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GO) {
				{
				setState(185);
				match(GO);
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
	public static class Sql_clausesContext extends ParserRuleContext {
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(TSQLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(TSQLParser.SEMICOLON, i);
		}
		public Sql_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterSql_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitSql_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitSql_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_clausesContext sql_clauses() throws RecognitionException {
		Sql_clausesContext _localctx = new Sql_clausesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_clauses);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			sql_clause();
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(189);
						match(SEMICOLON);
						}
					}

					setState(192);
					sql_clause();
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class Sql_clauseContext extends ParserRuleContext {
		public Dml_clauseContext dml_clause() {
			return getRuleContext(Dml_clauseContext.class,0);
		}
		public Ddl_clauseContext ddl_clause() {
			return getRuleContext(Ddl_clauseContext.class,0);
		}
		public Procedural_clauseContext procedural_clause() {
			return getRuleContext(Procedural_clauseContext.class,0);
		}
		public Transaction_clauseContext transaction_clause() {
			return getRuleContext(Transaction_clauseContext.class,0);
		}
		public Other_clauseContext other_clause() {
			return getRuleContext(Other_clauseContext.class,0);
		}
		public Sql_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterSql_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitSql_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitSql_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_clauseContext sql_clause() throws RecognitionException {
		Sql_clauseContext _localctx = new Sql_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_clause);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				dml_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				ddl_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				procedural_clause();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				transaction_clause();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				other_clause();
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
	public static class Dml_clauseContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Dml_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterDml_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitDml_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitDml_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dml_clauseContext dml_clause() throws RecognitionException {
		Dml_clauseContext _localctx = new Dml_clauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dml_clause);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				select_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				insert_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				update_statement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				delete_statement();
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
	public static class Ddl_clauseContext extends ParserRuleContext {
		public Create_statementContext create_statement() {
			return getRuleContext(Create_statementContext.class,0);
		}
		public Alter_statementContext alter_statement() {
			return getRuleContext(Alter_statementContext.class,0);
		}
		public Drop_statementContext drop_statement() {
			return getRuleContext(Drop_statementContext.class,0);
		}
		public Ddl_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterDdl_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitDdl_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitDdl_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ddl_clauseContext ddl_clause() throws RecognitionException {
		Ddl_clauseContext _localctx = new Ddl_clauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ddl_clause);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				create_statement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				alter_statement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				drop_statement();
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
	public static class Alter_statementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(TSQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(TSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Alter_table_actionContext> alter_table_action() {
			return getRuleContexts(Alter_table_actionContext.class);
		}
		public Alter_table_actionContext alter_table_action(int i) {
			return getRuleContext(Alter_table_actionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TSQLParser.COMMA, i);
		}
		public TerminalNode PROCEDURE() { return getToken(TSQLParser.PROCEDURE, 0); }
		public Procedure_nameContext procedure_name() {
			return getRuleContext(Procedure_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(TSQLParser.AS, 0); }
		public Sql_clausesContext sql_clauses() {
			return getRuleContext(Sql_clausesContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(TSQLParser.FUNCTION, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TSQLParser.RPAREN, 0); }
		public TerminalNode RETURNS() { return getToken(TSQLParser.RETURNS, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(TSQLParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(TSQLParser.END, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Alter_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterAlter_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitAlter_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitAlter_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_statementContext alter_statement() throws RecognitionException {
		Alter_statementContext _localctx = new Alter_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alter_statement);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(ALTER);
				setState(217);
				match(TABLE);
				setState(218);
				table_name();
				setState(219);
				alter_table_action();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(220);
					match(COMMA);
					setState(221);
					alter_table_action();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(ALTER);
				setState(228);
				match(PROCEDURE);
				setState(229);
				procedure_name();
				setState(230);
				match(AS);
				setState(231);
				sql_clauses();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(ALTER);
				setState(234);
				match(FUNCTION);
				setState(235);
				function_name();
				setState(236);
				match(LPAREN);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL_VARIABLE) {
					{
					setState(237);
					parameter_list();
					}
				}

				setState(240);
				match(RPAREN);
				setState(241);
				match(RETURNS);
				setState(242);
				data_type();
				setState(243);
				match(AS);
				setState(244);
				match(BEGIN);
				setState(245);
				sql_clauses();
				setState(246);
				match(END);
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
	public static class Alter_table_actionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(TSQLParser.ADD, 0); }
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(TSQLParser.COLUMN, 0); }
		public TerminalNode DROP() { return getToken(TSQLParser.DROP, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(TSQLParser.ALTER, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Alter_table_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterAlter_table_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitAlter_table_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitAlter_table_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_actionContext alter_table_action() throws RecognitionException {
		Alter_table_actionContext _localctx = new Alter_table_actionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_alter_table_action);
		int _la;
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(ADD);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(251);
					match(COLUMN);
					}
				}

				setState(254);
				column_definition();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(DROP);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(256);
					match(COLUMN);
					}
				}

				setState(259);
				column_name();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(ALTER);
				setState(261);
				match(COLUMN);
				setState(262);
				column_name();
				setState(263);
				data_type();
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
	public static class Drop_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(TSQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(TSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode PROCEDURE() { return getToken(TSQLParser.PROCEDURE, 0); }
		public Procedure_nameContext procedure_name() {
			return getRuleContext(Procedure_nameContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(TSQLParser.FUNCTION, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode VIEW() { return getToken(TSQLParser.VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(TSQLParser.INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode ON() { return getToken(TSQLParser.ON, 0); }
		public TerminalNode DATABASE() { return getToken(TSQLParser.DATABASE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterDrop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitDrop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitDrop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_statementContext drop_statement() throws RecognitionException {
		Drop_statementContext _localctx = new Drop_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_drop_statement);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(DROP);
				setState(268);
				match(TABLE);
				setState(269);
				table_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(DROP);
				setState(271);
				match(PROCEDURE);
				setState(272);
				procedure_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				match(DROP);
				setState(274);
				match(FUNCTION);
				setState(275);
				function_name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(DROP);
				setState(277);
				match(VIEW);
				setState(278);
				view_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
				match(DROP);
				setState(280);
				match(INDEX);
				setState(281);
				index_name();
				setState(282);
				match(ON);
				setState(283);
				table_name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				match(DROP);
				setState(286);
				match(DATABASE);
				setState(287);
				database_name();
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
	public static class Procedural_clauseContext extends ParserRuleContext {
		public Declare_statementContext declare_statement() {
			return getRuleContext(Declare_statementContext.class,0);
		}
		public Set_statementContext set_statement() {
			return getRuleContext(Set_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Try_catch_statementContext try_catch_statement() {
			return getRuleContext(Try_catch_statementContext.class,0);
		}
		public Execute_statementContext execute_statement() {
			return getRuleContext(Execute_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Throw_statementContext throw_statement() {
			return getRuleContext(Throw_statementContext.class,0);
		}
		public Procedural_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedural_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterProcedural_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitProcedural_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitProcedural_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedural_clauseContext procedural_clause() throws RecognitionException {
		Procedural_clauseContext _localctx = new Procedural_clauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_procedural_clause);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				declare_statement();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				set_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				while_statement();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				try_catch_statement();
				}
				break;
			case EXEC:
			case EXECUTE:
				enterOuterAlt(_localctx, 6);
				{
				setState(295);
				execute_statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				return_statement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 8);
				{
				setState(297);
				break_statement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 9);
				{
				setState(298);
				continue_statement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 10);
				{
				setState(299);
				throw_statement();
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
	public static class Transaction_clauseContext extends ParserRuleContext {
		public Begin_transactionContext begin_transaction() {
			return getRuleContext(Begin_transactionContext.class,0);
		}
		public Commit_transactionContext commit_transaction() {
			return getRuleContext(Commit_transactionContext.class,0);
		}
		public Rollback_transactionContext rollback_transaction() {
			return getRuleContext(Rollback_transactionContext.class,0);
		}
		public Save_transactionContext save_transaction() {
			return getRuleContext(Save_transactionContext.class,0);
		}
		public Transaction_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterTransaction_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitTransaction_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitTransaction_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_clauseContext transaction_clause() throws RecognitionException {
		Transaction_clauseContext _localctx = new Transaction_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_transaction_clause);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				begin_transaction();
				}
				break;
			case COMMIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				commit_transaction();
				}
				break;
			case ROLLBACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				rollback_transaction();
				}
				break;
			case SAVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				save_transaction();
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
	public static class Other_clauseContext extends ParserRuleContext {
		public Use_statementContext use_statement() {
			return getRuleContext(Use_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public Other_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterOther_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitOther_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitOther_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Other_clauseContext other_clause() throws RecognitionException {
		Other_clauseContext _localctx = new Other_clauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_other_clause);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				use_statement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				print_statement();
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
	public static class Create_statementContext extends ParserRuleContext {
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Create_procedureContext create_procedure() {
			return getRuleContext(Create_procedureContext.class,0);
		}
		public Create_functionContext create_function() {
			return getRuleContext(Create_functionContext.class,0);
		}
		public Create_viewContext create_view() {
			return getRuleContext(Create_viewContext.class,0);
		}
		public Create_indexContext create_index() {
			return getRuleContext(Create_indexContext.class,0);
		}
		public Create_databaseContext create_database() {
			return getRuleContext(Create_databaseContext.class,0);
		}
		public Create_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterCreate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitCreate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitCreate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_statementContext create_statement() throws RecognitionException {
		Create_statementContext _localctx = new Create_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_statement);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				create_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				create_procedure();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				create_function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				create_view();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				create_index();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(317);
				create_database();
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
	public static class Create_tableContext extends ParserRuleContext {
		public Table_nameContext table_name;
		public TerminalNode CREATE() { return getToken(TSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(TSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TSQLParser.LPAREN, 0); }
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TSQLParser.COMMA, i);
		}
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitCreate_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitCreate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(CREATE);
			setState(321);
			match(TABLE);
			setState(322);
			((Create_tableContext)_localctx).table_name = table_name();
			setState(323);
			match(LPAREN);
			setState(324);
			column_definition();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(325);
				match(COMMA);
				setState(326);
				column_definition();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			match(RPAREN);

			        addTable((((Create_tableContext)_localctx).table_name!=null?_input.getText(((Create_tableContext)_localctx).table_name.start,((Create_tableContext)_localctx).table_name.stop):null));
			        addSymbol((((Create_tableContext)_localctx).table_name!=null?_input.getText(((Create_tableContext)_localctx).table_name.start,((Create_tableContext)_localctx).table_name.stop):null), "table", (((Create_tableContext)_localctx).table_name!=null?(((Create_tableContext)_localctx).table_name.start):null).getLine(), (((Create_tableContext)_localctx).table_name!=null?(((Create_tableContext)_localctx).table_name.start):null).getCharPositionInLine());
			    
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
	public static class Column_definitionContext extends ParserRuleContext {
		public Column_nameContext column_name;
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitColumn_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitColumn_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			((Column_definitionContext)_localctx).column_name = column_name();
			setState(336);
			data_type();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 1529L) != 0)) {
				{
				{
				setState(337);
				column_constraint();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        addSymbol((((Column_definitionContext)_localctx).column_name!=null?_input.getText(((Column_definitionContext)_localctx).column_name.start,((Column_definitionContext)_localctx).column_name.stop):null), "column", (((Column_definitionContext)_localctx).column_name!=null?(((Column_definitionContext)_localctx).column_name.start):null).getLine(), (((Column_definitionContext)_localctx).column_name!=null?(((Column_definitionContext)_localctx).column_name.start):null).getCharPositionInLine());
			    
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
	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(TSQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(TSQLParser.NULL, 0); }
		public TerminalNode PRIMARY() { return getToken(TSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(TSQLParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(TSQLParser.UNIQUE, 0); }
		public TerminalNode DEFAULT() { return getToken(TSQLParser.DEFAULT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(TSQLParser.CHECK, 0); }
		public TerminalNode LPAREN() { return getToken(TSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TSQLParser.RPAREN, 0); }
		public TerminalNode IDENTITY() { return getToken(TSQLParser.IDENTITY, 0); }
		public List<TerminalNode> NUMBER_LITERAL() { return getTokens(TSQLParser.NUMBER_LITERAL); }
		public TerminalNode NUMBER_LITERAL(int i) {
			return getToken(TSQLParser.NUMBER_LITERAL, i);
		}
		public TerminalNode COMMA() { return getToken(TSQLParser.COMMA, 0); }
		public TerminalNode REFERENCES() { return getToken(TSQLParser.REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_column_constraint);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(NOT);
				setState(346);
				match(NULL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(NULL);
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				match(PRIMARY);
				setState(349);
				match(KEY);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(UNIQUE);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 5);
				{
				setState(351);
				match(DEFAULT);
				setState(352);
				expression();
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 6);
				{
				setState(353);
				match(CHECK);
				setState(354);
				match(LPAREN);
				setState(355);
				expression();
				setState(356);
				match(RPAREN);
				}
				break;
			case IDENTITY:
				enterOuterAlt(_localctx, 7);
				{
				setState(358);
				match(IDENTITY);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(359);
					match(LPAREN);
					setState(360);
					match(NUMBER_LITERAL);
					setState(361);
					match(COMMA);
					setState(362);
					match(NUMBER_LITERAL);
					setState(363);
					match(RPAREN);
					}
				}

				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 8);
				{
				setState(366);
				match(REFERENCES);
				setState(367);
				table_name();
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(368);
					match(LPAREN);
					setState(369);
					column_name();
					setState(370);
					match(RPAREN);
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
	public static class Create_procedureContext extends ParserRuleContext {
		public Procedure_nameContext procedure_name;
		public TerminalNode CREATE() { return getToken(TSQLParser.CREATE, 0); }
		public Procedure_nameContext procedure_name() {
			return getRuleContext(Procedure_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(TSQLParser.AS, 0); }
		public Sql_clausesContext sql_clauses() {
			return getRuleContext(Sql_clausesContext.class,0);
		}
		public TerminalNode PROCEDURE() { return getToken(TSQLParser.PROCEDURE, 0); }
		public TerminalNode PROC() { return getToken(TSQLParser.PROC, 0); }
		public TerminalNode LPAREN() { return getToken(TSQLParser.LPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TSQLParser.RPAREN, 0); }
		public Create_procedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterCreate_procedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitCreate_procedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitCreate_procedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedureContext create_procedure() throws RecognitionException {
		Create_procedureContext _localctx = new Create_procedureContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_create_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(CREATE);
			setState(377);
			_la = _input.LA(1);
			if ( !(_la==PROCEDURE || _la==PROC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(378);
			((Create_procedureContext)_localctx).procedure_name = procedure_name();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(379);
				match(LPAREN);
				setState(380);
				parameter_list();
				setState(381);
				match(RPAREN);
				}
			}

			setState(385);
			match(AS);
			setState(386);
			sql_clauses();

			        addProcedure((((Create_procedureContext)_localctx).procedure_name!=null?_input.getText(((Create_procedureContext)_localctx).procedure_name.start,((Create_procedureContext)_localctx).procedure_name.stop):null));
			        addSymbol((((Create_procedureContext)_localctx).procedure_name!=null?_input.getText(((Create_procedureContext)_localctx).procedure_name.start,((Create_procedureContext)_localctx).procedure_name.stop):null), "procedure", (((Create_procedureContext)_localctx).procedure_name!=null?(((Create_procedureContext)_localctx).procedure_name.start):null).getLine(), (((Create_procedureContext)_localctx).procedure_name!=null?(((Create_procedureContext)_localctx).procedure_name.start):null).getCharPositionInLine());
			    
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
	public static class Create_functionContext extends ParserRuleContext {
		public Function_nameContext function_name;
		public TerminalNode CREATE() { return getToken(TSQLParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(TSQLParser.FUNCTION, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TSQLParser.RPAREN, 0); }
		public TerminalNode RETURNS() { return getToken(TSQLParser.RETURNS, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode AS() { return getToken(TSQLParser.AS, 0); }
		public TerminalNode BEGIN() { return getToken(TSQLParser.BEGIN, 0); }
		public Sql_clausesContext sql_clauses() {
			return getRuleContext(Sql_clausesContext.class,0);
		}
		public TerminalNode END() { return getToken(TSQLParser.END, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Create_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterCreate_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitCreate_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitCreate_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_functionContext create_function() throws RecognitionException {
		Create_functionContext _localctx = new Create_functionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_create_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(CREATE);
			setState(390);
			match(FUNCTION);
			setState(391);
			((Create_functionContext)_localctx).function_name = function_name();
			setState(392);
			match(LPAREN);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL_VARIABLE) {
				{
				setState(393);
				parameter_list();
				}
			}

			setState(396);
			match(RPAREN);
			setState(397);
			match(RETURNS);
			setState(398);
			data_type();
			setState(399);
			match(AS);
			setState(400);
			match(BEGIN);
			setState(401);
			sql_clauses();
			setState(402);
			match(END);

			        addSymbol((((Create_functionContext)_localctx).function_name!=null?_input.getText(((Create_functionContext)_localctx).function_name.start,((Create_functionContext)_localctx).function_name.stop):null), "function", (((Create_functionContext)_localctx).function_name!=null?(((Create_functionContext)_localctx).function_name.start):null).getLine(), (((Create_functionContext)_localctx).function_name!=null?(((Create_functionContext)_localctx).function_name.start):null).getCharPositionInLine());
			    
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
	public static class Create_viewContext extends ParserRuleContext {
		public View_nameContext view_name;
		public TerminalNode CREATE() { return getToken(TSQLParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(TSQLParser.VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(TSQLParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Create_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterCreate_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitCreate_view(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitCreate_view(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_viewContext create_view() throws RecognitionException {
		Create_viewContext _localctx = new Create_viewContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_create_view);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(CREATE);
			setState(406);
			match(VIEW);
			setState(407);
			((Create_viewContext)_localctx).view_name = view_name();
			setState(408);
			match(AS);
			setState(409);
			select_statement();

			        addSymbol((((Create_viewContext)_localctx).view_name!=null?_input.getText(((Create_viewContext)_localctx).view_name.start,((Create_viewContext)_localctx).view_name.stop):null), "view", (((Create_viewContext)_localctx).view_name!=null?(((Create_viewContext)_localctx).view_name.start):null).getLine(), (((Create_viewContext)_localctx).view_name!=null?(((Create_viewContext)_localctx).view_name.start):null).getCharPositionInLine());
			    
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
	public static class Create_indexContext extends ParserRuleContext {
		public Index_nameContext index_name;
		public Table_nameContext table_name;
		public TerminalNode CREATE() { return getToken(TSQLParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(TSQLParser.INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode ON() { return getToken(TSQLParser.ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TSQLParser.LPAREN, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TSQLParser.RPAREN, 0); }
		public TerminalNode UNIQUE() { return getToken(TSQLParser.UNIQUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TSQLParser.COMMA, i);
		}
		public Create_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterCreate_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitCreate_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitCreate_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_indexContext create_index() throws RecognitionException {
		Create_indexContext _localctx = new Create_indexContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_create_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(CREATE);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(413);
				match(UNIQUE);
				}
			}

			setState(416);
			match(INDEX);
			setState(417);
			((Create_indexContext)_localctx).index_name = index_name();
			setState(418);
			match(ON);
			setState(419);
			((Create_indexContext)_localctx).table_name = table_name();
			setState(420);
			match(LPAREN);
			setState(421);
			column_name();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(422);
				match(COMMA);
				setState(423);
				column_name();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
			match(RPAREN);

			        checkTableExists((((Create_indexContext)_localctx).table_name!=null?_input.getText(((Create_indexContext)_localctx).table_name.start,((Create_indexContext)_localctx).table_name.stop):null), (((Create_indexContext)_localctx).table_name!=null?(((Create_indexContext)_localctx).table_name.start):null).getLine(), (((Create_indexContext)_localctx).table_name!=null?(((Create_indexContext)_localctx).table_name.start):null).getCharPositionInLine());
			        addSymbol((((Create_indexContext)_localctx).index_name!=null?_input.getText(((Create_indexContext)_localctx).index_name.start,((Create_indexContext)_localctx).index_name.stop):null), "index", (((Create_indexContext)_localctx).index_name!=null?(((Create_indexContext)_localctx).index_name.start):null).getLine(), (((Create_indexContext)_localctx).index_name!=null?(((Create_indexContext)_localctx).index_name.start):null).getCharPositionInLine());
			    
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
	public static class Create_databaseContext extends ParserRuleContext {
		public Database_nameContext database_name;
		public TerminalNode CREATE() { return getToken(TSQLParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(TSQLParser.DATABASE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Create_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterCreate_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitCreate_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitCreate_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_databaseContext create_database() throws RecognitionException {
		Create_databaseContext _localctx = new Create_databaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_create_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(CREATE);
			setState(433);
			match(DATABASE);
			setState(434);
			((Create_databaseContext)_localctx).database_name = database_name();

			        addSymbol((((Create_databaseContext)_localctx).database_name!=null?_input.getText(((Create_databaseContext)_localctx).database_name.start,((Create_databaseContext)_localctx).database_name.stop):null), "database", (((Create_databaseContext)_localctx).database_name!=null?(((Create_databaseContext)_localctx).database_name.start):null).getLine(), (((Create_databaseContext)_localctx).database_name!=null?(((Create_databaseContext)_localctx).database_name.start):null).getCharPositionInLine());
			    
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
	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TSQLParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			parameter();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(438);
				match(COMMA);
				setState(439);
				parameter();
				}
				}
				setState(444);
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
		public Parameter_nameContext parameter_name;
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TSQLParser.EQ, 0); }
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public TerminalNode OUTPUT() { return getToken(TSQLParser.OUTPUT, 0); }
		public TerminalNode OUT() { return getToken(TSQLParser.OUT, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			((ParameterContext)_localctx).parameter_name = parameter_name();
			setState(446);
			data_type();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(447);
				match(EQ);
				setState(448);
				default_value();
				}
			}

			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT || _la==OUT) {
				{
				setState(451);
				_la = _input.LA(1);
				if ( !(_la==OUTPUT || _la==OUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}


			        addVariable((((ParameterContext)_localctx).parameter_name!=null?_input.getText(((ParameterContext)_localctx).parameter_name.start,((ParameterContext)_localctx).parameter_name.stop):null));
			        addSymbol((((ParameterContext)_localctx).parameter_name!=null?_input.getText(((ParameterContext)_localctx).parameter_name.start,((ParameterContext)_localctx).parameter_name.stop):null), "parameter", (((ParameterContext)_localctx).parameter_name!=null?(((ParameterContext)_localctx).parameter_name.start):null).getLine(), (((ParameterContext)_localctx).parameter_name!=null?(((ParameterContext)_localctx).parameter_name.start):null).getCharPositionInLine());
			    
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
	public static class Default_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterDefault_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitDefault_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitDefault_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
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
	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode VARCHAR() { return getToken(TSQLParser.VARCHAR, 0); }
		public TerminalNode LPAREN() { return getToken(TSQLParser.LPAREN, 0); }
		public List<TerminalNode> NUMBER_LITERAL() { return getTokens(TSQLParser.NUMBER_LITERAL); }
		public TerminalNode NUMBER_LITERAL(int i) {
			return getToken(TSQLParser.NUMBER_LITERAL, i);
		}
		public TerminalNode RPAREN() { return getToken(TSQLParser.RPAREN, 0); }
		public TerminalNode NVARCHAR() { return getToken(TSQLParser.NVARCHAR, 0); }
		public TerminalNode CHAR() { return getToken(TSQLParser.CHAR, 0); }
		public TerminalNode NCHAR() { return getToken(TSQLParser.NCHAR, 0); }
		public TerminalNode TEXT() { return getToken(TSQLParser.TEXT, 0); }
		public TerminalNode NTEXT() { return getToken(TSQLParser.NTEXT, 0); }
		public TerminalNode INT() { return getToken(TSQLParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(TSQLParser.INTEGER, 0); }
		public TerminalNode BIGINT() { return getToken(TSQLParser.BIGINT, 0); }
		public TerminalNode SMALLINT() { return getToken(TSQLParser.SMALLINT, 0); }
		public TerminalNode TINYINT() { return getToken(TSQLParser.TINYINT, 0); }
		public TerminalNode DECIMAL() { return getToken(TSQLParser.DECIMAL, 0); }
		public TerminalNode COMMA() { return getToken(TSQLParser.COMMA, 0); }
		public TerminalNode NUMERIC() { return getToken(TSQLParser.NUMERIC, 0); }
		public TerminalNode FLOAT() { return getToken(TSQLParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(TSQLParser.REAL, 0); }
		public TerminalNode MONEY() { return getToken(TSQLParser.MONEY, 0); }
		public TerminalNode SMALLMONEY() { return getToken(TSQLParser.SMALLMONEY, 0); }
		public TerminalNode DATETIME() { return getToken(TSQLParser.DATETIME, 0); }
		public TerminalNode DATETIME2() { return getToken(TSQLParser.DATETIME2, 0); }
		public TerminalNode DATE() { return getToken(TSQLParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(TSQLParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(TSQLParser.TIMESTAMP, 0); }
		public TerminalNode BIT() { return getToken(TSQLParser.BIT, 0); }
		public TerminalNode BINARY() { return getToken(TSQLParser.BINARY, 0); }
		public TerminalNode VARBINARY() { return getToken(TSQLParser.VARBINARY, 0); }
		public TerminalNode IMAGE() { return getToken(TSQLParser.IMAGE, 0); }
		public TerminalNode UNIQUEIDENTIFIER() { return getToken(TSQLParser.UNIQUEIDENTIFIER, 0); }
		public TerminalNode XML() { return getToken(TSQLParser.XML, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_data_type);
		int _la;
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(VARCHAR);
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(459);
					match(LPAREN);
					setState(460);
					match(NUMBER_LITERAL);
					setState(461);
					match(RPAREN);
					}
				}

				}
				break;
			case NVARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(NVARCHAR);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(465);
					match(LPAREN);
					setState(466);
					match(NUMBER_LITERAL);
					setState(467);
					match(RPAREN);
					}
				}

				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				match(CHAR);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(471);
					match(LPAREN);
					setState(472);
					match(NUMBER_LITERAL);
					setState(473);
					match(RPAREN);
					}
				}

				}
				break;
			case NCHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				match(NCHAR);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(477);
					match(LPAREN);
					setState(478);
					match(NUMBER_LITERAL);
					setState(479);
					match(RPAREN);
					}
				}

				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(482);
				match(TEXT);
				}
				break;
			case NTEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(483);
				match(NTEXT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 7);
				{
				setState(484);
				match(INT);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 8);
				{
				setState(485);
				match(INTEGER);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(486);
				match(BIGINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 10);
				{
				setState(487);
				match(SMALLINT);
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 11);
				{
				setState(488);
				match(TINYINT);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 12);
				{
				setState(489);
				match(DECIMAL);
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(490);
					match(LPAREN);
					setState(491);
					match(NUMBER_LITERAL);
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(492);
						match(COMMA);
						setState(493);
						match(NUMBER_LITERAL);
						}
					}

					setState(496);
					match(RPAREN);
					}
				}

				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 13);
				{
				setState(499);
				match(NUMERIC);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(500);
					match(LPAREN);
					setState(501);
					match(NUMBER_LITERAL);
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(502);
						match(COMMA);
						setState(503);
						match(NUMBER_LITERAL);
						}
					}

					setState(506);
					match(RPAREN);
					}
				}

				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 14);
				{
				setState(509);
				match(FLOAT);
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
			case REAL:
				enterOuterAlt(_localctx, 15);
				{
				setState(515);
				match(REAL);
				}
				break;
			case MONEY:
				enterOuterAlt(_localctx, 16);
				{
				setState(516);
				match(MONEY);
				}
				break;
			case SMALLMONEY:
				enterOuterAlt(_localctx, 17);
				{
				setState(517);
				match(SMALLMONEY);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 18);
				{
				setState(518);
				match(DATETIME);
				}
				break;
			case DATETIME2:
				enterOuterAlt(_localctx, 19);
				{
				setState(519);
				match(DATETIME2);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 20);
				{
				setState(520);
				match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 21);
				{
				setState(521);
				match(TIME);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 22);
				{
				setState(522);
				match(TIMESTAMP);
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 23);
				{
				setState(523);
				match(BIT);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 24);
				{
				setState(524);
				match(BINARY);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(525);
					match(LPAREN);
					setState(526);
					match(NUMBER_LITERAL);
					setState(527);
					match(RPAREN);
					}
				}

				}
				break;
			case VARBINARY:
				enterOuterAlt(_localctx, 25);
				{
				setState(530);
				match(VARBINARY);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(531);
					match(LPAREN);
					setState(532);
					match(NUMBER_LITERAL);
					setState(533);
					match(RPAREN);
					}
				}

				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 26);
				{
				setState(536);
				match(IMAGE);
				}
				break;
			case UNIQUEIDENTIFIER:
				enterOuterAlt(_localctx, 27);
				{
				setState(537);
				match(UNIQUEIDENTIFIER);
				}
				break;
			case XML:
				enterOuterAlt(_localctx, 28);
				{
				setState(538);
				match(XML);
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
	public static class Select_statementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(TSQLParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TSQLParser.WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode TOP() { return getToken(TSQLParser.TOP, 0); }
		public TerminalNode LPAREN() { return getToken(TSQLParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TSQLParser.RPAREN, 0); }
		public TerminalNode FROM() { return getToken(TSQLParser.FROM, 0); }
		public List<Table_sourceContext> table_source() {
			return getRuleContexts(Table_sourceContext.class);
		}
		public Table_sourceContext table_source(int i) {
			return getRuleContext(Table_sourceContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(TSQLParser.WHERE, 0); }
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(TSQLParser.GROUP, 0); }
		public List<TerminalNode> BY() { return getTokens(TSQLParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(TSQLParser.BY, i);
		}
		public TerminalNode HAVING() { return getToken(TSQLParser.HAVING, 0); }
		public TerminalNode ORDER() { return getToken(TSQLParser.ORDER, 0); }
		public List<Order_by_expressionContext> order_by_expression() {
			return getRuleContexts(Order_by_expressionContext.class);
		}
		public Order_by_expressionContext order_by_expression(int i) {
			return getRuleContext(Order_by_expressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(TSQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(TSQLParser.DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TSQLParser.COMMA, i);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitSelect_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(541);
				match(WITH);
				setState(542);
				common_table_expression();
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(543);
					match(COMMA);
					setState(544);
					common_table_expression();
					}
					}
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(552);
			match(SELECT);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(553);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(556);
				match(TOP);
				setState(557);
				match(LPAREN);
				setState(558);
				expression();
				setState(559);
				match(RPAREN);
				}
			}

			setState(563);
			select_list();
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(564);
				match(FROM);
				setState(565);
				table_source(0);
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(566);
					match(COMMA);
					setState(567);
					table_source(0);
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(575);
				match(WHERE);
				setState(576);
				search_condition();
				}
			}

			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(579);
				match(GROUP);
				setState(580);
				match(BY);
				setState(581);
				expression();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(582);
					match(COMMA);
					setState(583);
					expression();
					}
					}
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(591);
				match(HAVING);
				setState(592);
				search_condition();
				}
			}

			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(595);
				match(ORDER);
				setState(596);
				match(BY);
				setState(597);
				order_by_expression();
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(598);
					match(COMMA);
					setState(599);
					order_by_expression();
					}
					}
					setState(604);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class Common_table_expressionContext extends ParserRuleContext {
		public Cte_nameContext cte_name;
		public Cte_nameContext cte_name() {
			return getRuleContext(Cte_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(TSQLParser.AS, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(TSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TSQLParser.LPAREN, i);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TSQLParser.RPAREN, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TSQLParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			((Common_table_expressionContext)_localctx).cte_name = cte_name();
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(608);
				match(LPAREN);
				setState(609);
				column_name();
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(610);
					match(COMMA);
					setState(611);
					column_name();
					}
					}
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(617);
				match(RPAREN);
				}
			}

			setState(621);
			match(AS);
			setState(622);
			match(LPAREN);
			setState(623);
			select_statement();
			setState(624);
			match(RPAREN);

			        addSymbol((((Common_table_expressionContext)_localctx).cte_name!=null?_input.getText(((Common_table_expressionContext)_localctx).cte_name.start,((Common_table_expressionContext)_localctx).cte_name.stop):null), "cte", (((Common_table_expressionContext)_localctx).cte_name!=null?(((Common_table_expressionContext)_localctx).cte_name.start):null).getLine(), (((Common_table_expressionContext)_localctx).cte_name!=null?(((Common_table_expressionContext)_localctx).cte_name.start):null).getCharPositionInLine());
			    
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
	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_elemContext> select_list_elem() {
			return getRuleContexts(Select_list_elemContext.class);
		}
		public Select_list_elemContext select_list_elem(int i) {
			return getRuleContext(Select_list_elemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TSQLParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			select_list_elem();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(628);
				match(COMMA);
				setState(629);
				select_list_elem();
				}
				}
				setState(634);
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
	public static class Select_list_elemContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(TSQLParser.MULT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TSQLParser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(TSQLParser.AS, 0); }
		public Select_list_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterSelect_list_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitSelect_list_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitSelect_list_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_elemContext select_list_elem() throws RecognitionException {
		Select_list_elemContext _localctx = new Select_list_elemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_select_list_elem);
		int _la;
		try {
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				match(MULT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				table_name();
				setState(637);
				match(DOT);
				setState(638);
				match(MULT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(640);
				expression();
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==QUOTED_IDENTIFIER || _la==IDENTIFIER) {
					{
					setState(642);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(641);
						match(AS);
						}
					}

					setState(644);
					column_alias();
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
	public static class Table_sourceContext extends ParserRuleContext {
		public Table_nameContext table_name;
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(TSQLParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(TSQLParser.LPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TSQLParser.RPAREN, 0); }
		public List<Table_sourceContext> table_source() {
			return getRuleContexts(Table_sourceContext.class);
		}
		public Table_sourceContext table_source(int i) {
			return getRuleContext(Table_sourceContext.class,i);
		}
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public TerminalNode ON() { return getToken(TSQLParser.ON, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Table_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterTable_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitTable_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitTable_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_sourceContext table_source() throws RecognitionException {
		return table_source(0);
	}

	private Table_sourceContext table_source(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Table_sourceContext _localctx = new Table_sourceContext(_ctx, _parentState);
		Table_sourceContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_table_source, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_IDENTIFIER:
			case IDENTIFIER:
				{
				setState(650);
				((Table_sourceContext)_localctx).table_name = table_name();
				setState(655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(651);
						match(AS);
						}
					}

					setState(654);
					table_alias();
					}
					break;
				}

				        checkTableExists((((Table_sourceContext)_localctx).table_name!=null?_input.getText(((Table_sourceContext)_localctx).table_name.start,((Table_sourceContext)_localctx).table_name.stop):null), (((Table_sourceContext)_localctx).table_name!=null?(((Table_sourceContext)_localctx).table_name.start):null).getLine(), (((Table_sourceContext)_localctx).table_name!=null?(((Table_sourceContext)_localctx).table_name.start):null).getCharPositionInLine());
				    
				}
				break;
			case LPAREN:
				{
				setState(659);
				match(LPAREN);
				setState(660);
				select_statement();
				setState(661);
				match(RPAREN);
				setState(666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(662);
						match(AS);
						}
					}

					setState(665);
					table_alias();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Table_sourceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_table_source);
					setState(670);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(671);
					join_type();
					setState(672);
					table_source(0);
					setState(673);
					match(ON);
					setState(674);
					search_condition();
					}
					} 
				}
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
	public static class Join_typeContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(TSQLParser.JOIN, 0); }
		public TerminalNode INNER() { return getToken(TSQLParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(TSQLParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(TSQLParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(TSQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(TSQLParser.FULL, 0); }
		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterJoin_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitJoin_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitJoin_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_join_type);
		int _la;
		try {
			setState(700);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(681);
					match(INNER);
					}
				}

				setState(684);
				match(JOIN);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				match(LEFT);
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(686);
					match(OUTER);
					}
				}

				setState(689);
				match(JOIN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(690);
				match(RIGHT);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(691);
					match(OUTER);
					}
				}

				setState(694);
				match(JOIN);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(695);
				match(FULL);
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(696);
					match(OUTER);
					}
				}

				setState(699);
				match(JOIN);
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
	public static class Order_by_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(TSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(TSQLParser.DESC, 0); }
		public Order_by_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterOrder_by_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitOrder_by_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitOrder_by_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_expressionContext order_by_expression() throws RecognitionException {
		Order_by_expressionContext _localctx = new Order_by_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_order_by_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			expression();
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(703);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
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
	public static class Insert_statementContext extends ParserRuleContext {
		public Table_nameContext table_name;
		public TerminalNode INSERT() { return getToken(TSQLParser.INSERT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(TSQLParser.VALUES, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(TSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TSQLParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TSQLParser.RPAREN, i);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode INTO() { return getToken(TSQLParser.INTO, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TSQLParser.COMMA, i);
		}
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitInsert_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitInsert_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(INSERT);
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(707);
				match(INTO);
				}
			}

			setState(710);
			((Insert_statementContext)_localctx).table_name = table_name();
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(711);
				match(LPAREN);
				setState(712);
				column_name();
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(713);
					match(COMMA);
					setState(714);
					column_name();
					}
					}
					setState(719);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(720);
				match(RPAREN);
				}
			}

			setState(737);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				{
				setState(724);
				match(VALUES);
				setState(725);
				match(LPAREN);
				setState(726);
				expression();
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(727);
					match(COMMA);
					setState(728);
					expression();
					}
					}
					setState(733);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(734);
				match(RPAREN);
				}
				break;
			case SELECT:
			case WITH:
				{
				setState(736);
				select_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        checkTableExists((((Insert_statementContext)_localctx).table_name!=null?_input.getText(((Insert_statementContext)_localctx).table_name.start,((Insert_statementContext)_localctx).table_name.stop):null), (((Insert_statementContext)_localctx).table_name!=null?(((Insert_statementContext)_localctx).table_name.start):null).getLine(), (((Insert_statementContext)_localctx).table_name!=null?(((Insert_statementContext)_localctx).table_name.start):null).getCharPositionInLine());
			    
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
	public static class Update_statementContext extends ParserRuleContext {
		public Table_nameContext table_name;
		public TerminalNode UPDATE() { return getToken(TSQLParser.UPDATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode SET() { return getToken(TSQLParser.SET, 0); }
		public List<Set_clauseContext> set_clause() {
			return getRuleContexts(Set_clauseContext.class);
		}
		public Set_clauseContext set_clause(int i) {
			return getRuleContext(Set_clauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TSQLParser.COMMA, i);
		}
		public TerminalNode WHERE() { return getToken(TSQLParser.WHERE, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitUpdate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitUpdate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(UPDATE);
			setState(742);
			((Update_statementContext)_localctx).table_name = table_name();
			setState(743);
			match(SET);
			setState(744);
			set_clause();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(745);
				match(COMMA);
				setState(746);
				set_clause();
				}
				}
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(752);
				match(WHERE);
				setState(753);
				search_condition();
				}
			}


			        checkTableExists((((Update_statementContext)_localctx).table_name!=null?_input.getText(((Update_statementContext)_localctx).table_name.start,((Update_statementContext)_localctx).table_name.stop):null), (((Update_statementContext)_localctx).table_name!=null?(((Update_statementContext)_localctx).table_name.start):null).getLine(), (((Update_statementContext)_localctx).table_name!=null?(((Update_statementContext)_localctx).table_name.start):null).getCharPositionInLine());
			    
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
	public static class Set_clauseContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TSQLParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitSet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_clauseContext set_clause() throws RecognitionException {
		Set_clauseContext _localctx = new Set_clauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_set_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			column_name();
			setState(759);
			match(EQ);
			setState(760);
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
	public static class Delete_statementContext extends ParserRuleContext {
		public Table_nameContext table_name;
		public TerminalNode DELETE() { return getToken(TSQLParser.DELETE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TSQLParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(TSQLParser.WHERE, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitDelete_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitDelete_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(DELETE);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(763);
				match(FROM);
				}
			}

			setState(766);
			((Delete_statementContext)_localctx).table_name = table_name();
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(767);
				match(WHERE);
				setState(768);
				search_condition();
				}
			}


			        checkTableExists((((Delete_statementContext)_localctx).table_name!=null?_input.getText(((Delete_statementContext)_localctx).table_name.start,((Delete_statementContext)_localctx).table_name.stop):null), (((Delete_statementContext)_localctx).table_name!=null?(((Delete_statementContext)_localctx).table_name.start):null).getLine(), (((Delete_statementContext)_localctx).table_name!=null?(((Delete_statementContext)_localctx).table_name.start):null).getCharPositionInLine());
			    
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
	public static class Declare_statementContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(TSQLParser.DECLARE, 0); }
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TSQLParser.COMMA, i);
		}
		public Declare_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterDeclare_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitDeclare_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitDeclare_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_statementContext declare_statement() throws RecognitionException {
		Declare_statementContext _localctx = new Declare_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_declare_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(DECLARE);
			setState(774);
			variable_declaration();
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(775);
				match(COMMA);
				setState(776);
				variable_declaration();
				}
				}
				setState(781);
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
	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_nameContext variable_name;
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TSQLParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			((Variable_declarationContext)_localctx).variable_name = variable_name();
			setState(783);
			data_type();
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(784);
				match(EQ);
				setState(785);
				expression();
				}
			}


			        addVariable((((Variable_declarationContext)_localctx).variable_name!=null?_input.getText(((Variable_declarationContext)_localctx).variable_name.start,((Variable_declarationContext)_localctx).variable_name.stop):null));
			        addSymbol((((Variable_declarationContext)_localctx).variable_name!=null?_input.getText(((Variable_declarationContext)_localctx).variable_name.start,((Variable_declarationContext)_localctx).variable_name.stop):null), "variable", (((Variable_declarationContext)_localctx).variable_name!=null?(((Variable_declarationContext)_localctx).variable_name.start):null).getLine(), (((Variable_declarationContext)_localctx).variable_name!=null?(((Variable_declarationContext)_localctx).variable_name.start):null).getCharPositionInLine());
			    
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
	public static class Set_statementContext extends ParserRuleContext {
		public Variable_nameContext variable_name;
		public TerminalNode SET() { return getToken(TSQLParser.SET, 0); }
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TSQLParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterSet_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitSet_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitSet_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_statementContext set_statement() throws RecognitionException {
		Set_statementContext _localctx = new Set_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_set_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(SET);
			setState(791);
			((Set_statementContext)_localctx).variable_name = variable_name();
			setState(792);
			match(EQ);
			setState(793);
			expression();

			        checkVariableExists((((Set_statementContext)_localctx).variable_name!=null?_input.getText(((Set_statementContext)_localctx).variable_name.start,((Set_statementContext)_localctx).variable_name.stop):null), (((Set_statementContext)_localctx).variable_name!=null?(((Set_statementContext)_localctx).variable_name.start):null).getLine(), (((Set_statementContext)_localctx).variable_name!=null?(((Set_statementContext)_localctx).variable_name.start):null).getCharPositionInLine());
			    
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
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TSQLParser.IF, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public List<Sql_clausesContext> sql_clauses() {
			return getRuleContexts(Sql_clausesContext.class);
		}
		public Sql_clausesContext sql_clauses(int i) {
			return getRuleContext(Sql_clausesContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TSQLParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(IF);
			setState(797);
			search_condition();
			setState(798);
			sql_clauses();
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(799);
				match(ELSE);
				setState(800);
				sql_clauses();
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
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(TSQLParser.WHILE, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Sql_clausesContext sql_clauses() {
			return getRuleContext(Sql_clausesContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(WHILE);
			setState(804);
			search_condition();
			setState(805);
			sql_clauses();
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
	public static class Try_catch_statementContext extends ParserRuleContext {
		public List<TerminalNode> BEGIN() { return getTokens(TSQLParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(TSQLParser.BEGIN, i);
		}
		public List<TerminalNode> TRY() { return getTokens(TSQLParser.TRY); }
		public TerminalNode TRY(int i) {
			return getToken(TSQLParser.TRY, i);
		}
		public List<Sql_clausesContext> sql_clauses() {
			return getRuleContexts(Sql_clausesContext.class);
		}
		public Sql_clausesContext sql_clauses(int i) {
			return getRuleContext(Sql_clausesContext.class,i);
		}
		public List<TerminalNode> END() { return getTokens(TSQLParser.END); }
		public TerminalNode END(int i) {
			return getToken(TSQLParser.END, i);
		}
		public List<TerminalNode> CATCH() { return getTokens(TSQLParser.CATCH); }
		public TerminalNode CATCH(int i) {
			return getToken(TSQLParser.CATCH, i);
		}
		public Try_catch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_catch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterTry_catch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitTry_catch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitTry_catch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_catch_statementContext try_catch_statement() throws RecognitionException {
		Try_catch_statementContext _localctx = new Try_catch_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_try_catch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(BEGIN);
			setState(808);
			match(TRY);
			setState(809);
			sql_clauses();
			setState(810);
			match(END);
			setState(811);
			match(TRY);
			setState(812);
			match(BEGIN);
			setState(813);
			match(CATCH);
			setState(814);
			sql_clauses();
			setState(815);
			match(END);
			setState(816);
			match(CATCH);
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
	public static class Execute_statementContext extends ParserRuleContext {
		public Procedure_nameContext procedure_name;
		public Procedure_nameContext procedure_name() {
			return getRuleContext(Procedure_nameContext.class,0);
		}
		public TerminalNode EXEC() { return getToken(TSQLParser.EXEC, 0); }
		public TerminalNode EXECUTE() { return getToken(TSQLParser.EXECUTE, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Execute_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterExecute_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitExecute_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitExecute_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execute_statementContext execute_statement() throws RecognitionException {
		Execute_statementContext _localctx = new Execute_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_execute_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_la = _input.LA(1);
			if ( !(_la==EXEC || _la==EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(819);
			((Execute_statementContext)_localctx).procedure_name = procedure_name();
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 1152928101676630531L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 255L) != 0)) {
				{
				setState(820);
				argument_list();
				}
			}


			        checkProcedureExists((((Execute_statementContext)_localctx).procedure_name!=null?_input.getText(((Execute_statementContext)_localctx).procedure_name.start,((Execute_statementContext)_localctx).procedure_name.stop):null), (((Execute_statementContext)_localctx).procedure_name!=null?(((Execute_statementContext)_localctx).procedure_name.start):null).getLine(), (((Execute_statementContext)_localctx).procedure_name!=null?(((Execute_statementContext)_localctx).procedure_name.start):null).getCharPositionInLine());
			    
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
	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TSQLParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			argument();
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(826);
				match(COMMA);
				setState(827);
				argument();
				}
				}
				setState(832);
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
	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TSQLParser.EQ, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_argument);
		try {
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(833);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				parameter_name();
				setState(835);
				match(EQ);
				setState(836);
				expression();
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
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(TSQLParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(RETURN);
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 1152928101676630531L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 255L) != 0)) {
				{
				setState(841);
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
	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(TSQLParser.BREAK, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(BREAK);
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
	public static class Continue_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(TSQLParser.CONTINUE, 0); }
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitContinue_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(CONTINUE);
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
	public static class Throw_statementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(TSQLParser.THROW, 0); }
		public Error_numberContext error_number() {
			return getRuleContext(Error_numberContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(TSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TSQLParser.COMMA, i);
		}
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public Error_stateContext error_state() {
			return getRuleContext(Error_stateContext.class,0);
		}
		public Throw_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterThrow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitThrow_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitThrow_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throw_statementContext throw_statement() throws RecognitionException {
		Throw_statementContext _localctx = new Throw_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_throw_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(THROW);
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 1152928101676630531L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 255L) != 0)) {
				{
				setState(849);
				error_number();
				setState(850);
				match(COMMA);
				setState(851);
				error_message();
				setState(852);
				match(COMMA);
				setState(853);
				error_state();
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
	public static class Error_numberContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Error_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterError_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitError_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitError_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_numberContext error_number() throws RecognitionException {
		Error_numberContext _localctx = new Error_numberContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_error_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
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
	public static class Error_messageContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
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
	public static class Error_stateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Error_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterError_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitError_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitError_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_stateContext error_state() throws RecognitionException {
		Error_stateContext _localctx = new Error_stateContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_error_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
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
	public static class Begin_transactionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(TSQLParser.BEGIN, 0); }
		public TerminalNode TRANSACTION() { return getToken(TSQLParser.TRANSACTION, 0); }
		public TerminalNode TRAN() { return getToken(TSQLParser.TRAN, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_transactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_transaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterBegin_transaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitBegin_transaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitBegin_transaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_transactionContext begin_transaction() throws RecognitionException {
		Begin_transactionContext _localctx = new Begin_transactionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_begin_transaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(BEGIN);
			setState(864);
			_la = _input.LA(1);
			if ( !(_la==TRANSACTION || _la==TRAN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUOTED_IDENTIFIER || _la==IDENTIFIER) {
				{
				setState(865);
				transaction_name();
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
	public static class Commit_transactionContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(TSQLParser.COMMIT, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode TRANSACTION() { return getToken(TSQLParser.TRANSACTION, 0); }
		public TerminalNode TRAN() { return getToken(TSQLParser.TRAN, 0); }
		public Commit_transactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_transaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterCommit_transaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitCommit_transaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitCommit_transaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_transactionContext commit_transaction() throws RecognitionException {
		Commit_transactionContext _localctx = new Commit_transactionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_commit_transaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			match(COMMIT);
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION || _la==TRAN) {
				{
				setState(869);
				_la = _input.LA(1);
				if ( !(_la==TRANSACTION || _la==TRAN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUOTED_IDENTIFIER || _la==IDENTIFIER) {
				{
				setState(872);
				transaction_name();
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
	public static class Rollback_transactionContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(TSQLParser.ROLLBACK, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode TRANSACTION() { return getToken(TSQLParser.TRANSACTION, 0); }
		public TerminalNode TRAN() { return getToken(TSQLParser.TRAN, 0); }
		public Rollback_transactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_transaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterRollback_transaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitRollback_transaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitRollback_transaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_transactionContext rollback_transaction() throws RecognitionException {
		Rollback_transactionContext _localctx = new Rollback_transactionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_rollback_transaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(ROLLBACK);
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION || _la==TRAN) {
				{
				setState(876);
				_la = _input.LA(1);
				if ( !(_la==TRANSACTION || _la==TRAN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(879);
				transaction_name();
				}
				break;
			case 2:
				{
				setState(880);
				savepoint_name();
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
	public static class Save_transactionContext extends ParserRuleContext {
		public TerminalNode SAVE() { return getToken(TSQLParser.SAVE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode TRANSACTION() { return getToken(TSQLParser.TRANSACTION, 0); }
		public TerminalNode TRAN() { return getToken(TSQLParser.TRAN, 0); }
		public Save_transactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save_transaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterSave_transaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitSave_transaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitSave_transaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Save_transactionContext save_transaction() throws RecognitionException {
		Save_transactionContext _localctx = new Save_transactionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_save_transaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(SAVE);
			setState(884);
			_la = _input.LA(1);
			if ( !(_la==TRANSACTION || _la==TRAN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(885);
			savepoint_name();
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
	public static class Use_statementContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(TSQLParser.USE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Use_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterUse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitUse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitUse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_statementContext use_statement() throws RecognitionException {
		Use_statementContext _localctx = new Use_statementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_use_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(USE);
			setState(888);
			database_name();
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
	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(TSQLParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitPrint_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitPrint_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(PRINT);
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
	public static class ExpressionContext extends ParserRuleContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			or_expression();
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
	public static class Or_expressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(TSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(TSQLParser.OR, i);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitOr_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			and_expression();
			setState(900);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(896);
					match(OR);
					setState(897);
					and_expression();
					}
					} 
				}
				setState(902);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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
	public static class And_expressionContext extends ParserRuleContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(TSQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TSQLParser.AND, i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			equality_expression();
			setState(908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(904);
					match(AND);
					setState(905);
					equality_expression();
					}
					} 
				}
				setState(910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(TSQLParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(TSQLParser.EQ, i);
		}
		public List<TerminalNode> NE() { return getTokens(TSQLParser.NE); }
		public TerminalNode NE(int i) {
			return getToken(TSQLParser.NE, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_equality_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			relational_expression();
			setState(916);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(912);
					_la = _input.LA(1);
					if ( !(_la==EQ || _la==NE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(913);
					relational_expression();
					}
					} 
				}
				setState(918);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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
	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(TSQLParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(TSQLParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(TSQLParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(TSQLParser.LE, i);
		}
		public List<TerminalNode> GT() { return getTokens(TSQLParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(TSQLParser.GT, i);
		}
		public List<TerminalNode> GE() { return getTokens(TSQLParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(TSQLParser.GE, i);
		}
		public TerminalNode BETWEEN() { return getToken(TSQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(TSQLParser.AND, 0); }
		public TerminalNode NOT() { return getToken(TSQLParser.NOT, 0); }
		public TerminalNode IN() { return getToken(TSQLParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(TSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TSQLParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(TSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TSQLParser.COMMA, i);
		}
		public TerminalNode LIKE() { return getToken(TSQLParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(TSQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(TSQLParser.NULL, 0); }
		public TerminalNode EXISTS() { return getToken(TSQLParser.EXISTS, 0); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_relational_expression);
		int _la;
		try {
			int _alt;
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				additive_expression();
				setState(924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(920);
						_la = _input.LA(1);
						if ( !(((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 15L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(921);
						additive_expression();
						}
						} 
					}
					setState(926);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				additive_expression();
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(928);
					match(NOT);
					}
				}

				setState(931);
				match(BETWEEN);
				setState(932);
				additive_expression();
				setState(933);
				match(AND);
				setState(934);
				additive_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(936);
				additive_expression();
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(937);
					match(NOT);
					}
				}

				setState(940);
				match(IN);
				setState(941);
				match(LPAREN);
				setState(951);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case NULL:
				case EXISTS:
				case CASE:
				case PLUS:
				case MINUS:
				case LPAREN:
				case NUMBER_LITERAL:
				case MONEY_LITERAL:
				case STRING_LITERAL:
				case UNICODE_STRING_LITERAL:
				case QUOTED_IDENTIFIER:
				case IDENTIFIER:
				case GLOBAL_VARIABLE:
				case LOCAL_VARIABLE:
					{
					setState(942);
					expression();
					setState(947);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(943);
						match(COMMA);
						setState(944);
						expression();
						}
						}
						setState(949);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case SELECT:
				case WITH:
					{
					setState(950);
					select_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(953);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(955);
				additive_expression();
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(956);
					match(NOT);
					}
				}

				setState(959);
				match(LIKE);
				setState(960);
				additive_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(962);
				additive_expression();
				setState(963);
				match(IS);
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(964);
					match(NOT);
					}
				}

				setState(967);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(969);
				match(EXISTS);
				setState(970);
				match(LPAREN);
				setState(971);
				select_statement();
				setState(972);
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
	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(TSQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(TSQLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(TSQLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(TSQLParser.MINUS, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_additive_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			multiplicative_expression();
			setState(981);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(977);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(978);
					multiplicative_expression();
					}
					} 
				}
				setState(983);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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
	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(TSQLParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(TSQLParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(TSQLParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(TSQLParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(TSQLParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(TSQLParser.MOD, i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_multiplicative_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			unary_expression();
			setState(989);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(985);
					_la = _input.LA(1);
					if ( !(((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & 7L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(986);
					unary_expression();
					}
					} 
				}
				setState(991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
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
	public static class Unary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(TSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TSQLParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(TSQLParser.NOT, 0); }
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unary_expression);
		int _la;
		try {
			setState(995);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case CASE:
			case LPAREN:
			case NUMBER_LITERAL:
			case MONEY_LITERAL:
			case STRING_LITERAL:
			case UNICODE_STRING_LITERAL:
			case QUOTED_IDENTIFIER:
			case IDENTIFIER:
			case GLOBAL_VARIABLE:
			case LOCAL_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				primary_expression();
				}
				break;
			case NOT:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				_la = _input.LA(1);
				if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 6597069766657L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(994);
				unary_expression();
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
	public static class Primary_expressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TSQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TSQLParser.RPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_primary_expression);
		try {
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				variable_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(999);
				column_name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1000);
				function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1001);
				case_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1002);
				match(LPAREN);
				setState(1003);
				expression();
				setState(1004);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1006);
				match(LPAREN);
				setState(1007);
				select_statement();
				setState(1008);
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
	public static class Function_callContext extends ParserRuleContext {
		public Function_nameContext function_name;
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TSQLParser.RPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			((Function_callContext)_localctx).function_name = function_name();
			setState(1013);
			match(LPAREN);
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 1152928101676630531L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 255L) != 0)) {
				{
				setState(1014);
				argument_list();
				}
			}

			setState(1017);
			match(RPAREN);

			        addSymbol((((Function_callContext)_localctx).function_name!=null?_input.getText(((Function_callContext)_localctx).function_name.start,((Function_callContext)_localctx).function_name.stop):null), "function_call", (((Function_callContext)_localctx).function_name!=null?(((Function_callContext)_localctx).function_name.start):null).getLine(), (((Function_callContext)_localctx).function_name!=null?(((Function_callContext)_localctx).function_name.start):null).getCharPositionInLine());
			    
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
	public static class Case_expressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(TSQLParser.CASE, 0); }
		public TerminalNode END() { return getToken(TSQLParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(TSQLParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(TSQLParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(TSQLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(TSQLParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(TSQLParser.ELSE, 0); }
		public Case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterCase_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitCase_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitCase_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_expressionContext case_expression() throws RecognitionException {
		Case_expressionContext _localctx = new Case_expressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_case_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(CASE);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 1152928101676630531L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 255L) != 0)) {
				{
				setState(1021);
				expression();
				}
			}

			setState(1029); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1024);
				match(WHEN);
				setState(1025);
				expression();
				setState(1026);
				match(THEN);
				setState(1027);
				expression();
				}
				}
				setState(1031); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1033);
				match(ELSE);
				setState(1034);
				expression();
				}
			}

			setState(1037);
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
	public static class Search_conditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Search_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterSearch_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitSearch_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitSearch_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_conditionContext search_condition() throws RecognitionException {
		Search_conditionContext _localctx = new Search_conditionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_search_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER_LITERAL() { return getToken(TSQLParser.NUMBER_LITERAL, 0); }
		public TerminalNode MONEY_LITERAL() { return getToken(TSQLParser.MONEY_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TSQLParser.STRING_LITERAL, 0); }
		public TerminalNode UNICODE_STRING_LITERAL() { return getToken(TSQLParser.UNICODE_STRING_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(TSQLParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			_la = _input.LA(1);
			if ( !(_la==NULL || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 15L) != 0)) ) {
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
	public static class Table_nameContext extends ParserRuleContext {
		public Object_nameContext object_name() {
			return getRuleContext(Object_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(TSQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TSQLParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1043);
				database_name();
				setState(1044);
				match(DOT);
				}
				break;
			}
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1048);
				schema_name();
				setState(1049);
				match(DOT);
				}
				break;
			}
			setState(1053);
			object_name();
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
	public static class View_nameContext extends ParserRuleContext {
		public Object_nameContext object_name() {
			return getRuleContext(Object_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(TSQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TSQLParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1055);
				database_name();
				setState(1056);
				match(DOT);
				}
				break;
			}
			setState(1063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1060);
				schema_name();
				setState(1061);
				match(DOT);
				}
				break;
			}
			setState(1065);
			object_name();
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
	public static class Procedure_nameContext extends ParserRuleContext {
		public Object_nameContext object_name() {
			return getRuleContext(Object_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(TSQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TSQLParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Procedure_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterProcedure_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitProcedure_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitProcedure_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_nameContext procedure_name() throws RecognitionException {
		Procedure_nameContext _localctx = new Procedure_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_procedure_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1067);
				database_name();
				setState(1068);
				match(DOT);
				}
				break;
			}
			setState(1075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1072);
				schema_name();
				setState(1073);
				match(DOT);
				}
				break;
			}
			setState(1077);
			object_name();
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
	public static class Function_nameContext extends ParserRuleContext {
		public Object_nameContext object_name() {
			return getRuleContext(Object_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(TSQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TSQLParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1079);
				database_name();
				setState(1080);
				match(DOT);
				}
				break;
			}
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1084);
				schema_name();
				setState(1085);
				match(DOT);
				}
				break;
			}
			setState(1089);
			object_name();
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
	public static class Index_nameContext extends ParserRuleContext {
		public Object_nameContext object_name() {
			return getRuleContext(Object_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			object_name();
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
	public static class Database_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			identifier();
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
	public static class Schema_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitSchema_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			identifier();
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
	public static class Object_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Object_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterObject_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitObject_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitObject_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_nameContext object_name() throws RecognitionException {
		Object_nameContext _localctx = new Object_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_object_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			identifier();
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
	public static class Column_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TSQLParser.DOT, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1099);
				table_name();
				setState(1100);
				match(DOT);
				}
				break;
			}
			setState(1104);
			identifier();
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
	public static class Table_aliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			identifier();
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
	public static class Column_aliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			identifier();
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
	public static class Cte_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Cte_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterCte_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitCte_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitCte_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_nameContext cte_name() throws RecognitionException {
		Cte_nameContext _localctx = new Cte_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_cte_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			identifier();
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
	public static class Variable_nameContext extends ParserRuleContext {
		public TerminalNode LOCAL_VARIABLE() { return getToken(TSQLParser.LOCAL_VARIABLE, 0); }
		public TerminalNode GLOBAL_VARIABLE() { return getToken(TSQLParser.GLOBAL_VARIABLE, 0); }
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_variable_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			_la = _input.LA(1);
			if ( !(_la==GLOBAL_VARIABLE || _la==LOCAL_VARIABLE) ) {
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
	public static class Parameter_nameContext extends ParserRuleContext {
		public TerminalNode LOCAL_VARIABLE() { return getToken(TSQLParser.LOCAL_VARIABLE, 0); }
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitParameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitParameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(LOCAL_VARIABLE);
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
	public static class Transaction_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			identifier();
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
	public static class Savepoint_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			identifier();
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TSQLParser.IDENTIFIER, 0); }
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(TSQLParser.QUOTED_IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSQLParserListener ) ((TSQLParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSQLParserVisitor ) return ((TSQLParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_IDENTIFIER || _la==IDENTIFIER) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return table_source_sempred((Table_sourceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean table_source_sempred(Table_sourceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00ae\u0463\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0001\u0000\u0005\u0000\u00b2"+
		"\b\u0000\n\u0000\f\u0000\u00b5\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u00bb\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00bf\b\u0002\u0001\u0002\u0005\u0002\u00c2\b\u0002\n\u0002\f\u0002\u00c5"+
		"\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00cc\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00d2\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d7"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00df\b\u0006\n\u0006\f\u0006\u00e2\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ef\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00f9\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00fd\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0102\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u010a\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0121\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u012d\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0133\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u0137\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u013f\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0148\b\r\n\r\f\r\u014b"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0153\b\u000e\n\u000e\f\u000e\u0156\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u016d\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0175\b\u000f\u0003\u000f"+
		"\u0177\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0180\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u018b\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u019f\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u01a9\b\u0013\n\u0013\f\u0013\u01ac\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01b9"+
		"\b\u0015\n\u0015\f\u0015\u01bc\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u01c2\b\u0016\u0001\u0016\u0003\u0016\u01c5\b"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01cf\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01d5\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01db\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01e1\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01ef"+
		"\b\u0018\u0001\u0018\u0003\u0018\u01f2\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01f9\b\u0018\u0001\u0018"+
		"\u0003\u0018\u01fc\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0202\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0211\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0217\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u021c\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u0222\b\u0019\n\u0019\f\u0019\u0225"+
		"\t\u0019\u0003\u0019\u0227\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u022b\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0232\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0239\b\u0019\n\u0019\f\u0019\u023c\t\u0019\u0003"+
		"\u0019\u023e\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0242\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0249\b\u0019\n\u0019\f\u0019\u024c\t\u0019\u0003\u0019\u024e\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0252\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0259\b\u0019\n\u0019"+
		"\f\u0019\u025c\t\u0019\u0003\u0019\u025e\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0265\b\u001a\n\u001a"+
		"\f\u001a\u0268\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u026c\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0277\b\u001b\n\u001b"+
		"\f\u001b\u027a\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0283\b\u001c\u0001\u001c"+
		"\u0003\u001c\u0286\b\u001c\u0003\u001c\u0288\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u028d\b\u001d\u0001\u001d\u0003\u001d\u0290"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0298\b\u001d\u0001\u001d\u0003\u001d\u029b\b\u001d"+
		"\u0003\u001d\u029d\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u02a5\b\u001d\n\u001d\f\u001d\u02a8"+
		"\t\u001d\u0001\u001e\u0003\u001e\u02ab\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u02b0\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u02b5\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u02ba\b\u001e\u0001\u001e\u0003\u001e\u02bd\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u02c1\b\u001f\u0001 \u0001 \u0003 \u02c5\b \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0005 \u02cc\b \n \f \u02cf\t \u0001 \u0001"+
		" \u0003 \u02d3\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u02da\b \n"+
		" \f \u02dd\t \u0001 \u0001 \u0001 \u0003 \u02e2\b \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u02ec\b!\n!\f!\u02ef\t!\u0001"+
		"!\u0001!\u0003!\u02f3\b!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0003#\u02fd\b#\u0001#\u0001#\u0001#\u0003#\u0302\b#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005$\u030a\b$\n$\f$\u030d\t$\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u0313\b%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'"+
		"\u0322\b\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0003"+
		"*\u0336\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0005+\u033d\b+\n+\f+\u0340"+
		"\t+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0347\b,\u0001-\u0001-\u0003"+
		"-\u034b\b-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u0358\b0\u00011\u00011\u00012\u00012\u00013\u0001"+
		"3\u00014\u00014\u00014\u00034\u0363\b4\u00015\u00015\u00035\u0367\b5\u0001"+
		"5\u00035\u036a\b5\u00016\u00016\u00036\u036e\b6\u00016\u00016\u00036\u0372"+
		"\b6\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00019\u00019\u0001"+
		"9\u0001:\u0001:\u0001;\u0001;\u0001;\u0005;\u0383\b;\n;\f;\u0386\t;\u0001"+
		"<\u0001<\u0001<\u0005<\u038b\b<\n<\f<\u038e\t<\u0001=\u0001=\u0001=\u0005"+
		"=\u0393\b=\n=\f=\u0396\t=\u0001>\u0001>\u0001>\u0005>\u039b\b>\n>\f>\u039e"+
		"\t>\u0001>\u0001>\u0003>\u03a2\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0003>\u03ab\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0005>\u03b2"+
		"\b>\n>\f>\u03b5\t>\u0001>\u0003>\u03b8\b>\u0001>\u0001>\u0001>\u0001>"+
		"\u0003>\u03be\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u03c6"+
		"\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u03cf\b>\u0001"+
		"?\u0001?\u0001?\u0005?\u03d4\b?\n?\f?\u03d7\t?\u0001@\u0001@\u0001@\u0005"+
		"@\u03dc\b@\n@\f@\u03df\t@\u0001A\u0001A\u0001A\u0003A\u03e4\bA\u0001B"+
		"\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0003B\u03f3\bB\u0001C\u0001C\u0001C\u0003C\u03f8\bC\u0001"+
		"C\u0001C\u0001C\u0001D\u0001D\u0003D\u03ff\bD\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0004D\u0406\bD\u000bD\fD\u0407\u0001D\u0001D\u0003D\u040c\b"+
		"D\u0001D\u0001D\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001G\u0003"+
		"G\u0417\bG\u0001G\u0001G\u0001G\u0003G\u041c\bG\u0001G\u0001G\u0001H\u0001"+
		"H\u0001H\u0003H\u0423\bH\u0001H\u0001H\u0001H\u0003H\u0428\bH\u0001H\u0001"+
		"H\u0001I\u0001I\u0001I\u0003I\u042f\bI\u0001I\u0001I\u0001I\u0003I\u0434"+
		"\bI\u0001I\u0001I\u0001J\u0001J\u0001J\u0003J\u043b\bJ\u0001J\u0001J\u0001"+
		"J\u0003J\u0440\bJ\u0001J\u0001J\u0001K\u0001K\u0001L\u0001L\u0001M\u0001"+
		"M\u0001N\u0001N\u0001O\u0001O\u0001O\u0003O\u044f\bO\u0001O\u0001O\u0001"+
		"P\u0001P\u0001Q\u0001Q\u0001R\u0001R\u0001S\u0001S\u0001T\u0001T\u0001"+
		"U\u0001U\u0001V\u0001V\u0001W\u0001W\u0001W\u0000\u0001:X\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u0000\u000e\u0002\u0000"+
		"  %%\u0001\u0000\u00aa\u00ab\u0001\u0000\u0017\u0018\u0001\u0000\u00a8"+
		"\u00a9\u0001\u000001\u0001\u0000wx\u0001\u0000\u008a\u008b\u0001\u0000"+
		"\u008c\u008f\u0001\u0000\u0085\u0086\u0001\u0000\u0087\u0089\u0002\u0000"+
		"\\\\\u0085\u0086\u0002\u0000]]\u00a0\u00a3\u0001\u0000\u00a6\u00a7\u0001"+
		"\u0000\u00a4\u00a5\u04cb\u0000\u00b3\u0001\u0000\u0000\u0000\u0002\u00b8"+
		"\u0001\u0000\u0000\u0000\u0004\u00bc\u0001\u0000\u0000\u0000\u0006\u00cb"+
		"\u0001\u0000\u0000\u0000\b\u00d1\u0001\u0000\u0000\u0000\n\u00d6\u0001"+
		"\u0000\u0000\u0000\f\u00f8\u0001\u0000\u0000\u0000\u000e\u0109\u0001\u0000"+
		"\u0000\u0000\u0010\u0120\u0001\u0000\u0000\u0000\u0012\u012c\u0001\u0000"+
		"\u0000\u0000\u0014\u0132\u0001\u0000\u0000\u0000\u0016\u0136\u0001\u0000"+
		"\u0000\u0000\u0018\u013e\u0001\u0000\u0000\u0000\u001a\u0140\u0001\u0000"+
		"\u0000\u0000\u001c\u014f\u0001\u0000\u0000\u0000\u001e\u0176\u0001\u0000"+
		"\u0000\u0000 \u0178\u0001\u0000\u0000\u0000\"\u0185\u0001\u0000\u0000"+
		"\u0000$\u0195\u0001\u0000\u0000\u0000&\u019c\u0001\u0000\u0000\u0000("+
		"\u01b0\u0001\u0000\u0000\u0000*\u01b5\u0001\u0000\u0000\u0000,\u01bd\u0001"+
		"\u0000\u0000\u0000.\u01c8\u0001\u0000\u0000\u00000\u021b\u0001\u0000\u0000"+
		"\u00002\u0226\u0001\u0000\u0000\u00004\u025f\u0001\u0000\u0000\u00006"+
		"\u0273\u0001\u0000\u0000\u00008\u0287\u0001\u0000\u0000\u0000:\u029c\u0001"+
		"\u0000\u0000\u0000<\u02bc\u0001\u0000\u0000\u0000>\u02be\u0001\u0000\u0000"+
		"\u0000@\u02c2\u0001\u0000\u0000\u0000B\u02e5\u0001\u0000\u0000\u0000D"+
		"\u02f6\u0001\u0000\u0000\u0000F\u02fa\u0001\u0000\u0000\u0000H\u0305\u0001"+
		"\u0000\u0000\u0000J\u030e\u0001\u0000\u0000\u0000L\u0316\u0001\u0000\u0000"+
		"\u0000N\u031c\u0001\u0000\u0000\u0000P\u0323\u0001\u0000\u0000\u0000R"+
		"\u0327\u0001\u0000\u0000\u0000T\u0332\u0001\u0000\u0000\u0000V\u0339\u0001"+
		"\u0000\u0000\u0000X\u0346\u0001\u0000\u0000\u0000Z\u0348\u0001\u0000\u0000"+
		"\u0000\\\u034c\u0001\u0000\u0000\u0000^\u034e\u0001\u0000\u0000\u0000"+
		"`\u0350\u0001\u0000\u0000\u0000b\u0359\u0001\u0000\u0000\u0000d\u035b"+
		"\u0001\u0000\u0000\u0000f\u035d\u0001\u0000\u0000\u0000h\u035f\u0001\u0000"+
		"\u0000\u0000j\u0364\u0001\u0000\u0000\u0000l\u036b\u0001\u0000\u0000\u0000"+
		"n\u0373\u0001\u0000\u0000\u0000p\u0377\u0001\u0000\u0000\u0000r\u037a"+
		"\u0001\u0000\u0000\u0000t\u037d\u0001\u0000\u0000\u0000v\u037f\u0001\u0000"+
		"\u0000\u0000x\u0387\u0001\u0000\u0000\u0000z\u038f\u0001\u0000\u0000\u0000"+
		"|\u03ce\u0001\u0000\u0000\u0000~\u03d0\u0001\u0000\u0000\u0000\u0080\u03d8"+
		"\u0001\u0000\u0000\u0000\u0082\u03e3\u0001\u0000\u0000\u0000\u0084\u03f2"+
		"\u0001\u0000\u0000\u0000\u0086\u03f4\u0001\u0000\u0000\u0000\u0088\u03fc"+
		"\u0001\u0000\u0000\u0000\u008a\u040f\u0001\u0000\u0000\u0000\u008c\u0411"+
		"\u0001\u0000\u0000\u0000\u008e\u0416\u0001\u0000\u0000\u0000\u0090\u0422"+
		"\u0001\u0000\u0000\u0000\u0092\u042e\u0001\u0000\u0000\u0000\u0094\u043a"+
		"\u0001\u0000\u0000\u0000\u0096\u0443\u0001\u0000\u0000\u0000\u0098\u0445"+
		"\u0001\u0000\u0000\u0000\u009a\u0447\u0001\u0000\u0000\u0000\u009c\u0449"+
		"\u0001\u0000\u0000\u0000\u009e\u044e\u0001\u0000\u0000\u0000\u00a0\u0452"+
		"\u0001\u0000\u0000\u0000\u00a2\u0454\u0001\u0000\u0000\u0000\u00a4\u0456"+
		"\u0001\u0000\u0000\u0000\u00a6\u0458\u0001\u0000\u0000\u0000\u00a8\u045a"+
		"\u0001\u0000\u0000\u0000\u00aa\u045c\u0001\u0000\u0000\u0000\u00ac\u045e"+
		"\u0001\u0000\u0000\u0000\u00ae\u0460\u0001\u0000\u0000\u0000\u00b0\u00b2"+
		"\u0003\u0002\u0001\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0000\u0000\u0001\u00b7\u0001"+
		"\u0001\u0000\u0000\u0000\u00b8\u00ba\u0003\u0004\u0002\u0000\u00b9\u00bb"+
		"\u0005\u009c\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb\u0003\u0001\u0000\u0000\u0000\u00bc\u00c3"+
		"\u0003\u0006\u0003\u0000\u00bd\u00bf\u0005\u0094\u0000\u0000\u00be\u00bd"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c2\u0003\u0006\u0003\u0000\u00c1\u00be"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u0005"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00cc"+
		"\u0003\b\u0004\u0000\u00c7\u00cc\u0003\n\u0005\u0000\u00c8\u00cc\u0003"+
		"\u0012\t\u0000\u00c9\u00cc\u0003\u0014\n\u0000\u00ca\u00cc\u0003\u0016"+
		"\u000b\u0000\u00cb\u00c6\u0001\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u0007\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d2\u00032\u0019\u0000\u00ce\u00d2\u0003@ \u0000"+
		"\u00cf\u00d2\u0003B!\u0000\u00d0\u00d2\u0003F#\u0000\u00d1\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\t\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d7\u0003\u0018\f\u0000\u00d4\u00d7\u0003\f\u0006"+
		"\u0000\u00d5\u00d7\u0003\u0010\b\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u000b\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u001b\u0000\u0000"+
		"\u00d9\u00da\u0005\u001d\u0000\u0000\u00da\u00db\u0003\u008eG\u0000\u00db"+
		"\u00e0\u0003\u000e\u0007\u0000\u00dc\u00dd\u0005\u0095\u0000\u0000\u00dd"+
		"\u00df\u0003\u000e\u0007\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00f9\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u001b\u0000\u0000\u00e4"+
		"\u00e5\u0005 \u0000\u0000\u00e5\u00e6\u0003\u0092I\u0000\u00e6\u00e7\u0005"+
		"\u0011\u0000\u0000\u00e7\u00e8\u0003\u0004\u0002\u0000\u00e8\u00f9\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0005\u001b\u0000\u0000\u00ea\u00eb\u0005"+
		"!\u0000\u0000\u00eb\u00ec\u0003\u0094J\u0000\u00ec\u00ee\u0005\u0098\u0000"+
		"\u0000\u00ed\u00ef\u0003*\u0015\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0005\u0099\u0000\u0000\u00f1\u00f2\u00058\u0000\u0000\u00f2"+
		"\u00f3\u00030\u0018\u0000\u00f3\u00f4\u0005\u0011\u0000\u0000\u00f4\u00f5"+
		"\u0005&\u0000\u0000\u00f5\u00f6\u0003\u0004\u0002\u0000\u00f6\u00f7\u0005"+
		"\'\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00d8\u0001\u0000"+
		"\u0000\u0000\u00f8\u00e3\u0001\u0000\u0000\u0000\u00f8\u00e9\u0001\u0000"+
		"\u0000\u0000\u00f9\r\u0001\u0000\u0000\u0000\u00fa\u00fc\u00056\u0000"+
		"\u0000\u00fb\u00fd\u00057\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe\u010a\u0003\u001c\u000e\u0000\u00ff\u0101\u0005\u001c\u0000\u0000"+
		"\u0100\u0102\u00057\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103"+
		"\u010a\u0003\u009eO\u0000\u0104\u0105\u0005\u001b\u0000\u0000\u0105\u0106"+
		"\u00057\u0000\u0000\u0106\u0107\u0003\u009eO\u0000\u0107\u0108\u00030"+
		"\u0018\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u00fa\u0001\u0000"+
		"\u0000\u0000\u0109\u00ff\u0001\u0000\u0000\u0000\u0109\u0104\u0001\u0000"+
		"\u0000\u0000\u010a\u000f\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u001c"+
		"\u0000\u0000\u010c\u010d\u0005\u001d\u0000\u0000\u010d\u0121\u0003\u008e"+
		"G\u0000\u010e\u010f\u0005\u001c\u0000\u0000\u010f\u0110\u0005 \u0000\u0000"+
		"\u0110\u0121\u0003\u0092I\u0000\u0111\u0112\u0005\u001c\u0000\u0000\u0112"+
		"\u0113\u0005!\u0000\u0000\u0113\u0121\u0003\u0094J\u0000\u0114\u0115\u0005"+
		"\u001c\u0000\u0000\u0115\u0116\u0005\u001f\u0000\u0000\u0116\u0121\u0003"+
		"\u0090H\u0000\u0117\u0118\u0005\u001c\u0000\u0000\u0118\u0119\u0005\u001e"+
		"\u0000\u0000\u0119\u011a\u0003\u0096K\u0000\u011a\u011b\u0005\u0010\u0000"+
		"\u0000\u011b\u011c\u0003\u008eG\u0000\u011c\u0121\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0005\u001c\u0000\u0000\u011e\u011f\u0005#\u0000\u0000\u011f"+
		"\u0121\u0003\u0098L\u0000\u0120\u010b\u0001\u0000\u0000\u0000\u0120\u010e"+
		"\u0001\u0000\u0000\u0000\u0120\u0111\u0001\u0000\u0000\u0000\u0120\u0114"+
		"\u0001\u0000\u0000\u0000\u0120\u0117\u0001\u0000\u0000\u0000\u0120\u011d"+
		"\u0001\u0000\u0000\u0000\u0121\u0011\u0001\u0000\u0000\u0000\u0122\u012d"+
		"\u0003H$\u0000\u0123\u012d\u0003L&\u0000\u0124\u012d\u0003N\'\u0000\u0125"+
		"\u012d\u0003P(\u0000\u0126\u012d\u0003R)\u0000\u0127\u012d\u0003T*\u0000"+
		"\u0128\u012d\u0003Z-\u0000\u0129\u012d\u0003\\.\u0000\u012a\u012d\u0003"+
		"^/\u0000\u012b\u012d\u0003`0\u0000\u012c\u0122\u0001\u0000\u0000\u0000"+
		"\u012c\u0123\u0001\u0000\u0000\u0000\u012c\u0124\u0001\u0000\u0000\u0000"+
		"\u012c\u0125\u0001\u0000\u0000\u0000\u012c\u0126\u0001\u0000\u0000\u0000"+
		"\u012c\u0127\u0001\u0000\u0000\u0000\u012c\u0128\u0001\u0000\u0000\u0000"+
		"\u012c\u0129\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012c\u012b\u0001\u0000\u0000\u0000\u012d\u0013\u0001\u0000\u0000\u0000"+
		"\u012e\u0133\u0003h4\u0000\u012f\u0133\u0003j5\u0000\u0130\u0133\u0003"+
		"l6\u0000\u0131\u0133\u0003n7\u0000\u0132\u012e\u0001\u0000\u0000\u0000"+
		"\u0132\u012f\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0015\u0001\u0000\u0000\u0000"+
		"\u0134\u0137\u0003p8\u0000\u0135\u0137\u0003r9\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u0017\u0001"+
		"\u0000\u0000\u0000\u0138\u013f\u0003\u001a\r\u0000\u0139\u013f\u0003 "+
		"\u0010\u0000\u013a\u013f\u0003\"\u0011\u0000\u013b\u013f\u0003$\u0012"+
		"\u0000\u013c\u013f\u0003&\u0013\u0000\u013d\u013f\u0003(\u0014\u0000\u013e"+
		"\u0138\u0001\u0000\u0000\u0000\u013e\u0139\u0001\u0000\u0000\u0000\u013e"+
		"\u013a\u0001\u0000\u0000\u0000\u013e\u013b\u0001\u0000\u0000\u0000\u013e"+
		"\u013c\u0001\u0000\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f"+
		"\u0019\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u001a\u0000\u0000\u0141"+
		"\u0142\u0005\u001d\u0000\u0000\u0142\u0143\u0003\u008eG\u0000\u0143\u0144"+
		"\u0005\u0098\u0000\u0000\u0144\u0149\u0003\u001c\u000e\u0000\u0145\u0146"+
		"\u0005\u0095\u0000\u0000\u0146\u0148\u0003\u001c\u000e\u0000\u0147\u0145"+
		"\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014c"+
		"\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0005\u0099\u0000\u0000\u014d\u014e\u0006\r\uffff\uffff\u0000\u014e\u001b"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0003\u009eO\u0000\u0150\u0154\u0003"+
		"0\u0018\u0000\u0151\u0153\u0003\u001e\u000f\u0000\u0152\u0151\u0001\u0000"+
		"\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0157\u0001\u0000"+
		"\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u0158\u0006\u000e"+
		"\uffff\uffff\u0000\u0158\u001d\u0001\u0000\u0000\u0000\u0159\u015a\u0005"+
		"\\\u0000\u0000\u015a\u0177\u0005]\u0000\u0000\u015b\u0177\u0005]\u0000"+
		"\u0000\u015c\u015d\u0005W\u0000\u0000\u015d\u0177\u0005X\u0000\u0000\u015e"+
		"\u0177\u0005[\u0000\u0000\u015f\u0160\u0005^\u0000\u0000\u0160\u0177\u0003"+
		"t:\u0000\u0161\u0162\u0005_\u0000\u0000\u0162\u0163\u0005\u0098\u0000"+
		"\u0000\u0163\u0164\u0003t:\u0000\u0164\u0165\u0005\u0099\u0000\u0000\u0165"+
		"\u0177\u0001\u0000\u0000\u0000\u0166\u016c\u0005a\u0000\u0000\u0167\u0168"+
		"\u0005\u0098\u0000\u0000\u0168\u0169\u0005\u00a0\u0000\u0000\u0169\u016a"+
		"\u0005\u0095\u0000\u0000\u016a\u016b\u0005\u00a0\u0000\u0000\u016b\u016d"+
		"\u0005\u0099\u0000\u0000\u016c\u0167\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0001\u0000\u0000\u0000\u016d\u0177\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0005Z\u0000\u0000\u016f\u0174\u0003\u008eG\u0000\u0170\u0171\u0005\u0098"+
		"\u0000\u0000\u0171\u0172\u0003\u009eO\u0000\u0172\u0173\u0005\u0099\u0000"+
		"\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174\u0170\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0177\u0001\u0000\u0000"+
		"\u0000\u0176\u0159\u0001\u0000\u0000\u0000\u0176\u015b\u0001\u0000\u0000"+
		"\u0000\u0176\u015c\u0001\u0000\u0000\u0000\u0176\u015e\u0001\u0000\u0000"+
		"\u0000\u0176\u015f\u0001\u0000\u0000\u0000\u0176\u0161\u0001\u0000\u0000"+
		"\u0000\u0176\u0166\u0001\u0000\u0000\u0000\u0176\u016e\u0001\u0000\u0000"+
		"\u0000\u0177\u001f\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u001a\u0000"+
		"\u0000\u0179\u017a\u0007\u0000\u0000\u0000\u017a\u017f\u0003\u0092I\u0000"+
		"\u017b\u017c\u0005\u0098\u0000\u0000\u017c\u017d\u0003*\u0015\u0000\u017d"+
		"\u017e\u0005\u0099\u0000\u0000\u017e\u0180\u0001\u0000\u0000\u0000\u017f"+
		"\u017b\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180"+
		"\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0005\u0011\u0000\u0000\u0182"+
		"\u0183\u0003\u0004\u0002\u0000\u0183\u0184\u0006\u0010\uffff\uffff\u0000"+
		"\u0184!\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u001a\u0000\u0000\u0186"+
		"\u0187\u0005!\u0000\u0000\u0187\u0188\u0003\u0094J\u0000\u0188\u018a\u0005"+
		"\u0098\u0000\u0000\u0189\u018b\u0003*\u0015\u0000\u018a\u0189\u0001\u0000"+
		"\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\u0005\u0099\u0000\u0000\u018d\u018e\u00058\u0000"+
		"\u0000\u018e\u018f\u00030\u0018\u0000\u018f\u0190\u0005\u0011\u0000\u0000"+
		"\u0190\u0191\u0005&\u0000\u0000\u0191\u0192\u0003\u0004\u0002\u0000\u0192"+
		"\u0193\u0005\'\u0000\u0000\u0193\u0194\u0006\u0011\uffff\uffff\u0000\u0194"+
		"#\u0001\u0000\u0000\u0000\u0195\u0196\u0005\u001a\u0000\u0000\u0196\u0197"+
		"\u0005\u001f\u0000\u0000\u0197\u0198\u0003\u0090H\u0000\u0198\u0199\u0005"+
		"\u0011\u0000\u0000\u0199\u019a\u00032\u0019\u0000\u019a\u019b\u0006\u0012"+
		"\uffff\uffff\u0000\u019b%\u0001\u0000\u0000\u0000\u019c\u019e\u0005\u001a"+
		"\u0000\u0000\u019d\u019f\u0005[\u0000\u0000\u019e\u019d\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0005\u001e\u0000\u0000\u01a1\u01a2\u0003\u0096K\u0000"+
		"\u01a2\u01a3\u0005\u0010\u0000\u0000\u01a3\u01a4\u0003\u008eG\u0000\u01a4"+
		"\u01a5\u0005\u0098\u0000\u0000\u01a5\u01aa\u0003\u009eO\u0000\u01a6\u01a7"+
		"\u0005\u0095\u0000\u0000\u01a7\u01a9\u0003\u009eO\u0000\u01a8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005"+
		"\u0099\u0000\u0000\u01ae\u01af\u0006\u0013\uffff\uffff\u0000\u01af\'\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b1\u0005\u001a\u0000\u0000\u01b1\u01b2\u0005"+
		"#\u0000\u0000\u01b2\u01b3\u0003\u0098L\u0000\u01b3\u01b4\u0006\u0014\uffff"+
		"\uffff\u0000\u01b4)\u0001\u0000\u0000\u0000\u01b5\u01ba\u0003,\u0016\u0000"+
		"\u01b6\u01b7\u0005\u0095\u0000\u0000\u01b7\u01b9\u0003,\u0016\u0000\u01b8"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba"+
		"\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb"+
		"+\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0003\u00a8T\u0000\u01be\u01c1\u00030\u0018\u0000\u01bf\u01c0\u0005\u008a"+
		"\u0000\u0000\u01c0\u01c2\u0003.\u0017\u0000\u01c1\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c5\u0007\u0001\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0006\u0016\uffff\uffff\u0000\u01c7-\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0003t:\u0000\u01c9/\u0001\u0000\u0000\u0000\u01ca"+
		"\u01ce\u0005;\u0000\u0000\u01cb\u01cc\u0005\u0098\u0000\u0000\u01cc\u01cd"+
		"\u0005\u00a0\u0000\u0000\u01cd\u01cf\u0005\u0099\u0000\u0000\u01ce\u01cb"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u021c"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d4\u0005<\u0000\u0000\u01d1\u01d2\u0005"+
		"\u0098\u0000\u0000\u01d2\u01d3\u0005\u00a0\u0000\u0000\u01d3\u01d5\u0005"+
		"\u0099\u0000\u0000\u01d4\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d5\u021c\u0001\u0000\u0000\u0000\u01d6\u01da\u0005"+
		"=\u0000\u0000\u01d7\u01d8\u0005\u0098\u0000\u0000\u01d8\u01d9\u0005\u00a0"+
		"\u0000\u0000\u01d9\u01db\u0005\u0099\u0000\u0000\u01da\u01d7\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u021c\u0001\u0000"+
		"\u0000\u0000\u01dc\u01e0\u0005>\u0000\u0000\u01dd\u01de\u0005\u0098\u0000"+
		"\u0000\u01de\u01df\u0005\u00a0\u0000\u0000\u01df\u01e1\u0005\u0099\u0000"+
		"\u0000\u01e0\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e1\u021c\u0001\u0000\u0000\u0000\u01e2\u021c\u0005?\u0000\u0000"+
		"\u01e3\u021c\u0005@\u0000\u0000\u01e4\u021c\u0005A\u0000\u0000\u01e5\u021c"+
		"\u0005B\u0000\u0000\u01e6\u021c\u0005C\u0000\u0000\u01e7\u021c\u0005D"+
		"\u0000\u0000\u01e8\u021c\u0005E\u0000\u0000\u01e9\u01f1\u0005F\u0000\u0000"+
		"\u01ea\u01eb\u0005\u0098\u0000\u0000\u01eb\u01ee\u0005\u00a0\u0000\u0000"+
		"\u01ec\u01ed\u0005\u0095\u0000\u0000\u01ed\u01ef\u0005\u00a0\u0000\u0000"+
		"\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f2\u0005\u0099\u0000\u0000"+
		"\u01f1\u01ea\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f2\u021c\u0001\u0000\u0000\u0000\u01f3\u01fb\u0005G\u0000\u0000\u01f4"+
		"\u01f5\u0005\u0098\u0000\u0000\u01f5\u01f8\u0005\u00a0\u0000\u0000\u01f6"+
		"\u01f7\u0005\u0095\u0000\u0000\u01f7\u01f9\u0005\u00a0\u0000\u0000\u01f8"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fc\u0005\u0099\u0000\u0000\u01fb"+
		"\u01f4\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc"+
		"\u021c\u0001\u0000\u0000\u0000\u01fd\u0201\u0005H\u0000\u0000\u01fe\u01ff"+
		"\u0005\u0098\u0000\u0000\u01ff\u0200\u0005\u00a0\u0000\u0000\u0200\u0202"+
		"\u0005\u0099\u0000\u0000\u0201\u01fe\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u0001\u0000\u0000\u0000\u0202\u021c\u0001\u0000\u0000\u0000\u0203\u021c"+
		"\u0005I\u0000\u0000\u0204\u021c\u0005J\u0000\u0000\u0205\u021c\u0005K"+
		"\u0000\u0000\u0206\u021c\u0005L\u0000\u0000\u0207\u021c\u0005M\u0000\u0000"+
		"\u0208\u021c\u0005N\u0000\u0000\u0209\u021c\u0005O\u0000\u0000\u020a\u021c"+
		"\u0005P\u0000\u0000\u020b\u021c\u0005Q\u0000\u0000\u020c\u0210\u0005R"+
		"\u0000\u0000\u020d\u020e\u0005\u0098\u0000\u0000\u020e\u020f\u0005\u00a0"+
		"\u0000\u0000\u020f\u0211\u0005\u0099\u0000\u0000\u0210\u020d\u0001\u0000"+
		"\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u021c\u0001\u0000"+
		"\u0000\u0000\u0212\u0216\u0005S\u0000\u0000\u0213\u0214\u0005\u0098\u0000"+
		"\u0000\u0214\u0215\u0005\u00a0\u0000\u0000\u0215\u0217\u0005\u0099\u0000"+
		"\u0000\u0216\u0213\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000"+
		"\u0000\u0217\u021c\u0001\u0000\u0000\u0000\u0218\u021c\u0005T\u0000\u0000"+
		"\u0219\u021c\u0005U\u0000\u0000\u021a\u021c\u0005V\u0000\u0000\u021b\u01ca"+
		"\u0001\u0000\u0000\u0000\u021b\u01d0\u0001\u0000\u0000\u0000\u021b\u01d6"+
		"\u0001\u0000\u0000\u0000\u021b\u01dc\u0001\u0000\u0000\u0000\u021b\u01e2"+
		"\u0001\u0000\u0000\u0000\u021b\u01e3\u0001\u0000\u0000\u0000\u021b\u01e4"+
		"\u0001\u0000\u0000\u0000\u021b\u01e5\u0001\u0000\u0000\u0000\u021b\u01e6"+
		"\u0001\u0000\u0000\u0000\u021b\u01e7\u0001\u0000\u0000\u0000\u021b\u01e8"+
		"\u0001\u0000\u0000\u0000\u021b\u01e9\u0001\u0000\u0000\u0000\u021b\u01f3"+
		"\u0001\u0000\u0000\u0000\u021b\u01fd\u0001\u0000\u0000\u0000\u021b\u0203"+
		"\u0001\u0000\u0000\u0000\u021b\u0204\u0001\u0000\u0000\u0000\u021b\u0205"+
		"\u0001\u0000\u0000\u0000\u021b\u0206\u0001\u0000\u0000\u0000\u021b\u0207"+
		"\u0001\u0000\u0000\u0000\u021b\u0208\u0001\u0000\u0000\u0000\u021b\u0209"+
		"\u0001\u0000\u0000\u0000\u021b\u020a\u0001\u0000\u0000\u0000\u021b\u020b"+
		"\u0001\u0000\u0000\u0000\u021b\u020c\u0001\u0000\u0000\u0000\u021b\u0212"+
		"\u0001\u0000\u0000\u0000\u021b\u0218\u0001\u0000\u0000\u0000\u021b\u0219"+
		"\u0001\u0000\u0000\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021c1\u0001"+
		"\u0000\u0000\u0000\u021d\u021e\u0005m\u0000\u0000\u021e\u0223\u00034\u001a"+
		"\u0000\u021f\u0220\u0005\u0095\u0000\u0000\u0220\u0222\u00034\u001a\u0000"+
		"\u0221\u021f\u0001\u0000\u0000\u0000\u0222\u0225\u0001\u0000\u0000\u0000"+
		"\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000"+
		"\u0224\u0227\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000"+
		"\u0226\u021d\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000"+
		"\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u022a\u0005\u0001\u0000\u0000"+
		"\u0229\u022b\u0007\u0002\u0000\u0000\u022a\u0229\u0001\u0000\u0000\u0000"+
		"\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u0231\u0001\u0000\u0000\u0000"+
		"\u022c\u022d\u0005\u0019\u0000\u0000\u022d\u022e\u0005\u0098\u0000\u0000"+
		"\u022e\u022f\u0003t:\u0000\u022f\u0230\u0005\u0099\u0000\u0000\u0230\u0232"+
		"\u0001\u0000\u0000\u0000\u0231\u022c\u0001\u0000\u0000\u0000\u0231\u0232"+
		"\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u023d"+
		"\u00036\u001b\u0000\u0234\u0235\u0005\u0005\u0000\u0000\u0235\u023a\u0003"+
		":\u001d\u0000\u0236\u0237\u0005\u0095\u0000\u0000\u0237\u0239\u0003:\u001d"+
		"\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023c\u0001\u0000\u0000"+
		"\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000"+
		"\u0000\u023b\u023e\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000"+
		"\u0000\u023d\u0234\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000"+
		"\u0000\u023e\u0241\u0001\u0000\u0000\u0000\u023f\u0240\u0005\u0006\u0000"+
		"\u0000\u0240\u0242\u0003\u008aE\u0000\u0241\u023f\u0001\u0000\u0000\u0000"+
		"\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u024d\u0001\u0000\u0000\u0000"+
		"\u0243\u0244\u0005\u0013\u0000\u0000\u0244\u0245\u0005\u0014\u0000\u0000"+
		"\u0245\u024a\u0003t:\u0000\u0246\u0247\u0005\u0095\u0000\u0000\u0247\u0249"+
		"\u0003t:\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0249\u024c\u0001\u0000"+
		"\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000"+
		"\u0000\u0000\u024b\u024e\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000"+
		"\u0000\u0000\u024d\u0243\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000"+
		"\u0000\u0000\u024e\u0251\u0001\u0000\u0000\u0000\u024f\u0250\u0005\u0015"+
		"\u0000\u0000\u0250\u0252\u0003\u008aE\u0000\u0251\u024f\u0001\u0000\u0000"+
		"\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u025d\u0001\u0000\u0000"+
		"\u0000\u0253\u0254\u0005\u0012\u0000\u0000\u0254\u0255\u0005\u0014\u0000"+
		"\u0000\u0255\u025a\u0003>\u001f\u0000\u0256\u0257\u0005\u0095\u0000\u0000"+
		"\u0257\u0259\u0003>\u001f\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0259"+
		"\u025c\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025a"+
		"\u025b\u0001\u0000\u0000\u0000\u025b\u025e\u0001\u0000\u0000\u0000\u025c"+
		"\u025a\u0001\u0000\u0000\u0000\u025d\u0253\u0001\u0000\u0000\u0000\u025d"+
		"\u025e\u0001\u0000\u0000\u0000\u025e3\u0001\u0000\u0000\u0000\u025f\u026b"+
		"\u0003\u00a4R\u0000\u0260\u0261\u0005\u0098\u0000\u0000\u0261\u0266\u0003"+
		"\u009eO\u0000\u0262\u0263\u0005\u0095\u0000\u0000\u0263\u0265\u0003\u009e"+
		"O\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265\u0268\u0001\u0000\u0000"+
		"\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000"+
		"\u0000\u0267\u0269\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000"+
		"\u0000\u0269\u026a\u0005\u0099\u0000\u0000\u026a\u026c\u0001\u0000\u0000"+
		"\u0000\u026b\u0260\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000"+
		"\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026e\u0005\u0011\u0000"+
		"\u0000\u026e\u026f\u0005\u0098\u0000\u0000\u026f\u0270\u00032\u0019\u0000"+
		"\u0270\u0271\u0005\u0099\u0000\u0000\u0271\u0272\u0006\u001a\uffff\uffff"+
		"\u0000\u02725\u0001\u0000\u0000\u0000\u0273\u0278\u00038\u001c\u0000\u0274"+
		"\u0275\u0005\u0095\u0000\u0000\u0275\u0277\u00038\u001c\u0000\u0276\u0274"+
		"\u0001\u0000\u0000\u0000\u0277\u027a\u0001\u0000\u0000\u0000\u0278\u0276"+
		"\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u02797\u0001"+
		"\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027b\u0288\u0005"+
		"\u0087\u0000\u0000\u027c\u027d\u0003\u008eG\u0000\u027d\u027e\u0005\u0096"+
		"\u0000\u0000\u027e\u027f\u0005\u0087\u0000\u0000\u027f\u0288\u0001\u0000"+
		"\u0000\u0000\u0280\u0285\u0003t:\u0000\u0281\u0283\u0005\u0011\u0000\u0000"+
		"\u0282\u0281\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000"+
		"\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0286\u0003\u00a2Q\u0000\u0285"+
		"\u0282\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286"+
		"\u0288\u0001\u0000\u0000\u0000\u0287\u027b\u0001\u0000\u0000\u0000\u0287"+
		"\u027c\u0001\u0000\u0000\u0000\u0287\u0280\u0001\u0000\u0000\u0000\u0288"+
		"9\u0001\u0000\u0000\u0000\u0289\u028a\u0006\u001d\uffff\uffff\u0000\u028a"+
		"\u028f\u0003\u008eG\u0000\u028b\u028d\u0005\u0011\u0000\u0000\u028c\u028b"+
		"\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u028e"+
		"\u0001\u0000\u0000\u0000\u028e\u0290\u0003\u00a0P\u0000\u028f\u028c\u0001"+
		"\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0291\u0001"+
		"\u0000\u0000\u0000\u0291\u0292\u0006\u001d\uffff\uffff\u0000\u0292\u029d"+
		"\u0001\u0000\u0000\u0000\u0293\u0294\u0005\u0098\u0000\u0000\u0294\u0295"+
		"\u00032\u0019\u0000\u0295\u029a\u0005\u0099\u0000\u0000\u0296\u0298\u0005"+
		"\u0011\u0000\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0297\u0298\u0001"+
		"\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029b\u0003"+
		"\u00a0P\u0000\u029a\u0297\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000"+
		"\u0000\u0000\u029b\u029d\u0001\u0000\u0000\u0000\u029c\u0289\u0001\u0000"+
		"\u0000\u0000\u029c\u0293\u0001\u0000\u0000\u0000\u029d\u02a6\u0001\u0000"+
		"\u0000\u0000\u029e\u029f\n\u0001\u0000\u0000\u029f\u02a0\u0003<\u001e"+
		"\u0000\u02a0\u02a1\u0003:\u001d\u0000\u02a1\u02a2\u0005\u0010\u0000\u0000"+
		"\u02a2\u02a3\u0003\u008aE\u0000\u02a3\u02a5\u0001\u0000\u0000\u0000\u02a4"+
		"\u029e\u0001\u0000\u0000\u0000\u02a5\u02a8\u0001\u0000\u0000\u0000\u02a6"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7"+
		";\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a9\u02ab"+
		"\u0005\r\u0000\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001"+
		"\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02bd\u0005"+
		"\n\u0000\u0000\u02ad\u02af\u0005\u000b\u0000\u0000\u02ae\u02b0\u0005\u000e"+
		"\u0000\u0000\u02af\u02ae\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1\u02bd\u0005\n\u0000"+
		"\u0000\u02b2\u02b4\u0005\f\u0000\u0000\u02b3\u02b5\u0005\u000e\u0000\u0000"+
		"\u02b4\u02b3\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02bd\u0005\n\u0000\u0000\u02b7"+
		"\u02b9\u0005\u000f\u0000\u0000\u02b8\u02ba\u0005\u000e\u0000\u0000\u02b9"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba"+
		"\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bd\u0005\n\u0000\u0000\u02bc\u02aa"+
		"\u0001\u0000\u0000\u0000\u02bc\u02ad\u0001\u0000\u0000\u0000\u02bc\u02b2"+
		"\u0001\u0000\u0000\u0000\u02bc\u02b7\u0001\u0000\u0000\u0000\u02bd=\u0001"+
		"\u0000\u0000\u0000\u02be\u02c0\u0003t:\u0000\u02bf\u02c1\u0007\u0003\u0000"+
		"\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c1?\u0001\u0000\u0000\u0000\u02c2\u02c4\u0005\u0002\u0000\u0000"+
		"\u02c3\u02c5\u0005\u0007\u0000\u0000\u02c4\u02c3\u0001\u0000\u0000\u0000"+
		"\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000"+
		"\u02c6\u02d2\u0003\u008eG\u0000\u02c7\u02c8\u0005\u0098\u0000\u0000\u02c8"+
		"\u02cd\u0003\u009eO\u0000\u02c9\u02ca\u0005\u0095\u0000\u0000\u02ca\u02cc"+
		"\u0003\u009eO\u0000\u02cb\u02c9\u0001\u0000\u0000\u0000\u02cc\u02cf\u0001"+
		"\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001"+
		"\u0000\u0000\u0000\u02ce\u02d0\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001"+
		"\u0000\u0000\u0000\u02d0\u02d1\u0005\u0099\u0000\u0000\u02d1\u02d3\u0001"+
		"\u0000\u0000\u0000\u02d2\u02c7\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001"+
		"\u0000\u0000\u0000\u02d3\u02e1\u0001\u0000\u0000\u0000\u02d4\u02d5\u0005"+
		"\b\u0000\u0000\u02d5\u02d6\u0005\u0098\u0000\u0000\u02d6\u02db\u0003t"+
		":\u0000\u02d7\u02d8\u0005\u0095\u0000\u0000\u02d8\u02da\u0003t:\u0000"+
		"\u02d9\u02d7\u0001\u0000\u0000\u0000\u02da\u02dd\u0001\u0000\u0000\u0000"+
		"\u02db\u02d9\u0001\u0000\u0000\u0000\u02db\u02dc\u0001\u0000\u0000\u0000"+
		"\u02dc\u02de\u0001\u0000\u0000\u0000\u02dd\u02db\u0001\u0000\u0000\u0000"+
		"\u02de\u02df\u0005\u0099\u0000\u0000\u02df\u02e2\u0001\u0000\u0000\u0000"+
		"\u02e0\u02e2\u00032\u0019\u0000\u02e1\u02d4\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e4\u0006 \uffff\uffff\u0000\u02e4A\u0001\u0000\u0000\u0000\u02e5\u02e6"+
		"\u0005\u0003\u0000\u0000\u02e6\u02e7\u0003\u008eG\u0000\u02e7\u02e8\u0005"+
		"\t\u0000\u0000\u02e8\u02ed\u0003D\"\u0000\u02e9\u02ea\u0005\u0095\u0000"+
		"\u0000\u02ea\u02ec\u0003D\"\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000"+
		"\u02ec\u02ef\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000"+
		"\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02f2\u0001\u0000\u0000\u0000"+
		"\u02ef\u02ed\u0001\u0000\u0000\u0000\u02f0\u02f1\u0005\u0006\u0000\u0000"+
		"\u02f1\u02f3\u0003\u008aE\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f2"+
		"\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f5\u0006!\uffff\uffff\u0000\u02f5C\u0001\u0000\u0000\u0000\u02f6\u02f7"+
		"\u0003\u009eO\u0000\u02f7\u02f8\u0005\u008a\u0000\u0000\u02f8\u02f9\u0003"+
		"t:\u0000\u02f9E\u0001\u0000\u0000\u0000\u02fa\u02fc\u0005\u0004\u0000"+
		"\u0000\u02fb\u02fd\u0005\u0005\u0000\u0000\u02fc\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000"+
		"\u0000\u02fe\u0301\u0003\u008eG\u0000\u02ff\u0300\u0005\u0006\u0000\u0000"+
		"\u0300\u0302\u0003\u008aE\u0000\u0301\u02ff\u0001\u0000\u0000\u0000\u0301"+
		"\u0302\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303"+
		"\u0304\u0006#\uffff\uffff\u0000\u0304G\u0001\u0000\u0000\u0000\u0305\u0306"+
		"\u0005/\u0000\u0000\u0306\u030b\u0003J%\u0000\u0307\u0308\u0005\u0095"+
		"\u0000\u0000\u0308\u030a\u0003J%\u0000\u0309\u0307\u0001\u0000\u0000\u0000"+
		"\u030a\u030d\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000"+
		"\u030b\u030c\u0001\u0000\u0000\u0000\u030cI\u0001\u0000\u0000\u0000\u030d"+
		"\u030b\u0001\u0000\u0000\u0000\u030e\u030f\u0003\u00a6S\u0000\u030f\u0312"+
		"\u00030\u0018\u0000\u0310\u0311\u0005\u008a\u0000\u0000\u0311\u0313\u0003"+
		"t:\u0000\u0312\u0310\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000"+
		"\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0315\u0006%\uffff\uffff"+
		"\u0000\u0315K\u0001\u0000\u0000\u0000\u0316\u0317\u0005\t\u0000\u0000"+
		"\u0317\u0318\u0003\u00a6S\u0000\u0318\u0319\u0005\u008a\u0000\u0000\u0319"+
		"\u031a\u0003t:\u0000\u031a\u031b\u0006&\uffff\uffff\u0000\u031bM\u0001"+
		"\u0000\u0000\u0000\u031c\u031d\u0005(\u0000\u0000\u031d\u031e\u0003\u008a"+
		"E\u0000\u031e\u0321\u0003\u0004\u0002\u0000\u031f\u0320\u0005)\u0000\u0000"+
		"\u0320\u0322\u0003\u0004\u0002\u0000\u0321\u031f\u0001\u0000\u0000\u0000"+
		"\u0321\u0322\u0001\u0000\u0000\u0000\u0322O\u0001\u0000\u0000\u0000\u0323"+
		"\u0324\u0005*\u0000\u0000\u0324\u0325\u0003\u008aE\u0000\u0325\u0326\u0003"+
		"\u0004\u0002\u0000\u0326Q\u0001\u0000\u0000\u0000\u0327\u0328\u0005&\u0000"+
		"\u0000\u0328\u0329\u00052\u0000\u0000\u0329\u032a\u0003\u0004\u0002\u0000"+
		"\u032a\u032b\u0005\'\u0000\u0000\u032b\u032c\u00052\u0000\u0000\u032c"+
		"\u032d\u0005&\u0000\u0000\u032d\u032e\u00053\u0000\u0000\u032e\u032f\u0003"+
		"\u0004\u0002\u0000\u032f\u0330\u0005\'\u0000\u0000\u0330\u0331\u00053"+
		"\u0000\u0000\u0331S\u0001\u0000\u0000\u0000\u0332\u0333\u0007\u0004\u0000"+
		"\u0000\u0333\u0335\u0003\u0092I\u0000\u0334\u0336\u0003V+\u0000\u0335"+
		"\u0334\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336"+
		"\u0337\u0001\u0000\u0000\u0000\u0337\u0338\u0006*\uffff\uffff\u0000\u0338"+
		"U\u0001\u0000\u0000\u0000\u0339\u033e\u0003X,\u0000\u033a\u033b\u0005"+
		"\u0095\u0000\u0000\u033b\u033d\u0003X,\u0000\u033c\u033a\u0001\u0000\u0000"+
		"\u0000\u033d\u0340\u0001\u0000\u0000\u0000\u033e\u033c\u0001\u0000\u0000"+
		"\u0000\u033e\u033f\u0001\u0000\u0000\u0000\u033fW\u0001\u0000\u0000\u0000"+
		"\u0340\u033e\u0001\u0000\u0000\u0000\u0341\u0347\u0003t:\u0000\u0342\u0343"+
		"\u0003\u00a8T\u0000\u0343\u0344\u0005\u008a\u0000\u0000\u0344\u0345\u0003"+
		"t:\u0000\u0345\u0347\u0001\u0000\u0000\u0000\u0346\u0341\u0001\u0000\u0000"+
		"\u0000\u0346\u0342\u0001\u0000\u0000\u0000\u0347Y\u0001\u0000\u0000\u0000"+
		"\u0348\u034a\u0005.\u0000\u0000\u0349\u034b\u0003t:\u0000\u034a\u0349"+
		"\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b[\u0001"+
		"\u0000\u0000\u0000\u034c\u034d\u0005,\u0000\u0000\u034d]\u0001\u0000\u0000"+
		"\u0000\u034e\u034f\u0005-\u0000\u0000\u034f_\u0001\u0000\u0000\u0000\u0350"+
		"\u0357\u00054\u0000\u0000\u0351\u0352\u0003b1\u0000\u0352\u0353\u0005"+
		"\u0095\u0000\u0000\u0353\u0354\u0003d2\u0000\u0354\u0355\u0005\u0095\u0000"+
		"\u0000\u0355\u0356\u0003f3\u0000\u0356\u0358\u0001\u0000\u0000\u0000\u0357"+
		"\u0351\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358"+
		"a\u0001\u0000\u0000\u0000\u0359\u035a\u0003t:\u0000\u035ac\u0001\u0000"+
		"\u0000\u0000\u035b\u035c\u0003t:\u0000\u035ce\u0001\u0000\u0000\u0000"+
		"\u035d\u035e\u0003t:\u0000\u035eg\u0001\u0000\u0000\u0000\u035f\u0360"+
		"\u0005&\u0000\u0000\u0360\u0362\u0007\u0005\u0000\u0000\u0361\u0363\u0003"+
		"\u00aaU\u0000\u0362\u0361\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000"+
		"\u0000\u0000\u0363i\u0001\u0000\u0000\u0000\u0364\u0366\u0005y\u0000\u0000"+
		"\u0365\u0367\u0007\u0005\u0000\u0000\u0366\u0365\u0001\u0000\u0000\u0000"+
		"\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u0369\u0001\u0000\u0000\u0000"+
		"\u0368\u036a\u0003\u00aaU\u0000\u0369\u0368\u0001\u0000\u0000\u0000\u0369"+
		"\u036a\u0001\u0000\u0000\u0000\u036ak\u0001\u0000\u0000\u0000\u036b\u036d"+
		"\u0005z\u0000\u0000\u036c\u036e\u0007\u0005\u0000\u0000\u036d\u036c\u0001"+
		"\u0000\u0000\u0000\u036d\u036e\u0001\u0000\u0000\u0000\u036e\u0371\u0001"+
		"\u0000\u0000\u0000\u036f\u0372\u0003\u00aaU\u0000\u0370\u0372\u0003\u00ac"+
		"V\u0000\u0371\u036f\u0001\u0000\u0000\u0000\u0371\u0370\u0001\u0000\u0000"+
		"\u0000\u0371\u0372\u0001\u0000\u0000\u0000\u0372m\u0001\u0000\u0000\u0000"+
		"\u0373\u0374\u0005{\u0000\u0000\u0374\u0375\u0007\u0005\u0000\u0000\u0375"+
		"\u0376\u0003\u00acV\u0000\u0376o\u0001\u0000\u0000\u0000\u0377\u0378\u0005"+
		":\u0000\u0000\u0378\u0379\u0003\u0098L\u0000\u0379q\u0001\u0000\u0000"+
		"\u0000\u037a\u037b\u00059\u0000\u0000\u037b\u037c\u0003t:\u0000\u037c"+
		"s\u0001\u0000\u0000\u0000\u037d\u037e\u0003v;\u0000\u037eu\u0001\u0000"+
		"\u0000\u0000\u037f\u0384\u0003x<\u0000\u0380\u0381\u0005c\u0000\u0000"+
		"\u0381\u0383\u0003x<\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0383\u0386"+
		"\u0001\u0000\u0000\u0000\u0384\u0382\u0001\u0000\u0000\u0000\u0384\u0385"+
		"\u0001\u0000\u0000\u0000\u0385w\u0001\u0000\u0000\u0000\u0386\u0384\u0001"+
		"\u0000\u0000\u0000\u0387\u038c\u0003z=\u0000\u0388\u0389\u0005b\u0000"+
		"\u0000\u0389\u038b\u0003z=\u0000\u038a\u0388\u0001\u0000\u0000\u0000\u038b"+
		"\u038e\u0001\u0000\u0000\u0000\u038c\u038a\u0001\u0000\u0000\u0000\u038c"+
		"\u038d\u0001\u0000\u0000\u0000\u038dy\u0001\u0000\u0000\u0000\u038e\u038c"+
		"\u0001\u0000\u0000\u0000\u038f\u0394\u0003|>\u0000\u0390\u0391\u0007\u0006"+
		"\u0000\u0000\u0391\u0393\u0003|>\u0000\u0392\u0390\u0001\u0000\u0000\u0000"+
		"\u0393\u0396\u0001\u0000\u0000\u0000\u0394\u0392\u0001\u0000\u0000\u0000"+
		"\u0394\u0395\u0001\u0000\u0000\u0000\u0395{\u0001\u0000\u0000\u0000\u0396"+
		"\u0394\u0001\u0000\u0000\u0000\u0397\u039c\u0003~?\u0000\u0398\u0399\u0007"+
		"\u0007\u0000\u0000\u0399\u039b\u0003~?\u0000\u039a\u0398\u0001\u0000\u0000"+
		"\u0000\u039b\u039e\u0001\u0000\u0000\u0000\u039c\u039a\u0001\u0000\u0000"+
		"\u0000\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u03cf\u0001\u0000\u0000"+
		"\u0000\u039e\u039c\u0001\u0000\u0000\u0000\u039f\u03a1\u0003~?\u0000\u03a0"+
		"\u03a2\u0005\\\u0000\u0000\u03a1\u03a0\u0001\u0000\u0000\u0000\u03a1\u03a2"+
		"\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000\u03a3\u03a4"+
		"\u0005f\u0000\u0000\u03a4\u03a5\u0003~?\u0000\u03a5\u03a6\u0005b\u0000"+
		"\u0000\u03a6\u03a7\u0003~?\u0000\u03a7\u03cf\u0001\u0000\u0000\u0000\u03a8"+
		"\u03aa\u0003~?\u0000\u03a9\u03ab\u0005\\\u0000\u0000\u03aa\u03a9\u0001"+
		"\u0000\u0000\u0000\u03aa\u03ab\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001"+
		"\u0000\u0000\u0000\u03ac\u03ad\u0005d\u0000\u0000\u03ad\u03b7\u0005\u0098"+
		"\u0000\u0000\u03ae\u03b3\u0003t:\u0000\u03af\u03b0\u0005\u0095\u0000\u0000"+
		"\u03b0\u03b2\u0003t:\u0000\u03b1\u03af\u0001\u0000\u0000\u0000\u03b2\u03b5"+
		"\u0001\u0000\u0000\u0000\u03b3\u03b1\u0001\u0000\u0000\u0000\u03b3\u03b4"+
		"\u0001\u0000\u0000\u0000\u03b4\u03b8\u0001\u0000\u0000\u0000\u03b5\u03b3"+
		"\u0001\u0000\u0000\u0000\u03b6\u03b8\u00032\u0019\u0000\u03b7\u03ae\u0001"+
		"\u0000\u0000\u0000\u03b7\u03b6\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001"+
		"\u0000\u0000\u0000\u03b9\u03ba\u0005\u0099\u0000\u0000\u03ba\u03cf\u0001"+
		"\u0000\u0000\u0000\u03bb\u03bd\u0003~?\u0000\u03bc\u03be\u0005\\\u0000"+
		"\u0000\u03bd\u03bc\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000"+
		"\u0000\u03be\u03bf\u0001\u0000\u0000\u0000\u03bf\u03c0\u0005g\u0000\u0000"+
		"\u03c0\u03c1\u0003~?\u0000\u03c1\u03cf\u0001\u0000\u0000\u0000\u03c2\u03c3"+
		"\u0003~?\u0000\u03c3\u03c5\u0005h\u0000\u0000\u03c4\u03c6\u0005\\\u0000"+
		"\u0000\u03c5\u03c4\u0001\u0000\u0000\u0000\u03c5\u03c6\u0001\u0000\u0000"+
		"\u0000\u03c6\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c8\u0005]\u0000\u0000"+
		"\u03c8\u03cf\u0001\u0000\u0000\u0000\u03c9\u03ca\u0005e\u0000\u0000\u03ca"+
		"\u03cb\u0005\u0098\u0000\u0000\u03cb\u03cc\u00032\u0019\u0000\u03cc\u03cd"+
		"\u0005\u0099\u0000\u0000\u03cd\u03cf\u0001\u0000\u0000\u0000\u03ce\u0397"+
		"\u0001\u0000\u0000\u0000\u03ce\u039f\u0001\u0000\u0000\u0000\u03ce\u03a8"+
		"\u0001\u0000\u0000\u0000\u03ce\u03bb\u0001\u0000\u0000\u0000\u03ce\u03c2"+
		"\u0001\u0000\u0000\u0000\u03ce\u03c9\u0001\u0000\u0000\u0000\u03cf}\u0001"+
		"\u0000\u0000\u0000\u03d0\u03d5\u0003\u0080@\u0000\u03d1\u03d2\u0007\b"+
		"\u0000\u0000\u03d2\u03d4\u0003\u0080@\u0000\u03d3\u03d1\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d7\u0001\u0000\u0000\u0000\u03d5\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6\u007f\u0001\u0000\u0000"+
		"\u0000\u03d7\u03d5\u0001\u0000\u0000\u0000\u03d8\u03dd\u0003\u0082A\u0000"+
		"\u03d9\u03da\u0007\t\u0000\u0000\u03da\u03dc\u0003\u0082A\u0000\u03db"+
		"\u03d9\u0001\u0000\u0000\u0000\u03dc\u03df\u0001\u0000\u0000\u0000\u03dd"+
		"\u03db\u0001\u0000\u0000\u0000\u03dd\u03de\u0001\u0000\u0000\u0000\u03de"+
		"\u0081\u0001\u0000\u0000\u0000\u03df\u03dd\u0001\u0000\u0000\u0000\u03e0"+
		"\u03e4\u0003\u0084B\u0000\u03e1\u03e2\u0007\n\u0000\u0000\u03e2\u03e4"+
		"\u0003\u0082A\u0000\u03e3\u03e0\u0001\u0000\u0000\u0000\u03e3\u03e1\u0001"+
		"\u0000\u0000\u0000\u03e4\u0083\u0001\u0000\u0000\u0000\u03e5\u03f3\u0003"+
		"\u008cF\u0000\u03e6\u03f3\u0003\u00a6S\u0000\u03e7\u03f3\u0003\u009eO"+
		"\u0000\u03e8\u03f3\u0003\u0086C\u0000\u03e9\u03f3\u0003\u0088D\u0000\u03ea"+
		"\u03eb\u0005\u0098\u0000\u0000\u03eb\u03ec\u0003t:\u0000\u03ec\u03ed\u0005"+
		"\u0099\u0000\u0000\u03ed\u03f3\u0001\u0000\u0000\u0000\u03ee\u03ef\u0005"+
		"\u0098\u0000\u0000\u03ef\u03f0\u00032\u0019\u0000\u03f0\u03f1\u0005\u0099"+
		"\u0000\u0000\u03f1\u03f3\u0001\u0000\u0000\u0000\u03f2\u03e5\u0001\u0000"+
		"\u0000\u0000\u03f2\u03e6\u0001\u0000\u0000\u0000\u03f2\u03e7\u0001\u0000"+
		"\u0000\u0000\u03f2\u03e8\u0001\u0000\u0000\u0000\u03f2\u03e9\u0001\u0000"+
		"\u0000\u0000\u03f2\u03ea\u0001\u0000\u0000\u0000\u03f2\u03ee\u0001\u0000"+
		"\u0000\u0000\u03f3\u0085\u0001\u0000\u0000\u0000\u03f4\u03f5\u0003\u0094"+
		"J\u0000\u03f5\u03f7\u0005\u0098\u0000\u0000\u03f6\u03f8\u0003V+\u0000"+
		"\u03f7\u03f6\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000"+
		"\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fa\u0005\u0099\u0000\u0000"+
		"\u03fa\u03fb\u0006C\uffff\uffff\u0000\u03fb\u0087\u0001\u0000\u0000\u0000"+
		"\u03fc\u03fe\u0005j\u0000\u0000\u03fd\u03ff\u0003t:\u0000\u03fe\u03fd"+
		"\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0405"+
		"\u0001\u0000\u0000\u0000\u0400\u0401\u0005k\u0000\u0000\u0401\u0402\u0003"+
		"t:\u0000\u0402\u0403\u0005l\u0000\u0000\u0403\u0404\u0003t:\u0000\u0404"+
		"\u0406\u0001\u0000\u0000\u0000\u0405\u0400\u0001\u0000\u0000\u0000\u0406"+
		"\u0407\u0001\u0000\u0000\u0000\u0407\u0405\u0001\u0000\u0000\u0000\u0407"+
		"\u0408\u0001\u0000\u0000\u0000\u0408\u040b\u0001\u0000\u0000\u0000\u0409"+
		"\u040a\u0005)\u0000\u0000\u040a\u040c\u0003t:\u0000\u040b\u0409\u0001"+
		"\u0000\u0000\u0000\u040b\u040c\u0001\u0000\u0000\u0000\u040c\u040d\u0001"+
		"\u0000\u0000\u0000\u040d\u040e\u0005\'\u0000\u0000\u040e\u0089\u0001\u0000"+
		"\u0000\u0000\u040f\u0410\u0003t:\u0000\u0410\u008b\u0001\u0000\u0000\u0000"+
		"\u0411\u0412\u0007\u000b\u0000\u0000\u0412\u008d\u0001\u0000\u0000\u0000"+
		"\u0413\u0414\u0003\u0098L\u0000\u0414\u0415\u0005\u0096\u0000\u0000\u0415"+
		"\u0417\u0001\u0000\u0000\u0000\u0416\u0413\u0001\u0000\u0000\u0000\u0416"+
		"\u0417\u0001\u0000\u0000\u0000\u0417\u041b\u0001\u0000\u0000\u0000\u0418"+
		"\u0419\u0003\u009aM\u0000\u0419\u041a\u0005\u0096\u0000\u0000\u041a\u041c"+
		"\u0001\u0000\u0000\u0000\u041b\u0418\u0001\u0000\u0000\u0000\u041b\u041c"+
		"\u0001\u0000\u0000\u0000\u041c\u041d\u0001\u0000\u0000\u0000\u041d\u041e"+
		"\u0003\u009cN\u0000\u041e\u008f\u0001\u0000\u0000\u0000\u041f\u0420\u0003"+
		"\u0098L\u0000\u0420\u0421\u0005\u0096\u0000\u0000\u0421\u0423\u0001\u0000"+
		"\u0000\u0000\u0422\u041f\u0001\u0000\u0000\u0000\u0422\u0423\u0001\u0000"+
		"\u0000\u0000\u0423\u0427\u0001\u0000\u0000\u0000\u0424\u0425\u0003\u009a"+
		"M\u0000\u0425\u0426\u0005\u0096\u0000\u0000\u0426\u0428\u0001\u0000\u0000"+
		"\u0000\u0427\u0424\u0001\u0000\u0000\u0000\u0427\u0428\u0001\u0000\u0000"+
		"\u0000\u0428\u0429\u0001\u0000\u0000\u0000\u0429\u042a\u0003\u009cN\u0000"+
		"\u042a\u0091\u0001\u0000\u0000\u0000\u042b\u042c\u0003\u0098L\u0000\u042c"+
		"\u042d\u0005\u0096\u0000\u0000\u042d\u042f\u0001\u0000\u0000\u0000\u042e"+
		"\u042b\u0001\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000\u0000\u042f"+
		"\u0433\u0001\u0000\u0000\u0000\u0430\u0431\u0003\u009aM\u0000\u0431\u0432"+
		"\u0005\u0096\u0000\u0000\u0432\u0434\u0001\u0000\u0000\u0000\u0433\u0430"+
		"\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000\u0000\u0434\u0435"+
		"\u0001\u0000\u0000\u0000\u0435\u0436\u0003\u009cN\u0000\u0436\u0093\u0001"+
		"\u0000\u0000\u0000\u0437\u0438\u0003\u0098L\u0000\u0438\u0439\u0005\u0096"+
		"\u0000\u0000\u0439\u043b\u0001\u0000\u0000\u0000\u043a\u0437\u0001\u0000"+
		"\u0000\u0000\u043a\u043b\u0001\u0000\u0000\u0000\u043b\u043f\u0001\u0000"+
		"\u0000\u0000\u043c\u043d\u0003\u009aM\u0000\u043d\u043e\u0005\u0096\u0000"+
		"\u0000\u043e\u0440\u0001\u0000\u0000\u0000\u043f\u043c\u0001\u0000\u0000"+
		"\u0000\u043f\u0440\u0001\u0000\u0000\u0000\u0440\u0441\u0001\u0000\u0000"+
		"\u0000\u0441\u0442\u0003\u009cN\u0000\u0442\u0095\u0001\u0000\u0000\u0000"+
		"\u0443\u0444\u0003\u009cN\u0000\u0444\u0097\u0001\u0000\u0000\u0000\u0445"+
		"\u0446\u0003\u00aeW\u0000\u0446\u0099\u0001\u0000\u0000\u0000\u0447\u0448"+
		"\u0003\u00aeW\u0000\u0448\u009b\u0001\u0000\u0000\u0000\u0449\u044a\u0003"+
		"\u00aeW\u0000\u044a\u009d\u0001\u0000\u0000\u0000\u044b\u044c\u0003\u008e"+
		"G\u0000\u044c\u044d\u0005\u0096\u0000\u0000\u044d\u044f\u0001\u0000\u0000"+
		"\u0000\u044e\u044b\u0001\u0000\u0000\u0000\u044e\u044f\u0001\u0000\u0000"+
		"\u0000\u044f\u0450\u0001\u0000\u0000\u0000\u0450\u0451\u0003\u00aeW\u0000"+
		"\u0451\u009f\u0001\u0000\u0000\u0000\u0452\u0453\u0003\u00aeW\u0000\u0453"+
		"\u00a1\u0001\u0000\u0000\u0000\u0454\u0455\u0003\u00aeW\u0000\u0455\u00a3"+
		"\u0001\u0000\u0000\u0000\u0456\u0457\u0003\u00aeW\u0000\u0457\u00a5\u0001"+
		"\u0000\u0000\u0000\u0458\u0459\u0007\f\u0000\u0000\u0459\u00a7\u0001\u0000"+
		"\u0000\u0000\u045a\u045b\u0005\u00a7\u0000\u0000\u045b\u00a9\u0001\u0000"+
		"\u0000\u0000\u045c\u045d\u0003\u00aeW\u0000\u045d\u00ab\u0001\u0000\u0000"+
		"\u0000\u045e\u045f\u0003\u00aeW\u0000\u045f\u00ad\u0001\u0000\u0000\u0000"+
		"\u0460\u0461\u0007\r\u0000\u0000\u0461\u00af\u0001\u0000\u0000\u0000z"+
		"\u00b3\u00ba\u00be\u00c3\u00cb\u00d1\u00d6\u00e0\u00ee\u00f8\u00fc\u0101"+
		"\u0109\u0120\u012c\u0132\u0136\u013e\u0149\u0154\u016c\u0174\u0176\u017f"+
		"\u018a\u019e\u01aa\u01ba\u01c1\u01c4\u01ce\u01d4\u01da\u01e0\u01ee\u01f1"+
		"\u01f8\u01fb\u0201\u0210\u0216\u021b\u0223\u0226\u022a\u0231\u023a\u023d"+
		"\u0241\u024a\u024d\u0251\u025a\u025d\u0266\u026b\u0278\u0282\u0285\u0287"+
		"\u028c\u028f\u0297\u029a\u029c\u02a6\u02aa\u02af\u02b4\u02b9\u02bc\u02c0"+
		"\u02c4\u02cd\u02d2\u02db\u02e1\u02ed\u02f2\u02fc\u0301\u030b\u0312\u0321"+
		"\u0335\u033e\u0346\u034a\u0357\u0362\u0366\u0369\u036d\u0371\u0384\u038c"+
		"\u0394\u039c\u03a1\u03aa\u03b3\u03b7\u03bd\u03c5\u03ce\u03d5\u03dd\u03e3"+
		"\u03f2\u03f7\u03fe\u0407\u040b\u0416\u041b\u0422\u0427\u042e\u0433\u043a"+
		"\u043f\u044e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}