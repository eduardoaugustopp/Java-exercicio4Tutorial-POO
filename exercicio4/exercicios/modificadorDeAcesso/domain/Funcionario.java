package com.java.intermediario.modificadorDeAcesso.domain;

/**
 * Modificadores de Acesso:
 * | Do mais restritivo ao menos restritivo:
 * | private -> default -> protected -> public
 * Uma classe filha nunca pode ter um modificador de 
 * acesso mais restritivo que a classe mae (classe super)
 */
public class Funcionario {
    private String nome;
    private int idade;
    private double media;    

    
    public void imprimeDados(){        
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.media);
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
    
    public double getMedia() {
        return this.media;
    }
    
    public void setSalarios(double...salarios) {
        if (salarios.length != 3) {
            System.err.println("Quantidade de salarios invalida!");
            System.err.println(salarios.length+" salarios digitados");
            System.err.println("Coloque somente 3 salarios para o calculo");
        } else {
            double soma = 0;
            for (double aux : salarios) {
                soma += aux;
            } 
            this.media = soma / 3;
        }
    }    
}
