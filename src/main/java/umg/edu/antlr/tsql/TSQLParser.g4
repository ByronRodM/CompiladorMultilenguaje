parser grammar TSQLParser;

options {
    tokenVocab = TSQLLexer;
}

@header {
    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;
}

@members {
    private SymbolTable symbolTable = new SymbolTable();
    private ErrorTable errorTable = new ErrorTable();
    private Set<String> declaredTables = new HashSet<>();
    private Set<String> declaredVariables = new HashSet<>();
    private Set<String> declaredProcedures = new HashSet<>();
    
    public SymbolTable getSymbolTable() { return symbolTable; }
    public ErrorTable getErrorTable() { return errorTable; }
    
    private void addSymbol(String name, String type, int line, int column) {
        Symbol symbol = new Symbol(name, type, "global", null, line, column);
        symbolTable.addSymbol(symbol);
    }
    
    private void addError(String message, int line, int column, String type) {
        CompilationError.ErrorType errorType = CompilationError.ErrorType.SEMANTIC;
        if ("LEXICAL".equals(type)) {
            errorType = CompilationError.ErrorType.LEXICAL;
        } else if ("SYNTACTIC".equals(type)) {
            errorType = CompilationError.ErrorType.SYNTACTIC;
        }
        CompilationError error = new CompilationError(errorType, message, line, column, "");
        errorTable.addError(error);
    }
    
    private void checkTableExists(String tableName, int line, int column) {
        if (!declaredTables.contains(tableName.toLowerCase())) {
            addError("Table '" + tableName + "' does not exist", line, column, "SEMANTIC");
        }
    }
    
    private void addTable(String tableName) {
        declaredTables.add(tableName.toLowerCase());
    }
    
    private void checkVariableExists(String varName, int line, int column) {
        if (!declaredVariables.contains(varName.toLowerCase())) {
            addError("Variable '" + varName + "' not declared", line, column, "SEMANTIC");
        }
    }
    
    private void addVariable(String varName) {
        declaredVariables.add(varName.toLowerCase());
    }
    
    private void addProcedure(String procName) {
        declaredProcedures.add(procName.toLowerCase());
    }
    
    private void checkProcedureExists(String procName, int line, int column) {
        if (!declaredProcedures.contains(procName.toLowerCase())) {
            addError("Procedure '" + procName + "' does not exist", line, column, "SEMANTIC");
        }
    }
}

// T-SQL program structure
tsql_file: batch* EOF;

batch: sql_clauses GO?;

sql_clauses: sql_clause (SEMICOLON? sql_clause)*;

sql_clause
    : dml_clause
    | ddl_clause
    | procedural_clause
    | transaction_clause
    | other_clause
    ;

// Data Manipulation Language
dml_clause
    : select_statement
    | insert_statement
    | update_statement
    | delete_statement
    ;

// Data Definition Language
ddl_clause
    : create_statement
    | alter_statement
    | drop_statement
    ;

// ALTER statement
alter_statement
    : ALTER TABLE table_name alter_table_action (COMMA alter_table_action)*
    | ALTER PROCEDURE procedure_name AS sql_clauses
    | ALTER FUNCTION function_name LPAREN parameter_list? RPAREN RETURNS data_type AS BEGIN sql_clauses END
    ;

alter_table_action
    : ADD COLUMN? column_definition
    | DROP COLUMN? column_name
    | ALTER COLUMN column_name data_type
    ;

// DROP statement
drop_statement
    : DROP TABLE table_name
    | DROP PROCEDURE procedure_name
    | DROP FUNCTION function_name
    | DROP VIEW view_name
    | DROP INDEX index_name ON table_name
    | DROP DATABASE database_name
    ;

// Procedural clauses
procedural_clause
    : declare_statement
    | set_statement
    | if_statement
    | while_statement
    | try_catch_statement
    | execute_statement
    | return_statement
    | break_statement
    | continue_statement
    | throw_statement
    ;

// Transaction control
transaction_clause
    : begin_transaction
    | commit_transaction
    | rollback_transaction
    | save_transaction
    ;

other_clause
    : use_statement
    | print_statement
    ;

// CREATE statements
create_statement
    : create_table
    | create_procedure
    | create_function
    | create_view
    | create_index
    | create_database
    ;

create_table
    : CREATE TABLE table_name LPAREN column_definition (COMMA column_definition)* RPAREN
    {
        addTable($table_name.text);
        addSymbol($table_name.text, "table", $table_name.start.getLine(), $table_name.start.getCharPositionInLine());
    }
    ;

column_definition
    : column_name data_type (column_constraint)*
    {
        addSymbol($column_name.text, "column", $column_name.start.getLine(), $column_name.start.getCharPositionInLine());
    }
    ;

column_constraint
    : NOT NULL
    | NULL
    | PRIMARY KEY
    | UNIQUE
    | DEFAULT expression
    | CHECK LPAREN expression RPAREN
    | IDENTITY (LPAREN NUMBER_LITERAL COMMA NUMBER_LITERAL RPAREN)?
    | REFERENCES table_name (LPAREN column_name RPAREN)?
    ;

