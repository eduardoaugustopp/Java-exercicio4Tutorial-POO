package com.java.intermediario.metodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    private double salario;

    

    public void salarioMedio(double...salarios) {
        if (salarios.length != 3) {
            System.err.println("Quantidade de salarios invalida!");
            System.err.println(salarios.length+" salarios digitados");
            System.err.println("Coloque somente 3 salarios para o calculo");
        } else {
            double soma = 0;
            for (double aux : salarios) {
                soma += aux;
            } 
            this.salario = soma / 3;
        }
    }
    
    

    public void imprimeDados(){        
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
    }
}
