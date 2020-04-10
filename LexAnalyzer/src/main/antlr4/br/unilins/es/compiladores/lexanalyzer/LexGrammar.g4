lexer grammar LexGrammar;

Palavra_Chave: 'IF' | 'OR' | 'DO' | 'TO' | 'END' | 'AND' | 'INTEGER' | 'FLOAT' | 'BEGIN' | 'READ' | 'THEN' | 'ELSE' | 'ELSIF' | 'WHILE' | 'PRINT' | 'ASSIGN' | 'VARIABLES';

Num_Int: ('+'|'-')? ('0'..'9')+;

Num_Float: ('+'|'-')? ('0'..'9')+ '.' ('0'..'9')+;

Var: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*;

String: '\'' (ESC_SEQ | ~('\''|'\\'))* '\'';

fragment
ESC_SEQ: '\\\'';

Ope_Rel: '>' | '<' | '>=' | '<=' | '<>' | '=';

Ope_Arit: '+' | '-' | '*' | '/';

Ope_Mod: '%';

Abre_Par: '(';

Fecha_Par: ')';

Abre_Chave: '{';

Fecha_Chave: '}';

Fim_de_Linha: ';';

Delim: ':';

Espaço: ( ' ' | '\n' | '\t' | '\r') -> skip;

Comment: '#' ~('\n')* -> skip;

