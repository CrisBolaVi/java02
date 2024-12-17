package es.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class baseciepersonas2 {
    static final String DB_URL = "jdbc:mysql://localhost:3306/cie";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT * from Personas";

    public static void main(String[] args) {
        // Open a connection
        try {
            Scanner sc = new Scanner(System.in);
            String nombre = sc.nextLine();
            String apellido = sc.nextLine();
            int edad = sc.nextInt();

            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate("insert into personas  (nombre,apellidos,edad) values('" + nombre + "','" + apellido
                    + "'," + edad + ")");

            
            //escribimos la sentencia, dentro de SUS PARENTESIS estará el texto que llega al SQL:
            // sentencia.xxx("insert into personas values('" <---- Aquí hemos 'partido' la primera parte de texto fijo
            //|seguimos||| + nombre (variable que hemos creado y queremos meter) + "', '" <---- Aquí hemos terminado de rodear
            // la variable de texto con comilla simpple para respetar sintaxis de SQL ||| + apellido + "', " <--- repetimos
            // + edad (esta variable numérica NO necesita estar rodeada de comillas simples) + ")" <-- terminamos sintaxis de SQL
            // ahora tras esas últimas comillas cerramos paréntesis de la sentencia --->  )
            //simplificación resumen: sentencia||( [aquí entre comillas texto fijo]*( + variables si son tipo texto necesitas agregar
            // comillas simples al principio y final de cada + que rodee la variable   + variable repetimos pero si es numérica sin comillas simples
            // + paréntesis de cierre del SQL con comillas finales para terminar de agregar el texto fijo )"* + último paréntesis sentencia )||
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}