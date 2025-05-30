lexer grammar PythonLexer;

// Keywords
AND: 'and';
AS: 'as';
ASSERT: 'assert';
BREAK: 'break';
CLASS: 'class';
CONTINUE: 'continue';
DEF: 'def';
DEL: 'del';
ELIF: 'elif';
ELSE: 'else';
EXCEPT: 'except';
FINALLY: 'finally';
FOR: 'for';
FROM: 'from';
GLOBAL: 'global';
IF: 'if';
IMPORT: 'import';
IN: 'in';
IS: 'is';
LAMBDA: 'lambda';
NONLOCAL: 'nonlocal';
NOT: 'not';
OR: 'or';
PASS: 'pass';
RAISE: 'raise';
RETURN: 'return';
TRY: 'try';
WHILE: 'while';
WITH: 'with';
YIELD: 'yield';

// Python 3 specific keywords
ASYNC: 'async';
AWAIT: 'await';

// Boolean literals
TRUE: 'True';
FALSE: 'False';
NONE: 'None';

// Operators
ASSIGN: '=';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULT_ASSIGN: '*=';
DIV_ASSIGN: '/=';
FLOOR_DIV_ASSIGN: '//=';
MOD_ASSIGN: '%=';
POWER_ASSIGN: '**=';
BIT_AND_ASSIGN: '&=';
BIT_OR_ASSIGN: '|=';
BIT_XOR_ASSIGN: '^=';
LEFT_SHIFT_ASSIGN: '<<=';
RIGHT_SHIFT_ASSIGN: '>>=';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
FLOOR_DIV: '//';
MOD: '%';
POWER: '**';

EQ: '==';
NE: '!=';
LT: '<';
LE: '<=';
GT: '>';
GE: '>=';

BIT_AND: '&';
BIT_OR: '|';
BIT_XOR: '^';
BIT_NOT: '~';
LEFT_SHIFT: '<<';
RIGHT_SHIFT: '>>';

ARROW: '->';

// Delimiters
SEMICOLON: ';';
COMMA: ',';
DOT: '.';
COLON: ':';
ELLIPSIS: '...';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';

AT: '@';

// String prefixes
STRING_PREFIX: [rRuUbBfF]+;

// Literals
INTEGER_LITERAL
    : [0-9]+
    | '0x' [0-9a-fA-F]+
    | '0o' [0-7]+
    | '0b' [01]+
    ;

FLOAT_LITERAL
    : [0-9]+ '.' [0-9]* ([eE] [+-]? [0-9]+)?
    | [0-9]* '.' [0-9]+ ([eE] [+-]? [0-9]+)?
    | [0-9]+ [eE] [+-]? [0-9]+
    ;

COMPLEX_LITERAL
    : (INTEGER_LITERAL | FLOAT_LITERAL) [jJ]
    ;

STRING_LITERAL
    : STRING_PREFIX? (SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | TRIPLE_QUOTE_STRING)
    ;

fragment SINGLE_QUOTE_STRING
    : '\'' (~['\\\r\n] | EscapeSequence)* '\''
    ;

fragment DOUBLE_QUOTE_STRING
    : '"' (~["\\\r\n] | EscapeSequence)* '"'
    ;

fragment TRIPLE_QUOTE_STRING
    : '\'\'\'' .*? '\'\'\''
    | '"""' .*? '"""'
    ;

fragment EscapeSequence
    : '\\' ['"\\abfnrtv]
    | '\\' [0-7] [0-7]? [0-7]?
    | '\\x' HexDigit HexDigit
    | '\\u' HexDigit HexDigit HexDigit HexDigit
    | '\\U' HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit
    | '\\N{' (~[}])+ '}'
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;

// Formatted string literals (f-strings)
FSTRING_START: [fF] ('\'' | '"' | '\'\'\'' | '"""') -> pushMode(FSTRING_MODE);

// Identifiers
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

// Comments
COMMENT: '#' ~[\r\n]* -> skip;

// Newlines and indentation
NEWLINE: '\r'? '\n' -> skip;
WS: [ \t]+ -> skip;

// Indentation tokens (simplified for basic parsing)
INDENT: '    ' -> skip;
DEDENT: '    ' -> skip;

// F-string mode
mode FSTRING_MODE;

FSTRING_END: ('\'' | '"' | '\'\'\'' | '"""') -> popMode;
FSTRING_LBRACE: '{' -> pushMode(DEFAULT_MODE);
FSTRING_TEXT: (~['"{}])+ ; 