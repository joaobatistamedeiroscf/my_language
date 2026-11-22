# ESPECIFICAÇÃO TOKENS
## Linguagem JB
<div align="center">

<p align="center">
  <img src="language_jb_round.png" alt="Logo circular da Linguagem JB" width="240">
</p>

| Categoria | Expressão Regular | TOKEN |
|---|---|---|
| Palavras-chave | `if` | `IF` |
| | `else` | `ELSE` |
| | `while` | `WHILE` |
| | `for` | `FOR` |
| | `return` | `RETURN` |
| | `func` | `FUNC` |
| | `const` | `CONST` |
| | `print` | `PRINT` |
| | `input` | `INPUT` |
| Tipos | `int` | `INT` |
| | `real` | `REAL` |
| | `str` | `STR` |
| | `char` | `CHAR` |
| | `bool` | `BOOL` |
| | `void` | `VOID` |
| Valores Booleanos | `true` | `TRUE` |
| | `false` | `FALSE` |
| Identificadores | `[a-zA-Z][a-zA-Z0-9_]*` | `ID` |
| Números | `[0-9]+` | `INT_LITERAL` |
| | `[0-9]+\.[0-9]+` | `REAL_LITERAL` |
| Strings | `"([^"\\]|\\.)*"` | `STRING_LITERAL` |
| Caracteres | `'([^'\\]|\\.)'` | `CHAR_LITERAL` |
| Atribuição | `=` | `ATRIB` |
| Operadores Aritméticos | `+` | `OP_SOMA` |
| | `-` | `OP_SUB` |>
| | `/` | `OP_DIV` |
| | `%` | `OP_MOD` |
| | `*` | `OP_MUL` |
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
| Delimitadores | `(` | `PAR_ESQ` |
| | `)` | `PAR_DIR` |
| | `{` | `CHAVE_ESQ` |
| | `}` | `CHAVE_DIR` |
| | `;` | `PONTO_VIRGULA` |
| | `,` | `VIRGULA` | 
| | `.` | `PONTO` |

</div>
