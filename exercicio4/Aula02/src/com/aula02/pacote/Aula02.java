package com.aula02.pacote;

public class Aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
//		c1.tampada = false; //chamada referência a atributo sem ()
		c1.tampar();
		c1.status(); //chamada referência a método com ()
		c1.rabiscar();
		
		
		
		Caneta c2 = new Caneta();
		c2.modelo = "Hostnet";
		c2.cor = "Preta";
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}

}
