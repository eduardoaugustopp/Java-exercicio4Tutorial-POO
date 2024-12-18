package com.java.intermediario.metodos.domain;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;
    public int matricula;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);        
    }

    // Ao implementar um metodo de impressao dentro da classe Estudante
    // você afeta o nível de coesão da classe, sendo ela responsável por
    // criar o objeto "Estudante", ela ainda esta com a tarefa de imprimir
    // os atributos feitos. 
    // Nesse caso, referente a qualidade do programa, seria melhor manter
    // a classe "ImprimeEstudante", onde uma é responsável apenas pelo objeto
    // estudante e a outra apenas pela impressao desse objeto.
}