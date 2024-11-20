package com.aula11.pacote;

public class Reptil extends Animal{
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
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som");
	}
	
}
