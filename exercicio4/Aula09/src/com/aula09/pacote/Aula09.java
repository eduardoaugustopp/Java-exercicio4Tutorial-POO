package com.aula09.pacote;

public class Aula09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p2.setNome("Eduardo");
		p4.setSetor("Teste");
		
		p3.setSalario(2500.75f);
		
		System.out.println(p2.toString());
		System.out.println(p4.toString());
		
		System.out.println(p3.toString());
	}

}