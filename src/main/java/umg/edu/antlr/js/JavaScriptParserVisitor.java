// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/js/JavaScriptParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.js;

    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaScriptParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavaScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElement(JavaScriptParser.SourceElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaScriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(JavaScriptParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(JavaScriptParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JavaScriptParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(JavaScriptParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JavaScriptParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JavaScriptParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaScriptParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(JavaScriptParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(JavaScriptParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause(JavaScriptParser.DefaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(JavaScriptParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(JavaScriptParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#catchProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchProduction(JavaScriptParser.CatchProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#finallyProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyProduction(JavaScriptParser.FinallyProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#debuggerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebuggerStatement(JavaScriptParser.DebuggerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JavaScriptParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JavaScriptParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaScriptParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassElement(JavaScriptParser.ClassElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(JavaScriptParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(JavaScriptParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(JavaScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(JavaScriptParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(JavaScriptParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(JavaScriptParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(JavaScriptParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#leftHandSideExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSideExpression(JavaScriptParser.LeftHandSideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(JavaScriptParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#memberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpression(JavaScriptParser.MemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#callExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(JavaScriptParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JavaScriptParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(JavaScriptParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(JavaScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#functionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(JavaScriptParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(JavaScriptParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(JavaScriptParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(JavaScriptParser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#templateLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateLiteral(JavaScriptParser.TemplateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#templateElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateElement(JavaScriptParser.TemplateElementContext ctx);
}