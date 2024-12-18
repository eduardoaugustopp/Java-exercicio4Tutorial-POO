package com.java.intermediario.metodos.test;

import com.java.intermediario.metodos.domain.Calculadora;

public class Test05_parametrosVarargs {
    public static void main(String[] args) {        
        
        /**
         * Passagem de paramentros
         * VarArgs
         * 
         * usando metodo com array e argumetos
         */
        
        Calculadora calculadora = new Calculadora();
        
        // metodo utilizando array da forma tradicional
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);

        // metodo utilizando VarArgs
        calculadora.somaVarArgs(1,2,3,4,5);

        // O que muda de um VarArgs para um array é a sintaxe;
        // O Java transforma o VarArgs em um array na execução;
        // Se houver mais de um atributo como parametros, ex:
        // calculadora.somaVarArgs(int valor, int valor2, int...isNumeros:1,2,3)
        // obrigatoriamente, o varargs deve estar no final do parametro.
    }
}