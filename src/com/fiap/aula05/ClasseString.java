package com.fiap.aula05;

public class ClasseString {

	public static void main(java.lang.String[] args) {

		/*
		 * String nome; nome = new String(); nome = "Maça"; System.out.println(nome);
		 * 
		 * String nome2 = new String("Maça"); System.out.println(nome2);
		 * 
		 * String nome3 = "Maça"; System.out.println(nome3);
		 * 
		 * 
		 * 
		 * String descricao = "Tipo Gala \nA maça mais doce do mercado";
		 * System.out.println(descricao);
		 * 
		 * descricao = "Tipo Gala \tA maça mais doce do mercado";
		 * System.out.println(descricao);
		 * 
		 * descricao = "Tipo Gala: \"A maça mais doce do mundo\"";
		 */

		String nome = new String("Maça");
		String descricao = new String();
		descricao = "tipo Gala, a maça mais doce do mercado";

		String propoganda = nome + " " + descricao;
		System.out.println(propoganda);

		propoganda = nome.concat(" ").concat(descricao);
		System.out.println(propoganda);

		propoganda += " ";
		System.out.println(propoganda);

	}

}
