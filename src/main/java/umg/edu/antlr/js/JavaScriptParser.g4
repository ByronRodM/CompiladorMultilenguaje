parser grammar JavaScriptParser;

options {
    tokenVocab = JavaScriptLexer;
}

@header {
    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;
}

@members {
    private SymbolTable symbolTable = new SymbolTable();
    private ErrorTable errorTable = new ErrorTable();
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
    
    private void checkVariableDeclaration(String varName, int line, int column) {
        if (declaredVariables.contains(varName)) {
            addError("Variable '" + varName + "' already declared", line, column, "SEMANTIC");
        } else {
            declaredVariables.add(varName);
        }
    }
    
    private void checkVariableUsage(String varName, int line, int column) {
        if (!declaredVariables.contains(varName)) {
            addError("Variable '" + varName + "' used before declaration", line, column, "SEMANTIC");
        }
    }
}

// Program structure
program: sourceElement* EOF;

sourceElement
    : statement
    | functionDeclaration
    | classDeclaration
    ;

// Statements
statement
    : block
    | variableStatement
    | expressionStatement
    | ifStatement
    | iterationStatement
    | continueStatement
    | breakStatement
    | returnStatement
    | switchStatement
    | throwStatement
    | tryStatement
    | debuggerStatement
    ;

block: LBRACE statement* RBRACE;

variableStatement
    : VAR variableDeclaration (COMMA variableDeclaration)* SEMICOLON?
    | LET variableDeclaration (COMMA variableDeclaration)* SEMICOLON?
    | CONST variableDeclaration (COMMA variableDeclaration)* SEMICOLON?
    ;

