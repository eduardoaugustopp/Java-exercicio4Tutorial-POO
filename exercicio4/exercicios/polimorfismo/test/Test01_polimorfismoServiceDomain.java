package com.java.intermediario.polimorfismo.test;

import com.java.intermediario.polimorfismo.domain.Computador;
import com.java.intermediario.polimorfismo.domain.PlacaDeVideo;
import com.java.intermediario.polimorfismo.service.CalculadoraImposto;

/**
 * Produto = classe abstrata;
 * Taxas = interface;
 * Computador e PlacaDeVideo = classes;
 * CalcularImposto = classe (pacote de servicos);
 * 
 * 1) Criou classe abstrata para implementar nas classes os atributos e construtor, 
 *    sendo que essa classe abstrata nao pode ser instanciada;
 * 2) Criou interface com metodo abstrato obrigatorio e implementou essa interface 
 *    na classe abstrata;
 * 3) Nas classes:
 *    - Criou uma var constante;
 *    - Implementou construtor da classe extends;
 *    - Implementou metodo da interface;
 *    - Implementou metodos get();
 * 4) Criou o pacote Services, que contem dois metodos estaticos que recebem como 
 *    parametros os objetos de Computador e PlacaDeVideo. Cada metodo é responsavel 
 *    por imprimir um relatorio;
 * 5) Criou classe main teste que instancia as classes, insere os parametros 
 *    obrigatorios da classe abstract e chama os metodos da classe de servico para 
 *    impressao de relatorio;
 */
public class Test01_polimorfismoServiceDomain {
    public static void main(String[] args) {
        /**
         * Até agora, criamos um objeto utilizando a mesma classe que instanciamos;
         * No Test02, criamos um objeto a partir da superclasse abstrata Produto;
         */
        Computador computador01 = new Computador("Galaxy Book Pro 360 13\"", 8410.90);
        PlacaDeVideo placadevideo01 = new PlacaDeVideo("AMD Radeon RX 6700 XT DDR6", 3587.00);

        CalculadoraImposto.calcularImpostoComputador(computador01);
        CalculadoraImposto.calcularImpostoPlacadeVideo(placadevideo01);

    }
}
