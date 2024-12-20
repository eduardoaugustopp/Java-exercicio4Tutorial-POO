package com.java.intermediario.polimorfismo.domain;

/**
 * Produto = classe abstrata;
 * Taxas = interface;
 * Computador e PlacaDeVideo = classes;
 * CalcularImposto = classe (pacote de servicos);
 * 
 * 3) Nas classes:
 *    - Criou uma var constante;
 *    - Implementou construtor da classe extends;
 *    - Implementou metodo da interface;
 *    - Implementou metodos get();
 */
public class Computador extends Produto {
    public static final double IMPOSTO_SOBRE_COMPUTADOR = .21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println(getClass().getSimpleName()+" - calcula imposto do computador");
        return this.valor * IMPOSTO_SOBRE_COMPUTADOR;
    }
    
}