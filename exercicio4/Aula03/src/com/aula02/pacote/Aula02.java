package com.aula02.pacote;

public class Aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta c1 = new Caneta();
		c1.modelo = "BIC cristal";
		c1.cor = "Azul";
		// c1.ponta = 0.5f;
		c1.carga = 80;
//		c1.tampada = true;
		c1.destampar();
		c1.status(); 
		c1.rabiscar();
		
	}

}
