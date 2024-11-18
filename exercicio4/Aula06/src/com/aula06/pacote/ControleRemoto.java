package com.aula06.pacote;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(false);

	}

	private int getVolume() {
		return this.volume;
	}

	private void setVolume(int v) {
		this.volume = v;
	}

	private boolean getLigado() {
		return this.ligado;
	}

	private void setLigado(boolean l) {
		this.ligado = l;
	}

	private boolean getTocando() {
		return this.tocando;
	}

	private void setTocando(boolean t) {
		this.tocando = t;
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		// TODO Auto-generated method stub
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		for(int i = 0; i<= this.getVolume(); i+=10) {
			System.out.print("|");
		}
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		System.out.println("Fechando Menu");
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			this.setVolume(this.getVolume()+5);
			
		}
	}

	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			this.setVolume(this.getVolume()-5);
		}

	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getVolume() >0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}

	}
}
