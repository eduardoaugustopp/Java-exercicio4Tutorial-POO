package com.java.intermediario.modificadorDeAcesso.domain;

/**
 * Modificadores de Acesso:
 * | Do mais restritivo ao menos restritivo:
 * | private -> default -> protected -> public
 * Uma classe filha nunca pode ter um modificador de 
 * acesso mais restritivo que a classe mae (classe super)
 */
public class Pessoa {
    // atributos privados
    private String nome;
    private int idade;


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
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
        if (idade < 0) {
            System.err.println("Idade invalida!");
            return;
        }
        this.idade = idade;
    }
}
