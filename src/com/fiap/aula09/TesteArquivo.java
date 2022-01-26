package com.fiap.aula09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {

	public static void main(String[] args) throws IOException {

		String nomeArquivo = "estoque.csv";
		String diretorio = System.getProperty("user.home");
		String caminho = diretorio + "//" + nomeArquivo;

		List<String> conteudo = new ArrayList<>();
		conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade");
		conteudo.add("Pera; 200; pct; R$; 5,40");
		conteudo.add("Pera; 400; cx; R$; 6540");
		conteudo.add("Abacaxi; 200; un; R$; 5,00");

		gravarEstoque(nomeArquivo, caminho, conteudo);

		lerEstoque(caminho);
		
		
		
		File arquivo = new File(caminho);
		
		if(arquivo.exists()) {
			System.out.println("O Caminho existe!"+
					"\nPode se lido: " + arquivo.canRead() +
					"\nPode ser gravado: " + arquivo.canWrite() +
					"\nTamanho: " + arquivo.length() +
					"\ncaminho: " + arquivo.getPath());
		} else {
			
			// cria o arquivo
			try {
				if(arquivo.createNewFile()) {
					System.out.println("Arquivo criado!");
				} else {
					System.out.println("Arquivo não foi criado!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		File fDirectorio = new File(diretorio);
		if(fDirectorio.exists()) {
			System.out.println("Directorio existe");
		}
		
		
		

	}

	private static void lerEstoque(String caminho) throws IOException {

		try {
			//abre o arquivo
			FileReader stream = new FileReader(caminho);

			BufferedReader reader = new BufferedReader(stream);
			
			//ler uma linha do arquivo
			String linha = reader.readLine();
			
			// enquanto linha for diferente de null
			while (linha != null) {
				System.out.println(linha);
				
				//le a proxima linha
				linha = reader.readLine();
			}
			reader.close();
			
			//fecha o arquivo
			stream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void gravarEstoque(String nomeArquivo, String caminho, List<String> conteudo) {

		FileWriter stream;
		PrintWriter print;

		try {
			// stream é uma conexoa de escrita para o arquivo
			stream = new FileWriter(caminho);

			// a classe PrintWritter escreve no arquivo
			print = new PrintWriter(stream);

			for (String linha : conteudo) {
				// o metodo println escreve uma linha no arquivo
				print.println(linha);
			}
			// close fecha o arquivo
			print.close();
			stream.close();

			System.out.println("O arquivo " + nomeArquivo + " foi salvo em " + caminho);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
