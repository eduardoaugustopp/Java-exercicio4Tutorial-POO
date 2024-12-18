package com.java.intermediario.modificadorDeAcesso.test;

import com.java.intermediario.modificadorDeAcesso.domain.Funcionario;
import com.java.intermediario.modificadorDeAcesso.domain.Pessoa;

public class ModificadorDeAcessoPrivadoGetSet {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        Funcionario funcionario01 = new Funcionario();
        

        System.out.println("---classe Pessoa---");
        pessoa01.setNome("Jaime");
        pessoa01.setIdade(18); // idade < 0 = erro
        // pessoa01.imprime();
        System.out.println(pessoa01.getNome());
        System.out.println(pessoa01.getIdade());
        

        System.out.println();        
        System.out.println("---classe Funcionario---");
        funcionario01.setNome("Joao");
        funcionario01.setIdade(30);
        funcionario01.setSalarios(1300, 2600, 3200);
        // funcionario01.imprimeDados();
        System.out.println(funcionario01.getNome());
        System.out.println(funcionario01.getIdade());
        System.out.println(funcionario01.getMedia());
    }
}
