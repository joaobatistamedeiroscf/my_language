grammar JB;

// Regra inicial: um programa é uma sequência de comandos
program
    : statement* EOF;

statement
    :variableDecl
    |assignment 
    |ifStmt
    |whileStmt
    |forStmt
    |funcStmt
    |returnStmt  
    |block

    ;

variableDecl
    : primitiveType ID (ATRIB expression)? PONTO_VIRGULA
    ;
 
assignment 
    : ID ATRIB expression PONTO_VIRGULA 
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

returnStmt
    : RETURN expression PONTO_VIRGULA
    ;

funcStmt
    : FUNC ID PAR_ESQ parameters? PAR_DIR  block
    ;

parameters
    : parameter (VIRGULA parameter)*
    ;

parameter
    : primitiveType ID
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

VOID 
    : 'void'
    ;

TRUE
    : 'true'
    ;

FALSE
    : 'false'
    ;

RETURN 
    : 'return' 
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

FUNC 
    : 'func'
    ;

VIRGULA
    : ','
    ;   
ID
    : [a-zA-Z][a-zA-Z0-9_]*
    ;

