lexer grammar CPlusPlusLexer;

// Keywords
AUTO: 'auto';
BREAK: 'break';
CASE: 'case';
CHAR: 'char';
CONST: 'const';
CONTINUE: 'continue';
DEFAULT: 'default';
DO: 'do';
DOUBLE: 'double';
ELSE: 'else';
ENUM: 'enum';
EXTERN: 'extern';
FLOAT: 'float';
FOR: 'for';
GOTO: 'goto';
IF: 'if';
INT: 'int';
LONG: 'long';
REGISTER: 'register';
RETURN: 'return';
SHORT: 'short';
SIGNED: 'signed';
SIZEOF: 'sizeof';
STATIC: 'static';
STRUCT: 'struct';
SWITCH: 'switch';
TYPEDEF: 'typedef';
UNION: 'union';
UNSIGNED: 'unsigned';
VOID: 'void';
VOLATILE: 'volatile';
WHILE: 'while';

// C++ specific keywords
BOOL: 'bool';
CLASS: 'class';
NAMESPACE: 'namespace';
NEW: 'new';
DELETE: 'delete';
PRIVATE: 'private';
PUBLIC: 'public';
PROTECTED: 'protected';
VIRTUAL: 'virtual';
THIS: 'this';
TRY: 'try';
CATCH: 'catch';
THROW: 'throw';
TEMPLATE: 'template';
TYPENAME: 'typename';
USING: 'using';
INLINE: 'inline';
FRIEND: 'friend';
OPERATOR: 'operator';

// Operators
ASSIGN: '=';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULT_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
INCREMENT: '++';
DECREMENT: '--';

EQ: '==';
NE: '!=';
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

// Delimiters
SEMICOLON: ';';
COMMA: ',';
DOT: '.';
ARROW: '->';
SCOPE: '::';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';

QUESTION: '?';
COLON: ':';

// Literals
INTEGER_LITERAL: [0-9]+;
FLOAT_LITERAL: [0-9]*'.'[0-9]+ | [0-9]+'.'[0-9]*;
CHARACTER_LITERAL: '\'' (~['\\\r\n] | EscapeSequence) '\'';
STRING_LITERAL: '"' (~["\\\r\n] | EscapeSequence)* '"';

fragment EscapeSequence
    : '\\' ['"?abfnrtv\\]
    | '\\' [0-3]? [0-7]? [0-7]
    | '\\x' HexDigit+
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;

// Identifiers
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

// Preprocessor directives
PREPROCESSOR: '#' ~[\r\n]* -> skip;

// Comments
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Whitespace
WS: [ \t\r\n]+ -> skip; 