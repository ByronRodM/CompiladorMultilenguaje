// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/tsql/TSQLParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.tsql;

    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TSQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TSQLParser#tsql_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsql_file(TSQLParser.Tsql_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#batch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatch(TSQLParser.BatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#sql_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_clauses(TSQLParser.Sql_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#sql_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_clause(TSQLParser.Sql_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#dml_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_clause(TSQLParser.Dml_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#ddl_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_clause(TSQLParser.Ddl_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_statement(TSQLParser.Alter_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_table_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_action(TSQLParser.Alter_table_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#drop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statement(TSQLParser.Drop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#procedural_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_clause(TSQLParser.Procedural_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#transaction_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_clause(TSQLParser.Transaction_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#other_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_clause(TSQLParser.Other_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_statement(TSQLParser.Create_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(TSQLParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(TSQLParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(TSQLParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure(TSQLParser.Create_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function(TSQLParser.Create_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view(TSQLParser.Create_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index(TSQLParser.Create_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database(TSQLParser.Create_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(TSQLParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(TSQLParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value(TSQLParser.Default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(TSQLParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(TSQLParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(TSQLParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(TSQLParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#select_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_elem(TSQLParser.Select_list_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source(TSQLParser.Table_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(TSQLParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#order_by_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expression(TSQLParser.Order_by_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(TSQLParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(TSQLParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause(TSQLParser.Set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(TSQLParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#declare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_statement(TSQLParser.Declare_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(TSQLParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#set_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_statement(TSQLParser.Set_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(TSQLParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(TSQLParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#try_catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_statement(TSQLParser.Try_catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#execute_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement(TSQLParser.Execute_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(TSQLParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(TSQLParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(TSQLParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(TSQLParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(TSQLParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(TSQLParser.Throw_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#error_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_number(TSQLParser.Error_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(TSQLParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#error_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_state(TSQLParser.Error_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#begin_transaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_transaction(TSQLParser.Begin_transactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#commit_transaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_transaction(TSQLParser.Commit_transactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#rollback_transaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_transaction(TSQLParser.Rollback_transactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#save_transaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSave_transaction(TSQLParser.Save_transactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#use_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_statement(TSQLParser.Use_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(TSQLParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TSQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(TSQLParser.Or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(TSQLParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(TSQLParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(TSQLParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(TSQLParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(TSQLParser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(TSQLParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(TSQLParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(TSQLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(TSQLParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(TSQLParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TSQLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(TSQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(TSQLParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#procedure_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_name(TSQLParser.Procedure_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(TSQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(TSQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(TSQLParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(TSQLParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#object_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_name(TSQLParser.Object_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(TSQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(TSQLParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(TSQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#cte_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_name(TSQLParser.Cte_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(TSQLParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(TSQLParser.Parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(TSQLParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(TSQLParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(TSQLParser.IdentifierContext ctx);
}