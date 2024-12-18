package com.java.intermediario.metodos.domain;

public class ImprimeEstudante {
    public void imprime(Estudante estudante) {
        System.out.println(estudante.nome+", "+estudante.idade+", "+estudante.sexo);
    }
}