lexer grammar JavaScriptLexer;

// Keywords
BREAK: 'break';
CASE: 'case';
CATCH: 'catch';
CLASS: 'class';
CONST: 'const';
CONTINUE: 'continue';
DEBUGGER: 'debugger';
DEFAULT: 'default';
DELETE: 'delete';
DO: 'do';
ELSE: 'else';
EXPORT: 'export';
EXTENDS: 'extends';
FINALLY: 'finally';
FOR: 'for';
FUNCTION: 'function';
IF: 'if';
IMPORT: 'import';
IN: 'in';
INSTANCEOF: 'instanceof';
LET: 'let';
NEW: 'new';
RETURN: 'return';
SUPER: 'super';
SWITCH: 'switch';
THIS: 'this';
THROW: 'throw';
TRY: 'try';
TYPEOF: 'typeof';
VAR: 'var';
VOID: 'void';
WHILE: 'while';
WITH: 'with';
YIELD: 'yield';

// ES6+ Keywords
ASYNC: 'async';
AWAIT: 'await';
FROM: 'from';
OF: 'of';
STATIC: 'static';

// Literals
TRUE: 'true';
FALSE: 'false';
NULL: 'null';
UNDEFINED: 'undefined';

// Operators
ASSIGN: '=';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULT_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';
POWER_ASSIGN: '**=';
LEFT_SHIFT_ASSIGN: '<<=';
RIGHT_SHIFT_ASSIGN: '>>=';
UNSIGNED_RIGHT_SHIFT_ASSIGN: '>>>=';
BIT_AND_ASSIGN: '&=';
BIT_OR_ASSIGN: '|=';
BIT_XOR_ASSIGN: '^=';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
POWER: '**';
INCREMENT: '++';
DECREMENT: '--';

EQ: '==';
STRICT_EQ: '===';
NE: '!=';
STRICT_NE: '!==';
LT: '<';
LE: '<=';
GT: '>';
GE: '>=';

AND: '&&';
OR: '||';
NOT: '!';

BIT_AND: '&';
BIT_OR: '|';
BIT_XOR: '^';
BIT_NOT: '~';
LEFT_SHIFT: '<<';
RIGHT_SHIFT: '>>';
UNSIGNED_RIGHT_SHIFT: '>>>';

// Arrow function
ARROW: '=>';

// Template literals
TEMPLATE_STRING_START: '`' -> pushMode(TEMPLATE_MODE);

// Punctuation
SEMICOLON: ';';
COMMA: ',';
DOT: '.';
QUESTION: '?';
COLON: ':';
OPTIONAL_CHAINING: '?.';
NULLISH_COALESCING: '??';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';

// Literals
NUMBER_LITERAL
    : [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?
    | '0x' [0-9a-fA-F]+
    | '0b' [01]+
    | '0o' [0-7]+
    ;

STRING_LITERAL
    : '"' (~["\\\r\n] | EscapeSequence)* '"'
    | '\'' (~['\\\r\n] | EscapeSequence)* '\''
    ;

REGEX_LITERAL
    : '/' (~[/\\\r\n] | '\\' .)+ '/' [gimsuvy]*
    ;

fragment EscapeSequence
    : '\\' ['"\\bfnrtv/]
    | '\\u' HexDigit HexDigit HexDigit HexDigit
    | '\\u{' HexDigit+ '}'
    | '\\x' HexDigit HexDigit
    | '\\' [0-7] [0-7]?
    | '\\' [0-3] [0-7] [0-7]
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;

// Identifiers
IDENTIFIER: [a-zA-Z_$][a-zA-Z_$0-9]*;

// Comments
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Whitespace
WS: [ \t\r\n]+ -> skip;

// Template literal mode
mode TEMPLATE_MODE;

TEMPLATE_STRING_END: '`' -> popMode;
TEMPLATE_EXPRESSION_START: '${' -> pushMode(DEFAULT_MODE);
TEMPLATE_STRING_PART: (~[`$] | '$' ~[{])+; 