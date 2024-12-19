package com.java.intermediario.modificadorFinal.domain;

public class Comprador{
    private String nome;

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            "}";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
