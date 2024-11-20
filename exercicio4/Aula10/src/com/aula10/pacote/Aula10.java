package com.aula10.pacote;

public class Aula10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Visitante v1 = new Visitante();
//		v1.setNome("Teste");
//		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome(" Teste");
		a1.setMatricula(111);
		System.out.println(a1.toString());
		
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Eduardo ");
		b1.pagarMensalidade();
	}

}
