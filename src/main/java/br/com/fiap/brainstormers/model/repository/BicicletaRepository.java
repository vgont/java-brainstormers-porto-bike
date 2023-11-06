package br.com.fiap.brainstormers.model.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.brainstormers.model.entity.Bicicleta;

public class BicicletaRepository extends Repository {

	public static Bicicleta save(Bicicleta bicicleta) {
		String sql = "insert into t_cvb_bicicleta " 
				+ "(id_bicicleta, nr_serie_bicicleta, id_cliente, "
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
			
			System.out.println("r: "+ rowsAffected);
			
			if (rowsAffected > 0) {
				System.out.println("enviou!");
				return bicicleta;
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("nao enviou :(");
		return null;

	}
}
