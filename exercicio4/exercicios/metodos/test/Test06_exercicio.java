package com.java.intermediario.metodos.test;

import com.java.intermediario.metodos.domain.Funcionario;

public class Test06_exercicio {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.nome = "Joao";
        funcionario01.idade = 30;
        funcionario01.salarioMedio(1200, 987.32, 2000);

        funcionario01.imprimeDados();
    }
}
