/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unilins.es.compiladores.lexanalyzer;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;


/**
 * ANALISADOR LEXICO DESENVOLVIDO UTILIZANDO A FERRAMENTA ANTLR 4.8 - Matheus Candiotti - ID: 314139
 * LINGUAGEM A SER UTILIZADA SE CHAMARÁ OWNL E ACEITARÁ O SEGUINTE:
 * Declaração de variáveis (INT e FLOAT);
 * Estruturas de repetição (IF-ELSE, WHILE);
 * Expressões relacionais e lógicas (MAIOR, MENOR, MAIOR-IGUAL, MENOR-IGUAL, IGUAL, DIFERENTE, E, OU);
 * Operações aritméticas (+, -, *, /, %);
 */
public class LexMain {
    public static void main(String args[]) throws IOException {
       CharStream  cs = CharStreams.fromFileName(args[0]);
       LexGrammar lexer = new LexGrammar(cs);
       
       Token tk = null;
       // LAÇO CRIADO APENAS PARA DAR UM PRINT FORMATADO E VER SE CADA TOKEN RECEBEU O TIPO CERTO
       // O TIPO SE ENCONTRA EM /generated-sources/antlr4/LexGrammar.tokens
       while ((tk = lexer.nextToken()).getType() != Token.EOF) {
           System.out.print("<" + tk.getType() + "," + tk.getText() + ">");
       }      
    }
}
