package br.com.fiap.brainstormers.model.repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	private static ConnectionFactory instance;
	private Connection conn;
	private String url;
	private String user;
	private String pass;
	private String driver;

	public ConnectionFactory(String url, String user, String pass, String driver) {
		this.url = url;
		this.user = user;
		this.pass = pass;
		this.driver = driver;
	}

	public static ConnectionFactory getInstance() {
		if (instance != null) {
			return instance;
		}

		Properties prop = new Properties();
		try (FileInputStream file = new FileInputStream("./src/main/resources/application.properties")) {
			prop.load(file);
			String url = prop.getProperty("datasource.url");
			String user = prop.getProperty("datasource.user");
			String pass = prop.getProperty("datasource.password");
			String driver = prop.getProperty("datasource.driver-class-name");
			System.out.println("url: " + url + "user: " + user + "pass: " + pass + "driver: " + driver);

			instance = new ConnectionFactory(url, user, pass, driver);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return null;
	}

	public Connection getConn() {
		try {
			if (this.conn != null && !this.conn.isClosed()) {
				return this.conn;
			}

			checkNotBlank(this.getDriver(), "nome da classe");
			checkNotBlank(this.getUser(), "usuário incorreto");
			checkNotBlank(this.getUrl(), "url da conexao");

			Class.forName(this.getDriver());
			this.conn = DriverManager.getConnection(this.getUrl(), this.getUser(), this.getPass());

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		return this.conn;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}

	public String getDriver() {
		return driver;
	}

	public void checkNotBlank(String value, String errorMessage) {
		if (value.isBlank()) {
			throw new RuntimeException("Error: " + errorMessage);
		}
	}

}
