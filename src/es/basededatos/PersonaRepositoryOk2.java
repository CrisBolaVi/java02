package es.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonaRepositoryOk2 {

	static final String DB_URL = "jdbc:mysql://localhost:3306/cie";
	static final String USER = "root";
	static final String PASS = "";
	static final String QUERY = "SELECT * from personas";

	public void insertar(Persona1 persona) {

		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();

			sentencia.executeUpdate("insert into personas values ('" + persona.getNombre() + "','"
					+ persona.getApellidos() + "'," + persona.getEdad() + ")");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void borrar(Persona1 persona) {

		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();

			String consultaBorrar = "delete from personas where nombre='" + persona.getNombre() + "'";

			System.out.println(consultaBorrar);

			sentencia.executeUpdate(consultaBorrar);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Persona1> buscarTodos() {

		ResultSet rs=null;
        Connection conexion=null;
        ArrayList<Persona1> lista= new ArrayList<Persona1>();
		try {
			//conecto a la base de datos
			conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			//preparo la sentencia
			Statement sentencia = conexion.createStatement();
			//ejecuto
			rs = sentencia.executeQuery("select * from Personas");
			while (rs.next()) {
				
				Persona1 p= new Persona1(rs.getString("nombre"),
						rs.getString("apellidos"), rs.getInt("edad"));
				
				lista.add(p);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if (conexion!=null) {
				try {
					conexion.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return lista;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}