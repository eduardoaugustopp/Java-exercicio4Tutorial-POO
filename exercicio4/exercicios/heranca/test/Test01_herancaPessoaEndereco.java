package com.java.intermediario.heranca.test;

import com.java.intermediario.heranca.domain.Endereco;
import com.java.intermediario.heranca.domain.Funcionario;
import com.java.intermediario.heranca.domain.Pessoa;

public class Test01_herancaPessoaEndereco {
    public static void main(String[] args) {
        Endereco endereco01 = new Endereco("Av Paulista", "06328-000");
        Pessoa pessoa01 = new Pessoa("Joao", "233.234.243-08", endereco01);
        Funcionario funcionario01 = new Funcionario("Pedro", "234.432.534-08", endereco01, 4500.00);

        System.out.println("---pessoa---");
        pessoa01.imprime();
        System.out.println("---funcionario---");
        funcionario01.imprime();
        funcionario01.imprimeRelatorio();

    }
}