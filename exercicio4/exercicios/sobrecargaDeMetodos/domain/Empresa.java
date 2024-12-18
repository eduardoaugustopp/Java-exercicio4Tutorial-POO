package com.java.intermediario.sobrecargaDeMetodos.domain;

public class Empresa {
    private String nomeFantasia;
    private int quantidadeFuncionarios;
    private String cnpj;
    private String endereco;


    public void init(String nomeFantasia, int quantidadeFuncionarios, String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.cnpj = cnpj;
    }

    public void init(String nomeFantasia, int quantidadeFuncionarios, String cnpj, String endereco) {
        this.init(nomeFantasia, quantidadeFuncionarios, cnpj);
        this.endereco = endereco;
    }


    public void imprime() {
        System.out.println(this.nomeFantasia);
        System.out.println(this.quantidadeFuncionarios);
        System.out.println(this.cnpj);
        System.out.println(this.endereco);
    }


    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    // public void setNomeFantasia(String nomeFantasia) {
    //     this.nomeFantasia = nomeFantasia;
    // }

    // public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
    //     this.quantidadeFuncionarios = quantidadeFuncionarios;
    // }

    // public void setCnpj(String cnpj) {
    //     this.cnpj = cnpj;
    // }

    // public void setEndereco(String endereco) {
    //     this.endereco = endereco;
    // }
}
