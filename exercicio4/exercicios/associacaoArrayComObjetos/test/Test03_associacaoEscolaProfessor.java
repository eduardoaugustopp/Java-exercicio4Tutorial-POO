package com.java.intermediario.associacaoArrayComObjetos.test;

import com.java.intermediario.associacaoArrayComObjetos.domain.Escola;
import com.java.intermediario.associacaoArrayComObjetos.domain.Professor;


/**
 * associacao unidirecional
 */

public class Test03_associacaoEscolaProfessor {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Joao");
        Professor professor02 = new Professor("Maria");
        Professor[] professores = {professor01,professor02};
        Escola escola = new Escola("EE Manoel da Conceicao Santos",professores);

        // escola.getProfessores();
        escola.imprime();
    }
}
