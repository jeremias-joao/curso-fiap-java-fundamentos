package com.fiap.aula07;

public class TestException {

	public static void main(String[] args) {

		try {

			// treccho onde a excepcao pode ocorrer
			// int val = 10 / 0;
			int[] valores = new int[3];
			System.out.println(valores);

			//String nome = null;
		
			//System.out.println(nome.length());
			

			int numero = Integer.parseInt("zero");
			System.out.println(numero);

		} catch (ArithmeticException e) {

			System.out.println("Nao foi possivel realizar uma divisao po zero");

			// Mensagem com lista de erros
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Nao foi possivel acessar a posicao 4 do array");
		}

		catch (NullPointerException e) {

			System.out.println("Nao foi possivel retornar o length, variavel nome nao foi instanciada !");
		} catch (NumberFormatException e) {

			System.out.println("Nao, foi possivel realizr a conversao !");
		}

		catch (Exception e) {
			System.out.println("Erro na execução de programa !");
		}

	}

}
