lexer grammar PascalLexer;

// Keywords
PROGRAM: 'program' | 'PROGRAM';
VAR: 'var' | 'VAR';
CONST: 'const' | 'CONST';
TYPE: 'type' | 'TYPE';
PROCEDURE: 'procedure' | 'PROCEDURE';
FUNCTION: 'function' | 'FUNCTION';
BEGIN: 'begin' | 'BEGIN';
END: 'end' | 'END';
IF: 'if' | 'IF';
THEN: 'then' | 'THEN';
ELSE: 'else' | 'ELSE';
WHILE: 'while' | 'WHILE';
DO: 'do' | 'DO';
FOR: 'for' | 'FOR';
TO: 'to' | 'TO';
DOWNTO: 'downto' | 'DOWNTO';
REPEAT: 'repeat' | 'REPEAT';
UNTIL: 'until' | 'UNTIL';
CASE: 'case' | 'CASE';
OF: 'of' | 'OF';
WITH: 'with' | 'WITH';
GOTO: 'goto' | 'GOTO';
LABEL: 'label' | 'LABEL';

// Data types
INTEGER_TYPE: 'integer' | 'INTEGER';
REAL_TYPE: 'real' | 'REAL';
BOOLEAN_TYPE: 'boolean' | 'BOOLEAN';
CHAR_TYPE: 'char' | 'CHAR';
STRING_TYPE: 'string' | 'STRING';
ARRAY: 'array' | 'ARRAY';
RECORD: 'record' | 'RECORD';
SET: 'set' | 'SET';
FILE: 'file' | 'FILE';
POINTER: 'pointer' | 'POINTER';

// Boolean literals
TRUE: 'true' | 'TRUE';
FALSE: 'false' | 'FALSE';

// Special keywords
NIL: 'nil' | 'NIL';
AND: 'and' | 'AND';
OR: 'or' | 'OR';
NOT: 'not' | 'NOT';
DIV: 'div' | 'DIV';
MOD: 'mod' | 'MOD';
IN: 'in' | 'IN';

// Operators
ASSIGN: ':=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';
EQ: '=';
NE: '<>';
LT: '<';
LE: '<=';
GT: '>';
GE: '>=';

// Delimiters
SEMICOLON: ';';
COMMA: ',';
DOT: '.';
DOTDOT: '..';
COLON: ':';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
POINTER_OP: '^';

// Literals
INTEGER_LITERAL: [0-9]+;
REAL_LITERAL: [0-9]+ '.' [0-9]+ ([eE] [+-]? [0-9]+)?;
STRING_LITERAL: '\'' (~['\r\n] | '\'\'')* '\'';
CHAR_LITERAL: '\'' (~['\r\n] | '\'\'') '\'';

// Identifiers
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

// Comments
COMMENT1: '(*' .*? '*)' -> skip;
COMMENT2: '{' .*? '}' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;

// Whitespace
WS: [ \t\r\n]+ -> skip; 