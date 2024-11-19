package com.pessoa.pacote;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String t) {
		this.titulo = t;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String a) {
		this.autor = a;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int tot) {
		this.totPaginas = tot;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int p) {
		this.pagAtual = p;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean ab) {
		this.aberto = ab;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa l) {
		this.leitor = l;
	}
	
	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas + ", pagAtual=" + pagAtual
				+ ", aberto=" + aberto + ", leitor=" + leitor.getNome() + "]";
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.setAberto(false);
	}

	@Override
	public void folhear(int p) {
		// TODO Auto-generated method stub
		this.setPagAtual(p);
	}

	@Override
	public void avançarPag() {
		// TODO Auto-generated method stub
		this.setPagAtual(getPagAtual() + 1);
	}

	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		this.setPagAtual(getPagAtual() - 1);
	}

}
