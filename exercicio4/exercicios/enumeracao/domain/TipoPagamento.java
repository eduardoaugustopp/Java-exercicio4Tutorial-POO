package com.java.intermediario.enumeracao.domain;

/**
 * aplicar desconto por tipo de pagamento
 */
public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.9;
        }
    }, 
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.95;
        }
    };

    public abstract double calcularDesconto(double valor);
}