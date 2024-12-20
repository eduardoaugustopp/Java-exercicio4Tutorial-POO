package com.java.intermediario.enumeracao.domain;

public class Cliente {
    // public enum TipoPagamento {
        // DEBITO, CREDITO
        /**
         * tbm é possivel usar dentro de uma classe
         */
    // }
    private String nome;
    private TipoCliente tipoCliente; // classe enum
    private TipoPagamento tipoPagamento;


    // enum classe propria
    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    // enum dentro da classe
    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", tipoCliente='" + getTipoCliente().getNomeRelatorio() + "'" +
            ", tipoCliente='" + getTipoCliente().VALOR + "'" +
            ", tipoPagamento='" + getTipoPagamento() + "'" +
            "}";
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return this.tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return this.tipoPagamento;
    }
}