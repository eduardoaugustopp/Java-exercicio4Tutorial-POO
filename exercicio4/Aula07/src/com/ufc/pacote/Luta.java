package com.ufc.pacote;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	
	public void  setDesafiado(Lutador ado) {
		this.desafiado = ado;
	}
	
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	
	public void setDesafiante(Lutador ante) {
		this.desafiante = ante;
	}
	
	public int getRounds() {
		return this.rounds;
	}
	
	public void setRounds(int r) {
		this.rounds = r;
	}
	
	public boolean getAprovada() {
		return this.aprovada;
	}
	
	public void setAprovada(boolean a) {
		this.aprovada = a;
	}
	
	public void marcarLuta(Lutador L1, Lutador L2){
		if (L1.getCategoria().equals(L2.getCategoria())
			&&  L1 != L2) {
				this.aprovada = true;
				this.desafiado = L1;
				this.desafiante = L2;
			} else {
				this.aprovada = false;
				this.desafiado = null;
				this.desafiante = null;
			}
	}
	
	public void lutar() {
		if (this.aprovada) {
			System.out.println("DESAFIADO");
			this.getDesafiado().apresentar();
			System.out.println("DESAFIANTE");
			this.getDesafiante().apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // vai gerar 3 resultados 0 1 2
			switch(vencedor) {
			case 0: //Empate
				System.out.println("EMPATOU");
				this.getDesafiado().empatarLuta();
				this.getDesafiante().empatarLuta();
				break;
			
			case 1:// Desafiado vence
				System.out.println("Vitória do " + this.getDesafiado().getNome());
				this.getDesafiado().ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: // Desafiante vence
				System.out.println("Vitória do " + this.getDesafiante().getNome());
				this.getDesafiante().ganharLuta();
				this.getDesafiado().perderLuta();
				break;
			}
			
			
		} else {
			System.out.println("A luta não pode acontecer");
		}
		
	}
	
}
