package es.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class personarepositorio {    
   
        static final String DB_URL = "jdbc:mysql://localhost:3306/cie";
        static final String USER = "root";
        static final String PASS = "";
        static final String QUERY = "SELECT * from Personas";

        public void insertar(String nombre, String apellidos, int edad){
         
         try {
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement sentencia = conexion.createStatement();
           sentencia.executeUpdate("insert into personas  (nombre,apellidos,edad) values('"+nombre+"','"+apellidos+"',"+edad+")");
           sentencia.executeUpdate("delete from personas where apellidos='perez'");
         
   } catch (SQLException e) {
       
       e.printStackTrace();
   } 
}
public void delete (String apellidos){
     try {
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement sentencia = conexion.createStatement();
            String consultaBorrar="delete from personas where apellidos='"+apellidos+"'";
            System.out.println(consultaBorrar);
           sentencia.executeUpdate(consultaBorrar);
           //("delete from personas where apellidos='"+apellidos+"'");
         
   } catch (SQLException e) {
       
       e.printStackTrace();
   } 

}
}


