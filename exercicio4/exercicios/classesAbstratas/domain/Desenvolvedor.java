package com.java.intermediario.classesAbstratas.domain;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salarioBonus = salario * 1.1;
    }
}
