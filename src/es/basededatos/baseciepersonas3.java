package es.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class baseciepersonas3 {
           static final String DB_URL = "jdbc:mysql://localhost:3306/cie";
		   static final String USER = "root";
		   static final String PASS = "";
		   static final String QUERY = "SELECT * from Personas";

		   public static void main(String[] args) {
		      // Open a connection
		    try {
					 Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				     Statement sentencia = conexion.createStatement();
				    sentencia.executeUpdate("delete from personas where apellidos='perez'");
				  
				  
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
        }
    }
    


