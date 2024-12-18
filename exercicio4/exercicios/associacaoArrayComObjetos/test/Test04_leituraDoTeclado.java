package com.java.intermediario.associacaoArrayComObjetos.test;

import java.util.Scanner;

public class Test04_leituraDoTeclado {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.close();
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite seu gênero (M ou F): ");
        char sexo = entrada.next().charAt(0);

        System.out.println("\nNome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Gênero: "+sexo);        
     }
}
