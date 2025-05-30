// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/plsql/PLSQLParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.plsql;

    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLSQLParser}.
 */
public interface PLSQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#plsqlUnit}.
	 * @param ctx the parse tree
	 */
	void enterPlsqlUnit(PLSQLParser.PlsqlUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#plsqlUnit}.
	 * @param ctx the parse tree
	 */
	void exitPlsqlUnit(PLSQLParser.PlsqlUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#anonymousBlock}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousBlock(PLSQLParser.AnonymousBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#anonymousBlock}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousBlock(PLSQLParser.AnonymousBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStatement(PLSQLParser.CreateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStatement(PLSQLParser.CreateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dropStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropStatement(PLSQLParser.DropStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dropStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropStatement(PLSQLParser.DropStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(PLSQLParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(PLSQLParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(PLSQLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(PLSQLParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(PLSQLParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(PLSQLParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(PLSQLParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(PLSQLParser.CreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(PLSQLParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(PLSQLParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#createPackage}.
	 * @param ctx the parse tree
	 */
	void enterCreatePackage(PLSQLParser.CreatePackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#createPackage}.
	 * @param ctx the parse tree
	 */
	void exitCreatePackage(PLSQLParser.CreatePackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#packageSpec}.
	 * @param ctx the parse tree
	 */
	void enterPackageSpec(PLSQLParser.PackageSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#packageSpec}.
	 * @param ctx the parse tree
	 */
	void exitPackageSpec(PLSQLParser.PackageSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#packageBody}.
	 * @param ctx the parse tree
	 */
	void enterPackageBody(PLSQLParser.PackageBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#packageBody}.
	 * @param ctx the parse tree
	 */
	void exitPackageBody(PLSQLParser.PackageBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(PLSQLParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(PLSQLParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(PLSQLParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(PLSQLParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedureImplementation}.
	 * @param ctx the parse tree
	 */
	void enterProcedureImplementation(PLSQLParser.ProcedureImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedureImplementation}.
	 * @param ctx the parse tree
	 */
	void exitProcedureImplementation(PLSQLParser.ProcedureImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#functionImplementation}.
	 * @param ctx the parse tree
	 */
	void enterFunctionImplementation(PLSQLParser.FunctionImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#functionImplementation}.
	 * @param ctx the parse tree
	 */
	void exitFunctionImplementation(PLSQLParser.FunctionImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PLSQLParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PLSQLParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PLSQLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PLSQLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#declarationSection}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSection(PLSQLParser.DeclarationSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#declarationSection}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSection(PLSQLParser.DeclarationSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PLSQLParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PLSQLParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(PLSQLParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(PLSQLParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCursorDeclaration(PLSQLParser.CursorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCursorDeclaration(PLSQLParser.CursorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(PLSQLParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(PLSQLParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(PLSQLParser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(PLSQLParser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#recordField}.
	 * @param ctx the parse tree
	 */
	void enterRecordField(PLSQLParser.RecordFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#recordField}.
	 * @param ctx the parse tree
	 */
	void exitRecordField(PLSQLParser.RecordFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(PLSQLParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(PLSQLParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#executableSection}.
	 * @param ctx the parse tree
	 */
	void enterExecutableSection(PLSQLParser.ExecutableSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#executableSection}.
	 * @param ctx the parse tree
	 */
	void exitExecutableSection(PLSQLParser.ExecutableSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exceptionSection}.
	 * @param ctx the parse tree
	 */
	void enterExceptionSection(PLSQLParser.ExceptionSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exceptionSection}.
	 * @param ctx the parse tree
	 */
	void exitExceptionSection(PLSQLParser.ExceptionSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(PLSQLParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(PLSQLParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exceptionName}.
	 * @param ctx the parse tree
	 */
	void enterExceptionName(PLSQLParser.ExceptionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exceptionName}.
	 * @param ctx the parse tree
	 */
	void exitExceptionName(PLSQLParser.ExceptionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PLSQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PLSQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PLSQLParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PLSQLParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PLSQLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PLSQLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#plsqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterPlsqlStatement(PLSQLParser.PlsqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#plsqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitPlsqlStatement(PLSQLParser.PlsqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCall(PLSQLParser.ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCall(PLSQLParser.ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(PLSQLParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(PLSQLParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#controlStatement}.
	 * @param ctx the parse tree
	 */
	void enterControlStatement(PLSQLParser.ControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#controlStatement}.
	 * @param ctx the parse tree
	 */
	void exitControlStatement(PLSQLParser.ControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PLSQLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PLSQLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(PLSQLParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(PLSQLParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(PLSQLParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(PLSQLParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PLSQLParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PLSQLParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PLSQLParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PLSQLParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void enterCursorName(PLSQLParser.CursorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void exitCursorName(PLSQLParser.CursorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(PLSQLParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(PLSQLParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(PLSQLParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(PLSQLParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(PLSQLParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(PLSQLParser.SelectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(PLSQLParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(PLSQLParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(PLSQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(PLSQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(PLSQLParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(PLSQLParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(PLSQLParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(PLSQLParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(PLSQLParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(PLSQLParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(PLSQLParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(PLSQLParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(PLSQLParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(PLSQLParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#columnAssignment}.
	 * @param ctx the parse tree
	 */
	void enterColumnAssignment(PLSQLParser.ColumnAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#columnAssignment}.
	 * @param ctx the parse tree
	 */
	void exitColumnAssignment(PLSQLParser.ColumnAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(PLSQLParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(PLSQLParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(PLSQLParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(PLSQLParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(PLSQLParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(PLSQLParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#createSequence}.
	 * @param ctx the parse tree
	 */
	void enterCreateSequence(PLSQLParser.CreateSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#createSequence}.
	 * @param ctx the parse tree
	 */
	void exitCreateSequence(PLSQLParser.CreateSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sequenceOption}.
	 * @param ctx the parse tree
	 */
	void enterSequenceOption(PLSQLParser.SequenceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sequenceOption}.
	 * @param ctx the parse tree
	 */
	void exitSequenceOption(PLSQLParser.SequenceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(PLSQLParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(PLSQLParser.CreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void enterTriggerEvent(PLSQLParser.TriggerEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void exitTriggerEvent(PLSQLParser.TriggerEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PLSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PLSQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(PLSQLParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(PLSQLParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(PLSQLParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(PLSQLParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(PLSQLParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(PLSQLParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(PLSQLParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(PLSQLParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(PLSQLParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(PLSQLParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(PLSQLParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(PLSQLParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(PLSQLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(PLSQLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(PLSQLParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(PLSQLParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(PLSQLParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(PLSQLParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PLSQLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PLSQLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PLSQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PLSQLParser.LiteralContext ctx);
}