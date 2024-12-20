package com.java.intermediario.polimorfismo.service;

/**
 * Produto = classe abstrata;
 * Taxas = interface;
 * Computador e PlacaDeVideo = classes;
 * CalcularImposto = classe (pacote de servicos);
 * 
 * 4) Criou o pacote Services, que contem dois metodos estaticos
 *    que recebem como parametros os objetos de Computador e 
 *    PlacaDeVideo. Cada metodo é responsavel por imprimir
 *    um relatorio;
 */
import com.java.intermediario.polimorfismo.domain.Computador;
import com.java.intermediario.polimorfismo.domain.PlacaDeVideo;
import com.java.intermediario.polimorfismo.domain.Produto;

public class CalculadoraImposto {
    // utililzado no Test01;
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatorio de imposto Computador");
        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto a ser pago " + computador.calculaImposto());
    }

    // utililzado no Test01;
    public static void calcularImpostoPlacadeVideo(PlacaDeVideo placadeVideo) {
        System.out.println("Relatorio de imposto Placa de Video");
        System.out.println("Placa de Video " + placadeVideo.getNome());
        System.out.println("Valor " + placadeVideo.getValor());
        System.out.println("Imposto a ser pago " + placadeVideo.calculaImposto());
    }

    /**
     * Test02:
     * A criacao de um metodo generico possibilita a criacao de novos produtos
     * no sistema sem a necessidade de manutencao na classe de servicos, que 
     * fornece os relatorios de impostos de cada produto. Nesse caso, viabiliza
     * a escalabilidade do software com manutencao reduzida, como é mostrado na
     * criacao da classe Monitor, que nao existia até entao;
     * Após a criacao desse metodo generico para produtos, os metodos acima ficam
     * obsoletos e nem precisam serem escritos;
     * !Só nao foram removidos por conta do Test01 que esta utilizando cada metodo;
     */
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto do Produto");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: R$" + produto.calculaImposto());
    }
}
