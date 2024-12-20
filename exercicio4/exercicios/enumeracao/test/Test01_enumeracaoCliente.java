package com.java.intermediario.enumeracao.test;

import com.java.intermediario.enumeracao.domain.Cliente;
import com.java.intermediario.enumeracao.domain.TipoCliente;
import com.java.intermediario.enumeracao.domain.TipoPagamento;

public class Test01_enumeracaoCliente {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Pedro",TipoCliente.PESSOA_FISICA); // enum classe
        Cliente cliente02 = new Cliente("Joao", TipoCliente.PESSOA_FISICA); // enum classe
        // Cliente cliente03 = new Cliente("Larissa", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO_CLIENTE); // enum dentro da classe
        // Cliente cliente04 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO_CLIENTE); // enum dentro da classe
        Cliente cliente05 = new Cliente("Jose", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO); // enum dentro da classe
        Cliente cliente06 = new Cliente("Paula", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO); // enum dentro da classe
        
        System.out.println(cliente01);
        System.out.println(cliente02);
        // System.out.println(cliente03);
        // System.out.println(cliente04);
        System.out.println(cliente05);
        System.out.println(cliente06);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());

        TipoCliente tipoCliente2 = TipoCliente.buscarPorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }    
}