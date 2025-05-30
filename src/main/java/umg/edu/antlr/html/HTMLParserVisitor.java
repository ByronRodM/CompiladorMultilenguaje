// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/html/HTMLParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.html;

    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(HTMLParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(HTMLParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#normalElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElement(HTMLParser.NormalElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#selfClosingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingElement(HTMLParser.SelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(HTMLParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#textContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextContent(HTMLParser.TextContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlEntity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlEntity(HTMLParser.HtmlEntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdata(HTMLParser.CdataContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(HTMLParser.AttributeContext ctx);
}