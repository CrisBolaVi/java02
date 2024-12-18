package es.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


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
}