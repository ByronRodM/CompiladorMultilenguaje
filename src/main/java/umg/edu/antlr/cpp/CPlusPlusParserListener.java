// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/cpp/CPlusPlusParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.cpp;

    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CPlusPlusParser}.
 */
public interface CPlusPlusParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CPlusPlusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CPlusPlusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CPlusPlusParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CPlusPlusParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(CPlusPlusParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(CPlusPlusParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CPlusPlusParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CPlusPlusParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CPlusPlusParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CPlusPlusParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(CPlusPlusParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(CPlusPlusParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(CPlusPlusParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(CPlusPlusParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(CPlusPlusParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(CPlusPlusParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(CPlusPlusParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(CPlusPlusParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(CPlusPlusParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(CPlusPlusParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CPlusPlusParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CPlusPlusParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#accessSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessSpecifier(CPlusPlusParser.AccessSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#accessSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessSpecifier(CPlusPlusParser.AccessSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDeclaration(CPlusPlusParser.NamespaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDeclaration(CPlusPlusParser.NamespaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingDeclaration(CPlusPlusParser.UsingDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingDeclaration(CPlusPlusParser.UsingDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CPlusPlusParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CPlusPlusParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CPlusPlusParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CPlusPlusParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(CPlusPlusParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(CPlusPlusParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(CPlusPlusParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(CPlusPlusParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CPlusPlusParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CPlusPlusParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CPlusPlusParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CPlusPlusParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CPlusPlusParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CPlusPlusParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(CPlusPlusParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(CPlusPlusParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(CPlusPlusParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(CPlusPlusParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#switchSection}.
	 * @param ctx the parse tree
	 */
	void enterSwitchSection(CPlusPlusParser.SwitchSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#switchSection}.
	 * @param ctx the parse tree
	 */
	void exitSwitchSection(CPlusPlusParser.SwitchSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(CPlusPlusParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(CPlusPlusParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(CPlusPlusParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(CPlusPlusParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CPlusPlusParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CPlusPlusParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CPlusPlusParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CPlusPlusParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CPlusPlusParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CPlusPlusParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CPlusPlusParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CPlusPlusParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(CPlusPlusParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(CPlusPlusParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(CPlusPlusParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(CPlusPlusParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CPlusPlusParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CPlusPlusParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CPlusPlusParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CPlusPlusParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(CPlusPlusParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(CPlusPlusParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CPlusPlusParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CPlusPlusParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CPlusPlusParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CPlusPlusParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CPlusPlusParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CPlusPlusParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(CPlusPlusParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(CPlusPlusParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(CPlusPlusParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(CPlusPlusParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#postfixSuffix}.
	 * @param ctx the parse tree
	 */
	void enterPostfixSuffix(CPlusPlusParser.PostfixSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#postfixSuffix}.
	 * @param ctx the parse tree
	 */
	void exitPostfixSuffix(CPlusPlusParser.PostfixSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CPlusPlusParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CPlusPlusParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(CPlusPlusParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(CPlusPlusParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPlusPlusParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CPlusPlusParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPlusPlusParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CPlusPlusParser.LiteralContext ctx);
}