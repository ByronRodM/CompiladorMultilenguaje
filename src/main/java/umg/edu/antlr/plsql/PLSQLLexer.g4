lexer grammar PLSQLLexer;

// PL/SQL Block structure keywords
DECLARE: 'declare' | 'DECLARE';
BEGIN: 'begin' | 'BEGIN';
END: 'end' | 'END';
EXCEPTION: 'exception' | 'EXCEPTION';

// Control flow keywords
IF: 'if' | 'IF';
THEN: 'then' | 'THEN';
ELSE: 'else' | 'ELSE';
ELSIF: 'elsif' | 'ELSIF';
CASE: 'case' | 'CASE';
WHEN: 'when' | 'WHEN';
WHILE: 'while' | 'WHILE';
FOR: 'for' | 'FOR';
LOOP: 'loop' | 'LOOP';
EXIT: 'exit' | 'EXIT';
CONTINUE: 'continue' | 'CONTINUE';
GOTO: 'goto' | 'GOTO';

// SQL DML keywords
SELECT: 'select' | 'SELECT';
INSERT: 'insert' | 'INSERT';
UPDATE: 'update' | 'UPDATE';
DELETE: 'delete' | 'DELETE';
FROM: 'from' | 'FROM';
WHERE: 'where' | 'WHERE';
INTO: 'into' | 'INTO';
VALUES: 'values' | 'VALUES';
SET: 'set' | 'SET';

// SQL DDL keywords
CREATE: 'create' | 'CREATE';
ALTER: 'alter' | 'ALTER';
DROP: 'drop' | 'DROP';
TABLE: 'table' | 'TABLE';
INDEX: 'index' | 'INDEX';
VIEW: 'view' | 'VIEW';
SEQUENCE: 'sequence' | 'SEQUENCE';
TRIGGER: 'trigger' | 'TRIGGER';

// PL/SQL specific keywords
PROCEDURE: 'procedure' | 'PROCEDURE';
FUNCTION: 'function' | 'FUNCTION';
PACKAGE: 'package' | 'PACKAGE';
BODY: 'body' | 'BODY';
TYPE: 'type' | 'TYPE';
CURSOR: 'cursor' | 'CURSOR';
RECORD: 'record' | 'RECORD';
VARRAY: 'varray' | 'VARRAY';
RETURN: 'return' | 'RETURN';
RETURNS: 'returns' | 'RETURNS';

// Variable and parameter keywords
CONSTANT: 'constant' | 'CONSTANT';
DEFAULT: 'default' | 'DEFAULT';
NOT_NULL: 'not null' | 'NOT NULL';
IN: 'in' | 'IN';
OUT: 'out' | 'OUT';
IN_OUT: 'in out' | 'IN OUT';

// Additional keywords
OR: 'or' | 'OR';
ON: 'on' | 'ON';
REPLACE: 'replace' | 'REPLACE';
AS: 'as' | 'AS';
IS: 'is' | 'IS';
OTHERS: 'others' | 'OTHERS';
REVERSE: 'reverse' | 'REVERSE';
DOTDOT: '..';
MULT: '*';
BEFORE: 'before' | 'BEFORE';
AFTER: 'after' | 'AFTER';
INSTEAD: 'instead' | 'INSTEAD';
OF: 'of' | 'OF';
EACH: 'each' | 'EACH';
ROW: 'row' | 'ROW';
START: 'start' | 'START';
WITH: 'with' | 'WITH';
INCREMENT: 'increment' | 'INCREMENT';
BY: 'by' | 'BY';
MAXVALUE: 'maxvalue' | 'MAXVALUE';
MINVALUE: 'minvalue' | 'MINVALUE';
CYCLE: 'cycle' | 'CYCLE';
NOCYCLE: 'nocycle' | 'NOCYCLE';
CACHE: 'cache' | 'CACHE';
NOCACHE: 'nocache' | 'NOCACHE';

// Data types
VARCHAR2: 'varchar2' | 'VARCHAR2';
VARCHAR: 'varchar' | 'VARCHAR';
CHAR: 'char' | 'CHAR';
NUMBER: 'number' | 'NUMBER';
INTEGER: 'integer' | 'INTEGER';
DATE: 'date' | 'DATE';
TIMESTAMP: 'timestamp' | 'TIMESTAMP';
BOOLEAN: 'boolean' | 'BOOLEAN';
BLOB: 'blob' | 'BLOB';
CLOB: 'clob' | 'CLOB';
ROWTYPE: '%rowtype' | '%ROWTYPE';
TYPE_ATTR: '%type' | '%TYPE';

// Boolean literals
TRUE: 'true' | 'TRUE';
FALSE: 'false' | 'FALSE';
NULL: 'null' | 'NULL';

// Logical operators
AND: 'and' | 'AND';
NOT: 'not' | 'NOT';
BETWEEN: 'between' | 'BETWEEN';
LIKE: 'like' | 'LIKE';
EXISTS: 'exists' | 'EXISTS';

// Operators
ASSIGN: ':=';
ARROW: '=>';
CONCAT: '||';
PLUS: '+';
MINUS: '-';
DIV: '/';
POWER: '**';
EQ: '=';
NE: '<>' | '!=' | '~=';
LT: '<';
LE: '<=';
GT: '>';
GE: '>=';

// Delimiters
SEMICOLON: ';';
COMMA: ',';
DOT: '.';
COLON: ':';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
PERCENT: '%';
AT: '@';
DOLLAR: '$';

// Literals
NUMBER_LITERAL: [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?;
STRING_LITERAL: '\'' (~['\r\n] | '\'\'')* '\'';
QUOTED_IDENTIFIER: '"' (~["\r\n])* '"';

// Identifiers
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9$]*;

// Host variables
HOST_VARIABLE: ':' [a-zA-Z_][a-zA-Z_0-9]*;

// Comments
LINE_COMMENT: '--' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// SQL*Plus commands (simplified)
SQLPLUS_COMMAND: ('/' | '@' | '@@' | 'spool' | 'SPOOL') ~[\r\n]* -> skip;

// Whitespace
WS: [ \t\r\n]+ -> skip; 