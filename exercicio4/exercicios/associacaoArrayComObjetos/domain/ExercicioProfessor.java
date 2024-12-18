package com.java.intermediario.associacaoArrayComObjetos.domain;

public class ExercicioProfessor {
    private String nome;
    private String especialidade;

    public ExercicioProfessor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}