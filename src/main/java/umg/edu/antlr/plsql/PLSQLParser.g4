parser grammar PLSQLParser;

options {
    tokenVocab = PLSQLLexer;
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
}

// Program structure
plsqlUnit
    : anonymousBlock
    | createStatement
    | dropStatement
    | sqlStatement
    ;

// Anonymous PL/SQL block
anonymousBlock
    : (DECLARE declarationSection)? executableSection (exceptionSection)? END SEMICOLON?
    ;

// Named PL/SQL objects
createStatement
    : createProcedure
    | createFunction
    | createPackage
    | createTable
    | createIndex
    | createView
    | createSequence
    | createTrigger
    ;

// DROP statements
dropStatement
    : DROP objectType IDENTIFIER SEMICOLON?
    {
        addSymbol($IDENTIFIER.getText(), "dropped_" + $objectType.text, $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

objectType
    : TABLE | PROCEDURE | FUNCTION | PACKAGE | INDEX | VIEW | SEQUENCE | TRIGGER
    ;

// CREATE TABLE
createTable
    : CREATE TABLE IDENTIFIER LPAREN columnDefinition (COMMA columnDefinition)* RPAREN SEMICOLON?
    {
        addTable($IDENTIFIER.getText());
        addSymbol($IDENTIFIER.getText(), "table", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

columnDefinition
    : IDENTIFIER dataType (NOT_NULL)? (DEFAULT expression)?
    {
        addSymbol($IDENTIFIER.getText(), "column", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

// CREATE PROCEDURE
createProcedure
    : CREATE (OR REPLACE)? PROCEDURE IDENTIFIER 
      (LPAREN parameterList RPAREN)? 
      (IS | AS) declarationSection? executableSection (exceptionSection)? END IDENTIFIER? SEMICOLON?
    {
        addSymbol($IDENTIFIER.getText(), "procedure", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

// CREATE FUNCTION
createFunction
    : CREATE (OR REPLACE)? FUNCTION IDENTIFIER 
      (LPAREN parameterList RPAREN)? 
      RETURN dataType
      (IS | AS) declarationSection? executableSection (exceptionSection)? END IDENTIFIER? SEMICOLON?
    {
        addSymbol($IDENTIFIER.getText(), "function", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

// CREATE PACKAGE
createPackage
    : CREATE (OR REPLACE)? PACKAGE IDENTIFIER (IS | AS) packageSpec END IDENTIFIER? SEMICOLON?
    | CREATE (OR REPLACE)? PACKAGE BODY IDENTIFIER (IS | AS) packageBody END IDENTIFIER? SEMICOLON?
    {
        addSymbol($IDENTIFIER.getText(), "package", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

packageSpec
    : (procedureDeclaration | functionDeclaration | variableDeclaration)*
    ;

packageBody
    : (procedureImplementation | functionImplementation | variableDeclaration)*
    ;

procedureDeclaration
    : PROCEDURE IDENTIFIER (LPAREN parameterList RPAREN)? SEMICOLON
    {
        addSymbol($IDENTIFIER.getText(), "procedure_declaration", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

functionDeclaration
    : FUNCTION IDENTIFIER (LPAREN parameterList RPAREN)? RETURN dataType SEMICOLON
    {
        addSymbol($IDENTIFIER.getText(), "function_declaration", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

procedureImplementation
    : PROCEDURE IDENTIFIER (LPAREN parameterList RPAREN)? 
      (IS | AS) declarationSection? executableSection (exceptionSection)? END IDENTIFIER? SEMICOLON?
    {
        addSymbol($IDENTIFIER.getText(), "procedure_implementation", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

functionImplementation
    : FUNCTION IDENTIFIER (LPAREN parameterList RPAREN)? RETURN dataType
      (IS | AS) declarationSection? executableSection (exceptionSection)? END IDENTIFIER? SEMICOLON?
    {
        addSymbol($IDENTIFIER.getText(), "function_implementation", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

// Parameters
parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : IDENTIFIER (IN | OUT | IN_OUT)? dataType (DEFAULT expression)?
    {
        addVariable($IDENTIFIER.getText());
        addSymbol($IDENTIFIER.getText(), "parameter", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

// Declaration section
declarationSection
    : (variableDeclaration | constantDeclaration | cursorDeclaration | typeDeclaration)*
    ;

variableDeclaration
    : IDENTIFIER dataType (NOT_NULL)? (DEFAULT expression)? SEMICOLON
    {
        addVariable($IDENTIFIER.getText());
        addSymbol($IDENTIFIER.getText(), "variable", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

constantDeclaration
    : IDENTIFIER CONSTANT dataType (NOT_NULL)? (DEFAULT expression)? SEMICOLON
    {
        addVariable($IDENTIFIER.getText());
        addSymbol($IDENTIFIER.getText(), "constant", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

cursorDeclaration
    : CURSOR IDENTIFIER (LPAREN parameterList RPAREN)? IS selectStatement SEMICOLON
    {
        addSymbol($IDENTIFIER.getText(), "cursor", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

typeDeclaration
    : TYPE IDENTIFIER IS recordType SEMICOLON
    | TYPE IDENTIFIER IS VARRAY LPAREN NUMBER_LITERAL RPAREN OF dataType SEMICOLON
    {
        addSymbol($IDENTIFIER.getText(), "type", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

recordType
    : RECORD LPAREN recordField (COMMA recordField)* RPAREN
    ;

recordField
    : IDENTIFIER dataType (NOT_NULL)?
    {
        addSymbol($IDENTIFIER.getText(), "record_field", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

// Data types
dataType
    : VARCHAR2 (LPAREN NUMBER_LITERAL RPAREN)?
    | VARCHAR (LPAREN NUMBER_LITERAL RPAREN)?
    | CHAR (LPAREN NUMBER_LITERAL RPAREN)?
    | NUMBER (LPAREN NUMBER_LITERAL (COMMA NUMBER_LITERAL)? RPAREN)?
    | INTEGER
    | DATE
    | TIMESTAMP
    | BOOLEAN
    | BLOB
    | CLOB
    | IDENTIFIER (ROWTYPE | TYPE_ATTR)?
    ;

// Executable section
executableSection
    : BEGIN statement* END
    ;

// Exception section
exceptionSection
    : EXCEPTION whenClause+
    ;

whenClause
    : WHEN (exceptionName | OTHERS) THEN statement*
    ;

exceptionName
    : IDENTIFIER
    {
        addSymbol($IDENTIFIER.getText(), "exception", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

// Statements
statement
    : assignmentStatement
    | sqlStatement
    | plsqlStatement
    | controlStatement
    | SEMICOLON
    ;

assignmentStatement
    : variable ASSIGN expression SEMICOLON
    ;

variable
    : IDENTIFIER
    {
        checkVariableExists($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    | IDENTIFIER DOT IDENTIFIER
    | IDENTIFIER LBRACKET expression RBRACKET
    ;

plsqlStatement
    : RETURN expression? SEMICOLON
    | EXIT (WHEN expression)? SEMICOLON
    | CONTINUE (WHEN expression)? SEMICOLON
    | GOTO IDENTIFIER SEMICOLON
    | procedureCall SEMICOLON
    ;

procedureCall
    : IDENTIFIER (LPAREN argumentList RPAREN)?
    {
        addSymbol($IDENTIFIER.getText(), "procedure_call", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

argumentList
    : expression (COMMA expression)*
    ;

controlStatement
    : ifStatement
    | caseStatement
    | loopStatement
    | forStatement
    | whileStatement
    ;

ifStatement
    : IF expression THEN statement* 
      (ELSIF expression THEN statement*)* 
      (ELSE statement*)? 
      END IF SEMICOLON
    ;

caseStatement
    : CASE expression?
      (WHEN expression THEN statement*)+
      (ELSE statement*)?
      END CASE SEMICOLON
    ;

loopStatement
    : LOOP statement* END LOOP SEMICOLON
    ;

forStatement
    : FOR IDENTIFIER IN (REVERSE)? expression DOTDOT expression LOOP statement* END LOOP SEMICOLON
    | FOR IDENTIFIER IN cursorName LOOP statement* END LOOP SEMICOLON
    {
        addSymbol($IDENTIFIER.getText(), "loop_variable", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

whileStatement
    : WHILE expression LOOP statement* END LOOP SEMICOLON
    ;

cursorName
    : IDENTIFIER
    {
        checkVariableExists($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

// SQL Statements
sqlStatement
    : selectStatement SEMICOLON?
    | insertStatement SEMICOLON?
    | updateStatement SEMICOLON?
    | deleteStatement SEMICOLON?
    ;

selectStatement
    : SELECT selectList FROM tableReference (whereClause)?
    ;

selectList
    : MULT
    | expression (COMMA expression)*
    ;

tableReference
    : IDENTIFIER
    {
        checkTableExists($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    | IDENTIFIER IDENTIFIER // table alias
    ;

whereClause
    : WHERE expression
    ;

insertStatement
    : INSERT INTO IDENTIFIER (LPAREN columnList RPAREN)? VALUES LPAREN valueList RPAREN
    | INSERT INTO IDENTIFIER (LPAREN columnList RPAREN)? selectStatement
    {
        checkTableExists($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

columnList
    : IDENTIFIER (COMMA IDENTIFIER)*
    ;

valueList
    : expression (COMMA expression)*
    ;

updateStatement
    : UPDATE IDENTIFIER SET assignmentList (whereClause)?
    {
        checkTableExists($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

assignmentList
    : columnAssignment (COMMA columnAssignment)*
    ;

columnAssignment
    : IDENTIFIER EQ expression
    ;

deleteStatement
    : DELETE FROM IDENTIFIER (whereClause)?
    {
        checkTableExists($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

// CREATE statements for other objects
createIndex
    : CREATE INDEX IDENTIFIER ON IDENTIFIER LPAREN columnList RPAREN SEMICOLON?
    {
        addSymbol($IDENTIFIER.getText(), "index", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

createView
    : CREATE VIEW IDENTIFIER AS selectStatement SEMICOLON?
    {
        addSymbol($IDENTIFIER.getText(), "view", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

createSequence
    : CREATE SEQUENCE IDENTIFIER (sequenceOption)* SEMICOLON?
    {
        addSymbol($IDENTIFIER.getText(), "sequence", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

sequenceOption
    : START WITH NUMBER_LITERAL
    | INCREMENT BY NUMBER_LITERAL
    | MAXVALUE NUMBER_LITERAL
    | MINVALUE NUMBER_LITERAL
    | CYCLE
    | NOCYCLE
    | CACHE NUMBER_LITERAL
    | NOCACHE
    ;

createTrigger
    : CREATE (OR REPLACE)? TRIGGER IDENTIFIER 
      (BEFORE | AFTER | INSTEAD OF) 
      triggerEvent ON IDENTIFIER
      (FOR EACH ROW)?
      (WHEN LPAREN expression RPAREN)?
      declarationSection? executableSection END IDENTIFIER? SEMICOLON?
    {
        addSymbol($IDENTIFIER.getText(), "trigger", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

triggerEvent
    : INSERT | UPDATE | DELETE
    | INSERT OR UPDATE
    | INSERT OR DELETE
    | UPDATE OR DELETE
    | INSERT OR UPDATE OR DELETE
    ;

// Expressions
expression
    : conditionalExpression
    ;

conditionalExpression
    : logicalOrExpression
    ;

logicalOrExpression
    : logicalAndExpression (OR logicalAndExpression)*
    ;

logicalAndExpression
    : relationalExpression (AND relationalExpression)*
    ;

relationalExpression
    : additiveExpression (relationalOperator additiveExpression)*
    | additiveExpression BETWEEN additiveExpression AND additiveExpression
    | additiveExpression NOT? IN LPAREN expression (COMMA expression)* RPAREN
    | additiveExpression IS NOT? NULL
    | additiveExpression NOT? LIKE additiveExpression
    | EXISTS LPAREN selectStatement RPAREN
    ;

relationalOperator
    : EQ | NE | LT | LE | GT | GE
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS | CONCAT) multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression ((MULT | DIV) unaryExpression)*
    ;

unaryExpression
    : primaryExpression
    | (PLUS | MINUS | NOT) unaryExpression
    ;

primaryExpression
    : literal
    | variable
    | functionCall
    | LPAREN expression RPAREN
    | LPAREN selectStatement RPAREN
    ;

functionCall
    : IDENTIFIER LPAREN argumentList? RPAREN
    {
        addSymbol($IDENTIFIER.getText(), "function_call", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

literal
    : NUMBER_LITERAL
    | STRING_LITERAL
    | TRUE
    | FALSE
    | NULL
    ;