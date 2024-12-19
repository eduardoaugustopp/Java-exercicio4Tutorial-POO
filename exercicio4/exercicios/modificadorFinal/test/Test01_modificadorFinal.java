package com.java.intermediario.modificadorFinal.test;

import com.java.intermediario.modificadorFinal.domain.Carro;
import com.java.intermediario.modificadorFinal.domain.Comprador;
import com.java.intermediario.modificadorFinal.domain.Renault;

public class Test01_modificadorFinal {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE); // 250.0        
        
        Comprador comprador01 = new Comprador();
        System.out.println(carro01.COMPRADOR); // null
        carro01.COMPRADOR.setNome("Joao");        
        System.out.println(carro01.COMPRADOR); // Joao
        
        Renault renault01 = new Renault();
        renault01.setNome("Kwid");
        renault01.imprime();
    }
}
