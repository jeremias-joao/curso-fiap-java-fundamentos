package com.fiap.aula01;

public class Conta {
	
	int numero;
	double saldo;
	Cliente cliente = new Cliente();
	
	
	
	public Conta() {

	}
	
	public Conta( int numero) {
		this.numero = numero;
		this.saldo = 0;
	}
	
	public Conta( double saldo) {
		this.saldo = numero;
	}
	
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
		
	}
	
	
	public double recuperarSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}
