package es.composicion;

public class Principal2 {
    public static void main(String[] args) {

        
        Persona pepe=
       FactoriaPersona.crearPersona("DeportistaPro", "pepe", 20);
       pepe.andar();
       DeportistaPro pepeVerdadero=(DeportistaPro)pepe;
       pepeVerdadero.andar();
      

        
    }

}
