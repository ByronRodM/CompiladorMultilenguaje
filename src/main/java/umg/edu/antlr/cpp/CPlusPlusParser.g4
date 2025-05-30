parser grammar CPlusPlusParser;

options {
    tokenVocab = CPlusPlusLexer;
}

@header {
    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;
}

@members {
    private SymbolTable symbolTable = new SymbolTable();
    private ErrorTable errorTable = new ErrorTable();
    
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
}

// Program structure
program: declaration* EOF;

declaration
    : functionDeclaration
    | variableDeclaration
    | classDeclaration
    | namespaceDeclaration
    | usingDeclaration
    ;

// Function declarations
functionDeclaration
    : type IDENTIFIER LPAREN parameterList? RPAREN compoundStatement
    {
        addSymbol($IDENTIFIER.getText(), "function", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : type IDENTIFIER
    {
        addSymbol($IDENTIFIER.getText(), "parameter", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

// Variable declarations
variableDeclaration
    : type variableDeclarator (COMMA variableDeclarator)* SEMICOLON
    ;

variableDeclarator
    : IDENTIFIER (ASSIGN expression)?
    {
        addSymbol($IDENTIFIER.getText(), "variable", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

// Class declarations
classDeclaration
    : CLASS IDENTIFIER (COLON accessSpecifier? IDENTIFIER)? LBRACE classBody RBRACE SEMICOLON?
    {
        addSymbol($IDENTIFIER.getText(), "class", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

classBody
    : classMember*
    ;

classMember
    : accessSpecifier? (methodDeclaration | variableDeclaration)
    ;

methodDeclaration
    : type IDENTIFIER LPAREN parameterList? RPAREN compoundStatement
    {
        addSymbol($IDENTIFIER.getText(), "method", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

accessSpecifier
    : PRIVATE
    | PUBLIC
    | PROTECTED
    ;

// Namespace declarations
namespaceDeclaration
    : NAMESPACE IDENTIFIER LBRACE declaration* RBRACE
    {
        addSymbol($IDENTIFIER.getText(), "namespace", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

usingDeclaration
    : USING NAMESPACE IDENTIFIER SEMICOLON
    | USING IDENTIFIER SEMICOLON
    ;

// Types
type
    : primitiveType pointer?
    | classType pointer?
    ;

primitiveType
    : VOID | BOOL | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE
    | SIGNED | UNSIGNED
    ;

classType
    : IDENTIFIER (SCOPE IDENTIFIER)*
    ;

pointer
    : MULT+
    ;

// Statements
statement
    : compoundStatement
    | expressionStatement
    | selectionStatement
    | iterationStatement
    | jumpStatement
    | declarationStatement
    ;

compoundStatement
    : LBRACE statement* RBRACE
    ;

expressionStatement
    : expression? SEMICOLON
    ;

declarationStatement
    : variableDeclaration
    ;

selectionStatement
    : IF LPAREN expression RPAREN statement (ELSE statement)?
    | SWITCH LPAREN expression RPAREN LBRACE switchSection* RBRACE
    ;

switchSection
    : (CASE expression | DEFAULT) COLON statement*
    ;

iterationStatement
    : WHILE LPAREN expression RPAREN statement
    | FOR LPAREN (variableDeclaration | expressionStatement) expression? SEMICOLON expression? RPAREN statement
    | DO statement WHILE LPAREN expression RPAREN SEMICOLON
    ;

jumpStatement
    : BREAK SEMICOLON
    | CONTINUE SEMICOLON
    | RETURN expression? SEMICOLON
    | GOTO IDENTIFIER SEMICOLON
    ;

// Expressions
expression
    : assignmentExpression
    ;

assignmentExpression
    : conditionalExpression
    | unaryExpression assignmentOperator assignmentExpression
    ;

assignmentOperator
    : ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | MULT_ASSIGN | DIV_ASSIGN | MOD_ASSIGN
    ;

conditionalExpression
    : logicalOrExpression (QUESTION expression COLON conditionalExpression)?
    ;

logicalOrExpression
    : logicalAndExpression (OR logicalAndExpression)*
    ;

logicalAndExpression
    : equalityExpression (AND equalityExpression)*
    ;

equalityExpression
    : relationalExpression ((EQ | NE) relationalExpression)*
    ;

relationalExpression
    : shiftExpression ((LT | GT | LE | GE) shiftExpression)*
    ;

shiftExpression
    : additiveExpression ((LEFT_SHIFT | RIGHT_SHIFT) additiveExpression)*
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression ((MULT | DIV | MOD) unaryExpression)*
    ;

unaryExpression
    : postfixExpression
    | INCREMENT unaryExpression
    | DECREMENT unaryExpression
    | unaryOperator unaryExpression
    | SIZEOF unaryExpression
    | SIZEOF LPAREN type RPAREN
    ;

unaryOperator
    : BIT_AND | MULT | PLUS | MINUS | BIT_NOT | NOT
    ;

postfixExpression
    : primaryExpression postfixSuffix*
    ;

postfixSuffix
    : LBRACKET expression RBRACKET
    | LPAREN argumentList? RPAREN
    | DOT IDENTIFIER
    | ARROW IDENTIFIER
    | INCREMENT
    | DECREMENT
    ;

primaryExpression
    : IDENTIFIER
    | literal
    | LPAREN expression RPAREN
    | THIS
    ;

argumentList
    : expression (COMMA expression)*
    ;

literal
    : INTEGER_LITERAL
    | FLOAT_LITERAL
    | CHARACTER_LITERAL
    | STRING_LITERAL
    ; 