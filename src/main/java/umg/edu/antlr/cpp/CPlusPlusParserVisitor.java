// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/cpp/CPlusPlusParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.cpp;

    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CPlusPlusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CPlusPlusParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CPlusPlusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CPlusPlusParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(CPlusPlusParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(CPlusPlusParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(CPlusPlusParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(CPlusPlusParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(CPlusPlusParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(CPlusPlusParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(CPlusPlusParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(CPlusPlusParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CPlusPlusParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#accessSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessSpecifier(CPlusPlusParser.AccessSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDeclaration(CPlusPlusParser.NamespaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#usingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDeclaration(CPlusPlusParser.UsingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CPlusPlusParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(CPlusPlusParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(CPlusPlusParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(CPlusPlusParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CPlusPlusParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CPlusPlusParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CPlusPlusParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(CPlusPlusParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(CPlusPlusParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#switchSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchSection(CPlusPlusParser.SwitchSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(CPlusPlusParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(CPlusPlusParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CPlusPlusParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(CPlusPlusParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(CPlusPlusParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CPlusPlusParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(CPlusPlusParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(CPlusPlusParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(CPlusPlusParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CPlusPlusParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(CPlusPlusParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(CPlusPlusParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(CPlusPlusParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CPlusPlusParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(CPlusPlusParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(CPlusPlusParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#postfixSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixSuffix(CPlusPlusParser.PostfixSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(CPlusPlusParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(CPlusPlusParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPlusPlusParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CPlusPlusParser.LiteralContext ctx);
}