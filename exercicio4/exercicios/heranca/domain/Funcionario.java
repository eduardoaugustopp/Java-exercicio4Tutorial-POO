package com.java.intermediario.heranca.domain;

/**
 * "extends" para a classe "Funcionario" herdar
 * os atributos da classe "Pessoa" (classe Mãe);
 */
public class Funcionario extends Pessoa {
    private double salario;

    // "super" para sobreescrever os atributos na classe atual;
    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    // "super" para acessar o metodo "imprime()" da classe mãe;
    public void imprime() {
        super.imprime();
        System.out.println("Salario: "+this.salario);
    }

    // metodo acessando o atributo "nome" da classe pessoa;
    public void imprimeRelatorio() {
        System.out.println("Eu "+ this.nome +" recebi o salario de R$"+this.salario);
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}