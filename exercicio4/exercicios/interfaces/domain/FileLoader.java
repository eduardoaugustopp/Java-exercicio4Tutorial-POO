package com.java.intermediario.interfaces.domain;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println(getClass().getSimpleName()+" - Metodo carrega arquivo");        
    }

    @Override
    public void remove() {
        System.out.println(getClass().getSimpleName()+" - Metodo remove arquivo");
    }
}