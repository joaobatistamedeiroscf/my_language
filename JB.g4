grammar JB;

// Regra inicial: um programa é uma sequência de comandos
program
    : statement* EOF;

statement
    :variableDecl
    |ifStmt
    |whileStmt
    |forStmt 
    |block

    ;

variableDecl
    : primitiveType ID (ATRIB expression)? PONTO_VIRGULA
    ;
ifStmt
    : IF PAR_ESQ expression PAR_DIR statement
      (ELSE statement)?
    ;

whileStmt
    : WHILE PAR_ESQ expression PAR_DIR statement
    ;

forStmt
    : FOR PAR_ESQ forInit PONTO_VIRGULA expression? PONTO_VIRGULA forUpdate PAR_DIR statement
    ;


forInit
    : primitiveType ID (ATRIB expression)?
    ;

forUpdate
    : ID OP_INC
    | ID OP_DEC
    ;


primitiveType
    : INT
    | REAL
    | STR
    | BOOL
    ;

block
    : CHAVE_ESQ statement* CHAVE_DIR
    ;

expression
    : relationalExpr
    ;

relationalExpr 
    : additiveExpr ((OP_LT | OP_LE | OP_GT | OP_GE | OP_EQ | OP_NE) additiveExpr)*
    ;

additiveExpr
    : multiplicativeExpr ((OP_SOMA | OP_SUB) multiplicativeExpr)*
    ;

multiplicativeExpr
    : primaryExpr ((OP_MULT | OP_DIV | OP_MOD) primaryExpr)*
    ;

primaryExpr
    : INT_LITERAL
    | REAL_LITERAL
    | STRING_LITERAL
    | CHAR_LITERAL
    | TRUE
    | FALSE
    | ID
    | PAR_ESQ expression PAR_DIR
    ;

// ============================================================
// LEXER
// ============================================================

INT
    : 'int'
    ;

REAL
    : 'real'
    ;

STR
    : 'str'
    ;

BOOL
    : 'bool'
    ;

TRUE
    : 'true'
    ;

FALSE
    : 'false'
    ;


INT_LITERAL
    : [0-9]+
    ;

REAL_LITERAL
    : [0-9]+ '.' [0-9]+
    ;

STRING_LITERAL
    : '"' (~["\\] | '\\' .)* '"'
    ;

CHAR_LITERAL
    : '\'' (~['\\] | '\\' .) '\''
    ;

ATRIB
    : '='
    ;

PONTO_VIRGULA
    : ';'
    ;

CHAVE_ESQ
    : '{'
    ;

CHAVE_DIR
    : '}'
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

OP_SOMA
    : '+'
    ;

OP_SUB
    : '-'
    ;

OP_MULT
    : '*'
    ;

OP_DIV
    : '/'
    ;

OP_MOD
    : '%'
    ;   

PAR_ESQ 
    : '('
    ;


PAR_DIR 
    : ')'
    ;

OP_LE
    : '<='
    ;

OP_LT
    : '<'
    ;

OP_GE
    : '>='
    ;

OP_GT
    : '>'
    ;

OP_EQ
    : '=='
    ;

OP_NE
    : '!='
    ;

IF
    : 'if'
    ;

ELSE
    : 'else'
    ;

WHILE
    : 'while'
    ;

FOR
    : 'for'
    ;
OP_INC 
    : '++' 
    ;

OP_DEC 
    : '--' 
    ;

ID
    : [a-zA-Z][a-zA-Z0-9_]*
    ;

