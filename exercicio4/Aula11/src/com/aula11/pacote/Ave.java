package com.aula11.pacote;

public class Ave extends Animal {
	
	private String corPena;
	
	public String getcorPena() {
		return this.corPena;
	}
	
	public void setcorPena(String p) {
		this.corPena = p;
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Frutas");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("SOM");
	}
	public void fazerNinho() {
		System.out.println("Construiu");
	}
		
}
