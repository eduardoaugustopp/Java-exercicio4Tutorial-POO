package com.pessoa.pacote;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	
	public Pessoa(String n, int i, String s) {
		this.setNome(n);
		this.setIdade(i);
		this.setSexo(s);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setSexo(String s) {
		this.sexo = s;
	}
	
	public void fazerNiver() {
		this.setIdade(getIdade() +1); 
	}
	
	}


