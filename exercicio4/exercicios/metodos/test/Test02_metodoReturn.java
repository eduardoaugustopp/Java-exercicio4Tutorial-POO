package com.java.intermediario.metodos.test;

import com.java.intermediario.metodos.domain.Calculadora;

public class Test02_metodoReturn {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        /**
         * Utilizando o "return"
         * 
         * - maneiras diferentes de resolver divisoes
         */
        
        System.out.println("Divisoes utilizando o 'return':");
        
        double result = calculadora.divideDoisNumeros(10, 0);
        System.out.println(result);
        
        double result2 = calculadora.divideDoisNumeros2(20, 0);
        System.out.println(result2);

        calculadora.divideDoisNumeros3(20, 0); // já tem o print no metodo
    }
}
