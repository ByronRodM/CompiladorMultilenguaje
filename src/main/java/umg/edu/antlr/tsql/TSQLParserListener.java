// Generated from C:/Code/Projects/Java/CompiladorMultilenguaje/src/main/java/umg/edu/antlr/tsql/TSQLParser.g4 by ANTLR 4.13.2
package umg.edu.antlr.tsql;

    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TSQLParser}.
 */
public interface TSQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TSQLParser#tsql_file}.
	 * @param ctx the parse tree
	 */
	void enterTsql_file(TSQLParser.Tsql_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#tsql_file}.
	 * @param ctx the parse tree
	 */
	void exitTsql_file(TSQLParser.Tsql_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#batch}.
	 * @param ctx the parse tree
	 */
	void enterBatch(TSQLParser.BatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#batch}.
	 * @param ctx the parse tree
	 */
	void exitBatch(TSQLParser.BatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSql_clauses(TSQLParser.Sql_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSql_clauses(TSQLParser.Sql_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#sql_clause}.
	 * @param ctx the parse tree
	 */
	void enterSql_clause(TSQLParser.Sql_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#sql_clause}.
	 * @param ctx the parse tree
	 */
	void exitSql_clause(TSQLParser.Sql_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_clause(TSQLParser.Dml_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_clause(TSQLParser.Dml_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void enterDdl_clause(TSQLParser.Ddl_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void exitDdl_clause(TSQLParser.Ddl_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_statement(TSQLParser.Alter_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_statement(TSQLParser.Alter_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_table_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_action(TSQLParser.Alter_table_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_table_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_action(TSQLParser.Alter_table_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#drop_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statement(TSQLParser.Drop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#drop_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statement(TSQLParser.Drop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#procedural_clause}.
	 * @param ctx the parse tree
	 */
	void enterProcedural_clause(TSQLParser.Procedural_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#procedural_clause}.
	 * @param ctx the parse tree
	 */
	void exitProcedural_clause(TSQLParser.Procedural_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#transaction_clause}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_clause(TSQLParser.Transaction_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#transaction_clause}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_clause(TSQLParser.Transaction_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#other_clause}.
	 * @param ctx the parse tree
	 */
	void enterOther_clause(TSQLParser.Other_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#other_clause}.
	 * @param ctx the parse tree
	 */
	void exitOther_clause(TSQLParser.Other_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statement(TSQLParser.Create_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statement(TSQLParser.Create_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(TSQLParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(TSQLParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(TSQLParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(TSQLParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(TSQLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(TSQLParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_procedure}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure(TSQLParser.Create_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_procedure}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure(TSQLParser.Create_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function(TSQLParser.Create_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function(TSQLParser.Create_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view(TSQLParser.Create_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view(TSQLParser.Create_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(TSQLParser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(TSQLParser.Create_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_database}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database(TSQLParser.Create_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_database}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database(TSQLParser.Create_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(TSQLParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(TSQLParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(TSQLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(TSQLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#default_value}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value(TSQLParser.Default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#default_value}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value(TSQLParser.Default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(TSQLParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(TSQLParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(TSQLParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(TSQLParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(TSQLParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(TSQLParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(TSQLParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(TSQLParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elem(TSQLParser.Select_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elem(TSQLParser.Select_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#table_source}.
	 * @param ctx the parse tree
	 */
	void enterTable_source(TSQLParser.Table_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#table_source}.
	 * @param ctx the parse tree
	 */
	void exitTable_source(TSQLParser.Table_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(TSQLParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(TSQLParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expression(TSQLParser.Order_by_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expression(TSQLParser.Order_by_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(TSQLParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(TSQLParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(TSQLParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(TSQLParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_clause(TSQLParser.Set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_clause(TSQLParser.Set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(TSQLParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(TSQLParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_statement(TSQLParser.Declare_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_statement(TSQLParser.Declare_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(TSQLParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(TSQLParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement(TSQLParser.Set_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement(TSQLParser.Set_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(TSQLParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(TSQLParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(TSQLParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(TSQLParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_statement(TSQLParser.Try_catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_statement(TSQLParser.Try_catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement(TSQLParser.Execute_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement(TSQLParser.Execute_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(TSQLParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(TSQLParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(TSQLParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(TSQLParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(TSQLParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(TSQLParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(TSQLParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(TSQLParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(TSQLParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(TSQLParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(TSQLParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(TSQLParser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#error_number}.
	 * @param ctx the parse tree
	 */
	void enterError_number(TSQLParser.Error_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#error_number}.
	 * @param ctx the parse tree
	 */
	void exitError_number(TSQLParser.Error_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(TSQLParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(TSQLParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#error_state}.
	 * @param ctx the parse tree
	 */
	void enterError_state(TSQLParser.Error_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#error_state}.
	 * @param ctx the parse tree
	 */
	void exitError_state(TSQLParser.Error_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#begin_transaction}.
	 * @param ctx the parse tree
	 */
	void enterBegin_transaction(TSQLParser.Begin_transactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#begin_transaction}.
	 * @param ctx the parse tree
	 */
	void exitBegin_transaction(TSQLParser.Begin_transactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#commit_transaction}.
	 * @param ctx the parse tree
	 */
	void enterCommit_transaction(TSQLParser.Commit_transactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#commit_transaction}.
	 * @param ctx the parse tree
	 */
	void exitCommit_transaction(TSQLParser.Commit_transactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#rollback_transaction}.
	 * @param ctx the parse tree
	 */
	void enterRollback_transaction(TSQLParser.Rollback_transactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#rollback_transaction}.
	 * @param ctx the parse tree
	 */
	void exitRollback_transaction(TSQLParser.Rollback_transactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#save_transaction}.
	 * @param ctx the parse tree
	 */
	void enterSave_transaction(TSQLParser.Save_transactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#save_transaction}.
	 * @param ctx the parse tree
	 */
	void exitSave_transaction(TSQLParser.Save_transactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void enterUse_statement(TSQLParser.Use_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void exitUse_statement(TSQLParser.Use_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(TSQLParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(TSQLParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TSQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(TSQLParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(TSQLParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(TSQLParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(TSQLParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(TSQLParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(TSQLParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(TSQLParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(TSQLParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(TSQLParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(TSQLParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(TSQLParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(TSQLParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(TSQLParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(TSQLParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(TSQLParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(TSQLParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(TSQLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(TSQLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(TSQLParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(TSQLParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(TSQLParser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(TSQLParser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TSQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TSQLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(TSQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(TSQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(TSQLParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(TSQLParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(TSQLParser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(TSQLParser.Procedure_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(TSQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(TSQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(TSQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(TSQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(TSQLParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(TSQLParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(TSQLParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(TSQLParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#object_name}.
	 * @param ctx the parse tree
	 */
	void enterObject_name(TSQLParser.Object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#object_name}.
	 * @param ctx the parse tree
	 */
	void exitObject_name(TSQLParser.Object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(TSQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(TSQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(TSQLParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(TSQLParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(TSQLParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(TSQLParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#cte_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_name(TSQLParser.Cte_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#cte_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_name(TSQLParser.Cte_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(TSQLParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(TSQLParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(TSQLParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(TSQLParser.Parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(TSQLParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(TSQLParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(TSQLParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(TSQLParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(TSQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(TSQLParser.IdentifierContext ctx);
}