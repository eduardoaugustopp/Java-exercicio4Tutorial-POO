package com.java.intermediario.polimorfismo.domain;

/**
 * Produto = classe abstrata;
 * Taxas = interface;
 * Computador e PlacaDeVideo = classes;
 * CalcularImposto = classe (pacote de servicos);
 * 
 * 1) Criou classe abstrata para implementar nas classes os 
 *    atributos e construtor, sendo que essa classe abstrata
 *    nao pode ser instanciada;
 */
public abstract class Produto implements Taxas {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public double getValor() {
        return this.valor;
    }
}