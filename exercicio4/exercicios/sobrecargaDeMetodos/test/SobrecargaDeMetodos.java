package com.java.intermediario.sobrecargaDeMetodos.test;

import com.java.intermediario.sobrecargaDeMetodos.domain.Empresa;

public class SobrecargaDeMetodos {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // empresa.setNomeFantasia("Tecnolight");
        // empresa.setQuantidadeFuncionarios(33);
        // empresa.setCnpj("00.000.000/0001-91");
        // empresa.imprime();

        empresa.init("Tecnolight", 33,"00.000.000/0001-91");
        empresa.init("Ecil Energia", 33,"00.000.000/0001-91","Av Pilar do Sul");
        empresa.imprime();

        /**
         * o metodo "init" substitui os metodos "set" e em condicao da necessidade
         * de adicionar mais atributos a classe, o metodo de inicializacao pode ser
         * sobreposto por metodo de mesmo nome.
         * isso vale tbm para os dados inseridos no metodo, que tera como prioridade
         * a ultima declaracao de atributos feita, ou seja, a prioridade sera do 
         * segundo "init" nesse caso.
         */
    }
}
