package com.java.intermediario.classesAbstratas.test;

import com.java.intermediario.classesAbstratas.domain.Contabilidade;
// import com.java.intermediario.classesAbstratas.domain.Funcionario;
import com.java.intermediario.classesAbstratas.domain.Desenvolvedor;
import com.java.intermediario.classesAbstratas.domain.Gerente;

public class Test01_classesAbstratasFuncionario {
    public static void main(String[] args) {
        // Funcionario funcionario01 = new Funcionario("Pedro", 4000.00);
        // System.out.println(funcionario01); // *Cannot instantiate the type Funcionario

        Gerente gerente01 = new Gerente("Roberto", 7000.00);
        System.out.println(gerente01);
        
        Desenvolvedor desenvolvedor01 = new Desenvolvedor("Lais", 9500.00);
        System.out.println(desenvolvedor01);

        Contabilidade contabilidade01 = new Contabilidade("Maria", 2000.00);
        System.out.println(contabilidade01);
    }
}
