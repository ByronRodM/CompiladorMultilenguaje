parser grammar PythonParser;

options {
    tokenVocab = PythonLexer;
}

@header {
    import java.util.*;
    import umg.edu.symboltable.*;
    import umg.edu.error.*;
}

@members {
    private SymbolTable symbolTable = new SymbolTable();
    private ErrorTable errorTable = new ErrorTable();
    private Set<String> definedVariables = new HashSet<>();
    private Set<String> importedModules = new HashSet<>();
    
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
    
    private void checkVariableUsage(String varName, int line, int column) {
        if (!definedVariables.contains(varName) && !importedModules.contains(varName)) {
            addError("Variable '" + varName + "' is not defined", line, column, "SEMANTIC");
        }
    }
    
    private void defineVariable(String varName) {
        definedVariables.add(varName);
    }
    
    private void addImport(String moduleName) {
        importedModules.add(moduleName);
    }
}

// Program structure
file_input: (statement)* EOF;

// Statements
statement
    : simple_stmt
    | compound_stmt
    ;

simple_stmt
    : small_stmt (SEMICOLON small_stmt)* SEMICOLON?
    ;

small_stmt
    : expr_stmt
    | del_stmt
    | pass_stmt
    | flow_stmt
    | import_stmt
    | global_stmt
    | nonlocal_stmt
    | assert_stmt
    ;

expr_stmt
    : testlist_star_expr (annassign | augassign (yield_expr | testlist) | (ASSIGN (yield_expr | testlist_star_expr))*)?
    ;

annassign
    : COLON test (ASSIGN (yield_expr | testlist))?
    ;

testlist_star_expr
    : (test | star_expr) (COMMA (test | star_expr))* COMMA?
    ;

augassign
    : PLUS_ASSIGN | MINUS_ASSIGN | MULT_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | BIT_AND_ASSIGN 
    | BIT_OR_ASSIGN | BIT_XOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN 
    | POWER_ASSIGN | FLOOR_DIV_ASSIGN
    ;

del_stmt: DEL exprlist;

pass_stmt: PASS;

flow_stmt
    : break_stmt
    | continue_stmt
    | return_stmt
    | raise_stmt
    | yield_stmt
    ;

break_stmt: BREAK;
continue_stmt: CONTINUE;
return_stmt: RETURN testlist?;
yield_stmt: yield_expr;
raise_stmt: RAISE (test (FROM test)?)?;

import_stmt
    : import_name
    | import_from
    ;

import_name
    : IMPORT dotted_as_names
    ;

import_from
    : FROM (DOT* dotted_name | DOT+) IMPORT (MULT | LPAREN import_as_names RPAREN | import_as_names)
    ;

