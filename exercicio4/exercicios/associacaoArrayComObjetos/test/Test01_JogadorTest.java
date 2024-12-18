package com.java.intermediario.associacaoArrayComObjetos.test;

import com.java.intermediario.associacaoArrayComObjetos.domain.Jogador;

public class Test01_JogadorTest {
    public static void main(String[] args) {   
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Richarlison");
        Jogador jogador3 = new Jogador("Daniel Alves");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        // ou:
        // Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
