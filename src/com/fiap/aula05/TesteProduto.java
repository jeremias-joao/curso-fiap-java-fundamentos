package com.fiap.aula05;

public class TesteProduto {

	public static void main(String[] args) {
	
		
		Produto[] produtos = new Produto[2];
		
		Produto prod1 =  new Produto();
		prod1.setNome("Limão");
		prod1.setDescricao("Galego");
		prod1.setValor(4);
		
		
		Produto prod2 =  new Produto();
		prod2.setNome("Maça");
		prod2.setDescricao("Gala");
		prod2.setValor(5);
		
		produtos[0] = prod1;
		produtos[1] = prod2;
		
		
		for(int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i].toString());
		}
		
		
		Produto[][] localizacoProduto = new Produto[10][3];
		
		localizacoProduto[2][1] = prod1;
		localizacoProduto[2][2] = prod2;
		
		System.out.println(localizacoProduto[2][1].getNome());
		
		
	}

}
