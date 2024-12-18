package com.java.intermediario.metodos.test;

import com.java.intermediario.metodos.domain.Calculadora;

public class Test01_metodoVoid {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        /**
         * Utilizando métodos "void" (vazio)
         * 
         * - o método será executado e não retorna nenhum valor
         */

        calculadora.somaDoisNumeros();
        calculadora.subtriDoisNumeros();
        calculadora.multiplicaDoisNumeros(9,2);
    }
}
