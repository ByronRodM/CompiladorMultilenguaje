// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/html/HTMLParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.html;

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
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOCTYPE=1, OPEN_TAG=2, CLOSE_TAG=3, SELF_CLOSE_TAG=4, ATTRIBUTE=5, TEXT_CONTENT=6, 
		HTML_ENTITY=7, HTML_COMMENT=8, CDATA=9, SCRIPT_CONTENT=10, STYLE_CONTENT=11, 
		GT=12, LT=13, AMP=14, WS=15;
	public static final int
		RULE_document = 0, RULE_htmlElement = 1, RULE_htmlContent = 2, RULE_element = 3, 
		RULE_normalElement = 4, RULE_selfClosingElement = 5, RULE_content = 6, 
		RULE_textContent = 7, RULE_htmlEntity = 8, RULE_cdata = 9, RULE_attribute = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "htmlElement", "htmlContent", "element", "normalElement", 
			"selfClosingElement", "content", "textContent", "htmlEntity", "cdata", 
			"attribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'>'", "'<'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCTYPE", "OPEN_TAG", "CLOSE_TAG", "SELF_CLOSE_TAG", "ATTRIBUTE", 
			"TEXT_CONTENT", "HTML_ENTITY", "HTML_COMMENT", "CDATA", "SCRIPT_CONTENT", 
			"STYLE_CONTENT", "GT", "LT", "AMP", "WS"
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
	public String getGrammarFileName() { return "HTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private SymbolTable symbolTable = new SymbolTable();
	    private ErrorTable errorTable = new ErrorTable();
	    private Stack<String> tagStack = new Stack<>();
	    
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
	    
	    private void pushTag(String tagName, int line, int column) {
	        tagStack.push(tagName);
	        addSymbol(tagName, "html_tag", line, column);
	    }
	    
	    private void popTag(String tagName, int line, int column) {
	        if (tagStack.isEmpty()) {
	            addError("Closing tag without opening tag: " + tagName, line, column, "SEMANTIC");
	        } else {
	            String openTag = tagStack.pop();
	            if (!openTag.equals(tagName)) {
	                addError("Mismatched tag: expected " + openTag + " but found " + tagName, line, column, "SEMANTIC");
	            }
	        }
	    }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HTMLParser.EOF, 0); }
		public TerminalNode DOCTYPE() { return getToken(HTMLParser.DOCTYPE, 0); }
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOCTYPE) {
				{
				setState(22);
				match(DOCTYPE);
				}
			}

			setState(25);
			htmlElement();
			setState(26);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public Token OPEN_TAG;
		public Token CLOSE_TAG;
		public TerminalNode OPEN_TAG() { return getToken(HTMLParser.OPEN_TAG, 0); }
		public TerminalNode GT() { return getToken(HTMLParser.GT, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(HTMLParser.CLOSE_TAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((HtmlElementContext)_localctx).OPEN_TAG = match(OPEN_TAG);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTRIBUTE) {
				{
				{
				setState(29);
				attribute();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(GT);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 724L) != 0)) {
				{
				{
				setState(36);
				htmlContent();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			((HtmlElementContext)_localctx).CLOSE_TAG = match(CLOSE_TAG);

			        // Extract tag name from OPEN_TAG and CLOSE_TAG for validation
			        String openTagName = ((HtmlElementContext)_localctx).OPEN_TAG.getText().substring(1); // Remove '<'
			        String closeTagName = ((HtmlElementContext)_localctx).CLOSE_TAG.getText().substring(2, ((HtmlElementContext)_localctx).CLOSE_TAG.getText().length()-1); // Remove '</' and '>'
			        
			        if (!openTagName.equals(closeTagName)) {
			            addError("Mismatched tags: " + openTagName + " and " + closeTagName, 
			                    ((HtmlElementContext)_localctx).CLOSE_TAG.getLine(), ((HtmlElementContext)_localctx).CLOSE_TAG.getCharPositionInLine(), "SEMANTIC");
			        } else {
			            addSymbol(openTagName, "html_element", ((HtmlElementContext)_localctx).OPEN_TAG.getLine(), ((HtmlElementContext)_localctx).OPEN_TAG.getCharPositionInLine());
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
	public static class HtmlContentContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TextContentContext textContent() {
			return getRuleContext(TextContentContext.class,0);
		}
		public HtmlEntityContext htmlEntity() {
			return getRuleContext(HtmlEntityContext.class,0);
		}
		public CdataContext cdata() {
			return getRuleContext(CdataContext.class,0);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlContent);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_TAG:
			case SELF_CLOSE_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				element();
				}
				break;
			case TEXT_CONTENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				textContent();
				}
				break;
			case HTML_ENTITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				htmlEntity();
				}
				break;
			case CDATA:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				cdata();
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
	public static class ElementContext extends ParserRuleContext {
		public NormalElementContext normalElement() {
			return getRuleContext(NormalElementContext.class,0);
		}
		public SelfClosingElementContext selfClosingElement() {
			return getRuleContext(SelfClosingElementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				normalElement();
				}
				break;
			case SELF_CLOSE_TAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				selfClosingElement();
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
	public static class NormalElementContext extends ParserRuleContext {
		public Token OPEN_TAG;
		public Token CLOSE_TAG;
		public TerminalNode OPEN_TAG() { return getToken(HTMLParser.OPEN_TAG, 0); }
		public TerminalNode GT() { return getToken(HTMLParser.GT, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(HTMLParser.CLOSE_TAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public NormalElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalElementContext normalElement() throws RecognitionException {
		NormalElementContext _localctx = new NormalElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_normalElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((NormalElementContext)_localctx).OPEN_TAG = match(OPEN_TAG);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTRIBUTE) {
				{
				{
				setState(56);
				attribute();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(GT);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 724L) != 0)) {
				{
				{
				setState(63);
				content();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			((NormalElementContext)_localctx).CLOSE_TAG = match(CLOSE_TAG);

			        String openTagName = ((NormalElementContext)_localctx).OPEN_TAG.getText().substring(1);
			        String closeTagName = ((NormalElementContext)_localctx).CLOSE_TAG.getText().substring(2, ((NormalElementContext)_localctx).CLOSE_TAG.getText().length()-1);
			        
			        if (!openTagName.equals(closeTagName)) {
			            addError("Mismatched tags: " + openTagName + " and " + closeTagName, 
			                    ((NormalElementContext)_localctx).CLOSE_TAG.getLine(), ((NormalElementContext)_localctx).CLOSE_TAG.getCharPositionInLine(), "SEMANTIC");
			        } else {
			            addSymbol(openTagName, "html_element", ((NormalElementContext)_localctx).OPEN_TAG.getLine(), ((NormalElementContext)_localctx).OPEN_TAG.getCharPositionInLine());
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
	public static class SelfClosingElementContext extends ParserRuleContext {
		public Token SELF_CLOSE_TAG;
		public TerminalNode SELF_CLOSE_TAG() { return getToken(HTMLParser.SELF_CLOSE_TAG, 0); }
		public SelfClosingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingElementContext selfClosingElement() throws RecognitionException {
		SelfClosingElementContext _localctx = new SelfClosingElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selfClosingElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((SelfClosingElementContext)_localctx).SELF_CLOSE_TAG = match(SELF_CLOSE_TAG);

			        // Extract tag name from self-closing tag
			        String tagContent = ((SelfClosingElementContext)_localctx).SELF_CLOSE_TAG.getText();
			        String tagName = tagContent.substring(1, tagContent.indexOf(' ') > 0 ? 
			                        tagContent.indexOf(' ') : tagContent.indexOf('/'));
			        addSymbol(tagName, "html_self_closing", ((SelfClosingElementContext)_localctx).SELF_CLOSE_TAG.getLine(), ((SelfClosingElementContext)_localctx).SELF_CLOSE_TAG.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TextContentContext textContent() {
			return getRuleContext(TextContentContext.class,0);
		}
		public HtmlEntityContext htmlEntity() {
			return getRuleContext(HtmlEntityContext.class,0);
		}
		public CdataContext cdata() {
			return getRuleContext(CdataContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_content);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_TAG:
			case SELF_CLOSE_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				element();
				}
				break;
			case TEXT_CONTENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				textContent();
				}
				break;
			case HTML_ENTITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				htmlEntity();
				}
				break;
			case CDATA:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				cdata();
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
	public static class TextContentContext extends ParserRuleContext {
		public TerminalNode TEXT_CONTENT() { return getToken(HTMLParser.TEXT_CONTENT, 0); }
		public TextContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTextContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTextContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTextContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContentContext textContent() throws RecognitionException {
		TextContentContext _localctx = new TextContentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_textContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(TEXT_CONTENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlEntityContext extends ParserRuleContext {
		public Token HTML_ENTITY;
		public TerminalNode HTML_ENTITY() { return getToken(HTMLParser.HTML_ENTITY, 0); }
		public HtmlEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlEntity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlEntityContext htmlEntity() throws RecognitionException {
		HtmlEntityContext _localctx = new HtmlEntityContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlEntity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			((HtmlEntityContext)_localctx).HTML_ENTITY = match(HTML_ENTITY);

			        addSymbol(((HtmlEntityContext)_localctx).HTML_ENTITY.getText(), "html_entity", ((HtmlEntityContext)_localctx).HTML_ENTITY.getLine(), ((HtmlEntityContext)_localctx).HTML_ENTITY.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CdataContext extends ParserRuleContext {
		public Token CDATA;
		public TerminalNode CDATA() { return getToken(HTMLParser.CDATA, 0); }
		public CdataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterCdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitCdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitCdata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CdataContext cdata() throws RecognitionException {
		CdataContext _localctx = new CdataContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cdata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			((CdataContext)_localctx).CDATA = match(CDATA);

			        addSymbol("CDATA", "html_cdata", ((CdataContext)_localctx).CDATA.getLine(), ((CdataContext)_localctx).CDATA.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public Token ATTRIBUTE;
		public TerminalNode ATTRIBUTE() { return getToken(HTMLParser.ATTRIBUTE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((AttributeContext)_localctx).ATTRIBUTE = match(ATTRIBUTE);

			        // Parse attribute name and value
			        String attrText = ((AttributeContext)_localctx).ATTRIBUTE.getText();
			        String attrName = attrText.substring(0, attrText.indexOf('='));
			        addSymbol(attrName.trim(), "html_attribute", ((AttributeContext)_localctx).ATTRIBUTE.getLine(), ((AttributeContext)_localctx).ATTRIBUTE.getCharPositionInLine());
			    
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001\u000f]\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0003\u0000\u0018"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"2\b\u0002\u0001\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0005\u0004:\b\u0004\n\u0004\f\u0004=\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004A\b\u0004\n\u0004\f\u0004D\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006P\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u0000]\u0000\u0017\u0001\u0000\u0000\u0000\u0002"+
		"\u001c\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u00065\u0001"+
		"\u0000\u0000\u0000\b7\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000"+
		"\fO\u0001\u0000\u0000\u0000\u000eQ\u0001\u0000\u0000\u0000\u0010S\u0001"+
		"\u0000\u0000\u0000\u0012V\u0001\u0000\u0000\u0000\u0014Y\u0001\u0000\u0000"+
		"\u0000\u0016\u0018\u0005\u0001\u0000\u0000\u0017\u0016\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0003\u0002\u0001\u0000\u001a\u001b\u0005\u0000\u0000"+
		"\u0001\u001b\u0001\u0001\u0000\u0000\u0000\u001c \u0005\u0002\u0000\u0000"+
		"\u001d\u001f\u0003\u0014\n\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f"+
		"\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000"+
		"\u0000\u0000!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#\'\u0005"+
		"\f\u0000\u0000$&\u0003\u0004\u0002\u0000%$\u0001\u0000\u0000\u0000&)\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005\u0003\u0000"+
		"\u0000+,\u0006\u0001\uffff\uffff\u0000,\u0003\u0001\u0000\u0000\u0000"+
		"-2\u0003\u0006\u0003\u0000.2\u0003\u000e\u0007\u0000/2\u0003\u0010\b\u0000"+
		"02\u0003\u0012\t\u00001-\u0001\u0000\u0000\u00001.\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0005\u0001\u0000"+
		"\u0000\u000036\u0003\b\u0004\u000046\u0003\n\u0005\u000053\u0001\u0000"+
		"\u0000\u000054\u0001\u0000\u0000\u00006\u0007\u0001\u0000\u0000\u0000"+
		"7;\u0005\u0002\u0000\u00008:\u0003\u0014\n\u000098\u0001\u0000\u0000\u0000"+
		":=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>B\u0005\f\u0000"+
		"\u0000?A\u0003\f\u0006\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0005\u0003\u0000\u0000FG\u0006"+
		"\u0004\uffff\uffff\u0000G\t\u0001\u0000\u0000\u0000HI\u0005\u0004\u0000"+
		"\u0000IJ\u0006\u0005\uffff\uffff\u0000J\u000b\u0001\u0000\u0000\u0000"+
		"KP\u0003\u0006\u0003\u0000LP\u0003\u000e\u0007\u0000MP\u0003\u0010\b\u0000"+
		"NP\u0003\u0012\t\u0000OK\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\r\u0001\u0000\u0000"+
		"\u0000QR\u0005\u0006\u0000\u0000R\u000f\u0001\u0000\u0000\u0000ST\u0005"+
		"\u0007\u0000\u0000TU\u0006\b\uffff\uffff\u0000U\u0011\u0001\u0000\u0000"+
		"\u0000VW\u0005\t\u0000\u0000WX\u0006\t\uffff\uffff\u0000X\u0013\u0001"+
		"\u0000\u0000\u0000YZ\u0005\u0005\u0000\u0000Z[\u0006\n\uffff\uffff\u0000"+
		"[\u0015\u0001\u0000\u0000\u0000\b\u0017 \'15;BO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}