create_procedure
    : CREATE (PROCEDURE | PROC) procedure_name 
      (LPAREN parameter_list RPAREN)?
      AS
      sql_clauses
    {
        addProcedure($procedure_name.text);
        addSymbol($procedure_name.text, "procedure", $procedure_name.start.getLine(), $procedure_name.start.getCharPositionInLine());
    }
    ;

create_function
    : CREATE FUNCTION function_name 
      LPAREN parameter_list? RPAREN
      RETURNS data_type
      AS
      BEGIN
      sql_clauses
      END
    {
        addSymbol($function_name.text, "function", $function_name.start.getLine(), $function_name.start.getCharPositionInLine());
    }
    ;

create_view
    : CREATE VIEW view_name AS select_statement
    {
        addSymbol($view_name.text, "view", $view_name.start.getLine(), $view_name.start.getCharPositionInLine());
    }
    ;

create_index
    : CREATE (UNIQUE)? INDEX index_name ON table_name LPAREN column_name (COMMA column_name)* RPAREN
    {
        checkTableExists($table_name.text, $table_name.start.getLine(), $table_name.start.getCharPositionInLine());
        addSymbol($index_name.text, "index", $index_name.start.getLine(), $index_name.start.getCharPositionInLine());
    }
    ;

create_database
    : CREATE DATABASE database_name
    {
        addSymbol($database_name.text, "database", $database_name.start.getLine(), $database_name.start.getCharPositionInLine());
    }
    ;

// Parameters
parameter_list
    : parameter (COMMA parameter)*
    ;

parameter
    : parameter_name data_type (EQ default_value)? (OUTPUT | OUT)?
    {
        addVariable($parameter_name.text);
        addSymbol($parameter_name.text, "parameter", $parameter_name.start.getLine(), $parameter_name.start.getCharPositionInLine());
    }
    ;

default_value
    : expression
    ;

// Data types
data_type
    : VARCHAR (LPAREN NUMBER_LITERAL RPAREN)? 
    | NVARCHAR (LPAREN NUMBER_LITERAL RPAREN)?
    | CHAR (LPAREN NUMBER_LITERAL RPAREN)?
    | NCHAR (LPAREN NUMBER_LITERAL RPAREN)?
    | TEXT | NTEXT
    | INT | INTEGER | BIGINT | SMALLINT | TINYINT
    | DECIMAL (LPAREN NUMBER_LITERAL (COMMA NUMBER_LITERAL)? RPAREN)?
    | NUMERIC (LPAREN NUMBER_LITERAL (COMMA NUMBER_LITERAL)? RPAREN)?
    | FLOAT (LPAREN NUMBER_LITERAL RPAREN)?
    | REAL | MONEY | SMALLMONEY
    | DATETIME | DATETIME2 | DATE | TIME | TIMESTAMP
    | BIT | BINARY (LPAREN NUMBER_LITERAL RPAREN)?
    | VARBINARY (LPAREN NUMBER_LITERAL RPAREN)?
    | IMAGE | UNIQUEIDENTIFIER | XML
    ;

// SELECT statement
select_statement
    : (WITH common_table_expression (COMMA common_table_expression)*)?
      SELECT (ALL | DISTINCT)? (TOP LPAREN expression RPAREN)?
      select_list
      (FROM table_source (COMMA table_source)*)?
      (WHERE search_condition)?
      (GROUP BY expression (COMMA expression)*)?
      (HAVING search_condition)?
      (ORDER BY order_by_expression (COMMA order_by_expression)*)?
    ;

common_table_expression
    : cte_name (LPAREN column_name (COMMA column_name)* RPAREN)? AS LPAREN select_statement RPAREN
    {
        addSymbol($cte_name.text, "cte", $cte_name.start.getLine(), $cte_name.start.getCharPositionInLine());
    }
    ;

select_list
    : select_list_elem (COMMA select_list_elem)*
    ;

select_list_elem
    : MULT
    | table_name DOT MULT
    | expression (AS? column_alias)?
    ;

table_source
    : table_name (AS? table_alias)?
    {
        checkTableExists($table_name.text, $table_name.start.getLine(), $table_name.start.getCharPositionInLine());
    }
    | LPAREN select_statement RPAREN (AS? table_alias)?
    | table_source join_type table_source ON search_condition
    ;

join_type
    : INNER? JOIN
    | LEFT OUTER? JOIN
    | RIGHT OUTER? JOIN
    | FULL OUTER? JOIN
    ;

order_by_expression
    : expression (ASC | DESC)?
    ;

// INSERT statement
insert_statement
    : INSERT (INTO)? table_name 
      (LPAREN column_name (COMMA column_name)* RPAREN)?
      (VALUES LPAREN expression (COMMA expression)* RPAREN | select_statement)
    {
        checkTableExists($table_name.text, $table_name.start.getLine(), $table_name.start.getCharPositionInLine());
    }
    ;

// UPDATE statement
update_statement
    : UPDATE table_name
      SET set_clause (COMMA set_clause)*
      (WHERE search_condition)?
    {
        checkTableExists($table_name.text, $table_name.start.getLine(), $table_name.start.getCharPositionInLine());
    }
    ;

