package com.java.intermediario.interfaces.domain;

/**
 * Para toda implementacao de interfaces, os metodos
 * da interface devem ser implementados na classe;
 * Podem ser implementados mais de uma interface na 
 * classe;
 */
public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println(getClass().getSimpleName()+" - Metodo carrega dados");
    }

    @Override
    public void remove() {
        System.out.println(getClass().getSimpleName()+" - Metodo remove dados");        
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
    }

    /**
     * Podemos ter um metodo estatico dentro da interface
     * e que nao pode ser sobrescrito nas classes implements;
     * Qualquer tentativa de sobrescrever o metodo, sera criado
     * um metodo totalmente diferente e o @Override nao sera permitido;
     */
    // @Override
    public static void retriveMaxDataSize() {
        System.out.println("class DataBaseLoader implements DataLoader - Metodo estatico dentro da classe");
    }
}