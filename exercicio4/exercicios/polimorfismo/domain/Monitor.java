package com.java.intermediario.polimorfismo.domain;

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
public class Monitor extends Produto {
    public static final double IMPOSTO_SOBRE_MONITOR = .1;

    public Monitor(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println(getClass().getSimpleName()+" - calcula imposto do Monitor");
        return this.valor * IMPOSTO_SOBRE_MONITOR;
    }
    
}