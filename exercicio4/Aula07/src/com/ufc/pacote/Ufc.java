package com.ufc.pacote;

public class Ufc {
	public static void main(String[] args) {
		Lutador[] L = new Lutador[6];
		L[0] = new Lutador ("JAVA", "França", 31, 1.75f, 68.9f, 11, 3, 1);
		L[1] = new Lutador ("JS", "Brasil", 31, 1.7f, 57.8f, 11, 3, 1);
		L[2] = new Lutador ("CSS", "Argentina", 31, 1.75f, 80.9f, 11, 3, 1);
		L[3] = new Lutador ("HTML", "Holanda", 31, 1.75f, 81.6f, 11, 3, 1);
		L[4] = new Lutador ("REACT", "Espanha", 31, 1.75f, 62f, 11, 3, 1);
		L[5] = new Lutador ("C#", "Alemanha", 31, 1.75f, 53f, 11, 3, 1);
		

		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(L[0], L[1]);
		UEC01.lutar();
		
		L[0].status();
		L[1].status();
		
		
		
	}

}
