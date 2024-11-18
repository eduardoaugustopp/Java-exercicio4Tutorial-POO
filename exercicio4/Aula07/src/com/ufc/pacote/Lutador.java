package com.ufc.pacote;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador(String no, String na, int i, double a, double p, int v, int d, int e) {
		this.setNome(no);
		this.setNacionalidade(na);
		this.setIdade(i);
		this.setAltura(a);
		this.setPeso(p);
		this.setVitorias(v);
		this.setDerrotas(d);
		this.setEmpates(e);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String no) {
		this.nome = no;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(String na) {
		this.nacionalidade = na;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int i) {
		this.idade = i;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double a) {
		this.altura = a;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double p) {
		this.peso = p;
		this.setCategoria();

	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria() { // categoria não vai ser utilizada do lado de fora, vai ser um método interno
									// por isso não tem parâmetro
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";
		} else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		} else if (this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		} else if (this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return this.vitorias;
	}

	public void setVitorias(int v) {
		this.vitorias = v;
	}

	public int getDerrotas() {
		return this.derrotas;
	}

	public void setDerrotas(int d) {
		this.derrotas = d;
	}

	public int getEmpates() {
		return this.empates;
	}

	public void setEmpates(int e) {
		this.empates = e;
	}

	public void apresentar() {
		System.out.println("--------------------------");
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println(this.getIdade() + "anos");
		System.out.println(this.getAltura() + " m de altura");
		System.out.println("Pesando: " + this.getPeso() + "Kg");
		System.out.println("Ganhou: " + this.getVitorias());
		System.out.println("Perdeu: " + this.getDerrotas());
		System.out.println("Empatou: " + this.getEmpates());
	}

	public void status() {
		System.out.println(this.getNome());
		System.out.println("É um peso de " + this.getCategoria());
		System.out.println(this.getVitorias() + "vitórias");
		System.out.println(this.getDerrotas() + "derrotas");
		System.out.println(this.getEmpates() + "empates");

	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);

	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);

	}
}
