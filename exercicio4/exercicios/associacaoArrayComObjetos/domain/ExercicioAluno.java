package com.java.intermediario.associacaoArrayComObjetos.domain;

public class ExercicioAluno {
    private String nome;
    private int idade;
    private ExercicioSeminario seminario;

    public ExercicioAluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime() {
        System.out.println(getNome());
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ExercicioSeminario getSeminario() {
        return this.seminario;
    }

    public void setSeminario(ExercicioSeminario seminario) {
        this.seminario = seminario;
    }
}