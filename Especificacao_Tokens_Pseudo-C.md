# ESPECIFICAÇÃO TOKENS
## Linguagem JB

| Categoria | Expressão Regular | TOKEN |
|---|---|---|
| Palavras-chave | `if` | `IF` |
| | `else` | `ELSE` |
| | `while` | `WHILE` |
| | `for` | `FOR` |
| | `repeat` | `REPEAT` |
| | `return` | `RETURN` |
| | `func` | `FUNC` |
| | `break` | `BREAK` |
| | `continue` | `CONTINUE` |
| | `const` | `CONST` |
| | `print` | `PRINT` |
| | `input` | `INPUT` |
| Tipos | `int` | `INT` |
| | `real` | `REAL` |
| | `str` | `STR` |
| | `bool` | `BOOL` |
| | `void` | `VOID` |
| Valores Booleanos | `true` | `TRUE` |
| | `false` | `FALSE` |
| Identificadores | `[a-zA-Z_][a-zA-Z0-9_]*` | `ID` |
| Números | `[0-9]+` | `INT_LITERAL` |
| | `[0-9]+\.[0-9]+` | `REAL_LITERAL` |
| Strings | `"([^"\\]|\\.)*"` | `STRING_LITERAL` |
| Caracteres | `'([^'\\]|\\.)'` | `CHAR_LITERAL` |
| Atribuição | `=` | `ATRIB` |
| Operadores Aritméticos | `+` | `OP_SOMA` |
| | `-` | `OP_SUB` |>
| | `/` | `OP_DIV` |
| | `%` | `OP_MOD` |
| Operadores Relacionais | `<=` | `OP_LE` |
| | `>=` | `OP_GE` |
| | `==` | `OP_EQ` |
| | `!=` | `OP_NE` |
| | `<` | `OP_LT` |
| | `>` | `OP_GT` |
| Operadores Lógicos | `&&` | `OP_AND` |
| | `\|\|` | `OP_OR` |
| | `!` | `OP_NOT` |
| Operadores de Incremento/Decremento | `++` | `OP_INC` |
| | `--` | `OP_DEC` |
| Operadores de Atribuição | `+=` | `ATRIB_SOMA` |
| | `-=` | `ATRIB_SUB` |
| | `*=` | `ATRIB_MULT` |
| | `/=` | `ATRIB_DIV` |
| | `%=` | `ATRIB_MOD` |
| Delimitadores | `(` | `PAR_ESQ` |
| | `)` | `PAR_DIR` |
| | `{` | `CHAVE_ESQ` |
| | `}` | `CHAVE_DIR` |
| | `[` | `COLCHETE_ESQ` |
| | `]` | `COLCHETE_DIR` |
| | `;` | `PONTO_VIRGULA` |
| | `,` | `VIRGULA` |
| | `.` | `PONTO` |
| | `:` | `DOIS_PONTOS` |
| Espaços em branco | `[ \t\r\n]+` | `WHITESPACE` |
