package com.java.intermediario.interfaces.test;

import com.java.intermediario.interfaces.domain.DataBaseLoader;
import com.java.intermediario.interfaces.domain.DataLoader;
import com.java.intermediario.interfaces.domain.FileLoader;

public class Test01_inteface {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader01 = new DataBaseLoader();
        FileLoader fileLoader01 = new FileLoader();
        
        // metodos implementados obrigatorios da interface
        dataBaseLoader01.load();
        dataBaseLoader01.remove();
        fileLoader01.load();
        fileLoader01.remove();
        
        // metodo default implementado somente em uma classe
        dataBaseLoader01.checkPermission();
        
        // metodo static na interface e na classe
        DataLoader.retriveMaxDataSize();
        DataBaseLoader.retriveMaxDataSize();
    }
}
