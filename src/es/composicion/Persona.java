package es.composicion;

public class Persona {
    
private String nombre;

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public Persona(String nombre) {
    this.nombre = nombre;
}

public void andar(){
    System.out.println("andar a 5 Km por H");
}
}
