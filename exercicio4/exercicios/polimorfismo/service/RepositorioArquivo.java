package com.java.intermediario.polimorfismo.service;

import com.java.intermediario.polimorfismo.repository.Ropositorio;

public class RepositorioArquivo implements Ropositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo");
    }
    
}
