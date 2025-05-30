// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/pascal/PascalParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.pascal;

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
public class PascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, CONST=3, TYPE=4, PROCEDURE=5, FUNCTION=6, BEGIN=7, END=8, 
		IF=9, THEN=10, ELSE=11, WHILE=12, DO=13, FOR=14, TO=15, DOWNTO=16, REPEAT=17, 
		UNTIL=18, CASE=19, OF=20, WITH=21, GOTO=22, LABEL=23, INTEGER_TYPE=24, 
		REAL_TYPE=25, BOOLEAN_TYPE=26, CHAR_TYPE=27, STRING_TYPE=28, ARRAY=29, 
		RECORD=30, SET=31, FILE=32, POINTER=33, TRUE=34, FALSE=35, NIL=36, AND=37, 
		OR=38, NOT=39, DIV=40, MOD=41, IN=42, ASSIGN=43, PLUS=44, MINUS=45, MULT=46, 
		DIVIDE=47, EQ=48, NE=49, LT=50, LE=51, GT=52, GE=53, SEMICOLON=54, COMMA=55, 
		DOT=56, DOTDOT=57, COLON=58, LPAREN=59, RPAREN=60, LBRACKET=61, RBRACKET=62, 
		POINTER_OP=63, INTEGER_LITERAL=64, REAL_LITERAL=65, STRING_LITERAL=66, 
		CHAR_LITERAL=67, IDENTIFIER=68, COMMENT1=69, COMMENT2=70, LINE_COMMENT=71, 
		WS=72;
	public static final int
		RULE_program = 0, RULE_programBlock = 1, RULE_declarationPart = 2, RULE_labelDeclaration = 3, 
		RULE_labelList = 4, RULE_constantDeclaration = 5, RULE_constantDefinition = 6, 
		RULE_typeDeclaration = 7, RULE_typeDefinition = 8, RULE_variableDeclaration = 9, 
		RULE_variableGroup = 10, RULE_identifierList = 11, RULE_procedureDeclaration = 12, 
		RULE_procedureHeading = 13, RULE_functionHeading = 14, RULE_resultType = 15, 
		RULE_formalParameterList = 16, RULE_formalParameterSection = 17, RULE_parameterGroup = 18, 
		RULE_parameterType = 19, RULE_indexType = 20, RULE_procedureBody = 21, 
		RULE_functionBody = 22, RULE_type = 23, RULE_simpleType = 24, RULE_ordinalType = 25, 
		RULE_enumType = 26, RULE_subrangeType = 27, RULE_realType = 28, RULE_structuredType = 29, 
		RULE_arrayType = 30, RULE_componentType = 31, RULE_recordType = 32, RULE_fieldList = 33, 
		RULE_fixedPart = 34, RULE_recordSection = 35, RULE_variantPart = 36, RULE_tag = 37, 
		RULE_variant = 38, RULE_caseLabelList = 39, RULE_caseLabel = 40, RULE_setType = 41, 
		RULE_fileType = 42, RULE_pointerType = 43, RULE_statementPart = 44, RULE_block = 45, 
		RULE_statement = 46, RULE_simpleStatement = 47, RULE_assignmentStatement = 48, 
		RULE_variable = 49, RULE_procedureCall = 50, RULE_actualParameterList = 51, 
		RULE_actualParameter = 52, RULE_gotoStatement = 53, RULE_emptyStatement = 54, 
		RULE_structuredStatement = 55, RULE_compoundStatement = 56, RULE_statementList = 57, 
		RULE_conditionalStatement = 58, RULE_ifStatement = 59, RULE_caseStatement = 60, 
		RULE_caseListElement = 61, RULE_repetitiveStatement = 62, RULE_whileStatement = 63, 
		RULE_repeatStatement = 64, RULE_forStatement = 65, RULE_forList = 66, 
		RULE_initialValue = 67, RULE_finalValue = 68, RULE_withStatement = 69, 
		RULE_recordVariableList = 70, RULE_expression = 71, RULE_relationalOperator = 72, 
		RULE_simpleExpression = 73, RULE_addingOperator = 74, RULE_term = 75, 
		RULE_multiplyingOperator = 76, RULE_factor = 77, RULE_functionCall = 78, 
		RULE_set = 79, RULE_elementList = 80, RULE_element = 81, RULE_constant = 82, 
		RULE_unsignedConstant = 83, RULE_unsignedNumber = 84;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programBlock", "declarationPart", "labelDeclaration", "labelList", 
			"constantDeclaration", "constantDefinition", "typeDeclaration", "typeDefinition", 
			"variableDeclaration", "variableGroup", "identifierList", "procedureDeclaration", 
			"procedureHeading", "functionHeading", "resultType", "formalParameterList", 
			"formalParameterSection", "parameterGroup", "parameterType", "indexType", 
			"procedureBody", "functionBody", "type", "simpleType", "ordinalType", 
			"enumType", "subrangeType", "realType", "structuredType", "arrayType", 
			"componentType", "recordType", "fieldList", "fixedPart", "recordSection", 
			"variantPart", "tag", "variant", "caseLabelList", "caseLabel", "setType", 
			"fileType", "pointerType", "statementPart", "block", "statement", "simpleStatement", 
			"assignmentStatement", "variable", "procedureCall", "actualParameterList", 
			"actualParameter", "gotoStatement", "emptyStatement", "structuredStatement", 
			"compoundStatement", "statementList", "conditionalStatement", "ifStatement", 
			"caseStatement", "caseListElement", "repetitiveStatement", "whileStatement", 
			"repeatStatement", "forStatement", "forList", "initialValue", "finalValue", 
			"withStatement", "recordVariableList", "expression", "relationalOperator", 
			"simpleExpression", "addingOperator", "term", "multiplyingOperator", 
			"factor", "functionCall", "set", "elementList", "element", "constant", 
			"unsignedConstant", "unsignedNumber"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "':='", "'+'", "'-'", "'*'", 
			"'/'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "';'", "','", "'.'", 
			"'..'", "':'", "'('", "')'", "'['", "']'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "CONST", "TYPE", "PROCEDURE", "FUNCTION", "BEGIN", 
			"END", "IF", "THEN", "ELSE", "WHILE", "DO", "FOR", "TO", "DOWNTO", "REPEAT", 
			"UNTIL", "CASE", "OF", "WITH", "GOTO", "LABEL", "INTEGER_TYPE", "REAL_TYPE", 
			"BOOLEAN_TYPE", "CHAR_TYPE", "STRING_TYPE", "ARRAY", "RECORD", "SET", 
			"FILE", "POINTER", "TRUE", "FALSE", "NIL", "AND", "OR", "NOT", "DIV", 
			"MOD", "IN", "ASSIGN", "PLUS", "MINUS", "MULT", "DIVIDE", "EQ", "NE", 
			"LT", "LE", "GT", "GE", "SEMICOLON", "COMMA", "DOT", "DOTDOT", "COLON", 
			"LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "POINTER_OP", "INTEGER_LITERAL", 
			"REAL_LITERAL", "STRING_LITERAL", "CHAR_LITERAL", "IDENTIFIER", "COMMENT1", 
			"COMMENT2", "LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "PascalParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private SymbolTable symbolTable = new SymbolTable();
	    private ErrorTable errorTable = new ErrorTable();
	    private Set<String> declaredIdentifiers = new HashSet<>();
	    
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
	    
	    private void checkIdentifierDeclaration(String name, int line, int column) {
	        if (declaredIdentifiers.contains(name)) {
	            addError("Identifier '" + name + "' already declared", line, column, "SEMANTIC");
	        } else {
	            declaredIdentifiers.add(name);
	        }
	    }
	    
	    private void checkIdentifierUsage(String name, int line, int column) {
	        if (!declaredIdentifiers.contains(name)) {
	            addError("Identifier '" + name + "' not declared", line, column, "SEMANTIC");
	        }
	    }

	public PascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode PROGRAM() { return getToken(PascalParser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public ProgramBlockContext programBlock() {
			return getRuleContext(ProgramBlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PascalParser.DOT, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(PROGRAM);
			setState(171);
			((ProgramContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(172);
			match(SEMICOLON);
			setState(173);
			programBlock();
			setState(174);
			match(DOT);

			        addSymbol(((ProgramContext)_localctx).IDENTIFIER.getText(), "program", ((ProgramContext)_localctx).IDENTIFIER.getLine(), ((ProgramContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramBlockContext extends ParserRuleContext {
		public DeclarationPartContext declarationPart() {
			return getRuleContext(DeclarationPartContext.class,0);
		}
		public StatementPartContext statementPart() {
			return getRuleContext(StatementPartContext.class,0);
		}
		public ProgramBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterProgramBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitProgramBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitProgramBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramBlockContext programBlock() throws RecognitionException {
		ProgramBlockContext _localctx = new ProgramBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			declarationPart();
			setState(178);
			statementPart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationPartContext extends ParserRuleContext {
		public List<LabelDeclarationContext> labelDeclaration() {
			return getRuleContexts(LabelDeclarationContext.class);
		}
		public LabelDeclarationContext labelDeclaration(int i) {
			return getRuleContext(LabelDeclarationContext.class,i);
		}
		public List<ConstantDeclarationContext> constantDeclaration() {
			return getRuleContexts(ConstantDeclarationContext.class);
		}
		public ConstantDeclarationContext constantDeclaration(int i) {
			return getRuleContext(ConstantDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<ProcedureDeclarationContext> procedureDeclaration() {
			return getRuleContexts(ProcedureDeclarationContext.class);
		}
		public ProcedureDeclarationContext procedureDeclaration(int i) {
			return getRuleContext(ProcedureDeclarationContext.class,i);
		}
		public DeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitDeclarationPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationPartContext declarationPart() throws RecognitionException {
		DeclarationPartContext _localctx = new DeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388732L) != 0)) {
				{
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LABEL:
					{
					setState(180);
					labelDeclaration();
					}
					break;
				case CONST:
					{
					setState(181);
					constantDeclaration();
					}
					break;
				case TYPE:
					{
					setState(182);
					typeDeclaration();
					}
					break;
				case VAR:
					{
					setState(183);
					variableDeclaration();
					}
					break;
				case PROCEDURE:
				case FUNCTION:
					{
					setState(184);
					procedureDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(189);
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
	public static class LabelDeclarationContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(PascalParser.LABEL, 0); }
		public LabelListContext labelList() {
			return getRuleContext(LabelListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public LabelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterLabelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitLabelDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitLabelDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDeclarationContext labelDeclaration() throws RecognitionException {
		LabelDeclarationContext _localctx = new LabelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_labelDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(LABEL);
			setState(191);
			labelList();
			setState(192);
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
	public static class LabelListContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<TerminalNode> IDENTIFIER() { return getTokens(PascalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PascalParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public LabelListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterLabelList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitLabelList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitLabelList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelListContext labelList() throws RecognitionException {
		LabelListContext _localctx = new LabelListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_labelList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((LabelListContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(195);
				match(COMMA);
				setState(196);
				((LabelListContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        addSymbol(((LabelListContext)_localctx).IDENTIFIER.getText(), "label", ((LabelListContext)_localctx).IDENTIFIER.getLine(), ((LabelListContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode CONST() { return getToken(PascalParser.CONST, 0); }
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(CONST);
			setState(205);
			constantDefinition();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(206);
				constantDefinition();
				}
				}
				setState(211);
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
	public static class ConstantDefinitionContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(PascalParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterConstantDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitConstantDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitConstantDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			((ConstantDefinitionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(213);
			match(EQ);
			setState(214);
			constant();
			setState(215);
			match(SEMICOLON);

			        checkIdentifierDeclaration(((ConstantDefinitionContext)_localctx).IDENTIFIER.getText(), ((ConstantDefinitionContext)_localctx).IDENTIFIER.getLine(), ((ConstantDefinitionContext)_localctx).IDENTIFIER.getCharPositionInLine());
			        addSymbol(((ConstantDefinitionContext)_localctx).IDENTIFIER.getText(), "constant", ((ConstantDefinitionContext)_localctx).IDENTIFIER.getLine(), ((ConstantDefinitionContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode TYPE() { return getToken(PascalParser.TYPE, 0); }
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(TYPE);
			setState(219);
			typeDefinition();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(220);
				typeDefinition();
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
	public static class TypeDefinitionContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(PascalParser.EQ, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((TypeDefinitionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(227);
			match(EQ);
			setState(228);
			type();
			setState(229);
			match(SEMICOLON);

			        checkIdentifierDeclaration(((TypeDefinitionContext)_localctx).IDENTIFIER.getText(), ((TypeDefinitionContext)_localctx).IDENTIFIER.getLine(), ((TypeDefinitionContext)_localctx).IDENTIFIER.getCharPositionInLine());
			        addSymbol(((TypeDefinitionContext)_localctx).IDENTIFIER.getText(), "type", ((TypeDefinitionContext)_localctx).IDENTIFIER.getLine(), ((TypeDefinitionContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode VAR() { return getToken(PascalParser.VAR, 0); }
		public List<VariableGroupContext> variableGroup() {
			return getRuleContexts(VariableGroupContext.class);
		}
		public VariableGroupContext variableGroup(int i) {
			return getRuleContext(VariableGroupContext.class,i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(VAR);
			setState(233);
			variableGroup();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(234);
				variableGroup();
				}
				}
				setState(239);
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
	public static class VariableGroupContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public VariableGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterVariableGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitVariableGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitVariableGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableGroupContext variableGroup() throws RecognitionException {
		VariableGroupContext _localctx = new VariableGroupContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			identifierList();
			setState(241);
			match(COLON);
			setState(242);
			type();
			setState(243);
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
	public static class IdentifierListContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<TerminalNode> IDENTIFIER() { return getTokens(PascalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PascalParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			((IdentifierListContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(246);
				match(COMMA);
				setState(247);
				((IdentifierListContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        checkIdentifierDeclaration(((IdentifierListContext)_localctx).IDENTIFIER.getText(), ((IdentifierListContext)_localctx).IDENTIFIER.getLine(), ((IdentifierListContext)_localctx).IDENTIFIER.getCharPositionInLine());
			        addSymbol(((IdentifierListContext)_localctx).IDENTIFIER.getText(), "variable", ((IdentifierListContext)_localctx).IDENTIFIER.getLine(), ((IdentifierListContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public ProcedureHeadingContext procedureHeading() {
			return getRuleContext(ProcedureHeadingContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public ProcedureBodyContext procedureBody() {
			return getRuleContext(ProcedureBodyContext.class,0);
		}
		public FunctionHeadingContext functionHeading() {
			return getRuleContext(FunctionHeadingContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitProcedureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_procedureDeclaration);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				procedureHeading();
				setState(256);
				match(SEMICOLON);
				setState(257);
				procedureBody();
				setState(258);
				match(SEMICOLON);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				functionHeading();
				setState(261);
				match(SEMICOLON);
				setState(262);
				functionBody();
				setState(263);
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
	public static class ProcedureHeadingContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode PROCEDURE() { return getToken(PascalParser.PROCEDURE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public ProcedureHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterProcedureHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitProcedureHeading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitProcedureHeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureHeadingContext procedureHeading() throws RecognitionException {
		ProcedureHeadingContext _localctx = new ProcedureHeadingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_procedureHeading);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(PROCEDURE);
			setState(268);
			((ProcedureHeadingContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(269);
				match(LPAREN);
				setState(270);
				formalParameterList();
				setState(271);
				match(RPAREN);
				}
			}


			        checkIdentifierDeclaration(((ProcedureHeadingContext)_localctx).IDENTIFIER.getText(), ((ProcedureHeadingContext)_localctx).IDENTIFIER.getLine(), ((ProcedureHeadingContext)_localctx).IDENTIFIER.getCharPositionInLine());
			        addSymbol(((ProcedureHeadingContext)_localctx).IDENTIFIER.getText(), "procedure", ((ProcedureHeadingContext)_localctx).IDENTIFIER.getLine(), ((ProcedureHeadingContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionHeadingContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode FUNCTION() { return getToken(PascalParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public FunctionHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterFunctionHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitFunctionHeading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitFunctionHeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionHeadingContext functionHeading() throws RecognitionException {
		FunctionHeadingContext _localctx = new FunctionHeadingContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionHeading);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(FUNCTION);
			setState(278);
			((FunctionHeadingContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(279);
				match(LPAREN);
				setState(280);
				formalParameterList();
				setState(281);
				match(RPAREN);
				}
			}

			setState(285);
			match(COLON);
			setState(286);
			resultType();

			        checkIdentifierDeclaration(((FunctionHeadingContext)_localctx).IDENTIFIER.getText(), ((FunctionHeadingContext)_localctx).IDENTIFIER.getLine(), ((FunctionHeadingContext)_localctx).IDENTIFIER.getCharPositionInLine());
			        addSymbol(((FunctionHeadingContext)_localctx).IDENTIFIER.getText(), "function", ((FunctionHeadingContext)_localctx).IDENTIFIER.getLine(), ((FunctionHeadingContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResultTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterResultType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitResultType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitResultType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			formalParameterSection();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(292);
				match(SEMICOLON);
				setState(293);
				formalParameterSection();
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
	public static class FormalParameterSectionContext extends ParserRuleContext {
		public ParameterGroupContext parameterGroup() {
			return getRuleContext(ParameterGroupContext.class,0);
		}
		public TerminalNode VAR() { return getToken(PascalParser.VAR, 0); }
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterFormalParameterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitFormalParameterSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitFormalParameterSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_formalParameterSection);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				parameterGroup();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(VAR);
				setState(301);
				parameterGroup();
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
	public static class ParameterGroupContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public ParameterTypeContext parameterType() {
			return getRuleContext(ParameterTypeContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterParameterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitParameterGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitParameterGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			identifierList();
			setState(305);
			match(COLON);
			setState(306);
			parameterType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public TerminalNode ARRAY() { return getToken(PascalParser.ARRAY, 0); }
		public TerminalNode LBRACKET() { return getToken(PascalParser.LBRACKET, 0); }
		public IndexTypeContext indexType() {
			return getRuleContext(IndexTypeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(PascalParser.RBRACKET, 0); }
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public ParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterParameterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitParameterType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitParameterType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeContext parameterType() throws RecognitionException {
		ParameterTypeContext _localctx = new ParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameterType);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(IDENTIFIER);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(ARRAY);
				setState(310);
				match(LBRACKET);
				setState(311);
				indexType();
				setState(312);
				match(RBRACKET);
				setState(313);
				match(OF);
				setState(314);
				match(IDENTIFIER);
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
	public static class IndexTypeContext extends ParserRuleContext {
		public OrdinalTypeContext ordinalType() {
			return getRuleContext(OrdinalTypeContext.class,0);
		}
		public IndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterIndexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitIndexType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitIndexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			ordinalType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProcedureBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterProcedureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitProcedureBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitProcedureBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureBodyContext procedureBody() throws RecognitionException {
		ProcedureBodyContext _localctx = new ProcedureBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_procedureBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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
	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
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
	public static class TypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public StructuredTypeContext structuredType() {
			return getRuleContext(StructuredTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_TYPE:
			case REAL_TYPE:
			case BOOLEAN_TYPE:
			case CHAR_TYPE:
			case TRUE:
			case FALSE:
			case NIL:
			case PLUS:
			case MINUS:
			case LPAREN:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case STRING_LITERAL:
			case CHAR_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				simpleType();
				}
				break;
			case ARRAY:
			case RECORD:
			case SET:
			case FILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				structuredType();
				}
				break;
			case POINTER_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				pointerType();
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
	public static class SimpleTypeContext extends ParserRuleContext {
		public OrdinalTypeContext ordinalType() {
			return getRuleContext(OrdinalTypeContext.class,0);
		}
		public RealTypeContext realType() {
			return getRuleContext(RealTypeContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_simpleType);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_TYPE:
			case BOOLEAN_TYPE:
			case CHAR_TYPE:
			case TRUE:
			case FALSE:
			case NIL:
			case PLUS:
			case MINUS:
			case LPAREN:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case STRING_LITERAL:
			case CHAR_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				ordinalType();
				}
				break;
			case REAL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				realType();
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
	public static class OrdinalTypeContext extends ParserRuleContext {
		public TerminalNode INTEGER_TYPE() { return getToken(PascalParser.INTEGER_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(PascalParser.BOOLEAN_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(PascalParser.CHAR_TYPE, 0); }
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public SubrangeTypeContext subrangeType() {
			return getRuleContext(SubrangeTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public OrdinalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterOrdinalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitOrdinalType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitOrdinalType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdinalTypeContext ordinalType() throws RecognitionException {
		OrdinalTypeContext _localctx = new OrdinalTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ordinalType);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(INTEGER_TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(BOOLEAN_TYPE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(CHAR_TYPE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				enumType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				subrangeType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
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
	public static class EnumTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitEnumType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitEnumType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enumType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(LPAREN);
			setState(342);
			identifierList();
			setState(343);
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
	public static class SubrangeTypeContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(PascalParser.DOTDOT, 0); }
		public SubrangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrangeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterSubrangeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitSubrangeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitSubrangeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrangeTypeContext subrangeType() throws RecognitionException {
		SubrangeTypeContext _localctx = new SubrangeTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_subrangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			constant();
			setState(346);
			match(DOTDOT);
			setState(347);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RealTypeContext extends ParserRuleContext {
		public TerminalNode REAL_TYPE() { return getToken(PascalParser.REAL_TYPE, 0); }
		public RealTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterRealType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitRealType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitRealType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealTypeContext realType() throws RecognitionException {
		RealTypeContext _localctx = new RealTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_realType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(REAL_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructuredTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public FileTypeContext fileType() {
			return getRuleContext(FileTypeContext.class,0);
		}
		public StructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitStructuredType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitStructuredType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredTypeContext structuredType() throws RecognitionException {
		StructuredTypeContext _localctx = new StructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_structuredType);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				recordType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				setType();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				fileType();
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
	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(PascalParser.ARRAY, 0); }
		public TerminalNode LBRACKET() { return getToken(PascalParser.LBRACKET, 0); }
		public List<IndexTypeContext> indexType() {
			return getRuleContexts(IndexTypeContext.class);
		}
		public IndexTypeContext indexType(int i) {
			return getRuleContext(IndexTypeContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(PascalParser.RBRACKET, 0); }
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public ComponentTypeContext componentType() {
			return getRuleContext(ComponentTypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(ARRAY);
			setState(358);
			match(LBRACKET);
			setState(359);
			indexType();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(360);
				match(COMMA);
				setState(361);
				indexType();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(RBRACKET);
			setState(368);
			match(OF);
			setState(369);
			componentType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ComponentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterComponentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitComponentType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitComponentType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentTypeContext componentType() throws RecognitionException {
		ComponentTypeContext _localctx = new ComponentTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_componentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode RECORD() { return getToken(PascalParser.RECORD, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterRecordType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitRecordType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitRecordType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_recordType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(RECORD);
			setState(374);
			fieldList();
			setState(375);
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
	public static class FieldListContext extends ParserRuleContext {
		public FixedPartContext fixedPart() {
			return getRuleContext(FixedPartContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public VariantPartContext variantPart() {
			return getRuleContext(VariantPartContext.class,0);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fieldList);
		int _la;
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				fixedPart();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(378);
					match(SEMICOLON);
					setState(379);
					variantPart();
					}
				}

				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				variantPart();
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
	public static class FixedPartContext extends ParserRuleContext {
		public List<RecordSectionContext> recordSection() {
			return getRuleContexts(RecordSectionContext.class);
		}
		public RecordSectionContext recordSection(int i) {
			return getRuleContext(RecordSectionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public FixedPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterFixedPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitFixedPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitFixedPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedPartContext fixedPart() throws RecognitionException {
		FixedPartContext _localctx = new FixedPartContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fixedPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			recordSection();
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(386);
					match(SEMICOLON);
					setState(387);
					recordSection();
					}
					} 
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	public static class RecordSectionContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RecordSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterRecordSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitRecordSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitRecordSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordSectionContext recordSection() throws RecognitionException {
		RecordSectionContext _localctx = new RecordSectionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_recordSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			identifierList();
			setState(394);
			match(COLON);
			setState(395);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariantPartContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PascalParser.CASE, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public List<VariantContext> variant() {
			return getRuleContexts(VariantContext.class);
		}
		public VariantContext variant(int i) {
			return getRuleContext(VariantContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public VariantPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterVariantPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitVariantPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitVariantPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantPartContext variantPart() throws RecognitionException {
		VariantPartContext _localctx = new VariantPartContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variantPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(CASE);
			setState(398);
			tag();
			setState(399);
			match(OF);
			setState(400);
			variant();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(401);
				match(SEMICOLON);
				setState(402);
				variant();
				}
				}
				setState(407);
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
	public static class TagContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(PascalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PascalParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tag);
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(IDENTIFIER);
				setState(409);
				match(COLON);
				setState(410);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
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
	public static class VariantContext extends ParserRuleContext {
		public CaseLabelListContext caseLabelList() {
			return getRuleContext(CaseLabelListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public VariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterVariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitVariant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitVariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantContext variant() throws RecognitionException {
		VariantContext _localctx = new VariantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			caseLabelList();
			setState(415);
			match(COLON);
			setState(416);
			match(LPAREN);
			setState(417);
			fieldList();
			setState(418);
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
	public static class CaseLabelListContext extends ParserRuleContext {
		public List<CaseLabelContext> caseLabel() {
			return getRuleContexts(CaseLabelContext.class);
		}
		public CaseLabelContext caseLabel(int i) {
			return getRuleContext(CaseLabelContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public CaseLabelListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLabelList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterCaseLabelList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitCaseLabelList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitCaseLabelList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseLabelListContext caseLabelList() throws RecognitionException {
		CaseLabelListContext _localctx = new CaseLabelListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_caseLabelList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			caseLabel();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(421);
				match(COMMA);
				setState(422);
				caseLabel();
				}
				}
				setState(427);
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
	public static class CaseLabelContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(PascalParser.DOTDOT, 0); }
		public CaseLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterCaseLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitCaseLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitCaseLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseLabelContext caseLabel() throws RecognitionException {
		CaseLabelContext _localctx = new CaseLabelContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_caseLabel);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				constant();
				setState(430);
				match(DOTDOT);
				setState(431);
				constant();
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
	public static class SetTypeContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PascalParser.SET, 0); }
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public OrdinalTypeContext ordinalType() {
			return getRuleContext(OrdinalTypeContext.class,0);
		}
		public SetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitSetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitSetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(SET);
			setState(436);
			match(OF);
			setState(437);
			ordinalType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileTypeContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(PascalParser.FILE, 0); }
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FileTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterFileType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitFileType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitFileType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileTypeContext fileType() throws RecognitionException {
		FileTypeContext _localctx = new FileTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fileType);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(FILE);
				setState(440);
				match(OF);
				setState(441);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(FILE);
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
	public static class PointerTypeContext extends ParserRuleContext {
		public TerminalNode POINTER_OP() { return getToken(PascalParser.POINTER_OP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(POINTER_OP);
			setState(446);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementPartContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public StatementPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterStatementPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitStatementPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitStatementPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPartContext statementPart() throws RecognitionException {
		StatementPartContext _localctx = new StatementPartContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_statementPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public DeclarationPartContext declarationPart() {
			return getRuleContext(DeclarationPartContext.class,0);
		}
		public StatementPartContext statementPart() {
			return getRuleContext(StatementPartContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			declarationPart();
			setState(451);
			statementPart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_statement);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
			case ELSE:
			case UNTIL:
			case GOTO:
			case SEMICOLON:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				simpleStatement();
				}
				break;
			case BEGIN:
			case IF:
			case WHILE:
			case FOR:
			case REPEAT:
			case CASE:
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				structuredStatement();
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
	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ProcedureCallContext procedureCall() {
			return getRuleContext(ProcedureCallContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_simpleStatement);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				procedureCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				gotoStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				emptyStatement();
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
		public TerminalNode ASSIGN() { return getToken(PascalParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			variable(0);
			setState(464);
			match(ASSIGN);
			setState(465);
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
	public static class VariableContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(PascalParser.LBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(PascalParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public TerminalNode DOT() { return getToken(PascalParser.DOT, 0); }
		public TerminalNode POINTER_OP() { return getToken(PascalParser.POINTER_OP, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		return variable(0);
	}

	private VariableContext variable(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariableContext _localctx = new VariableContext(_ctx, _parentState);
		VariableContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_variable, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(468);
			((VariableContext)_localctx).IDENTIFIER = match(IDENTIFIER);

			        checkIdentifierUsage(((VariableContext)_localctx).IDENTIFIER.getText(), ((VariableContext)_localctx).IDENTIFIER.getLine(), ((VariableContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(488);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new VariableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variable);
						setState(471);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(472);
						match(LBRACKET);
						setState(473);
						expression();
						setState(478);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(474);
							match(COMMA);
							setState(475);
							expression();
							}
							}
							setState(480);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(481);
						match(RBRACKET);
						}
						break;
					case 2:
						{
						_localctx = new VariableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variable);
						setState(483);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(484);
						match(DOT);
						setState(485);
						((VariableContext)_localctx).IDENTIFIER = match(IDENTIFIER);
						}
						break;
					case 3:
						{
						_localctx = new VariableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variable);
						setState(486);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(487);
						match(POINTER_OP);
						}
						break;
					}
					} 
				}
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
	public static class ProcedureCallContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public ProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterProcedureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitProcedureCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitProcedureCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureCallContext procedureCall() throws RecognitionException {
		ProcedureCallContext _localctx = new ProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_procedureCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			((ProcedureCallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(494);
				match(LPAREN);
				setState(495);
				actualParameterList();
				setState(496);
				match(RPAREN);
				}
			}


			        checkIdentifierUsage(((ProcedureCallContext)_localctx).IDENTIFIER.getText(), ((ProcedureCallContext)_localctx).IDENTIFIER.getLine(), ((ProcedureCallContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActualParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ActualParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterActualParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitActualParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitActualParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterListContext actualParameterList() throws RecognitionException {
		ActualParameterListContext _localctx = new ActualParameterListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_actualParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			actualParameter();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(503);
				match(COMMA);
				setState(504);
				actualParameter();
				}
				}
				setState(509);
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
	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitActualParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitActualParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_actualParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
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
	public static class GotoStatementContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode GOTO() { return getToken(PascalParser.GOTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(GOTO);
			setState(513);
			((GotoStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);

			        checkIdentifierUsage(((GotoStatementContext)_localctx).IDENTIFIER.getText(), ((GotoStatementContext)_localctx).IDENTIFIER.getLine(), ((GotoStatementContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructuredStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public RepetitiveStatementContext repetitiveStatement() {
			return getRuleContext(RepetitiveStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterStructuredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitStructuredStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitStructuredStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_structuredStatement);
		try {
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				compoundStatement();
				}
				break;
			case IF:
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				conditionalStatement();
				}
				break;
			case WHILE:
			case FOR:
			case REPEAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				repetitiveStatement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				withStatement();
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
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PascalParser.BEGIN, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(BEGIN);
			setState(525);
			statementList();
			setState(526);
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
	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			statement();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(529);
				match(SEMICOLON);
				setState(530);
				statement();
				}
				}
				setState(535);
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
	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_conditionalStatement);
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				caseStatement();
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
		public TerminalNode IF() { return getToken(PascalParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PascalParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PascalParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(IF);
			setState(541);
			expression();
			setState(542);
			match(THEN);
			setState(543);
			statement();
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(544);
				match(ELSE);
				setState(545);
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
	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PascalParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public List<CaseListElementContext> caseListElement() {
			return getRuleContexts(CaseListElementContext.class);
		}
		public CaseListElementContext caseListElement(int i) {
			return getRuleContext(CaseListElementContext.class,i);
		}
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public TerminalNode ELSE() { return getToken(PascalParser.ELSE, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(CASE);
			setState(549);
			expression();
			setState(550);
			match(OF);
			setState(551);
			caseListElement();
			setState(556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(552);
					match(SEMICOLON);
					setState(553);
					caseListElement();
					}
					} 
				}
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(559);
				match(SEMICOLON);
				setState(560);
				match(ELSE);
				setState(561);
				statementList();
				}
			}

			setState(564);
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
	public static class CaseListElementContext extends ParserRuleContext {
		public CaseLabelListContext caseLabelList() {
			return getRuleContext(CaseLabelListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterCaseListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitCaseListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitCaseListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseListElementContext caseListElement() throws RecognitionException {
		CaseListElementContext _localctx = new CaseListElementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			caseLabelList();
			setState(567);
			match(COLON);
			setState(568);
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
	public static class RepetitiveStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public RepetitiveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetitiveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterRepetitiveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitRepetitiveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitRepetitiveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetitiveStatementContext repetitiveStatement() throws RecognitionException {
		RepetitiveStatementContext _localctx = new RepetitiveStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_repetitiveStatement);
		try {
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				forStatement();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PascalParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(WHILE);
			setState(576);
			expression();
			setState(577);
			match(DO);
			setState(578);
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
	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(PascalParser.REPEAT, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(PascalParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(REPEAT);
			setState(581);
			statementList();
			setState(582);
			match(UNTIL);
			setState(583);
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
	public static class ForStatementContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode FOR() { return getToken(PascalParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PascalParser.ASSIGN, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(FOR);
			setState(586);
			((ForStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(587);
			match(ASSIGN);
			setState(588);
			forList();
			setState(589);
			match(DO);
			setState(590);
			statement();

			        checkIdentifierUsage(((ForStatementContext)_localctx).IDENTIFIER.getText(), ((ForStatementContext)_localctx).IDENTIFIER.getLine(), ((ForStatementContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForListContext extends ParserRuleContext {
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(PascalParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(PascalParser.DOWNTO, 0); }
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitForList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitForList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			initialValue();
			setState(594);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(595);
			finalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitialValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitInitialValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitInitialValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
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
	public static class FinalValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitFinalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitFinalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
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
	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(PascalParser.WITH, 0); }
		public RecordVariableListContext recordVariableList() {
			return getRuleContext(RecordVariableListContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitWithStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitWithStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(WITH);
			setState(602);
			recordVariableList();
			setState(603);
			match(DO);
			setState(604);
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
	public static class RecordVariableListContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public RecordVariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordVariableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterRecordVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitRecordVariableList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitRecordVariableList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordVariableListContext recordVariableList() throws RecognitionException {
		RecordVariableListContext _localctx = new RecordVariableListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_recordVariableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			variable(0);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(607);
				match(COMMA);
				setState(608);
				variable(0);
				}
				}
				setState(613);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			simpleExpression();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17737321579282432L) != 0)) {
				{
				setState(615);
				relationalOperator();
				setState(616);
				simpleExpression();
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
	public static class RelationalOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(PascalParser.EQ, 0); }
		public TerminalNode NE() { return getToken(PascalParser.NE, 0); }
		public TerminalNode LT() { return getToken(PascalParser.LT, 0); }
		public TerminalNode LE() { return getToken(PascalParser.LE, 0); }
		public TerminalNode GT() { return getToken(PascalParser.GT, 0); }
		public TerminalNode GE() { return getToken(PascalParser.GE, 0); }
		public TerminalNode IN() { return getToken(PascalParser.IN, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitRelationalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17737321579282432L) != 0)) ) {
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
	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddingOperatorContext> addingOperator() {
			return getRuleContexts(AddingOperatorContext.class);
		}
		public AddingOperatorContext addingOperator(int i) {
			return getRuleContext(AddingOperatorContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascalParser.MINUS, 0); }
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(622);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(625);
			term();
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53051436040192L) != 0)) {
				{
				{
				setState(626);
				addingOperator();
				setState(627);
				term();
				}
				}
				setState(633);
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
	public static class AddingOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascalParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(PascalParser.OR, 0); }
		public AddingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterAddingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitAddingOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitAddingOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddingOperatorContext addingOperator() throws RecognitionException {
		AddingOperatorContext _localctx = new AddingOperatorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_addingOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 53051436040192L) != 0)) ) {
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MultiplyingOperatorContext> multiplyingOperator() {
			return getRuleContexts(MultiplyingOperatorContext.class);
		}
		public MultiplyingOperatorContext multiplyingOperator(int i) {
			return getRuleContext(MultiplyingOperatorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			factor();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 214542206369792L) != 0)) {
				{
				{
				setState(637);
				multiplyingOperator();
				setState(638);
				factor();
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
	public static class MultiplyingOperatorContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(PascalParser.MULT, 0); }
		public TerminalNode DIVIDE() { return getToken(PascalParser.DIVIDE, 0); }
		public TerminalNode DIV() { return getToken(PascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PascalParser.MOD, 0); }
		public TerminalNode AND() { return getToken(PascalParser.AND, 0); }
		public MultiplyingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterMultiplyingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitMultiplyingOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitMultiplyingOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingOperatorContext multiplyingOperator() throws RecognitionException {
		MultiplyingOperatorContext _localctx = new MultiplyingOperatorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_multiplyingOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 214542206369792L) != 0)) ) {
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
	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PascalParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_factor);
		try {
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				variable(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				unsignedConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(649);
				match(LPAREN);
				setState(650);
				expression();
				setState(651);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(653);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(654);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(655);
				match(NOT);
				setState(656);
				factor();
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			((FunctionCallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(660);
			match(LPAREN);
			setState(661);
			actualParameterList();
			setState(662);
			match(RPAREN);

			        checkIdentifierUsage(((FunctionCallContext)_localctx).IDENTIFIER.getText(), ((FunctionCallContext)_localctx).IDENTIFIER.getLine(), ((FunctionCallContext)_localctx).IDENTIFIER.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(PascalParser.LBRACKET, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(PascalParser.RBRACKET, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_set);
		try {
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				match(LBRACKET);
				setState(666);
				elementList();
				setState(667);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				match(LBRACKET);
				setState(670);
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
	public static class ElementListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_elementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			element();
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(674);
				match(COMMA);
				setState(675);
				element();
				}
				}
				setState(680);
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
	public static class ElementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(PascalParser.DOTDOT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			expression();
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(682);
				match(DOTDOT);
				setState(683);
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
	public static class ConstantContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascalParser.MINUS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_constant);
		try {
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NIL:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case STRING_LITERAL:
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				unsignedConstant();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				match(PLUS);
				setState(688);
				unsignedConstant();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(689);
				match(MINUS);
				setState(690);
				unsignedConstant();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(691);
				((ConstantContext)_localctx).IDENTIFIER = match(IDENTIFIER);

				        checkIdentifierUsage(((ConstantContext)_localctx).IDENTIFIER.getText(), ((ConstantContext)_localctx).IDENTIFIER.getLine(), ((ConstantContext)_localctx).IDENTIFIER.getCharPositionInLine());
				    
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
	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(PascalParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(PascalParser.CHAR_LITERAL, 0); }
		public TerminalNode NIL() { return getToken(PascalParser.NIL, 0); }
		public TerminalNode TRUE() { return getToken(PascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PascalParser.FALSE, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitUnsignedConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitUnsignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_unsignedConstant);
		try {
			setState(701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				unsignedNumber();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				match(STRING_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				match(CHAR_LITERAL);
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(698);
				match(NIL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(699);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(700);
				match(FALSE);
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
	public static class UnsignedNumberContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(PascalParser.INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(PascalParser.REAL_LITERAL, 0); }
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalParserListener ) ((PascalParserListener)listener).exitUnsignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalParserVisitor ) return ((PascalParserVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_unsignedNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_LITERAL || _la==REAL_LITERAL) ) {
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
		case 49:
			return variable_sempred((VariableContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean variable_sempred(VariableContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001H\u02c2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00ba\b\u0002\n\u0002\f\u0002"+
		"\u00bd\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u00c6\b\u0004\n\u0004\f\u0004\u00c9"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00d0\b\u0005\n\u0005\f\u0005\u00d3\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00de\b\u0007\n\u0007\f\u0007\u00e1\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00ec\b\t\n\t\f\t\u00ef\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00f9\b\u000b\n\u000b"+
		"\f\u000b\u00fc\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u010a"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0112\b\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u011c\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u0127\b\u0010\n\u0010\f\u0010\u012a\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u012f\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u013d\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0148\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u014c\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0154\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0164\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u016b\b\u001e\n\u001e\f\u001e\u016e"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u017d\b"+
		"!\u0001!\u0003!\u0180\b!\u0001\"\u0001\"\u0001\"\u0005\"\u0185\b\"\n\""+
		"\f\"\u0188\t\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0005$\u0194\b$\n$\f$\u0197\t$\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u019d\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0005\'\u01a8\b\'\n\'\f\'\u01ab\t\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u01b2\b(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u01bc\b*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0003.\u01c8\b.\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u01ce\b/\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00051\u01dd\b1\n1\f1\u01e0\t1\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00051\u01e9\b1\n1\f1\u01ec\t1\u0001"+
		"2\u00012\u00012\u00012\u00012\u00032\u01f3\b2\u00012\u00012\u00013\u0001"+
		"3\u00013\u00053\u01fa\b3\n3\f3\u01fd\t3\u00014\u00014\u00015\u00015\u0001"+
		"5\u00015\u00016\u00016\u00017\u00017\u00017\u00017\u00037\u020b\b7\u0001"+
		"8\u00018\u00018\u00018\u00019\u00019\u00019\u00059\u0214\b9\n9\f9\u0217"+
		"\t9\u0001:\u0001:\u0003:\u021b\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0003;\u0223\b;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0005<\u022b"+
		"\b<\n<\f<\u022e\t<\u0001<\u0001<\u0001<\u0003<\u0233\b<\u0001<\u0001<"+
		"\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0003>\u023e\b>\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001"+
		"B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001F\u0001F\u0001F\u0005F\u0262\bF\nF\fF\u0265\tF\u0001G\u0001G\u0001"+
		"G\u0001G\u0003G\u026b\bG\u0001H\u0001H\u0001I\u0003I\u0270\bI\u0001I\u0001"+
		"I\u0001I\u0001I\u0005I\u0276\bI\nI\fI\u0279\tI\u0001J\u0001J\u0001K\u0001"+
		"K\u0001K\u0001K\u0005K\u0281\bK\nK\fK\u0284\tK\u0001L\u0001L\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003M\u0292"+
		"\bM\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0003O\u02a0\bO\u0001P\u0001P\u0001P\u0005P\u02a5\bP\n"+
		"P\fP\u02a8\tP\u0001Q\u0001Q\u0001Q\u0003Q\u02ad\bQ\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0001R\u0001R\u0003R\u02b6\bR\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0003S\u02be\bS\u0001T\u0001T\u0001T\u0000\u0001bU\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u0000\u0006\u0001\u0000\u000f\u0010"+
		"\u0002\u0000**05\u0001\u0000,-\u0002\u0000&&,-\u0003\u0000%%()./\u0001"+
		"\u0000@A\u02b9\u0000\u00aa\u0001\u0000\u0000\u0000\u0002\u00b1\u0001\u0000"+
		"\u0000\u0000\u0004\u00bb\u0001\u0000\u0000\u0000\u0006\u00be\u0001\u0000"+
		"\u0000\u0000\b\u00c2\u0001\u0000\u0000\u0000\n\u00cc\u0001\u0000\u0000"+
		"\u0000\f\u00d4\u0001\u0000\u0000\u0000\u000e\u00da\u0001\u0000\u0000\u0000"+
		"\u0010\u00e2\u0001\u0000\u0000\u0000\u0012\u00e8\u0001\u0000\u0000\u0000"+
		"\u0014\u00f0\u0001\u0000\u0000\u0000\u0016\u00f5\u0001\u0000\u0000\u0000"+
		"\u0018\u0109\u0001\u0000\u0000\u0000\u001a\u010b\u0001\u0000\u0000\u0000"+
		"\u001c\u0115\u0001\u0000\u0000\u0000\u001e\u0121\u0001\u0000\u0000\u0000"+
		" \u0123\u0001\u0000\u0000\u0000\"\u012e\u0001\u0000\u0000\u0000$\u0130"+
		"\u0001\u0000\u0000\u0000&\u013c\u0001\u0000\u0000\u0000(\u013e\u0001\u0000"+
		"\u0000\u0000*\u0140\u0001\u0000\u0000\u0000,\u0142\u0001\u0000\u0000\u0000"+
		".\u0147\u0001\u0000\u0000\u00000\u014b\u0001\u0000\u0000\u00002\u0153"+
		"\u0001\u0000\u0000\u00004\u0155\u0001\u0000\u0000\u00006\u0159\u0001\u0000"+
		"\u0000\u00008\u015d\u0001\u0000\u0000\u0000:\u0163\u0001\u0000\u0000\u0000"+
		"<\u0165\u0001\u0000\u0000\u0000>\u0173\u0001\u0000\u0000\u0000@\u0175"+
		"\u0001\u0000\u0000\u0000B\u017f\u0001\u0000\u0000\u0000D\u0181\u0001\u0000"+
		"\u0000\u0000F\u0189\u0001\u0000\u0000\u0000H\u018d\u0001\u0000\u0000\u0000"+
		"J\u019c\u0001\u0000\u0000\u0000L\u019e\u0001\u0000\u0000\u0000N\u01a4"+
		"\u0001\u0000\u0000\u0000P\u01b1\u0001\u0000\u0000\u0000R\u01b3\u0001\u0000"+
		"\u0000\u0000T\u01bb\u0001\u0000\u0000\u0000V\u01bd\u0001\u0000\u0000\u0000"+
		"X\u01c0\u0001\u0000\u0000\u0000Z\u01c2\u0001\u0000\u0000\u0000\\\u01c7"+
		"\u0001\u0000\u0000\u0000^\u01cd\u0001\u0000\u0000\u0000`\u01cf\u0001\u0000"+
		"\u0000\u0000b\u01d3\u0001\u0000\u0000\u0000d\u01ed\u0001\u0000\u0000\u0000"+
		"f\u01f6\u0001\u0000\u0000\u0000h\u01fe\u0001\u0000\u0000\u0000j\u0200"+
		"\u0001\u0000\u0000\u0000l\u0204\u0001\u0000\u0000\u0000n\u020a\u0001\u0000"+
		"\u0000\u0000p\u020c\u0001\u0000\u0000\u0000r\u0210\u0001\u0000\u0000\u0000"+
		"t\u021a\u0001\u0000\u0000\u0000v\u021c\u0001\u0000\u0000\u0000x\u0224"+
		"\u0001\u0000\u0000\u0000z\u0236\u0001\u0000\u0000\u0000|\u023d\u0001\u0000"+
		"\u0000\u0000~\u023f\u0001\u0000\u0000\u0000\u0080\u0244\u0001\u0000\u0000"+
		"\u0000\u0082\u0249\u0001\u0000\u0000\u0000\u0084\u0251\u0001\u0000\u0000"+
		"\u0000\u0086\u0255\u0001\u0000\u0000\u0000\u0088\u0257\u0001\u0000\u0000"+
		"\u0000\u008a\u0259\u0001\u0000\u0000\u0000\u008c\u025e\u0001\u0000\u0000"+
		"\u0000\u008e\u0266\u0001\u0000\u0000\u0000\u0090\u026c\u0001\u0000\u0000"+
		"\u0000\u0092\u026f\u0001\u0000\u0000\u0000\u0094\u027a\u0001\u0000\u0000"+
		"\u0000\u0096\u027c\u0001\u0000\u0000\u0000\u0098\u0285\u0001\u0000\u0000"+
		"\u0000\u009a\u0291\u0001\u0000\u0000\u0000\u009c\u0293\u0001\u0000\u0000"+
		"\u0000\u009e\u029f\u0001\u0000\u0000\u0000\u00a0\u02a1\u0001\u0000\u0000"+
		"\u0000\u00a2\u02a9\u0001\u0000\u0000\u0000\u00a4\u02b5\u0001\u0000\u0000"+
		"\u0000\u00a6\u02bd\u0001\u0000\u0000\u0000\u00a8\u02bf\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005\u0001\u0000\u0000\u00ab\u00ac\u0005D\u0000\u0000"+
		"\u00ac\u00ad\u00056\u0000\u0000\u00ad\u00ae\u0003\u0002\u0001\u0000\u00ae"+
		"\u00af\u00058\u0000\u0000\u00af\u00b0\u0006\u0000\uffff\uffff\u0000\u00b0"+
		"\u0001\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003\u0004\u0002\u0000\u00b2"+
		"\u00b3\u0003X,\u0000\u00b3\u0003\u0001\u0000\u0000\u0000\u00b4\u00ba\u0003"+
		"\u0006\u0003\u0000\u00b5\u00ba\u0003\n\u0005\u0000\u00b6\u00ba\u0003\u000e"+
		"\u0007\u0000\u00b7\u00ba\u0003\u0012\t\u0000\u00b8\u00ba\u0003\u0018\f"+
		"\u0000\u00b9\u00b4\u0001\u0000\u0000\u0000\u00b9\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u0005\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005\u0017\u0000\u0000\u00bf\u00c0\u0003\b\u0004\u0000"+
		"\u00c0\u00c1\u00056\u0000\u0000\u00c1\u0007\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c7\u0005D\u0000\u0000\u00c3\u00c4\u00057\u0000\u0000\u00c4\u00c6\u0005"+
		"D\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0006\u0004\uffff\uffff\u0000\u00cb\t\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0005\u0003\u0000\u0000\u00cd\u00d1\u0003\f\u0006"+
		"\u0000\u00ce\u00d0\u0003\f\u0006\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u000b\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005D\u0000\u0000\u00d5"+
		"\u00d6\u00050\u0000\u0000\u00d6\u00d7\u0003\u00a4R\u0000\u00d7\u00d8\u0005"+
		"6\u0000\u0000\u00d8\u00d9\u0006\u0006\uffff\uffff\u0000\u00d9\r\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0005\u0004\u0000\u0000\u00db\u00df\u0003"+
		"\u0010\b\u0000\u00dc\u00de\u0003\u0010\b\u0000\u00dd\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u000f\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005D\u0000"+
		"\u0000\u00e3\u00e4\u00050\u0000\u0000\u00e4\u00e5\u0003.\u0017\u0000\u00e5"+
		"\u00e6\u00056\u0000\u0000\u00e6\u00e7\u0006\b\uffff\uffff\u0000\u00e7"+
		"\u0011\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0002\u0000\u0000\u00e9"+
		"\u00ed\u0003\u0014\n\u0000\u00ea\u00ec\u0003\u0014\n\u0000\u00eb\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u0013"+
		"\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0003\u0016\u000b\u0000\u00f1\u00f2\u0005:\u0000\u0000\u00f2\u00f3\u0003"+
		".\u0017\u0000\u00f3\u00f4\u00056\u0000\u0000\u00f4\u0015\u0001\u0000\u0000"+
		"\u0000\u00f5\u00fa\u0005D\u0000\u0000\u00f6\u00f7\u00057\u0000\u0000\u00f7"+
		"\u00f9\u0005D\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0006\u000b\uffff\uffff\u0000\u00fe"+
		"\u0017\u0001\u0000\u0000\u0000\u00ff\u0100\u0003\u001a\r\u0000\u0100\u0101"+
		"\u00056\u0000\u0000\u0101\u0102\u0003*\u0015\u0000\u0102\u0103\u00056"+
		"\u0000\u0000\u0103\u010a\u0001\u0000\u0000\u0000\u0104\u0105\u0003\u001c"+
		"\u000e\u0000\u0105\u0106\u00056\u0000\u0000\u0106\u0107\u0003,\u0016\u0000"+
		"\u0107\u0108\u00056\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109"+
		"\u00ff\u0001\u0000\u0000\u0000\u0109\u0104\u0001\u0000\u0000\u0000\u010a"+
		"\u0019\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0005\u0000\u0000\u010c"+
		"\u0111\u0005D\u0000\u0000\u010d\u010e\u0005;\u0000\u0000\u010e\u010f\u0003"+
		" \u0010\u0000\u010f\u0110\u0005<\u0000\u0000\u0110\u0112\u0001\u0000\u0000"+
		"\u0000\u0111\u010d\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0006\r\uffff\uffff"+
		"\u0000\u0114\u001b\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u0006\u0000"+
		"\u0000\u0116\u011b\u0005D\u0000\u0000\u0117\u0118\u0005;\u0000\u0000\u0118"+
		"\u0119\u0003 \u0010\u0000\u0119\u011a\u0005<\u0000\u0000\u011a\u011c\u0001"+
		"\u0000\u0000\u0000\u011b\u0117\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		":\u0000\u0000\u011e\u011f\u0003\u001e\u000f\u0000\u011f\u0120\u0006\u000e"+
		"\uffff\uffff\u0000\u0120\u001d\u0001\u0000\u0000\u0000\u0121\u0122\u0005"+
		"D\u0000\u0000\u0122\u001f\u0001\u0000\u0000\u0000\u0123\u0128\u0003\""+
		"\u0011\u0000\u0124\u0125\u00056\u0000\u0000\u0125\u0127\u0003\"\u0011"+
		"\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000"+
		"\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000"+
		"\u0000\u0129!\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000"+
		"\u012b\u012f\u0003$\u0012\u0000\u012c\u012d\u0005\u0002\u0000\u0000\u012d"+
		"\u012f\u0003$\u0012\u0000\u012e\u012b\u0001\u0000\u0000\u0000\u012e\u012c"+
		"\u0001\u0000\u0000\u0000\u012f#\u0001\u0000\u0000\u0000\u0130\u0131\u0003"+
		"\u0016\u000b\u0000\u0131\u0132\u0005:\u0000\u0000\u0132\u0133\u0003&\u0013"+
		"\u0000\u0133%\u0001\u0000\u0000\u0000\u0134\u013d\u0005D\u0000\u0000\u0135"+
		"\u0136\u0005\u001d\u0000\u0000\u0136\u0137\u0005=\u0000\u0000\u0137\u0138"+
		"\u0003(\u0014\u0000\u0138\u0139\u0005>\u0000\u0000\u0139\u013a\u0005\u0014"+
		"\u0000\u0000\u013a\u013b\u0005D\u0000\u0000\u013b\u013d\u0001\u0000\u0000"+
		"\u0000\u013c\u0134\u0001\u0000\u0000\u0000\u013c\u0135\u0001\u0000\u0000"+
		"\u0000\u013d\'\u0001\u0000\u0000\u0000\u013e\u013f\u00032\u0019\u0000"+
		"\u013f)\u0001\u0000\u0000\u0000\u0140\u0141\u0003Z-\u0000\u0141+\u0001"+
		"\u0000\u0000\u0000\u0142\u0143\u0003Z-\u0000\u0143-\u0001\u0000\u0000"+
		"\u0000\u0144\u0148\u00030\u0018\u0000\u0145\u0148\u0003:\u001d\u0000\u0146"+
		"\u0148\u0003V+\u0000\u0147\u0144\u0001\u0000\u0000\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148/\u0001\u0000"+
		"\u0000\u0000\u0149\u014c\u00032\u0019\u0000\u014a\u014c\u00038\u001c\u0000"+
		"\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000"+
		"\u014c1\u0001\u0000\u0000\u0000\u014d\u0154\u0005\u0018\u0000\u0000\u014e"+
		"\u0154\u0005\u001a\u0000\u0000\u014f\u0154\u0005\u001b\u0000\u0000\u0150"+
		"\u0154\u00034\u001a\u0000\u0151\u0154\u00036\u001b\u0000\u0152\u0154\u0005"+
		"D\u0000\u0000\u0153\u014d\u0001\u0000\u0000\u0000\u0153\u014e\u0001\u0000"+
		"\u0000\u0000\u0153\u014f\u0001\u0000\u0000\u0000\u0153\u0150\u0001\u0000"+
		"\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0152\u0001\u0000"+
		"\u0000\u0000\u01543\u0001\u0000\u0000\u0000\u0155\u0156\u0005;\u0000\u0000"+
		"\u0156\u0157\u0003\u0016\u000b\u0000\u0157\u0158\u0005<\u0000\u0000\u0158"+
		"5\u0001\u0000\u0000\u0000\u0159\u015a\u0003\u00a4R\u0000\u015a\u015b\u0005"+
		"9\u0000\u0000\u015b\u015c\u0003\u00a4R\u0000\u015c7\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0005\u0019\u0000\u0000\u015e9\u0001\u0000\u0000\u0000"+
		"\u015f\u0164\u0003<\u001e\u0000\u0160\u0164\u0003@ \u0000\u0161\u0164"+
		"\u0003R)\u0000\u0162\u0164\u0003T*\u0000\u0163\u015f\u0001\u0000\u0000"+
		"\u0000\u0163\u0160\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000"+
		"\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164;\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0005\u001d\u0000\u0000\u0166\u0167\u0005=\u0000\u0000\u0167"+
		"\u016c\u0003(\u0014\u0000\u0168\u0169\u00057\u0000\u0000\u0169\u016b\u0003"+
		"(\u0014\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000"+
		"\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0005>\u0000\u0000\u0170\u0171\u0005\u0014\u0000"+
		"\u0000\u0171\u0172\u0003>\u001f\u0000\u0172=\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0003.\u0017\u0000\u0174?\u0001\u0000\u0000\u0000\u0175\u0176\u0005"+
		"\u001e\u0000\u0000\u0176\u0177\u0003B!\u0000\u0177\u0178\u0005\b\u0000"+
		"\u0000\u0178A\u0001\u0000\u0000\u0000\u0179\u017c\u0003D\"\u0000\u017a"+
		"\u017b\u00056\u0000\u0000\u017b\u017d\u0003H$\u0000\u017c\u017a\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u0180\u0001"+
		"\u0000\u0000\u0000\u017e\u0180\u0003H$\u0000\u017f\u0179\u0001\u0000\u0000"+
		"\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u0180C\u0001\u0000\u0000\u0000"+
		"\u0181\u0186\u0003F#\u0000\u0182\u0183\u00056\u0000\u0000\u0183\u0185"+
		"\u0003F#\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0188\u0001\u0000"+
		"\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000"+
		"\u0000\u0000\u0187E\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0003\u0016\u000b\u0000\u018a\u018b\u0005:\u0000\u0000"+
		"\u018b\u018c\u0003.\u0017\u0000\u018cG\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0005\u0013\u0000\u0000\u018e\u018f\u0003J%\u0000\u018f\u0190\u0005\u0014"+
		"\u0000\u0000\u0190\u0195\u0003L&\u0000\u0191\u0192\u00056\u0000\u0000"+
		"\u0192\u0194\u0003L&\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0197"+
		"\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0001\u0000\u0000\u0000\u0196I\u0001\u0000\u0000\u0000\u0197\u0195\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0005D\u0000\u0000\u0199\u019a\u0005:\u0000"+
		"\u0000\u019a\u019d\u0005D\u0000\u0000\u019b\u019d\u0005D\u0000\u0000\u019c"+
		"\u0198\u0001\u0000\u0000\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d"+
		"K\u0001\u0000\u0000\u0000\u019e\u019f\u0003N\'\u0000\u019f\u01a0\u0005"+
		":\u0000\u0000\u01a0\u01a1\u0005;\u0000\u0000\u01a1\u01a2\u0003B!\u0000"+
		"\u01a2\u01a3\u0005<\u0000\u0000\u01a3M\u0001\u0000\u0000\u0000\u01a4\u01a9"+
		"\u0003P(\u0000\u01a5\u01a6\u00057\u0000\u0000\u01a6\u01a8\u0003P(\u0000"+
		"\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000"+
		"\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000"+
		"\u01aaO\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac"+
		"\u01b2\u0003\u00a4R\u0000\u01ad\u01ae\u0003\u00a4R\u0000\u01ae\u01af\u0005"+
		"9\u0000\u0000\u01af\u01b0\u0003\u00a4R\u0000\u01b0\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b1\u01ac\u0001\u0000\u0000\u0000\u01b1\u01ad\u0001\u0000\u0000"+
		"\u0000\u01b2Q\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005\u001f\u0000\u0000"+
		"\u01b4\u01b5\u0005\u0014\u0000\u0000\u01b5\u01b6\u00032\u0019\u0000\u01b6"+
		"S\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005 \u0000\u0000\u01b8\u01b9\u0005"+
		"\u0014\u0000\u0000\u01b9\u01bc\u0003.\u0017\u0000\u01ba\u01bc\u0005 \u0000"+
		"\u0000\u01bb\u01b7\u0001\u0000\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bcU\u0001\u0000\u0000\u0000\u01bd\u01be\u0005?\u0000\u0000\u01be"+
		"\u01bf\u0005D\u0000\u0000\u01bfW\u0001\u0000\u0000\u0000\u01c0\u01c1\u0003"+
		"p8\u0000\u01c1Y\u0001\u0000\u0000\u0000\u01c2\u01c3\u0003\u0004\u0002"+
		"\u0000\u01c3\u01c4\u0003X,\u0000\u01c4[\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c8\u0003^/\u0000\u01c6\u01c8\u0003n7\u0000\u01c7\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8]\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ce\u0003`0\u0000\u01ca\u01ce\u0003d2\u0000\u01cb\u01ce"+
		"\u0003j5\u0000\u01cc\u01ce\u0003l6\u0000\u01cd\u01c9\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ca\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce_\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d0\u0003b1\u0000\u01d0\u01d1\u0005+\u0000\u0000\u01d1\u01d2"+
		"\u0003\u008eG\u0000\u01d2a\u0001\u0000\u0000\u0000\u01d3\u01d4\u00061"+
		"\uffff\uffff\u0000\u01d4\u01d5\u0005D\u0000\u0000\u01d5\u01d6\u00061\uffff"+
		"\uffff\u0000\u01d6\u01ea\u0001\u0000\u0000\u0000\u01d7\u01d8\n\u0003\u0000"+
		"\u0000\u01d8\u01d9\u0005=\u0000\u0000\u01d9\u01de\u0003\u008eG\u0000\u01da"+
		"\u01db\u00057\u0000\u0000\u01db\u01dd\u0003\u008eG\u0000\u01dc\u01da\u0001"+
		"\u0000\u0000\u0000\u01dd\u01e0\u0001\u0000\u0000\u0000\u01de\u01dc\u0001"+
		"\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005"+
		">\u0000\u0000\u01e2\u01e9\u0001\u0000\u0000\u0000\u01e3\u01e4\n\u0002"+
		"\u0000\u0000\u01e4\u01e5\u00058\u0000\u0000\u01e5\u01e9\u0005D\u0000\u0000"+
		"\u01e6\u01e7\n\u0001\u0000\u0000\u01e7\u01e9\u0005?\u0000\u0000\u01e8"+
		"\u01d7\u0001\u0000\u0000\u0000\u01e8\u01e3\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001\u0000\u0000\u0000\u01ea"+
		"\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb"+
		"c\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed\u01f2"+
		"\u0005D\u0000\u0000\u01ee\u01ef\u0005;\u0000\u0000\u01ef\u01f0\u0003f"+
		"3\u0000\u01f0\u01f1\u0005<\u0000\u0000\u01f1\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f2\u01ee\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u00062\uffff\uffff\u0000"+
		"\u01f5e\u0001\u0000\u0000\u0000\u01f6\u01fb\u0003h4\u0000\u01f7\u01f8"+
		"\u00057\u0000\u0000\u01f8\u01fa\u0003h4\u0000\u01f9\u01f7\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fcg\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u01ff\u0003\u008eG\u0000"+
		"\u01ffi\u0001\u0000\u0000\u0000\u0200\u0201\u0005\u0016\u0000\u0000\u0201"+
		"\u0202\u0005D\u0000\u0000\u0202\u0203\u00065\uffff\uffff\u0000\u0203k"+
		"\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205m\u0001"+
		"\u0000\u0000\u0000\u0206\u020b\u0003p8\u0000\u0207\u020b\u0003t:\u0000"+
		"\u0208\u020b\u0003|>\u0000\u0209\u020b\u0003\u008aE\u0000\u020a\u0206"+
		"\u0001\u0000\u0000\u0000\u020a\u0207\u0001\u0000\u0000\u0000\u020a\u0208"+
		"\u0001\u0000\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020bo\u0001"+
		"\u0000\u0000\u0000\u020c\u020d\u0005\u0007\u0000\u0000\u020d\u020e\u0003"+
		"r9\u0000\u020e\u020f\u0005\b\u0000\u0000\u020fq\u0001\u0000\u0000\u0000"+
		"\u0210\u0215\u0003\\.\u0000\u0211\u0212\u00056\u0000\u0000\u0212\u0214"+
		"\u0003\\.\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0214\u0217\u0001"+
		"\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0215\u0216\u0001"+
		"\u0000\u0000\u0000\u0216s\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000"+
		"\u0000\u0000\u0218\u021b\u0003v;\u0000\u0219\u021b\u0003x<\u0000\u021a"+
		"\u0218\u0001\u0000\u0000\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021b"+
		"u\u0001\u0000\u0000\u0000\u021c\u021d\u0005\t\u0000\u0000\u021d\u021e"+
		"\u0003\u008eG\u0000\u021e\u021f\u0005\n\u0000\u0000\u021f\u0222\u0003"+
		"\\.\u0000\u0220\u0221\u0005\u000b\u0000\u0000\u0221\u0223\u0003\\.\u0000"+
		"\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000"+
		"\u0223w\u0001\u0000\u0000\u0000\u0224\u0225\u0005\u0013\u0000\u0000\u0225"+
		"\u0226\u0003\u008eG\u0000\u0226\u0227\u0005\u0014\u0000\u0000\u0227\u022c"+
		"\u0003z=\u0000\u0228\u0229\u00056\u0000\u0000\u0229\u022b\u0003z=\u0000"+
		"\u022a\u0228\u0001\u0000\u0000\u0000\u022b\u022e\u0001\u0000\u0000\u0000"+
		"\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000"+
		"\u022d\u0232\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000"+
		"\u022f\u0230\u00056\u0000\u0000\u0230\u0231\u0005\u000b\u0000\u0000\u0231"+
		"\u0233\u0003r9\u0000\u0232\u022f\u0001\u0000\u0000\u0000\u0232\u0233\u0001"+
		"\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0235\u0005"+
		"\b\u0000\u0000\u0235y\u0001\u0000\u0000\u0000\u0236\u0237\u0003N\'\u0000"+
		"\u0237\u0238\u0005:\u0000\u0000\u0238\u0239\u0003\\.\u0000\u0239{\u0001"+
		"\u0000\u0000\u0000\u023a\u023e\u0003~?\u0000\u023b\u023e\u0003\u0080@"+
		"\u0000\u023c\u023e\u0003\u0082A\u0000\u023d\u023a\u0001\u0000\u0000\u0000"+
		"\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023c\u0001\u0000\u0000\u0000"+
		"\u023e}\u0001\u0000\u0000\u0000\u023f\u0240\u0005\f\u0000\u0000\u0240"+
		"\u0241\u0003\u008eG\u0000\u0241\u0242\u0005\r\u0000\u0000\u0242\u0243"+
		"\u0003\\.\u0000\u0243\u007f\u0001\u0000\u0000\u0000\u0244\u0245\u0005"+
		"\u0011\u0000\u0000\u0245\u0246\u0003r9\u0000\u0246\u0247\u0005\u0012\u0000"+
		"\u0000\u0247\u0248\u0003\u008eG\u0000\u0248\u0081\u0001\u0000\u0000\u0000"+
		"\u0249\u024a\u0005\u000e\u0000\u0000\u024a\u024b\u0005D\u0000\u0000\u024b"+
		"\u024c\u0005+\u0000\u0000\u024c\u024d\u0003\u0084B\u0000\u024d\u024e\u0005"+
		"\r\u0000\u0000\u024e\u024f\u0003\\.\u0000\u024f\u0250\u0006A\uffff\uffff"+
		"\u0000\u0250\u0083\u0001\u0000\u0000\u0000\u0251\u0252\u0003\u0086C\u0000"+
		"\u0252\u0253\u0007\u0000\u0000\u0000\u0253\u0254\u0003\u0088D\u0000\u0254"+
		"\u0085\u0001\u0000\u0000\u0000\u0255\u0256\u0003\u008eG\u0000\u0256\u0087"+
		"\u0001\u0000\u0000\u0000\u0257\u0258\u0003\u008eG\u0000\u0258\u0089\u0001"+
		"\u0000\u0000\u0000\u0259\u025a\u0005\u0015\u0000\u0000\u025a\u025b\u0003"+
		"\u008cF\u0000\u025b\u025c\u0005\r\u0000\u0000\u025c\u025d\u0003\\.\u0000"+
		"\u025d\u008b\u0001\u0000\u0000\u0000\u025e\u0263\u0003b1\u0000\u025f\u0260"+
		"\u00057\u0000\u0000\u0260\u0262\u0003b1\u0000\u0261\u025f\u0001\u0000"+
		"\u0000\u0000\u0262\u0265\u0001\u0000\u0000\u0000\u0263\u0261\u0001\u0000"+
		"\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264\u008d\u0001\u0000"+
		"\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0266\u026a\u0003\u0092"+
		"I\u0000\u0267\u0268\u0003\u0090H\u0000\u0268\u0269\u0003\u0092I\u0000"+
		"\u0269\u026b\u0001\u0000\u0000\u0000\u026a\u0267\u0001\u0000\u0000\u0000"+
		"\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u008f\u0001\u0000\u0000\u0000"+
		"\u026c\u026d\u0007\u0001\u0000\u0000\u026d\u0091\u0001\u0000\u0000\u0000"+
		"\u026e\u0270\u0007\u0002\u0000\u0000\u026f\u026e\u0001\u0000\u0000\u0000"+
		"\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000"+
		"\u0271\u0277\u0003\u0096K\u0000\u0272\u0273\u0003\u0094J\u0000\u0273\u0274"+
		"\u0003\u0096K\u0000\u0274\u0276\u0001\u0000\u0000\u0000\u0275\u0272\u0001"+
		"\u0000\u0000\u0000\u0276\u0279\u0001\u0000\u0000\u0000\u0277\u0275\u0001"+
		"\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0093\u0001"+
		"\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u027a\u027b\u0007"+
		"\u0003\u0000\u0000\u027b\u0095\u0001\u0000\u0000\u0000\u027c\u0282\u0003"+
		"\u009aM\u0000\u027d\u027e\u0003\u0098L\u0000\u027e\u027f\u0003\u009aM"+
		"\u0000\u027f\u0281\u0001\u0000\u0000\u0000\u0280\u027d\u0001\u0000\u0000"+
		"\u0000\u0281\u0284\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000"+
		"\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0097\u0001\u0000\u0000"+
		"\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0285\u0286\u0007\u0004\u0000"+
		"\u0000\u0286\u0099\u0001\u0000\u0000\u0000\u0287\u0292\u0003b1\u0000\u0288"+
		"\u0292\u0003\u00a6S\u0000\u0289\u028a\u0005;\u0000\u0000\u028a\u028b\u0003"+
		"\u008eG\u0000\u028b\u028c\u0005<\u0000\u0000\u028c\u0292\u0001\u0000\u0000"+
		"\u0000\u028d\u0292\u0003\u009cN\u0000\u028e\u0292\u0003\u009eO\u0000\u028f"+
		"\u0290\u0005\'\u0000\u0000\u0290\u0292\u0003\u009aM\u0000\u0291\u0287"+
		"\u0001\u0000\u0000\u0000\u0291\u0288\u0001\u0000\u0000\u0000\u0291\u0289"+
		"\u0001\u0000\u0000\u0000\u0291\u028d\u0001\u0000\u0000\u0000\u0291\u028e"+
		"\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u009b"+
		"\u0001\u0000\u0000\u0000\u0293\u0294\u0005D\u0000\u0000\u0294\u0295\u0005"+
		";\u0000\u0000\u0295\u0296\u0003f3\u0000\u0296\u0297\u0005<\u0000\u0000"+
		"\u0297\u0298\u0006N\uffff\uffff\u0000\u0298\u009d\u0001\u0000\u0000\u0000"+
		"\u0299\u029a\u0005=\u0000\u0000\u029a\u029b\u0003\u00a0P\u0000\u029b\u029c"+
		"\u0005>\u0000\u0000\u029c\u02a0\u0001\u0000\u0000\u0000\u029d\u029e\u0005"+
		"=\u0000\u0000\u029e\u02a0\u0005>\u0000\u0000\u029f\u0299\u0001\u0000\u0000"+
		"\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u02a0\u009f\u0001\u0000\u0000"+
		"\u0000\u02a1\u02a6\u0003\u00a2Q\u0000\u02a2\u02a3\u00057\u0000\u0000\u02a3"+
		"\u02a5\u0003\u00a2Q\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a5\u02a8"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a7"+
		"\u0001\u0000\u0000\u0000\u02a7\u00a1\u0001\u0000\u0000\u0000\u02a8\u02a6"+
		"\u0001\u0000\u0000\u0000\u02a9\u02ac\u0003\u008eG\u0000\u02aa\u02ab\u0005"+
		"9\u0000\u0000\u02ab\u02ad\u0003\u008eG\u0000\u02ac\u02aa\u0001\u0000\u0000"+
		"\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u00a3\u0001\u0000\u0000"+
		"\u0000\u02ae\u02b6\u0003\u00a6S\u0000\u02af\u02b0\u0005,\u0000\u0000\u02b0"+
		"\u02b6\u0003\u00a6S\u0000\u02b1\u02b2\u0005-\u0000\u0000\u02b2\u02b6\u0003"+
		"\u00a6S\u0000\u02b3\u02b4\u0005D\u0000\u0000\u02b4\u02b6\u0006R\uffff"+
		"\uffff\u0000\u02b5\u02ae\u0001\u0000\u0000\u0000\u02b5\u02af\u0001\u0000"+
		"\u0000\u0000\u02b5\u02b1\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000"+
		"\u0000\u0000\u02b6\u00a5\u0001\u0000\u0000\u0000\u02b7\u02be\u0003\u00a8"+
		"T\u0000\u02b8\u02be\u0005B\u0000\u0000\u02b9\u02be\u0005C\u0000\u0000"+
		"\u02ba\u02be\u0005$\u0000\u0000\u02bb\u02be\u0005\"\u0000\u0000\u02bc"+
		"\u02be\u0005#\u0000\u0000\u02bd\u02b7\u0001\u0000\u0000\u0000\u02bd\u02b8"+
		"\u0001\u0000\u0000\u0000\u02bd\u02b9\u0001\u0000\u0000\u0000\u02bd\u02ba"+
		"\u0001\u0000\u0000\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000\u02bd\u02bc"+
		"\u0001\u0000\u0000\u0000\u02be\u00a7\u0001\u0000\u0000\u0000\u02bf\u02c0"+
		"\u0007\u0005\u0000\u0000\u02c0\u00a9\u0001\u0000\u0000\u00003\u00b9\u00bb"+
		"\u00c7\u00d1\u00df\u00ed\u00fa\u0109\u0111\u011b\u0128\u012e\u013c\u0147"+
		"\u014b\u0153\u0163\u016c\u017c\u017f\u0186\u0195\u019c\u01a9\u01b1\u01bb"+
		"\u01c7\u01cd\u01de\u01e8\u01ea\u01f2\u01fb\u020a\u0215\u021a\u0222\u022c"+
		"\u0232\u023d\u0263\u026a\u026f\u0277\u0282\u0291\u029f\u02a6\u02ac\u02b5"+
		"\u02bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}