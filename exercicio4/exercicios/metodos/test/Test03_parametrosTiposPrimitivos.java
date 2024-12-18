package com.java.intermediario.metodos.test;

import com.java.intermediario.metodos.domain.Calculadora;

public class Test03_parametrosTiposPrimitivos {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        /**
         * Passagem de paramentros
         * Tipos Primitivos
         */

        // variaveis de tipos primitivos
        int num11 = 1;
        int num22 = 2;

        // enviando cópia dos valores para o método
        calculadora.alteraDoisNumeros(num11, num22);

        // imprime valor das variaveis 
        System.out.println("Fora do método");
        System.out.println(num11);
        System.out.println(num22);

        // a passagem de parametros com tipos primitivos garante
        // que o valor das variáveis não serão alterados dentro
        // do método, pq o que é passado é somente uma cópia dos
        // valores e não a referência desses valores.
    }
}
