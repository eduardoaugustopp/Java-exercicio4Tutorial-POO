package com.java.intermediario.polimorfismo.service;

import com.java.intermediario.polimorfismo.repository.Ropositorio;

public class RepositorioBancoDeDados implements Ropositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em banco de dados");        
    }
    
}
