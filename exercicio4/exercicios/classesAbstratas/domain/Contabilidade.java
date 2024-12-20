package com.java.intermediario.classesAbstratas.domain;

public class Contabilidade extends Funcionario {

    public Contabilidade(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salarioBonus = salario * 1.07;
    }
    
}
