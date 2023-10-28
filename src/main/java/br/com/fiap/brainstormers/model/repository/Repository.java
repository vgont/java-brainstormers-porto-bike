package br.com.fiap.brainstormers.model.repository;

import java.sql.Connection;

public class Repository {
	
	protected static Connection conn;
	
	public Repository() {
		getConn();
	}

	public static Connection getConn() {
		try {
			conn = ConnectionFactory.getInstance().getConn();
			return conn;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}
	
	public static void closeConn() {
		try {
			if (!conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
