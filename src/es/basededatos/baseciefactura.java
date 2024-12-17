package es.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class baseciefactura {   static final String DB_URL = "jdbc:mysql://localhost:3306/cie";
		   static final String USER = "root";
		   static final String PASS = "";
		   static final String QUERY = "SELECT * from factura ";

		   public static void main(String[] args) {
		      // Open a connection
		    try {
					 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				     Statement sentencia = conexion.createStatement();
				     ResultSet conjuntoResultados = sentencia.executeQuery(QUERY);
				   {		      
				     while(conjuntoResultados.next()){
				        //Display values
				        System.out.print(conjuntoResultados.getString("concepto"));
				        System.out.print(conjuntoResultados.getInt("importe"));
				        System.out.print(conjuntoResultados.getInt("numero"));
				       
				     }
				  }
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
		   }
		

}