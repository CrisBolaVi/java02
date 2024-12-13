package es.composicion;

public class FactoriaPersona {

    public static Persona crearPersona(String tipo, String nombre, int edad){
        if (tipo.equals("Persona")){
            return new Persona(nombre);
        }else if(tipo.equals("Deportista")){
            return new Deportista(nombre, "padel");
        }else{
            return new DeportistaPro(nombre, "padel",1);
        }
    }
}
