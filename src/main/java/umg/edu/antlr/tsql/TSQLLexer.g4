lexer grammar TSQLLexer;

// SQL Keywords
SELECT: 'select' | 'SELECT';
INSERT: 'insert' | 'INSERT';
UPDATE: 'update' | 'UPDATE';
DELETE: 'delete' | 'DELETE';
FROM: 'from' | 'FROM';
WHERE: 'where' | 'WHERE';
INTO: 'into' | 'INTO';
VALUES: 'values' | 'VALUES';
SET: 'set' | 'SET';
JOIN: 'join' | 'JOIN';
LEFT: 'left' | 'LEFT';
RIGHT: 'right' | 'RIGHT';
INNER: 'inner' | 'INNER';
OUTER: 'outer' | 'OUTER';
FULL: 'full' | 'FULL';
ON: 'on' | 'ON';
AS: 'as' | 'AS';
ORDER: 'order' | 'ORDER';
GROUP: 'group' | 'GROUP';
BY: 'by' | 'BY';
HAVING: 'having' | 'HAVING';
UNION: 'union' | 'UNION';
ALL: 'all' | 'ALL';
DISTINCT: 'distinct' | 'DISTINCT';
TOP: 'top' | 'TOP';

// DDL Keywords
CREATE: 'create' | 'CREATE';
ALTER: 'alter' | 'ALTER';
DROP: 'drop' | 'DROP';
TABLE: 'table' | 'TABLE';
INDEX: 'index' | 'INDEX';
VIEW: 'view' | 'VIEW';
PROCEDURE: 'procedure' | 'PROCEDURE';
FUNCTION: 'function' | 'FUNCTION';
TRIGGER: 'trigger' | 'TRIGGER';
DATABASE: 'database' | 'DATABASE';
SCHEMA: 'schema' | 'SCHEMA';

// T-SQL specific keywords
PROC: 'proc' | 'PROC';
BEGIN: 'begin' | 'BEGIN';
END: 'end' | 'END';
IF: 'if' | 'IF';
ELSE: 'else' | 'ELSE';
WHILE: 'while' | 'WHILE';
FOR: 'for' | 'FOR';
BREAK: 'break' | 'BREAK';
CONTINUE: 'continue' | 'CONTINUE';
RETURN: 'return' | 'RETURN';
DECLARE: 'declare' | 'DECLARE';
EXEC: 'exec' | 'EXEC';
EXECUTE: 'execute' | 'EXECUTE';
TRY: 'try' | 'TRY';
CATCH: 'catch' | 'CATCH';
THROW: 'throw' | 'THROW';
RAISERROR: 'raiserror' | 'RAISERROR';

// Additional keywords
ADD: 'add' | 'ADD';
COLUMN: 'column' | 'COLUMN';
RETURNS: 'returns' | 'RETURNS';
PRINT: 'print' | 'PRINT';
USE: 'use' | 'USE';

// Data types
VARCHAR: 'varchar' | 'VARCHAR';
NVARCHAR: 'nvarchar' | 'NVARCHAR';
CHAR: 'char' | 'CHAR';
NCHAR: 'nchar' | 'NCHAR';
TEXT: 'text' | 'TEXT';
NTEXT: 'ntext' | 'NTEXT';
INT: 'int' | 'INT';
INTEGER: 'integer' | 'INTEGER';
BIGINT: 'bigint' | 'BIGINT';
SMALLINT: 'smallint' | 'SMALLINT';
TINYINT: 'tinyint' | 'TINYINT';
DECIMAL: 'decimal' | 'DECIMAL';
NUMERIC: 'numeric' | 'NUMERIC';
FLOAT: 'float' | 'FLOAT';
REAL: 'real' | 'REAL';
MONEY: 'money' | 'MONEY';
SMALLMONEY: 'smallmoney' | 'SMALLMONEY';
DATETIME: 'datetime' | 'DATETIME';
DATETIME2: 'datetime2' | 'DATETIME2';
DATE: 'date' | 'DATE';
TIME: 'time' | 'TIME';
TIMESTAMP: 'timestamp' | 'TIMESTAMP';
BIT: 'bit' | 'BIT';
BINARY: 'binary' | 'BINARY';
VARBINARY: 'varbinary' | 'VARBINARY';
IMAGE: 'image' | 'IMAGE';
UNIQUEIDENTIFIER: 'uniqueidentifier' | 'UNIQUEIDENTIFIER';
XML: 'xml' | 'XML';

