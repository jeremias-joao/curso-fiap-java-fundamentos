package com.fiap.aula03;

public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.setAgencia(1111);
		cc.setNumero(2222);
		cc.setTipo("Pessoa Física");
		cc.setChequeEspecial(1000);
		
		System.out.println(cc.getAgencia());
		System.out.println(cc.getNumero());
		System.out.println(cc.getTipo());
		System.out.println(cc.getChequeEspecial());
		
		//Conta cc2 = new Conta();
		
		Conta conta1 = new Conta();
		conta1.depositar(1000);
		conta1.retirar(100);
		
		
		Conta conta2 = new ContaCorrente();
		conta1.depositar(1000);
		conta1.retirar(100);
		
		Conta conta3 = new ContaCorrente();
		conta1.depositar(1000);
		conta1.retirar(100);
		
		
		System.out.println("Conta1: " + conta1.getSaldo());
		System.out.println("Conta1: " + conta2.getSaldo());
		System.out.println("Conta1: " + conta3.getSaldo());

		
	}

}
