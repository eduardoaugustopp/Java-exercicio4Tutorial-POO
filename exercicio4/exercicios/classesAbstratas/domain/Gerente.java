package com.java.intermediario.classesAbstratas.domain;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salarioBonus = salario * 1.2;
    }
    
}