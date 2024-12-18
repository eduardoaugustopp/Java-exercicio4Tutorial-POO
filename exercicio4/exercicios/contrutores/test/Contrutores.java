package com.java.intermediario.contrutores.test;

import com.java.intermediario.contrutores.domain.Empresa;

/**
 * Construtores
 * 
 * não pode haver retorno, senão configura um método
 */

public class Contrutores {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tecnolight", 33, "00.000.000/0001-85", "Av Osasco");
        empresa.imprime();  

        System.out.println();

        Empresa empresa2 = new Empresa("Ecil", 33, "00.000.000/0001-91", "Av Barueri","www.ecil.com.br");
        empresa2.imprime();         
    }
}
