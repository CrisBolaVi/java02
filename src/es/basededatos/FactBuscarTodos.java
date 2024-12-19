package es.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FactBuscarTodos {

	static final String DB_URL = "jdbc:mysql://localhost:3306/cie";
	static final String USER = "root";
	static final String PASS = "";
	static final String QUERY = "SELECT * from factura";

	public void insertar(Factura factura) {

		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();

			sentencia.executeUpdate("insert into factura values ('" + factura.getNumero() + "','"
					+ factura.getConcepto() + "'," + factura.getImporte() + ")");

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public void borrar(Factura factura) {

		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();

			String consultaBorrar = "delete from personas where nombre='" + factura.getImporte() + "'";

			System.out.println(consultaBorrar);

			sentencia.executeUpdate(consultaBorrar);

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}



}