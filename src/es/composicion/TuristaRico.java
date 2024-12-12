package es.composicion;

import java.util.ArrayList;

public class TuristaRico {

    //se agrega setters and getters, el constructor solo al nombre
    
    private ArrayList<Maleta> maletas=new ArrayList<Maleta>();
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Maleta> getMaletas() {
        return maletas;
    }

    public TuristaRico(String nombre) {
        this.nombre = nombre;
    }

    public void setMaletas(ArrayList<Maleta> maletas) {
        this.maletas = maletas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addMaleta(Maleta maletita){
        maletas.add(maletita);
    }

}
