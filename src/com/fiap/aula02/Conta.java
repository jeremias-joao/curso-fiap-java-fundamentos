package com.fiap.aula02;

public class Conta {
	
	int agencia;
	int numero;
	double saldo;
	
	public Conta () {}
	
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
	    //this.saldo = this.saldo + valor;
		this.saldo += valor;
	}
	
	public void retitar(double valor) {
		
		//this.saldo = this.saldo - valor;
		this.saldo -= valor;
	}
	
	public double verificarSaldo() {
		return this.saldo;
	}

}
