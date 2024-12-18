package com.java.intermediario.associacaoArrayComObjetos.domain;

/**
 * associacao unidirecional
 */

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime() {

        // imprime nome da escola
        System.out.println(this.nome);

        // se nao houver associacao a professores, entao out
        if (professores == null) {
            return;
        }

        // para cada professor em professores, print
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return this.professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

}
