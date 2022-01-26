package com.fiap.aula05;

public class Caixa {
	
	 public static void main(String[] args) {
		
		 int qtdprodutos = 5;
		 int registo = 0;
		 
		 System.out.println(registo);
		 
		/*while (registo < qtdprodutos) {
			registo ++;
			System.out.println("O produto numero " + registo + " foi registado");
		}
		
		 do {
			 registo++;
			 System.out.println("O caixa registrou o produto " + registo);
		 } while (registo < qtdprodutos);
		*/
		 
		 for(int i = 1; i < qtdprodutos; i++) {
			 System.out.println("O caixa registrou o produto " +i);
		 }
		
	}
}
