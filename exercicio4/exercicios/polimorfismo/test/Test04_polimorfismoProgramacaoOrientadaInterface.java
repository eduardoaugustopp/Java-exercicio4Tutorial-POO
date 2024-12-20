package com.java.intermediario.polimorfismo.test;

import com.java.intermediario.polimorfismo.service.RepositorioArquivo;
import com.java.intermediario.polimorfismo.service.RepositorioBancoDeDados;

public class Test04_polimorfismoProgramacaoOrientadaInterface {
    public static void main(String[] args) {

        /**
         * Instancia de tipo especifico de objeto;
         * Impossibilita alterar as instancias com facilidade, tendo que 
         * reescrever o codigo com a classe a ser instanciada;
         * Nesse caso o erro acontece porque as classes nao estao na mesma
         * linha de Heranca;
         */
        RepositorioBancoDeDados rbd01 = new RepositorioBancoDeDados();
        rbd01.salvar();

        /**
         * Em progamacao orientada a interface, ao inves de instanciar
         * o objeto com o tipo especifico, usa-se um tipo mais generico
         * que nesse caso sera a propria interface;
         * Agora, a qualquer necessidade de mudar o objeto, troca-se apenas
         * a instancia, facilitando a manutencao do codigo;
         */
        RepositorioArquivo repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }

}
