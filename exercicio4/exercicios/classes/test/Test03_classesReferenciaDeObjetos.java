package com.java.intermediario.classes.test;

import com.java.intermediario.classes.domain.Carro;

/**
 * Referencia de Objetos
 * 
 * usar uma instancia para referenciar um
 * mesmo objeto já instanciado
 */
public class Test03_classesReferenciaDeObjetos {
    public static void main(String[] args) {
        // instanciando a classe Carro
        Carro renault = new Carro();
        Carro fiat = new Carro();
    
        // preenchendo os atributos da classe
        renault.nome = "Kwid";
        renault.modelo = "Zen 1.0";
        renault.ano = 2022;
        renault.valor = 65790;

        fiat.nome = "Mobi";
        fiat.modelo = "Like 1.0";
        fiat.ano = 2022;
        fiat.valor = 64690;
        
        // referencia de objetos
        fiat = renault;

        // imprimindo carro 1 e carro 2
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