package com.aula4.pacote;

public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;

	public Caneta(String m, String c, float p) {
		this.setModelo(m);
		this.setPonta(p);
		this.cor = c;
		this.tampar();

	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String m) {
		this.modelo = m;
	}

	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float p) {
		this.ponta = p;
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	public void status() {
		System.out.println("Sobre a caneta:");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);

//		System.out.println("Modelo: " + this.getModelo());// saida com get
//		System.out.println("Ponta: " + this.getPonta());

		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
}
