package com.fiap.aula08;

public class TesteException {
	public static void main(String[] args) {

		try {
			int val = 10 / 0;
			System.out.println(val);
		} catch (Exception e) {
			throw new DivisaoPoZerException();
		}

	}
}
