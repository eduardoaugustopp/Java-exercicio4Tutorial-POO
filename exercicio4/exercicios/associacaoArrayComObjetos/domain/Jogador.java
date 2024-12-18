package com.java.intermediario.associacaoArrayComObjetos.domain;


/**
 * Associacao bidirecional
 * Jogador N -- 1 Time
 */

public class Jogador {
    private String nome;
    private Time[] times;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, Time[] times) {
        this.nome = nome;
        this.times = times;
    }

    public void imprime(){
        System.out.println(this.nome+":");
        if (times == null) {
            return;
        }
        for (Time time : times) {
            System.out.println(time.getNome());
        }
    }

    public Time[] getTime() {
        return this.times;
    }

    public void setTime(Time[] times) {
        this.times = times;
    }
     
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
