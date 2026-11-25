grammar JB;

// ============================================================
// 1. REGRA INICIAL
// ============================================================

program
    : (funcStmt | statement)* EOF
    ;

// ============================================================
// 2. INSTRUÇÕES
// ============================================================

statement
    : variableDecl
    | assignment
    | incrementStmt
    | ifStmt
    | whileStmt
    | forStmt
    | returnStmt
    | printStmt
    | callStmt
    | block
    ;

// ============================================================
// 3. DECLARAÇÃO E ATRIBUIÇÃO
// ============================================================

//Declaração de uma variável
variableDecl
    : CONST? primitiveType ID (ATRIB expression)? PONTO_VIRGULA
    ;
//Atribuição/
assignment
    : ID ATRIB expression PONTO_VIRGULA
    ;
//Incremento
incrementStmt
    : ID (OP_INC | OP_DEC) PONTO_VIRGULA
    ;

// ============================================================
// 4. ESTRUTURAS CONDICIONAIS E DE REPETIÇÃO
// ============================================================

ifStmt
    : IF PAR_ESQ expression PAR_DIR statement (ELSE statement)?
    ;

whileStmt
    : WHILE PAR_ESQ expression PAR_DIR statement
    ;

forStmt
    : FOR PAR_ESQ forInit? PONTO_VIRGULA expression? PONTO_VIRGULA forUpdate? PAR_DIR statement
    ;

forInit
    : primitiveType ID (ATRIB expression)?
    | ID ATRIB expression
    ;

forUpdate
    : ID (OP_INC | OP_DEC)
    | ID ATRIB expression
    ;

// ============================================================
// 5. FUNÇÕES E RETORNO
// ============================================================

funcStmt
    : FUNC returnType ID PAR_ESQ parameters? PAR_DIR block
    ;

returnType
    : primitiveType
    | VOID
    ;

parameters
    : parameter (VIRGULA parameter)*
    ;

parameter
    : primitiveType ID
    ;

returnStmt
    : RETURN expression? PONTO_VIRGULA
    ;

callStmt
    : functionCall PONTO_VIRGULA
    ;

// ============================================================
// 6. ENTRADA, SAÍDA E BLOCOS
// ============================================================

printStmt
    : PRINT PAR_ESQ expression PAR_DIR PONTO_VIRGULA
    ;

block
    : CHAVE_ESQ statement* CHAVE_DIR
    ;

// ============================================================
// 7. TIPOS
// ============================================================

primitiveType
    : INT
    | REAL
    | STR
    | CHAR
    | BOOL
    ;

// ============================================================
// 8. EXPRESSÕES
// Precedência: OR, AND, relacional, soma, multiplicação, unária.
// ============================================================

expression
    : logicalOrExpr
    ;

logicalOrExpr   
    : logicalAndExpr (OP_OR logicalAndExpr)*
    ;

logicalAndExpr
    : relationalExpr (OP_AND relationalExpr)*
    ;

relationalExpr
    : additiveExpr ((OP_LT | OP_LE | OP_GT | OP_GE | OP_EQ | OP_NE) additiveExpr)*
    ;

additiveExpr
    : multiplicativeExpr ((OP_SOMA | OP_SUB) multiplicativeExpr)*
    ;

multiplicativeExpr
    : unaryExpr ((OP_MUL | OP_DIV | OP_MOD) unaryExpr)*
    ;

unaryExpr
    : (OP_NOT | OP_SUB | OP_SOMA) unaryExpr
    | primaryExpr
    ;

primaryExpr
    : INT_LITERAL
    | REAL_LITERAL
    | STRING_LITERAL
    | CHAR_LITERAL
    | TRUE
    | FALSE
    | INPUT PAR_ESQ PAR_DIR
    | functionCall
    |ID
    | PAR_ESQ expression PAR_DIR
    ;

functionCall
    : ID PAR_ESQ arguments? PAR_DIR
    ;

arguments
    : expression (VIRGULA expression)*
    ;



// ============================================================
// 9. REGRAS LÉXICAS
// ============================================================

// Palavras-chave
IF              : 'if';
ELSE            : 'else';
WHILE           : 'while';
FOR             : 'for';
RETURN          : 'return';
FUNC            : 'func';
CONST           : 'const';
PRINT           : 'print';
INPUT           : 'input';

// Tipos
INT             : 'int';
REAL            : 'real';
STR             : 'str';
CHAR            : 'char';
BOOL            : 'bool';
VOID            : 'void';

// Valores booleanos
TRUE            : 'true';
FALSE           : 'false';

// Literais
REAL_LITERAL    : [0-9]+ '.' [0-9]+;
INT_LITERAL     : [0-9]+;
STRING_LITERAL  : '"' (~["\\] | '\\' .)* '"';
CHAR_LITERAL    : '\'' (~['\\] | '\\' .) '\'';

// Atribuição simples
ATRIB           : '=';

// Operadores aritméticos
OP_SOMA         : '+';
OP_SUB          : '-';
OP_DIV          : '/';
OP_MOD          : '%';
OP_MUL          : '*';

// Operadores relacionais
OP_LE           : '<=';
OP_GE           : '>=';
OP_EQ           : '==';
OP_NE           : '!=';
OP_LT           : '<';
OP_GT           : '>';

// Operadores lógicos
OP_AND          : '&&';
OP_OR           : '||';
OP_NOT          : '!';

// Incremento e decremento
OP_INC          : '++';
OP_DEC          : '--';

// Delimitadores
PAR_ESQ         : '(';
PAR_DIR         : ')';
CHAVE_ESQ       : '{';
CHAVE_DIR       : '}';
PONTO_VIRGULA   : ';';
VIRGULA         : ',';
PONTO           : '.';

// Identificadores
ID              : [a-zA-Z] [a-zA-Z0-9_]*;

// Espaços em branco são ignorados.
WS              : [ \t\r\n]+ -> skip;
