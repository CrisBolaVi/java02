package es.basededatos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ficheros {
    public static void main(String[] args) {
        

    Path ruta = Paths.get("hola.txt");

    try{
        List<String> lineas = Files.readAllLines(ruta);
        for (String linea:lineas){
            System.out.println(linea);
        }
    }catch(IOException e){
        System.out.println("Hola majo que no va");
    }finally{
        System.out.println("cerrar");
    }
    }

}


