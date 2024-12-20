package com.java.intermediario.enumeracao.domain;

/**
 * Enumeraçoes forçam as escolhas disponiveis
 * e garantem a tipagem correta para o funcionamento
 * do codigo;
 */
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");
    public final int VALOR;
    private String nomeRelatorio;

    // construtor é privado, quem chama o contrutor é a enumeracao
    TipoCliente (int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente buscarPorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
