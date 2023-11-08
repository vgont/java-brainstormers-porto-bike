package br.com.fiap.brainstormers.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.brainstormers.model.entity.Cliente;

public class ClienteRepository extends Repository {

	public static Cliente findAllById(Long idCliente) {
		String sql = "select * from t_cvb_cliente where id_cliente=?";
		try (PreparedStatement ps = getConn().prepareStatement(sql)) {
			ps.setLong(1, idCliente);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setIdCliente(idCliente);
				cliente.setEmailCliente(rs.getString("email_cliente"));
				cliente.setSenhaCliente(rs.getString("senha_cliente"));
				return cliente;
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
