package com.java.intermediario.sobrescrita.domain;

public class Mercado {
    private String nome;

    public Mercado(String nome) {
        this.nome = nome;
    }

    /**
     * metodo sobrescrito da classe super Object
     */
    @Override
    public String toString() {
        return getNome();
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
