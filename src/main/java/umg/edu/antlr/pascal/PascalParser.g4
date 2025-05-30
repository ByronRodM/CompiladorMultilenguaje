parser grammar PascalParser;

options {
    tokenVocab = PascalLexer;
}

@header {
    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;
}

@members {
    private SymbolTable symbolTable = new SymbolTable();
    private ErrorTable errorTable = new ErrorTable();
    private Set<String> declaredIdentifiers = new HashSet<>();
    
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
    
    private void checkIdentifierDeclaration(String name, int line, int column) {
        if (declaredIdentifiers.contains(name)) {
            addError("Identifier '" + name + "' already declared", line, column, "SEMANTIC");
        } else {
            declaredIdentifiers.add(name);
        }
    }
    
    private void checkIdentifierUsage(String name, int line, int column) {
        if (!declaredIdentifiers.contains(name)) {
            addError("Identifier '" + name + "' not declared", line, column, "SEMANTIC");
        }
    }
}

// Program structure
program
    : PROGRAM IDENTIFIER SEMICOLON programBlock DOT
    {
        addSymbol($IDENTIFIER.getText(), "program", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

programBlock
    : declarationPart statementPart
    ;

declarationPart
    : (labelDeclaration | constantDeclaration | typeDeclaration | variableDeclaration | procedureDeclaration)*
    ;

// Declarations
labelDeclaration
    : LABEL labelList SEMICOLON
    ;

labelList
    : IDENTIFIER (COMMA IDENTIFIER)*
    {
        addSymbol($IDENTIFIER.getText(), "label", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

constantDeclaration
    : CONST constantDefinition (constantDefinition)*
    ;

constantDefinition
    : IDENTIFIER EQ constant SEMICOLON
    {
        checkIdentifierDeclaration($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
        addSymbol($IDENTIFIER.getText(), "constant", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

typeDeclaration
    : TYPE typeDefinition (typeDefinition)*
    ;

typeDefinition
    : IDENTIFIER EQ type SEMICOLON
    {
        checkIdentifierDeclaration($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
        addSymbol($IDENTIFIER.getText(), "type", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

variableDeclaration
    : VAR variableGroup (variableGroup)*
    ;

variableGroup
    : identifierList COLON type SEMICOLON
    ;

identifierList
    : IDENTIFIER (COMMA IDENTIFIER)*
    {
        checkIdentifierDeclaration($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
        addSymbol($IDENTIFIER.getText(), "variable", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

procedureDeclaration
    : procedureHeading SEMICOLON procedureBody SEMICOLON
    | functionHeading SEMICOLON functionBody SEMICOLON
    ;

procedureHeading
    : PROCEDURE IDENTIFIER (LPAREN formalParameterList RPAREN)?
    {
        checkIdentifierDeclaration($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
        addSymbol($IDENTIFIER.getText(), "procedure", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

functionHeading
    : FUNCTION IDENTIFIER (LPAREN formalParameterList RPAREN)? COLON resultType
    {
        checkIdentifierDeclaration($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
        addSymbol($IDENTIFIER.getText(), "function", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

resultType: IDENTIFIER;

formalParameterList
    : formalParameterSection (SEMICOLON formalParameterSection)*
    ;

formalParameterSection
    : parameterGroup
    | VAR parameterGroup
    ;

parameterGroup
    : identifierList COLON parameterType
    ;

parameterType
    : IDENTIFIER
    | ARRAY LBRACKET indexType RBRACKET OF IDENTIFIER
    ;

indexType: ordinalType;

procedureBody: block;
functionBody: block;

// Types
type
    : simpleType
    | structuredType
    | pointerType
    ;

simpleType
    : ordinalType
    | realType
    ;

ordinalType
    : INTEGER_TYPE
    | BOOLEAN_TYPE
    | CHAR_TYPE
    | enumType
    | subrangeType
    | IDENTIFIER
    ;

enumType
    : LPAREN identifierList RPAREN
    ;

subrangeType
    : constant DOTDOT constant
    ;

realType: REAL_TYPE;

structuredType
    : arrayType
    | recordType
    | setType
    | fileType
    ;

arrayType
    : ARRAY LBRACKET indexType (COMMA indexType)* RBRACKET OF componentType
    ;

componentType: type;

recordType
    : RECORD fieldList END
    ;

fieldList
    : fixedPart (SEMICOLON variantPart)?
    | variantPart
    ;

fixedPart
    : recordSection (SEMICOLON recordSection)*
    ;

recordSection
    : identifierList COLON type
    ;

variantPart
    : CASE tag OF variant (SEMICOLON variant)*
    ;

tag
    : IDENTIFIER COLON IDENTIFIER
    | IDENTIFIER
    ;

variant
    : caseLabelList COLON LPAREN fieldList RPAREN
    ;

caseLabelList
    : caseLabel (COMMA caseLabel)*
    ;

caseLabel
    : constant
    | constant DOTDOT constant
    ;

setType
    : SET OF ordinalType
    ;

fileType
    : FILE OF type
    | FILE
    ;

pointerType
    : POINTER_OP IDENTIFIER
    ;

// Statements
statementPart
    : compoundStatement
    ;

block
    : declarationPart statementPart
    ;

statement
    : simpleStatement
    | structuredStatement
    ;

simpleStatement
    : assignmentStatement
    | procedureCall
    | gotoStatement
    | emptyStatement
    ;

assignmentStatement
    : variable ASSIGN expression
    ;

variable
    : IDENTIFIER
    {
        checkIdentifierUsage($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    | variable LBRACKET expression (COMMA expression)* RBRACKET
    | variable DOT IDENTIFIER
    | variable POINTER_OP
    ;

procedureCall
    : IDENTIFIER (LPAREN actualParameterList RPAREN)?
    {
        checkIdentifierUsage($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

actualParameterList
    : actualParameter (COMMA actualParameter)*
    ;

actualParameter
    : expression
    ;

gotoStatement
    : GOTO IDENTIFIER
    {
        checkIdentifierUsage($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

emptyStatement: ;

structuredStatement
    : compoundStatement
    | conditionalStatement
    | repetitiveStatement
    | withStatement
    ;

compoundStatement
    : BEGIN statementList END
    ;

statementList
    : statement (SEMICOLON statement)*
    ;

conditionalStatement
    : ifStatement
    | caseStatement
    ;

ifStatement
    : IF expression THEN statement (ELSE statement)?
    ;

caseStatement
    : CASE expression OF caseListElement (SEMICOLON caseListElement)* (SEMICOLON ELSE statementList)? END
    ;

caseListElement
    : caseLabelList COLON statement
    ;

repetitiveStatement
    : whileStatement
    | repeatStatement
    | forStatement
    ;

whileStatement
    : WHILE expression DO statement
    ;

repeatStatement
    : REPEAT statementList UNTIL expression
    ;

forStatement
    : FOR IDENTIFIER ASSIGN forList DO statement
    {
        checkIdentifierUsage($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

forList
    : initialValue (TO | DOWNTO) finalValue
    ;

initialValue: expression;
finalValue: expression;

withStatement
    : WITH recordVariableList DO statement
    ;

recordVariableList
    : variable (COMMA variable)*
    ;

// Expressions
expression
    : simpleExpression (relationalOperator simpleExpression)?
    ;

relationalOperator
    : EQ | NE | LT | LE | GT | GE | IN
    ;

simpleExpression
    : (PLUS | MINUS)? term (addingOperator term)*
    ;

addingOperator
    : PLUS | MINUS | OR
    ;

term
    : factor (multiplyingOperator factor)*
    ;

multiplyingOperator
    : MULT | DIVIDE | DIV | MOD | AND
    ;

factor
    : variable
    | unsignedConstant
    | LPAREN expression RPAREN
    | functionCall
    | set
    | NOT factor
    ;

functionCall
    : IDENTIFIER LPAREN actualParameterList RPAREN
    {
        checkIdentifierUsage($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

set
    : LBRACKET elementList RBRACKET
    | LBRACKET RBRACKET
    ;

elementList
    : element (COMMA element)*
    ;

element
    : expression (DOTDOT expression)?
    ;

// Constants
constant
    : unsignedConstant
    | PLUS unsignedConstant
    | MINUS unsignedConstant
    | IDENTIFIER
    {
        checkIdentifierUsage($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

unsignedConstant
    : unsignedNumber
    | STRING_LITERAL
    | CHAR_LITERAL
    | NIL
    | TRUE
    | FALSE
    ;

unsignedNumber
    : INTEGER_LITERAL
    | REAL_LITERAL
    ;