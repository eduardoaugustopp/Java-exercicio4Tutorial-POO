package com.pessoa.pacote;

public class Aula08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 22, "M");
		p[1] = new Pessoa("Maria", 25, "F");
		
		l[0] = new Livro("TESTE1", "Augusto", 300, 0, false, p[0]);
		
		l[1] = new Livro("TESTE2", "Paiva", 500, 0, false, p[1]);
		
		System.out.println(l[0].detalhes());
	}

}
