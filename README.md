Matheus dos Santos Candiotti - 314139

O analisador léxico desenvolvido utilizando a ferramenta ANTLR 4.8 funciona em cima de um arquivo de extensão .G4, este deve estar em uma pasta especifica que o antlr exige.
Este arquivo é basicamente a gramática na linguagem, nele deve ser definido basicamente tudo o que a linguagem a ser utilizada pelo compilador em desenvolvimento aceitará:
- Se aceita variáveis e quais serão os tipos aceitos;
- Se aceita cadeias(Strings);
- Se aceita operadores relacionais e aritmeticos;
- Se aceita laços.
Também deve ser definido questões de formatação de código, como a utilização de parenteses, delimitadores, capacidade de comentar o código e como a gramatica se portará quando aparecer espaços em branco ' '.
Nessa primeira etapa também é definido PALAVRAS CHAVES, que no caso dão corpo para o algoritmo a ser desenvolvido, palavras como IMPRIMIR, ATRIBUIR, INT, FLOAT, nessa etapa são considerados PALAVRAS CHAVES.

O analisador léxico em si, após definir todas essas regras, gera tipos de TOKEN para cada regra inserida no arquivo de gramática, por exemplo: a palavra em caixa alta ATRIBUIR deve ser reconhecida como uma PALAVRA CHAVE e não como uma varíavel, se isso não acontecer, no momento não acontece erros explicitos, mas nas fases seguintes isso não funcionará devido a inconsistencia no analisador lexico. Resumidamente, o analisador léxico se preocupa apenas com o que a linguagem aceitará de TEXTO inserido, sem se preocupar com significados ou estruturas de código.
Outro tipo de incosistencia seria caso acontecesse de aparecer uma declaração de variavel no código da seguinte maneira:
	- NOMEVAR:INT
Em teoria, teria de ser gerado um token do tipo TIPO_VAR e outro do tipo VARIAVEL, no entanto, essa estrutura não está respeitando como o token é formado, no caso, para uma variavel do tipo inteiro é necessário que seja escrito "INTEIRO", no momento não apresentará um erro explicito, apenas será gerado um token do tipo incorreto.

A linguagem a ser desenvolvida para ser aceita pelo compilador em desenvolvimento aceitará:
 - DECLARAÇÕES DE VARIÁVEIS (INTEIRAS E REAIS);
 - EXPRESSÕES ARITMÉTICAS (SOMA, SUBTRAÇÃO, MULTIPLICAÇÃO E DIVISÃO);
 - EXPRESSÕES RELACIONAIS (MAIOR, MAIOR-IGUAL, MENOR, MENOR-IGUAL, IGUAL, DIFERENTE);
 - EXPRESSÕES LÓGICAS (E, OU);
 - LAÇOS CONDICIONAIS (SE-ENTÃO-SENÃO);
 - LAÇOS DE REPETIÇÃO (ENQUANTO).
