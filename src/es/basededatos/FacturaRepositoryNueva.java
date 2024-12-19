package es.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class FacturaRepositoryNueva { 
static final String DB_URL = "jdbc:mysql://localhost:3306/cie";
static final String USER = "root";
static final String PASS = "";
static final String QUERY = "SELECT * from factura";

public void insertar(Factura factura){
 
 try {
    Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
    Statement sentencia = conexion.createStatement();
   sentencia.executeUpdate("insert into factura  (numero,concepto,importe) values('"+factura.getNumero()+"','"+factura.getConcepto()+"',"+factura.getImporte()+")");
  
} catch (SQLException e) {

e.printStackTrace();
} 
}
public void delete (Factura factura){
try {
    Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
    Statement sentencia = conexion.createStatement();
    String consultaBorrar="delete from factura where numero='"+factura.getNumero()+"'";
    System.out.println(consultaBorrar);
   sentencia.executeUpdate(consultaBorrar);
   //("delete from factura where numero='"+numero+"'");
 
} catch (SQLException e) {

e.printStackTrace();
} 
    }
	public ArrayList<Factura> buscarTodos() {

		ResultSet rs=null;
        Connection conexion=null;
        ArrayList<Factura> lista= new ArrayList<Factura>();
		try {
			//conecto a la base de datos
			conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			//preparo la sentencia
			Statement sentencia = conexion.createStatement();
			//ejecuto
			rs = sentencia.executeQuery("select * from Factura");
			while (rs.next()) {
				
				Factura f= new Factura(rs.getInt("numero"),
				rs.getString("concepto"), rs.getInt("importe"));
				lista.add(f);
}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			if (conexion!=null) {
				try {
					conexion.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		return lista;
	}
	
}