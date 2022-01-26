package com.fiap.aula11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConecxao {

	public static void main(String[] args) throws Exception {
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connexao = DriverManager.getConnection("jdbc:mysql://localhost/db_fiap", "root", "123");
			
			System.out.println("Conectou!");
			
			connexao.close();
		
		} catch (SQLException e) {
			System.err.println("Nao foi possivel conectar ao MY SQL FIAP");
			e.printStackTrace();
		}
	}

}
