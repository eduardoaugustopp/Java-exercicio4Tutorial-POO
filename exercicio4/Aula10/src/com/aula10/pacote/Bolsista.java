package com.aula10.pacote;

public class Bolsista extends Aluno {
		private float bolsa;
		
		public void renovarBolsa() {
			System.out.println("Renovando" + this.nome);
		}
		
		@Override
		public void pagarMensalidade() {
			System.out.println(this.nome + "bolsista");
		}
}