import_as_name
    : IDENTIFIER (AS IDENTIFIER)?
    {
        addImport($IDENTIFIER.getText());
        addSymbol($IDENTIFIER.getText(), "import", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

dotted_as_name
    : dotted_name (AS IDENTIFIER)?
    {
        if ($AS != null) {
            addImport($IDENTIFIER.getText());
            addSymbol($IDENTIFIER.getText(), "import_alias", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
        }
    }
    ;

import_as_names
    : import_as_name (COMMA import_as_name)* COMMA?
    ;

dotted_as_names
    : dotted_as_name (COMMA dotted_as_name)*
    ;

dotted_name
    : IDENTIFIER (DOT IDENTIFIER)*
    {
        addImport($IDENTIFIER.getText());
        addSymbol($IDENTIFIER.getText(), "module", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

global_stmt
    : GLOBAL IDENTIFIER (COMMA IDENTIFIER)*
    {
        defineVariable($IDENTIFIER.getText());
        addSymbol($IDENTIFIER.getText(), "global", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

nonlocal_stmt
    : NONLOCAL IDENTIFIER (COMMA IDENTIFIER)*
    {
        addSymbol($IDENTIFIER.getText(), "nonlocal", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

assert_stmt
    : ASSERT test (COMMA test)?
    ;

compound_stmt
    : if_stmt
    | while_stmt
    | for_stmt
    | try_stmt
    | with_stmt
    | funcdef
    | classdef
    | decorated
    | async_stmt
    ;

async_stmt
    : ASYNC (funcdef | with_stmt | for_stmt)
    ;

if_stmt
    : IF test COLON suite (ELIF test COLON suite)* (ELSE COLON suite)?
    ;

while_stmt
    : WHILE test COLON suite (ELSE COLON suite)?
    ;

for_stmt
    : FOR exprlist IN testlist COLON suite (ELSE COLON suite)?
    ;

try_stmt
    : TRY COLON suite ((except_clause COLON suite)+ (ELSE COLON suite)? (FINALLY COLON suite)? | FINALLY COLON suite)
    ;

with_stmt
    : WITH with_item (COMMA with_item)* COLON suite
    ;

with_item
    : test (AS expr)?
    ;

except_clause
    : EXCEPT (test (AS IDENTIFIER)?)?
    {
        if ($IDENTIFIER != null) {
            defineVariable($IDENTIFIER.getText());
            addSymbol($IDENTIFIER.getText(), "exception", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
        }
    }
    ;

suite
    : simple_stmt
    | COLON (statement)+
    ;

// Tests and expressions
test: or_test (IF or_test ELSE test)? | lambdef;

test_nocond: or_test | lambdef_nocond;

lambdef: LAMBDA varargslist? COLON test;
lambdef_nocond: LAMBDA varargslist? COLON test_nocond;

or_test: and_test (OR and_test)*;
and_test: not_test (AND not_test)*;
not_test: NOT not_test | comparison;

comparison: expr (comp_op expr)*;

comp_op
    : LT | GT | EQ | GE | LE | NE | IN | NOT IN | IS | IS NOT
    ;

star_expr: MULT expr;

expr: xor_expr (BIT_OR xor_expr)*;
xor_expr: and_expr (BIT_XOR and_expr)*;
and_expr: shift_expr (BIT_AND shift_expr)*;
shift_expr: arith_expr ((LEFT_SHIFT | RIGHT_SHIFT) arith_expr)*;
arith_expr: term ((PLUS | MINUS) term)*;
term: factor ((MULT | AT | DIV | MOD | FLOOR_DIV) factor)*;
factor: (PLUS | MINUS | BIT_NOT) factor | power;
power: atom_expr (POWER factor)?;

atom_expr: AWAIT? atom trailer*;

atom
    : LPAREN (yield_expr | testlist_comp)? RPAREN
    | LBRACKET listmaker? RBRACKET
    | LBRACE dictorsetmaker? RBRACE
    | IDENTIFIER
    {
        checkVariableUsage($IDENTIFIER.getText(), $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    | number
    | string+
    | ELLIPSIS
    | NONE
    | TRUE
    | FALSE
    ;

testlist_comp: (test | star_expr) (comp_for | (COMMA (test | star_expr))* COMMA?);

trailer
    : LPAREN arglist? RPAREN
    | LBRACKET subscriptlist RBRACKET
    | DOT IDENTIFIER
    ;

subscriptlist: subscript (COMMA subscript)* COMMA?;

subscript
    : test
    | test? COLON test? sliceop?
    ;

sliceop: COLON test?;

exprlist: (expr | star_expr) (COMMA (expr | star_expr))* COMMA?;

testlist: test (COMMA test)* COMMA?;

dictorsetmaker
    : ((test COLON test | POWER expr) (comp_for | (COMMA (test COLON test | POWER expr))* COMMA?))
    | ((test | star_expr) (comp_for | (COMMA (test | star_expr))* COMMA?))
    ;

listmaker: (test | star_expr) (comp_for | (COMMA (test | star_expr))* COMMA?);

classdef
    : CLASS IDENTIFIER (LPAREN arglist? RPAREN)? COLON suite
    {
        defineVariable($IDENTIFIER.getText());
        addSymbol($IDENTIFIER.getText(), "class", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

arglist: argument (COMMA argument)* COMMA?;

argument
    : test comp_for?
    | test ASSIGN test
    | POWER test
    | MULT test
    ;

comp_iter: comp_for | comp_if;
comp_for: ASYNC? FOR exprlist IN or_test comp_iter?;
comp_if: IF test_nocond comp_iter?;

yield_expr: YIELD yield_arg?;
yield_arg: FROM test | testlist;

// Function definition
funcdef
    : DEF IDENTIFIER parameters (ARROW test)? COLON suite
    {
        defineVariable($IDENTIFIER.getText());
        addSymbol($IDENTIFIER.getText(), "function", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

parameters: LPAREN typedargslist? RPAREN;

typedargslist
    : (tfpdef (ASSIGN test)? (COMMA tfpdef (ASSIGN test)?)* (COMMA (MULT tfpdef (COMMA tfpdef (ASSIGN test)?)* (COMMA (POWER tfpdef COMMA?)?)? | POWER tfpdef COMMA?)?)?
    | MULT tfpdef (COMMA tfpdef (ASSIGN test)?)* (COMMA (POWER tfpdef COMMA?)?)?
    | POWER tfpdef COMMA?)
    ;

tfpdef
    : IDENTIFIER (COLON test)?
    {
        defineVariable($IDENTIFIER.getText());
        addSymbol($IDENTIFIER.getText(), "parameter", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

varargslist
    : (vfpdef (ASSIGN test)? (COMMA vfpdef (ASSIGN test)?)* (COMMA (MULT vfpdef? (COMMA vfpdef (ASSIGN test)?)* (COMMA (POWER vfpdef COMMA?)?)? | POWER vfpdef COMMA?)?)?
    | MULT vfpdef? (COMMA vfpdef (ASSIGN test)?)* (COMMA (POWER vfpdef COMMA?)?)?
    | POWER vfpdef COMMA?)
    ;

vfpdef
    : IDENTIFIER
    {
        defineVariable($IDENTIFIER.getText());
        addSymbol($IDENTIFIER.getText(), "parameter", $IDENTIFIER.getLine(), $IDENTIFIER.getCharPositionInLine());
    }
    ;

// Decorators
decorated: decorators (classdef | funcdef | async_funcdef);
async_funcdef: ASYNC funcdef;
decorators: decorator+;
decorator: AT dotted_name (LPAREN arglist? RPAREN)?;

// Literals
number
    : INTEGER_LITERAL
    | FLOAT_LITERAL
    | COMPLEX_LITERAL
    ;

string
    : STRING_LITERAL
    | FSTRING_START fstring_middle* FSTRING_END
    ;

fstring_middle
    : FSTRING_TEXT
    | FSTRING_LBRACE test RBRACE
    ;