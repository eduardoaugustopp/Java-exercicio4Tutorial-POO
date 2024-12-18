package com.java.intermediario.classes.test;

import com.java.intermediario.classes.domain.Estudante;
import com.java.intermediario.classes.domain.Professor;

/**
 * Classes:
 * 
 * Estudante;
 * Professor;
 */
public class Test01_classesIntroducao {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Joao";
        estudante.idade = 30;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println();

        Professor professor = new Professor();
        professor.nome = "Maria";
        professor.idade = 45;
        professor.sexo = 'F';

        System.out.println( "Nome: "+ professor.nome +"; Idade: "+ professor.idade +"; Sexo: "+ professor.sexo);
    }
}
