package com.java.intermediario.associacaoArrayComObjetos.test;

import com.java.intermediario.associacaoArrayComObjetos.domain.ExercicioAluno;
import com.java.intermediario.associacaoArrayComObjetos.domain.ExercicioLocalidade;
import com.java.intermediario.associacaoArrayComObjetos.domain.ExercicioProfessor;
import com.java.intermediario.associacaoArrayComObjetos.domain.ExercicioSeminario;
import com.java.intermediario.associacaoArrayComObjetos.domain.Imprime;

/*
 * Sistema de cadastro de seminarios, estudantes, 
 * professores e local onde será realizado;
 * 
 * um seminario deve ter um local
 * um seminario podera ter nenhum ou vários alunos;
 * um seminario podera ter um ou mais professores;
 * um professor poderá ministrar um seminario;
 * um aluno poderá estar em apenas um seminario;
 */

public class Test05_exercicioAssociacaoDeClasses {
    public static void main(String[] args) {
        ExercicioAluno aluno01 = new ExercicioAluno("Rafael", 25);
        ExercicioAluno aluno02 = new ExercicioAluno("Diego", 28);
        ExercicioAluno aluno03 = new ExercicioAluno("Larissa", 23);
        ExercicioAluno aluno04 = new ExercicioAluno("Angela", 26);
        ExercicioAluno aluno05 = new ExercicioAluno("Natalia", 26);
        ExercicioAluno aluno06 = new ExercicioAluno("Guilherme", 30);
        ExercicioAluno aluno07 = new ExercicioAluno("Davi", 31);
        ExercicioAluno aluno08 = new ExercicioAluno("Maria", 29);
        ExercicioAluno aluno09 = new ExercicioAluno("Luana", 30);

        ExercicioProfessor professor01 = new ExercicioProfessor("Ricardo", "Matematica");
        ExercicioProfessor professor02 = new ExercicioProfessor("Ana Paula", "Engenharia de Software");
        ExercicioProfessor professor03 = new ExercicioProfessor("Elaine", "Engenharia de Software");
        ExercicioProfessor professor04 = new ExercicioProfessor("Tiba Sato", "Analise e Desenvolvimento de Sistemas");
        ExercicioProfessor professor05 = new ExercicioProfessor("Ladenilson", "Ciencia da Computacao");
        ExercicioProfessor professor06 = new ExercicioProfessor("Andre", "Ciencia da Computacao");
        
        ExercicioLocalidade local01 = new ExercicioLocalidade("Av Paulista - SP");
        ExercicioLocalidade local02 = new ExercicioLocalidade("Av Reboucas - SP");
        ExercicioLocalidade local03 = new ExercicioLocalidade("Av Consolacao - SP");

        ExercicioSeminario seminario01 = new ExercicioSeminario("Matematica Aplicada para Engenharia de Sistemas", local01, professor01);
        ExercicioProfessor[] professoresSeminario02 = {professor02, professor03};
        ExercicioSeminario seminario02 = new ExercicioSeminario("Estatistica Analitica", local01, professoresSeminario02);
        ExercicioProfessor[] professoresSeminario03 = {professor04, professor05};
        ExercicioSeminario seminario03 = new ExercicioSeminario("Estrutura de Dados", local02, professoresSeminario03);
        ExercicioSeminario seminario04 = new ExercicioSeminario("Algoritmos", local03, professor06);
        
        ExercicioAluno[] alunosSeminario02 = {aluno01, aluno02, aluno03};
        seminario02.setAlunos(alunosSeminario02);
        ExercicioAluno[] alunosSeminario03 = {aluno04, aluno05, aluno06, aluno07, aluno08};
        seminario03.setAlunos(alunosSeminario03);
        seminario04.setAluno(aluno09);


        
        
        Imprime impressora = new Imprime();

        System.out.println("---RELATORIO SEMINARIO---");
        impressora.imprimeRelatorio(seminario01);
        impressora.imprimeRelatorio(seminario02);
        impressora.imprimeRelatorio(seminario03);
        impressora.imprimeRelatorio(seminario04);
        System.out.println();

        System.out.println("---LISTA SEMINARIOS---");
        impressora.imprimeSeminario(seminario01, seminario02, seminario03, seminario04);
        System.out.println();

        System.out.println("---LISTA ENDERECOS---");
        impressora.imprimeLocalidade(local01, local02, local03);
        System.out.println();

        System.out.println("---LISTA PROFESSORES---");
        impressora.imprimeProfessor(professor01, professor02, professor03, professor04, professor05, professor06);
        System.out.println();

        System.out.println("---LISTA ALUNOS---");
        impressora.imprimeAluno(aluno01, aluno02, aluno03, aluno04, aluno05, aluno06, aluno07, aluno08, aluno09);
        System.out.println();
    }
}