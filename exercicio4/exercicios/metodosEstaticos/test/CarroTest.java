package com.java.intermediario.metodosEstaticos.test;

import com.java.intermediario.metodosEstaticos.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        System.out.println(Carro.getVelocidadeLimite());

        /**
         * o metodo static possibilita o seu acesso sem a necessidade
         * de instanciar a classe;
         */

        Carro.setVelocidadeLimite(180);
        
        Carro carro = new Carro("Ferrari", 300);
        Carro carro2 = new Carro("Audi", 250);
        Carro carro3 = new Carro("Fusca", 60);
        System.out.println(Carro.getVelocidadeLimite());

        Carro.setVelocidadeLimite(160);
        
        carro.imprime();
        carro2.imprime();
        carro3.imprime();

        System.out.println(Carro.getVelocidadeLimite());

    }
}
