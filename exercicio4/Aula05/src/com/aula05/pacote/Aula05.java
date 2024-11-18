package com.aula05.pacote;


public class Aula05 {
	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Eduardo");
		p1.abrirConta("CC");
		
		p1.depositar(500);
		p1.sacar(150);
		p1.fecharConta();
	
		p1.estadoAtual();
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Augusto");
		p2.abrirConta("CP");
		
		p2.estadoAtual();
	}
}