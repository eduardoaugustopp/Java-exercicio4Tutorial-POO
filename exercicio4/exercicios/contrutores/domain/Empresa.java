package com.java.intermediario.contrutores.domain;


public class Empresa {
    private String nomeFantasia;
    private int quantidadeFuncionarios;
    private String cnpj;
    private String endereco;
    private String site; // *** adicao de atributo fora do escopo previsto;

    /**
     * Construtores
     * 
     * não pode haver retorno, senão configura um método;
     * sempre inicializado antes do métodos;
     */
    public Empresa(String nomeFantasia, int quantidadeFuncionarios, String cnpj, String endereco) {
        // this(); // *** sobrecarga de construtores: chama o proximo construtor;
        this.nomeFantasia = nomeFantasia;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public Empresa(String nomeFantasia, int quantidadeFuncionarios, String cnpj, String endereco, String site) {
        this(nomeFantasia, quantidadeFuncionarios, cnpj, endereco); // *** sobrecarga de construtores: chama o proximo construtor;
        this.site = site;
    }

    
    
    
    public void imprime() {
        System.out.println(this.nomeFantasia);
        System.out.println(this.quantidadeFuncionarios);
        System.out.println(this.cnpj);
        System.out.println(this.endereco);
        System.out.println(this.site);
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
}
