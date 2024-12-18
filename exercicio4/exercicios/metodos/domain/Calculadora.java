package com.java.intermediario.metodos.domain;


/**
 * Metodos:
 */

public class Calculadora {

    /**
     * Utilizando métodos "void" (vazio)
     * 
     * - o método será executado e não retorna nenhum valor
     */

    public void somaDoisNumeros() {
        System.out.println("Soma: "+(10 + 10));
    }

    public void subtriDoisNumeros() {
        System.out.println("Subtracao: "+(21 - 2));
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println("Multiplicacao: "+(num1 * num2));
    }


    /**
     * Utilizando o "return"
     * 
     * - maneiras diferentes de resolver divisoes
     */

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.err.println("Operacao invalida!");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public double divideDoisNumeros2(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        System.err.println("Operacao invalida!");
        return 0;
    }

    public void divideDoisNumeros3(double num1, double num2) {
        if (num2 != 0) {
            System.out.println( num1 / num2);
            return; // é tipo o break
        }
        System.err.println("Operacao invalida!");
    }


    /**
     * Passagem de paramentros
     * Tipos Primitivos
     */

    public void alteraDoisNumeros(int num1, int num2) {
        
        // alterando o valor dos parametros recebidos
        num1 = 99-num1;
        num2 = 33-num2;

        // imprime valor alterado pelo método
        System.out.println("Dentro do método");
        System.out.println("Num1 = "+num1);
        System.out.println("Num2 = "+num2);
    }


    /**
     * Passagem de paramentros
     * Varargs
     * 
     * usando metodo com array e argumetos
     */

    // metodo utilizando array da forma tradicional
    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int aux : numeros) {
            soma += aux;
        }
        System.out.println(soma);
    }

    // metodo utilizando VarArgs
    public void somaVarArgs(int...isNumeros) {
        int soma = 0;
        for (int aux : isNumeros) {
            soma += aux;
        }
        System.out.println(soma);
    }
}
