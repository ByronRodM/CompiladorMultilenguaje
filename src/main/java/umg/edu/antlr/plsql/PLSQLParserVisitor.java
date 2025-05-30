// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/plsql/PLSQLParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.plsql;

    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PLSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PLSQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#plsqlUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsqlUnit(PLSQLParser.PlsqlUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#anonymousBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousBlock(PLSQLParser.AnonymousBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#createStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatement(PLSQLParser.CreateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#dropStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStatement(PLSQLParser.DropStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(PLSQLParser.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(PLSQLParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(PLSQLParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#createProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedure(PLSQLParser.CreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#createFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(PLSQLParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#createPackage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePackage(PLSQLParser.CreatePackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#packageSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageSpec(PLSQLParser.PackageSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#packageBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageBody(PLSQLParser.PackageBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(PLSQLParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(PLSQLParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#procedureImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureImplementation(PLSQLParser.ProcedureImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#functionImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionImplementation(PLSQLParser.FunctionImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(PLSQLParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(PLSQLParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#declarationSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSection(PLSQLParser.DeclarationSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(PLSQLParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(PLSQLParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorDeclaration(PLSQLParser.CursorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(PLSQLParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#recordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(PLSQLParser.RecordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#recordField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordField(PLSQLParser.RecordFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(PLSQLParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#executableSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecutableSection(PLSQLParser.ExecutableSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#exceptionSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionSection(PLSQLParser.ExceptionSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(PLSQLParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#exceptionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionName(PLSQLParser.ExceptionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PLSQLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(PLSQLParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PLSQLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#plsqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsqlStatement(PLSQLParser.PlsqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#procedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCall(PLSQLParser.ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(PLSQLParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStatement(PLSQLParser.ControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PLSQLParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(PLSQLParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(PLSQLParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PLSQLParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PLSQLParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorName(PLSQLParser.CursorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(PLSQLParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(PLSQLParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(PLSQLParser.SelectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(PLSQLParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(PLSQLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(PLSQLParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(PLSQLParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(PLSQLParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(PLSQLParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(PLSQLParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#columnAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAssignment(PLSQLParser.ColumnAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(PLSQLParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(PLSQLParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#createView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(PLSQLParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#createSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSequence(PLSQLParser.CreateSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#sequenceOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceOption(PLSQLParser.SequenceOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#createTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrigger(PLSQLParser.CreateTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#triggerEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerEvent(PLSQLParser.TriggerEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PLSQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(PLSQLParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(PLSQLParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(PLSQLParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(PLSQLParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(PLSQLParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(PLSQLParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(PLSQLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(PLSQLParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(PLSQLParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PLSQLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PLSQLParser.LiteralContext ctx);
}