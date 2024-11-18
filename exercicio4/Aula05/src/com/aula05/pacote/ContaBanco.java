package com.aula05.pacote;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public void estadoAtual() {
		System.out.println("----------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public void ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}

	public int getNumConta() {
		return this.numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getDono() {
		return this.dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double s) {
		this.saldo = s;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean st) {
		this.status = st;
	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t.equals("CC")) {
			this.setSaldo(50);
		} else if (t.equals("CP")) {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta em débito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}

	}

	public void depositar(double v) {
		if (status == true) {
//			saldo += v; outra forma
			this.setSaldo(getSaldo() + v);
			System.out.println("Dépósito realizado com sucesso");
		} else {
			System.out.println("Imposível deposita"); // Conta fechada
		}
	}

	public void sacar(double v) {
		if (this.getStatus()) { // Verifica se a conta está ativa
			if (this.getSaldo() >= v) { // Verifica se há saldo suficiente
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado com sucesso!");
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossível sacar: conta inativa");
		}
	}

	public void pagarMensalidade() {
		double v = 0; // Atribui um valor inicial à variável v

		if (tipo.equals("CC")) { // Verifica se tipo é "CC"
			v = 12;
		} else if (tipo.equals("CP")) { // Verifica se tipo é "CP"
			v = 20;
		} else {
			System.out.println("Tipo inválido");
			return; // Se o tipo não for "CC" nem "CP", sai do método
		}

		if (status == true) {
			if (saldo > v) {
				this.setSaldo(getSaldo() - v); // Atualiza o saldo
			} else {
				System.out.println("Saldo insuficiente");
			}
		}
	}

}
