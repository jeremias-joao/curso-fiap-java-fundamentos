package com.fiap.aula02;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta();
		cc.saldo = 50.0;
		cc.numero = 123;
		cc.numero = 321;
		
		cc.depositar(1000);
		
		System.out.println(cc.verificarSaldo());
		
		Conta poupanca = new Conta(111, 222, 1000);
		poupanca.retitar(50);
		
		System.out.println(poupanca.verificarSaldo());
		
		
		
		
		
	}
	
}