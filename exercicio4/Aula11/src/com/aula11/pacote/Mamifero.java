package com.aula11.pacote;

public class Mamifero extends Animal {
	private String corPelo;

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Alimentando");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som");
	}
	
	public String getcorPelo() {
		return this.corPelo;
	}
	public void setcorPelo(String c) {
		this.corPelo = c;
	}

}