variableDeclaration
    : IDENTIFIER (ASSIGN assignmentExpression)?
    {
        checkVariableDeclaration($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
        addSymbol($IDENTIFIER.getText(), "variable", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

expressionStatement: expression SEMICOLON?;

ifStatement
    : IF LPAREN expression RPAREN statement (ELSE statement)?
    ;

iterationStatement
    : DO statement WHILE LPAREN expression RPAREN SEMICOLON?
    | WHILE LPAREN expression RPAREN statement
    | FOR LPAREN (variableStatement | expression SEMICOLON | SEMICOLON) 
          (expression SEMICOLON | SEMICOLON) expression? RPAREN statement
    | FOR LPAREN (VAR | LET | CONST) IDENTIFIER (IN | OF) expression RPAREN statement
    {
        addSymbol($IDENTIFIER.getText(), "iterator", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

continueStatement: CONTINUE IDENTIFIER? SEMICOLON?;
breakStatement: BREAK IDENTIFIER? SEMICOLON?;
returnStatement: RETURN expression? SEMICOLON?;

switchStatement
    : SWITCH LPAREN expression RPAREN LBRACE caseClause* defaultClause? caseClause* RBRACE
    ;

caseClause: CASE expression COLON statement*;
defaultClause: DEFAULT COLON statement*;

throwStatement: THROW expression SEMICOLON?;

tryStatement
    : TRY block (catchProduction finallyProduction? | finallyProduction)
    ;

catchProduction
    : CATCH LPAREN IDENTIFIER RPAREN block
    {
        addSymbol($IDENTIFIER.getText(), "exception", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

finallyProduction: FINALLY block;

debuggerStatement: DEBUGGER SEMICOLON?;

// Function declarations
functionDeclaration
    : FUNCTION IDENTIFIER LPAREN formalParameterList? RPAREN block
    {
        addSymbol($IDENTIFIER.getText(), "function", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    | ASYNC FUNCTION IDENTIFIER LPAREN formalParameterList? RPAREN block
    {
        addSymbol($IDENTIFIER.getText(), "async_function", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

formalParameterList
    : formalParameter (COMMA formalParameter)*
    ;

formalParameter
    : IDENTIFIER (ASSIGN assignmentExpression)?
    {
        addSymbol($IDENTIFIER.getText(), "parameter", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

// Class declarations
classDeclaration
    : CLASS IDENTIFIER (EXTENDS IDENTIFIER)? LBRACE classElement* RBRACE
    {
        addSymbol($IDENTIFIER.getText(), "class", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

classElement
    : methodDefinition
    | STATIC? propertyName ASSIGN assignmentExpression SEMICOLON?
    ;

methodDefinition
    : STATIC? ASYNC? propertyName LPAREN formalParameterList? RPAREN block
    {
        // Method name handling would need more complex logic for computed property names
    }
    ;

// Expressions
expression
    : assignmentExpression (COMMA assignmentExpression)*
    ;

assignmentExpression
    : conditionalExpression
    | arrowFunction
    | leftHandSideExpression assignmentOperator assignmentExpression
    ;

arrowFunction
    : IDENTIFIER ARROW assignmentExpression
    | LPAREN formalParameterList? RPAREN ARROW (assignmentExpression | block)
    ;

assignmentOperator
    : ASSIGN | MULT_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN
    | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | UNSIGNED_RIGHT_SHIFT_ASSIGN
    | BIT_AND_ASSIGN | BIT_XOR_ASSIGN | BIT_OR_ASSIGN | POWER_ASSIGN
    ;

conditionalExpression
    : binaryExpression (QUESTION assignmentExpression COLON assignmentExpression)?
    ;

binaryExpression
    : unaryExpression
    | binaryExpression (MULT | DIV | MOD) binaryExpression
    | binaryExpression (PLUS | MINUS) binaryExpression
    | binaryExpression (LEFT_SHIFT | RIGHT_SHIFT | UNSIGNED_RIGHT_SHIFT) binaryExpression
    | binaryExpression (LT | GT | LE | GE | INSTANCEOF | IN) binaryExpression
    | binaryExpression (EQ | NE | STRICT_EQ | STRICT_NE) binaryExpression
    | binaryExpression BIT_AND binaryExpression
    | binaryExpression BIT_XOR binaryExpression
    | binaryExpression BIT_OR binaryExpression
    | binaryExpression AND binaryExpression
    | binaryExpression OR binaryExpression
    | binaryExpression NULLISH_COALESCING binaryExpression
    ;

unaryExpression
    : postfixExpression
    | DELETE unaryExpression
    | VOID unaryExpression
    | TYPEOF unaryExpression
    | INCREMENT unaryExpression
    | DECREMENT unaryExpression
    | PLUS unaryExpression
    | MINUS unaryExpression
    | BIT_NOT unaryExpression
    | NOT unaryExpression
    | AWAIT unaryExpression
    ;

postfixExpression
    : leftHandSideExpression
    | leftHandSideExpression INCREMENT
    | leftHandSideExpression DECREMENT
    ;

leftHandSideExpression
    : newExpression
    | callExpression
    ;

newExpression
    : memberExpression
    | NEW newExpression
    ;

memberExpression
    : primaryExpression
    | memberExpression LBRACKET expression RBRACKET
    | memberExpression DOT IDENTIFIER
    | memberExpression OPTIONAL_CHAINING IDENTIFIER
    | NEW memberExpression arguments
    ;

callExpression
    : memberExpression arguments
    | callExpression arguments
    | callExpression LBRACKET expression RBRACKET
    | callExpression DOT IDENTIFIER
    | callExpression OPTIONAL_CHAINING IDENTIFIER
    ;

arguments: LPAREN argumentList? RPAREN;

argumentList: assignmentExpression (COMMA assignmentExpression)*;

primaryExpression
    : THIS
    | IDENTIFIER
    {
        checkVariableUsage($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    | literal
    | arrayLiteral
    | objectLiteral
    | LPAREN expression RPAREN
    | functionExpression
    ;

functionExpression
    : FUNCTION IDENTIFIER? LPAREN formalParameterList? RPAREN block
    | ASYNC FUNCTION IDENTIFIER? LPAREN formalParameterList? RPAREN block
    ;

arrayLiteral
    : LBRACKET (assignmentExpression (COMMA assignmentExpression)*)? RBRACKET
    ;

objectLiteral
    : LBRACE (propertyAssignment (COMMA propertyAssignment)*)? RBRACE
    ;

propertyAssignment
    : propertyName COLON assignmentExpression
    | propertyName LPAREN formalParameterList? RPAREN block
    ;

propertyName
    : IDENTIFIER
    | STRING_LITERAL
    | NUMBER_LITERAL
    | LBRACKET expression RBRACKET
    ;

literal
    : NULL
    | TRUE
    | FALSE
    | NUMBER_LITERAL
    | STRING_LITERAL
    | REGEX_LITERAL
    | templateLiteral
    ;

templateLiteral
    : TEMPLATE_STRING_START templateElement* TEMPLATE_STRING_END
    ;

templateElement
    : TEMPLATE_STRING_PART
    | TEMPLATE_EXPRESSION_START expression RBRACE
    ;