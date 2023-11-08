package br.com.fiap.brainstormers.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.brainstormers.model.entity.Acessorio;

public class AcessorioRepository extends Repository {

	public static Acessorio save(Acessorio acessorio) {
		String sql = "insert into t_cvb_acessorio (id_acessorio, id_bicicleta, nm_acessorio, valor_acessorio) "
				+ "values(null,?,?,?)";

		try (PreparedStatement ps = getConn().prepareStatement(sql)) {
			ps.setLong(1, acessorio.getIdBicicleta());
			ps.setString(2, acessorio.getNomeAcessorio());
			ps.setFloat(3, acessorio.getValorAcessorio());

			if (ps.executeUpdate() > 0) {
				return acessorio;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			closeConn();
		}
		System.out.println("nao enviou :(");
		return null;
	}

	public static ArrayList<Acessorio> findAllByIdBicicleta(Long idBicicleta) {
		ArrayList<Acessorio> acessorios = new ArrayList<Acessorio>();
		String sql = "select * from t_cvb_acessorio where id_bicicleta= ?";

		try {
			PreparedStatement ps = getConn().prepareStatement(sql);
			ps.setLong(1, idBicicleta);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Acessorio acessorio = new Acessorio();
				acessorio.setIdAcessorio(rs.getLong("id_acessorio"));
				acessorio.setIdBicicleta(rs.getLong("id_bicicleta"));
				acessorio.setNomeAcessorio(rs.getString("nm_acessorio"));
				acessorio.setValorAcessorio(rs.getFloat("valor_acessorio"));
				acessorios.add(acessorio);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			closeConn();
		}
		return acessorios;
	}
}
