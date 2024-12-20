package com.java.intermediario.interfaces.domain;

public interface DataLoader {
    /**
     * Por padrao, toda constante de uma interface sao
     * "public static final" e ja vem implicito no codigo 
     * -> public static final int MAX_DATA_SIZE = 10;
     */
    int MAX_DATA_SIZE = 10;

    /**
     * Todo metodo de uma interface pode conter: abstract, default e static metodos;
     * Por padrao, o modificador de acesso "public" ja esta implicito o pode ser
     * omitido do codigo -> public abstract void load();
     * O metodo de uma interface sao declarados mas nao implementados, quem deve
     * prover as implementacoes sao as classes que implementam a interface;
     */
    abstract void load();

    /**
     * Modificador "default" criado para implementar um metodo
     * em uma interface sem obrigar a classe a implementar o 
     * mesmo;
     * Chamado de Modificador de Acesso de Pacote;
     */
    default void checkPermission(){
        System.out.println(getClass().getSimpleName()+" - Verificando permissoes");
    }

    /**
     * Podemos ter um metodo estatico dentro da interface
     * e que nao pode ser sobrescrito nas classes implements;
     * Qualquer tentativa de sobrescrever o metodo, sera criado
     * um metodo totalmente diferente e o @Override nao sera permitido;
     */
    static void retriveMaxDataSize() {
        System.out.println("interface DataLoader - Metodo estatico dentro da interface");
    }
}