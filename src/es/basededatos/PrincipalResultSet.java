package es.basededatos;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PrincipalResultSet {

	public static void main(String[] args) {
		
		PersonaRepositoryOk repo= 
				new PersonaRepositoryOk();

		ResultSet rs=repo.buscarTodos();
		
		try {
			while(rs.next()) {
				
				System.out.println(rs.getString("nombre"));
				System.out.println(rs.getString("apellidos"));
				System.out.println(rs.getInt("edad"));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	
	}

}


