package es.basededatos;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PrincipalApellidoResultSet {

	public static void main(String[] args) {
		
		PersonaRepositoryApellido repo= 
				new PersonaRepositoryApellido();

		ResultSet rs=repo.buscarTodosApellidos();
		
		try {
			while(rs.next()) {
				
				//System.out.println(rs.getString("nombre"));
                System.out.println("Dame todos los apellidos");
				System.out.println(rs.getString("apellidos"));
				//System.out.println(rs.getInt("edad"));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	
	}

}


