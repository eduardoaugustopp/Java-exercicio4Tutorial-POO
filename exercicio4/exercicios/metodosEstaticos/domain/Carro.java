package com.java.intermediario.metodosEstaticos.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro (String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.print(nome);
        System.out.print("; Velocidade máxima: "+velocidadeMaxima);
        System.out.println("; Velocidade limite: "+Carro.velocidadeLimite);
    }

    // acessando atributo estático
    // metodos estáticos podem ser acessados sem a necessidade
    // de instanciar a classe em que ele se encontra
    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeLimite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeLimite;
    }


}
