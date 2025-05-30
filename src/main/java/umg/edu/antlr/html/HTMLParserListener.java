// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/html/HTMLParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.html;

    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(HTMLParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(HTMLParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(HTMLParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(HTMLParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalElement(HTMLParser.NormalElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalElement(HTMLParser.NormalElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#selfClosingElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingElement(HTMLParser.SelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#selfClosingElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingElement(HTMLParser.SelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(HTMLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(HTMLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#textContent}.
	 * @param ctx the parse tree
	 */
	void enterTextContent(HTMLParser.TextContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#textContent}.
	 * @param ctx the parse tree
	 */
	void exitTextContent(HTMLParser.TextContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlEntity}.
	 * @param ctx the parse tree
	 */
	void enterHtmlEntity(HTMLParser.HtmlEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlEntity}.
	 * @param ctx the parse tree
	 */
	void exitHtmlEntity(HTMLParser.HtmlEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cdata}.
	 * @param ctx the parse tree
	 */
	void enterCdata(HTMLParser.CdataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cdata}.
	 * @param ctx the parse tree
	 */
	void exitCdata(HTMLParser.CdataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(HTMLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(HTMLParser.AttributeContext ctx);
}