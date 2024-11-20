package com.aula11.pacote;

public class Peixe extends Animal {
	private String corEscama;
	
	public String getcorEscama() {
		return this.corEscama;
	}
	
	public void setcorEscama(String e) {
		this.corEscama = e;
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Não");
	}
	
	public void soltarBolha() {
		System.out.println("Bolha");
	}
}
