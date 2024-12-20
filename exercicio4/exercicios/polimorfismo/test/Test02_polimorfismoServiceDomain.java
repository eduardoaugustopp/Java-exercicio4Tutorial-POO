package com.java.intermediario.polimorfismo.test;

import com.java.intermediario.polimorfismo.domain.Computador;
import com.java.intermediario.polimorfismo.domain.Monitor;
import com.java.intermediario.polimorfismo.domain.PlacaDeVideo;
import com.java.intermediario.polimorfismo.domain.Produto;
import com.java.intermediario.polimorfismo.service.CalculadoraImposto;


public class Test02_polimorfismoServiceDomain {
    public static void main(String[] args) {
        /**
         * Super classe recebendo um Objeto da Sub classe:
         * 
         * Até agora, criamos um objeto utilizando a mesma classe que instanciamos;
         * No Test02, criamos um objeto a partir da superclasse abstrata Produto;
         * Nesse caso, garantimos que todos os metodos e funcoes em Produtos podem
         * ser chamados em qualquer subclasse de Produtos;
         */
        Produto produto01 = new Computador("Lenovo V15 Geforce MX350 W11 Pro 15\"", 6499.00);
        System.out.println(produto01.getNome());
        System.out.println(produto01.getValor());
        System.out.println(produto01.calculaImposto());
        System.out.println();

        Produto produto02 = new PlacaDeVideo("GeForce RTX 3070", 3399.15);
        System.out.println(produto02.getNome());
        System.out.println(produto02.getValor());
        System.out.println(produto02.calculaImposto());
        System.out.println();

        Produto monitor01 = new Monitor("LG UltraWide 34Wp550 34\"", 2345.96);
        CalculadoraImposto.calcularImposto(monitor01);
    }
}