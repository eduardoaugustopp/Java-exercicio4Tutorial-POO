package com.java.intermediario.classesAbstratas.domain;

/**
 * Uma classe abstrata funciona somente 
 * como um Template, não é possível
 * criar um objeto direto dela
 */
public abstract class Funcionario {
    protected String nome;
    protected double salario;
    protected double salarioBonus;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    // força as subclasses a prover a implementaçao 
    // do método abstract;
    // métodos abstratos só podem existir dentro
    // de classes abstratas;
    public abstract void calculaBonus();

    @Override
    public String toString() {
        return getClass().getSimpleName() + 
            " {" +
            " nome='" + this.nome + "'" +
            ", salario='" + this.salario + "'" +
            ", salarioBonus='" + this.salarioBonus + "'" +
            "}";
    }
}