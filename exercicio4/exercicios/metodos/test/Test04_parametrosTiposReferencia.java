package com.java.intermediario.metodos.test;

import com.java.intermediario.metodos.domain.Estudante;
import com.java.intermediario.metodos.domain.ImprimeEstudante;

public class Test04_parametrosTiposReferencia {
    public static void main(String[] args) {        

        /**
         * Passagem de paramentros
         * Tipo Referência
         * 
         * usando classe especifica para imprimir objetos
         */

        // instancia classe Estudantes e ImprimeEstudante
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante01.nome = "Joao";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        // "estudante01 e 02" estão sendo referenciado para o "estudante" da
        // classe ImprimeEstudante, onde os valores são atribuídos e executados
        // método "imprime";
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


        /**
         * Passagem de paramentros
         * Tipo Referência
         * 
         * usando metodo dentro da propria classe para imprimir
         */

        Estudante estudante03 = new Estudante();
        Estudante estudante04 = new Estudante();

        estudante03.nome = "Enzo";
        estudante03.idade = 14;
        estudante03.sexo = 'M';

        estudante04.nome = "Valentina";
        estudante04.idade = 14;
        estudante04.sexo = 'F';

        // metodo dentro da classe "Estudante"
        estudante03.imprime();
        estudante04.imprime();
    }
}
