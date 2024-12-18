package com.java.intermediario.blocosDeInicializacao.domain;

public class Serie {
    private static int[] episodios;

    static {
        System.out.println("dentro do bloco de inicializacao");
        episodios = new int[10];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }       
    
    public Serie() {
        for (int episodio : Serie.episodios) {
            System.out.print(episodio+" ");
        }
        System.out.println();
    }
}