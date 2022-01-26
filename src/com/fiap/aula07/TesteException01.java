package com.fiap.aula07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TesteException01 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("/home/jeremiasjoaomane/Documents/arquivo.txt");
		
		PrintWriter print = new PrintWriter(fw);
		print.println("Maça = R$ 4,00");
		print.println("Morango = R$ 6,00");
		print.println("Total = R$ 10,00");
		print.println("My name is Jeremy");
		print.close();
		fw.close();
		
	}

}
