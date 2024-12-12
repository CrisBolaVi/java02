package es.composicion;

public class DeportistaPro extends Deportista {

    private int Nivel;

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int nivel) {
        Nivel = nivel;
    }

    public DeportistaPro(String nombre, String deporte, int nivel) {
        super(nombre, deporte);
        Nivel = nivel;
    }

    
    
}
