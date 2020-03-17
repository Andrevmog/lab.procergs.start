package com.procergs.starter.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.procergs.starter.domain.Offer;

public class OfferDao {
	
	public void add(Offer offer) {
		Connection connection = null;
		
		String sql = "insert into offer " + 
				"(id,procurementNumber,procurementYear,idCompany,coordinator)" +
				" values (?,?,?,?,?)";
		
		try {
			connection = new JdbcConnection().getConnection();
			
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			// seta os valores
			stmt.setLong(1, offer.getId());
			stmt.setString(2, offer.getProcurementNumber());
			stmt.setInt(3, offer.getProcurementYear());
			stmt.setLong(4, offer.getIdCompany());
			stmt.setString(5, offer.getCoordinator());
				
			// executa
			stmt.execute();
			stmt.close();			
		
		} catch ( SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				connection.close();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		
	}
	
	public List<Offer> getList() {
		Connection connection = null;
		
		try {
			connection = new JdbcConnection().getConnection();
			
			List<Offer> offers = new ArrayList<Offer>();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM (" + 
					"       SELECT" + 
					"         id_oferta AS id," + 
					"         nr_edital AS procurementNumber," + 
					"         ano_edital AS procurementYear," + 
					"         id_empresa AS idCompany," + 
					"         usuario AS coordinator" + 
					"       FROM" + 
					"          oferta" + 
					"        WHERE" + 
					"          id_empresa = 1" + 
					"        ORDER BY" + 
					"           id_oferta DESC" + 
					"    ) WHERE rownum <= 100 ORDER BY id");
			ResultSet rs = stmt.executeQuery();
				
			while(rs.next()) {
				// criando o objeto Offer
				Offer offer1 = new Offer();
				offer1.setId(rs.getLong("id"));
				offer1.setProcurementNumber(rs.getString("procurementNumber"));
				offer1.setProcurementYear(rs.getInt("procurementYear"));
				offer1.setIdCompany(rs.getLong("idCompany"));
				offer1.setCoordinator(rs.getString("coordinator"));
				
				// adicionando o objeto à lista
				offers.add(offer1);
			}
			
			rs.close();
			stmt.close();
			return offers;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (connection != null) {
				connection.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
					
	}

}
	
	
	
	


