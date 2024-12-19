package com.java.intermediario.modificadorFinal.domain;

/**
 * O uso do modificador "final" em uma classe
 * faz com que essa classe fique impossibilitada
 * de ter uma classe filha, e seus métodos ficam
 * inacessiveis para outras classes;
 */

// public final class Carro {
public class Carro {
    private String nome;

    /**
     * O modificador de acesso "final" transforma o
     * valor do atributo em uma constante;
     * Por convenção, o atributo é escrito em uppercase
     * e separado por underscore;
     */ 
    public static final double VELOCIDADE_LIMITE = 250;    
    public final Comprador COMPRADOR = new Comprador();

    /**
     * o udo do modificador "final" em um metodo 
     * faz com que esse metodo não possa ser 
     * sobrescrito em uma outra classe;
     */
    public final void imprime() {
        // classe Renault;
        System.out.println(this.nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}