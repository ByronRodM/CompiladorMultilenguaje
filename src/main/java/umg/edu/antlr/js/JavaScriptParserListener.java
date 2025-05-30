// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/js/JavaScriptParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.js;

    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaScriptParser}.
 */
public interface JavaScriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(JavaScriptParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(JavaScriptParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(JavaScriptParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(JavaScriptParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(JavaScriptParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(JavaScriptParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JavaScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JavaScriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(JavaScriptParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(JavaScriptParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JavaScriptParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JavaScriptParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JavaScriptParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JavaScriptParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaScriptParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaScriptParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JavaScriptParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JavaScriptParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(JavaScriptParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(JavaScriptParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(JavaScriptParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(JavaScriptParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(JavaScriptParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(JavaScriptParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(JavaScriptParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(JavaScriptParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void enterCatchProduction(JavaScriptParser.CatchProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void exitCatchProduction(JavaScriptParser.CatchProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void enterFinallyProduction(JavaScriptParser.FinallyProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void exitFinallyProduction(JavaScriptParser.FinallyProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterDebuggerStatement(JavaScriptParser.DebuggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitDebuggerStatement(JavaScriptParser.DebuggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JavaScriptParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JavaScriptParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaScriptParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaScriptParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaScriptParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaScriptParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassElement(JavaScriptParser.ClassElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassElement(JavaScriptParser.ClassElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(JavaScriptParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(JavaScriptParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(JavaScriptParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(JavaScriptParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JavaScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JavaScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JavaScriptParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JavaScriptParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(JavaScriptParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(JavaScriptParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JavaScriptParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JavaScriptParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JavaScriptParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JavaScriptParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#leftHandSideExpression}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSideExpression(JavaScriptParser.LeftHandSideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#leftHandSideExpression}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSideExpression(JavaScriptParser.LeftHandSideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(JavaScriptParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(JavaScriptParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#memberExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpression(JavaScriptParser.MemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#memberExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpression(JavaScriptParser.MemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(JavaScriptParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(JavaScriptParser.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JavaScriptParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JavaScriptParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JavaScriptParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JavaScriptParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(JavaScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(JavaScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(JavaScriptParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(JavaScriptParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(JavaScriptParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(JavaScriptParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(JavaScriptParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(JavaScriptParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(JavaScriptParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(JavaScriptParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#templateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTemplateLiteral(JavaScriptParser.TemplateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#templateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTemplateLiteral(JavaScriptParser.TemplateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#templateElement}.
	 * @param ctx the parse tree
	 */
	void enterTemplateElement(JavaScriptParser.TemplateElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#templateElement}.
	 * @param ctx the parse tree
	 */
	void exitTemplateElement(JavaScriptParser.TemplateElementContext ctx);
}