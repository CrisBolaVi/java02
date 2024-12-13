package es.composicion;

public class DeportistaPro extends Deportista {

    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
       this.nivel = nivel;
    }

    public DeportistaPro(String nombre, String deporte, int nivel) {
        super(nombre, deporte);
        this.nivel = nivel;
    }

    @Override
    public void andar() {
      
        System.out.println("andar a 9 km/h");
    }

}
