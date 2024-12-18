package com.java.intermediario.associacaoArrayComObjetos.domain;

/**
 * associacao unidirecional
 */

public class Professor {
    private String nome;


    public Professor(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