set_clause
    : column_name EQ expression
    ;

// DELETE statement
delete_statement
    : DELETE (FROM)? table_name
      (WHERE search_condition)?
    {
        checkTableExists($table_name.text, $table_name.start.getLine(), $table_name.start.getCharPositionInLine());
    }
    ;

// Procedural statements
declare_statement
    : DECLARE variable_declaration (COMMA variable_declaration)*
    ;

variable_declaration
    : variable_name data_type (EQ expression)?
    {
        addVariable($variable_name.text);
        addSymbol($variable_name.text, "variable", $variable_name.start.getLine(), $variable_name.start.getCharPositionInLine());
    }
    ;

set_statement
    : SET variable_name EQ expression
    {
        checkVariableExists($variable_name.text, $variable_name.start.getLine(), $variable_name.start.getCharPositionInLine());
    }
    ;

if_statement
    : IF search_condition
      sql_clauses
      (ELSE sql_clauses)?
    ;

while_statement
    : WHILE search_condition
      sql_clauses
    ;

try_catch_statement
    : BEGIN TRY
      sql_clauses
      END TRY
      BEGIN CATCH
      sql_clauses
      END CATCH
    ;

execute_statement
    : (EXEC | EXECUTE) procedure_name (argument_list)?
    {
        checkProcedureExists($procedure_name.text, $procedure_name.start.getLine(), $procedure_name.start.getCharPositionInLine());
    }
    ;

argument_list
    : argument (COMMA argument)*
    ;

argument
    : expression
    | parameter_name EQ expression
    ;

return_statement
    : RETURN expression?
    ;

break_statement: BREAK;
continue_statement: CONTINUE;

throw_statement
    : THROW (error_number COMMA error_message COMMA error_state)?
    ;

error_number: expression;
error_message: expression;
error_state: expression;

// Transaction statements
begin_transaction
    : BEGIN (TRANSACTION | TRAN) (transaction_name)?
    ;

commit_transaction
    : COMMIT (TRANSACTION | TRAN)? (transaction_name)?
    ;

rollback_transaction
    : ROLLBACK (TRANSACTION | TRAN)? (transaction_name | savepoint_name)?
    ;

save_transaction
    : SAVE (TRANSACTION | TRAN) savepoint_name
    ;

// Other statements
use_statement
    : USE database_name
    ;

print_statement
    : PRINT expression
    ;

// Expressions
expression
    : or_expression
    ;

or_expression
    : and_expression (OR and_expression)*
    ;

and_expression
    : equality_expression (AND equality_expression)*
    ;

equality_expression
    : relational_expression ((EQ | NE) relational_expression)*
    ;

relational_expression
    : additive_expression ((LT | LE | GT | GE) additive_expression)*
    | additive_expression (NOT)? BETWEEN additive_expression AND additive_expression
    | additive_expression (NOT)? IN LPAREN (expression (COMMA expression)* | select_statement) RPAREN
    | additive_expression (NOT)? LIKE additive_expression
    | additive_expression IS (NOT)? NULL
    | EXISTS LPAREN select_statement RPAREN
    ;

additive_expression
    : multiplicative_expression ((PLUS | MINUS) multiplicative_expression)*
    ;

multiplicative_expression
    : unary_expression ((MULT | DIV | MOD) unary_expression)*
    ;

unary_expression
    : primary_expression
    | (PLUS | MINUS | NOT) unary_expression
    ;

primary_expression
    : literal
    | variable_name
    | column_name
    | function_call
    | case_expression
    | LPAREN expression RPAREN
    | LPAREN select_statement RPAREN
    ;

function_call
    : function_name LPAREN (argument_list)? RPAREN
    {
        addSymbol($function_name.text, "function_call", $function_name.start.getLine(), $function_name.start.getCharPositionInLine());
    }
    ;

case_expression
    : CASE (expression)? 
      (WHEN expression THEN expression)+
      (ELSE expression)?
      END
    ;

search_condition
    : expression
    ;

// Literals
literal
    : NUMBER_LITERAL
    | MONEY_LITERAL
    | STRING_LITERAL
    | UNICODE_STRING_LITERAL
    | NULL
    ;

// Names and identifiers
table_name: (database_name DOT)? (schema_name DOT)? object_name;
view_name: (database_name DOT)? (schema_name DOT)? object_name;
procedure_name: (database_name DOT)? (schema_name DOT)? object_name;
function_name: (database_name DOT)? (schema_name DOT)? object_name;
index_name: object_name;
database_name: identifier;
schema_name: identifier;
object_name: identifier;
column_name: (table_name DOT)? identifier;
table_alias: identifier;
column_alias: identifier;
cte_name: identifier;
variable_name: LOCAL_VARIABLE | GLOBAL_VARIABLE;
parameter_name: LOCAL_VARIABLE;
transaction_name: identifier;
savepoint_name: identifier;

identifier
    : IDENTIFIER
    | QUOTED_IDENTIFIER
    ; 