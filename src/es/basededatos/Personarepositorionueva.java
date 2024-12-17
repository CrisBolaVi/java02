package es.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Personarepositorionueva { 
static final String DB_URL = "jdbc:mysql://localhost:3306/cie";
static final String USER = "root";
static final String PASS = "";
static final String QUERY = "SELECT * from Personas";

public void insertar(Persona1 persona){
 
 try {
    Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
    Statement sentencia = conexion.createStatement();
   sentencia.executeUpdate("insert into personas  (nombre,apellidos,edad) values('"+persona.getNombre()+"','"+persona.getApellidos()+"',"+persona.getEdad()+")");
  
} catch (SQLException e) {

e.printStackTrace();
} 
}
public void delete (Persona1 persona){
try {
    Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
    Statement sentencia = conexion.createStatement();
    String consultaBorrar="delete from personas where apellidos='"+persona.getApellidos()+"'";
    System.out.println(consultaBorrar);
   sentencia.executeUpdate(consultaBorrar);
   //("delete from personas where apellidos='"+apellidos+"'");
 
} catch (SQLException e) {

e.printStackTrace();
} 

}
}





