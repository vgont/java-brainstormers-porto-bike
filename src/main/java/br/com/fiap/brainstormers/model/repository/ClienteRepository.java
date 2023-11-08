package br.com.fiap.brainstormers.model.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.brainstormers.model.entity.Cliente;

public class ClienteRepository extends Repository{
	public static Cliente save(Cliente cliente) {
		String sql = "insert into t_cvb_cliente" 
				+ "(id_cliente, nm_cliente, email_cliente, senha_cliente) "
				+ "values(null,?,?,?)";

		try (PreparedStatement ps = getConn().prepareStatement(sql)) {
			ps.setString(1, cliente.getNomeCliente());
			ps.setString(2, cliente.getEmailCliente());
			ps.setString(3, cliente.getSenhaCliente());
			
			if (ps.executeUpdate() > 0) {
				return cliente;
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			closeConn();
		}
		System.out.println("nao enviou :(");
		return null;
	}
}
