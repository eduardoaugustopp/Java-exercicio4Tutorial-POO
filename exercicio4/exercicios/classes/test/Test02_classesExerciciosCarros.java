package com.java.intermediario.classes.test;

import com.java.intermediario.classes.domain.Carro;

/*
 * Crie uma classe carro com os seguintes atributos
 * nome
 * modelo
 * ano
 * 
 * em seguida, crie dois objetos e imprima seus valores 
 */
public class Test02_classesExerciciosCarros {
    public static void main(String[] args) {
        Carro renault = new Carro();
        Carro fiat = new Carro();
    
        renault.nome = "Kwid";
        renault.modelo = "Zen 1.0";
        renault.ano = 2022;
        renault.valor = 65790;

        fiat.nome = "Mobi";
        fiat.modelo = "Like 1.0";
        fiat.ano = 2022;
        fiat.valor = 64690;

        System.out.println(
            "Carro "+renault.nome+
            ", modelo "+renault.modelo+
            ", ano "+renault.ano+
            ", valor em 2022 R$"+renault.valor
        );

        System.out.println(
            "Carro "+fiat.nome+
            ", modelo "+fiat.modelo+
            ", ano "+fiat.ano+
            ", valor em 2022 R$"+fiat.valor
        );
    }
}