// Constraints
PRIMARY: 'primary' | 'PRIMARY';
KEY: 'key' | 'KEY';
FOREIGN: 'foreign' | 'FOREIGN';
REFERENCES: 'references' | 'REFERENCES';
UNIQUE: 'unique' | 'UNIQUE';
NOT: 'not' | 'NOT';
NULL: 'null' | 'NULL';
DEFAULT: 'default' | 'DEFAULT';
CHECK: 'check' | 'CHECK';
CONSTRAINT: 'constraint' | 'CONSTRAINT';
IDENTITY: 'identity' | 'IDENTITY';

// Logical operators
AND: 'and' | 'AND';
OR: 'or' | 'OR';
IN: 'in' | 'IN';
EXISTS: 'exists' | 'EXISTS';
BETWEEN: 'between' | 'BETWEEN';
LIKE: 'like' | 'LIKE';
IS: 'is' | 'IS';

// T-SQL specific operators and keywords
COLLATE: 'collate' | 'COLLATE';
CASE: 'case' | 'CASE';
WHEN: 'when' | 'WHEN';
THEN: 'then' | 'THEN';
WITH: 'with' | 'WITH';
CTE: 'cte' | 'CTE';
RECURSIVE: 'recursive' | 'RECURSIVE';
PIVOT: 'pivot' | 'PIVOT';
UNPIVOT: 'unpivot' | 'UNPIVOT';
OVER: 'over' | 'OVER';
PARTITION: 'partition' | 'PARTITION';
ROW_NUMBER: 'row_number' | 'ROW_NUMBER';
RANK: 'rank' | 'RANK';
DENSE_RANK: 'dense_rank' | 'DENSE_RANK';

// Transaction control
TRANSACTION: 'transaction' | 'TRANSACTION';
TRAN: 'tran' | 'TRAN';
COMMIT: 'commit' | 'COMMIT';
ROLLBACK: 'rollback' | 'ROLLBACK';
SAVE: 'save' | 'SAVE';
SAVEPOINT: 'savepoint' | 'SAVEPOINT';

// Operators
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULT_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';
AND_ASSIGN: '&=';
OR_ASSIGN: '|=';
XOR_ASSIGN: '^=';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';

EQ: '=';
NE: '<>' | '!=' | '~=';
LT: '<';
LE: '<=';
GT: '>';
GE: '>=';

BIT_AND: '&';
BIT_OR: '|';
BIT_XOR: '^';
BIT_NOT: '~';

// Delimiters
SEMICOLON: ';';
COMMA: ',';
DOT: '.';
COLON: ':';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';

// T-SQL specific delimiters
GO: 'go' | 'GO';
DOLLAR: '$';
AT: '@';
HASH: '#';

// Literals
NUMBER_LITERAL: [0-9]+ ('.' [0-9]+)?;
MONEY_LITERAL: '$' [0-9]+ ('.' [0-9]+)?;
STRING_LITERAL: '\'' (~['\r\n] | '\'\'')* '\'';
UNICODE_STRING_LITERAL: 'N\'' (~['\r\n] | '\'\'')* '\'';
QUOTED_IDENTIFIER: '"' (~["\r\n])* '"' | '[' (~[\]\r\n])* ']';

// Identifiers
IDENTIFIER: [a-zA-Z_@#][a-zA-Z_0-9@#$]*;

// Variables
GLOBAL_VARIABLE: '@@' [a-zA-Z_][a-zA-Z_0-9]*;
LOCAL_VARIABLE: '@' [a-zA-Z_][a-zA-Z_0-9]*;

// Keywords that can be used as identifiers in certain contexts
ASC: 'asc' | 'ASC';
DESC: 'desc' | 'DESC';
OUTPUT: 'output' | 'OUTPUT';
OUT: 'out' | 'OUT';

// Comments
LINE_COMMENT: '--' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Whitespace
WS: [ \t\r\n]+ -> skip; 