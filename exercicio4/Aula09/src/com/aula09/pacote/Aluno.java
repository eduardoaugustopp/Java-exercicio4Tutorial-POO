package com.aula09.pacote;

public class Aluno extends Pessoa {
	private int matr;
	private String curso;

	public void cancelarMatr() {
		System.out.println("Cancelada");
	}
	
	public int getMatr() {
		return this.matr;
	}
	
	public void setMatr(int m) {
		this.matr = m;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
