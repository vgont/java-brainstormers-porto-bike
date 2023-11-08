package br.com.fiap.brainstormers.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.fiap.brainstormers.model.entity.Modificacao;

public class ModificacaoRepository extends Repository {
	public static Modificacao save(Modificacao modificacao) {
		String sql = "insert into t_cvb_modificacao "
				+ "(id_modificacao, id_bicicleta, nm_modificacao, valor_modificacao) " + "values(SQ_T_CVB_MODIFICACAO.NEXTVAL,?,?,?)";

		try (PreparedStatement ps = getConn().prepareStatement(sql)) {
			ps.setLong(1, modificacao.getIdBicicleta());
			ps.setString(2, modificacao.getNomeModificacao());
			ps.setDouble(3, modificacao.getValorModificacao());

			if (ps.executeUpdate() > 0) {
				return modificacao;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			closeConn();
		}
		System.out.println("nao enviou :(");
		return null;
	}

	public static ArrayList<Modificacao> findAllByIdBicicleta(Long idBicicleta) {
		ArrayList<Modificacao> modificacoes = new ArrayList<Modificacao>();
		String sql = "select * from t_cvb_modificacao where id_bicicleta= ?";

		try {
			PreparedStatement ps = getConn().prepareStatement(sql);
			ps.setLong(1, idBicicleta);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Modificacao modificacao = new Modificacao();
				modificacao.setIdModificacao(rs.getLong("id_modificacao"));
				modificacao.setIdBicicleta(rs.getLong("id_bicicleta"));
				modificacao.setNomeModificacao(rs.getString("nm_modificacao"));
				modificacao.setValorModificacao(rs.getFloat("valor_modificacao"));
				modificacoes.add(modificacao);
				return modificacoes;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			closeConn();
		}
		return null;
	}
}
