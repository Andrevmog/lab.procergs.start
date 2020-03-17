package com.procergs.starter.db;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class JdbcConnection{

	public Connection getConnection() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			return DriverManager.getConnection(
				"jdbc:oracle:thin:@pr12.oracle-des.procergs.reders:1525:pr12", "d_procergs_coe_ad", "teste"
			);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}


		
		
					
		
			
		