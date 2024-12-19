package com.java.intermediario.heranca.domain;

public class Pessoa {
    // libera acesso a todas as classe filhas e as demais 
    // que estiverem dentro do mesmo pacote
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+ this.cpf);
        System.out.println("Endereco: "+ this.endereco.getRua());
        System.out.println("CEP: "+ this.endereco.getCep());
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}