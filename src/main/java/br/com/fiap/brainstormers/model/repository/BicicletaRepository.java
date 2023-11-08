package br.com.fiap.brainstormers.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.brainstormers.model.entity.Bicicleta;

public class BicicletaRepository extends Repository {

	public static Bicicleta save(Bicicleta bicicleta) {
		String sql = "insert into t_cvb_bicicleta " + "(id_bicicleta, nr_serie_bicicleta, id_cliente, "
				+ "tipo_bicicleta, nm_marca_bicicleta, nm_modelo_bicicleta, "
				+ "valor_bicicleta, categoria_bicicleta, tp_uso_bicicleta,nr_potencia_bicicleta) "
				+ "values(null,?,?,?,?,?,?,?,?,?)";

		try (PreparedStatement ps = getConn().prepareStatement(sql)) {
			ps.setString(1, bicicleta.getNrSerieBicicleta());
			ps.setLong(2, bicicleta.getIdCliente());
			ps.setString(3, bicicleta.getTipoBicicleta());
			ps.setString(4, bicicleta.getMarcaBicicleta());
			ps.setString(5, bicicleta.getModeloBicicleta());
			ps.setFloat(6, bicicleta.getValorBicicleta());
			ps.setString(7, bicicleta.getCategoriaBicicleta());
			ps.setInt(8, bicicleta.getTempoUsoAnosBicicleta());
			if (bicicleta.getNrPotenciaBicicleta() != null) {
				ps.setFloat(9, bicicleta.getNrPotenciaBicicleta());
			} else {
				ps.setNull(9, 0);
			}

			int rowsAffected = ps.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("enviou!");
				return bicicleta;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			closeConn();
		}
		System.out.println("nao enviou :(");
		return null;
	}

	public static ArrayList<Bicicleta> findAllByIdCliente(Long idCliente) {
		String sql = "select * from t_cvb_bicicleta where id_cliente=?";
		ArrayList<Bicicleta> clienteBicicletas = new ArrayList<Bicicleta>();

		try (PreparedStatement ps = getConn().prepareStatement(sql)) {
			ps.setLong(1, idCliente);

			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Bicicleta bicicleta = new Bicicleta();
					bicicleta.setIdBicicleta(rs.getLong("id_bicicleta"));
					bicicleta.setNrSerieBicicleta(rs.getString("nr_serie_bicicleta"));
					bicicleta.setIdCliente(idCliente);
					bicicleta.setTipoBicicleta(rs.getString("tipo_bicicleta"));
					bicicleta.setMarcaBicicleta(rs.getString("nm_marca_bicicleta"));
					bicicleta.setModeloBicicleta(rs.getString("nm_modelo_bicicleta"));
					bicicleta.setValorBicicleta(rs.getFloat("valor_bicicleta"));
					bicicleta.setCategoriaBicicleta(rs.getString("categoria_bicicleta"));
					bicicleta.setTempoUsoAnosBicicleta(rs.getInt("tp_uso_bicicleta"));
					bicicleta.setNrPotenciaBicicleta(rs.getFloat("nr_potencia_bicicleta"));
					clienteBicicletas.add(bicicleta);
				}
				return clienteBicicletas;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			closeConn();
		}
		return null;
	}
}
