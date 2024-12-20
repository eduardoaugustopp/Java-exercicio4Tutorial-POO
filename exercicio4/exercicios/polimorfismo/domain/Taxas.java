package com.java.intermediario.polimorfismo.domain;

/**
 * Produto = classe abstrata;
 * Taxas = interface;
 * Computador e PlacaDeVideo = classes;
 * CalcularImposto = classe (pacote de servicos);
 * 
 * 2) Criou interface com metodo abstrato obrigatorio e 
 *    implementou essa interface na classe abstrata;
 */
public interface Taxas {
    double calculaImposto();
}
