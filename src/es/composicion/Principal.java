package es.composicion;

public class Principal {
   
    public static void main(String[] args) {

        
        Persona p= new Persona("Gema");
        p.andar();
       
        Deportista deportistaNormal= new Deportista("Ana", "Baloncesto");
        deportistaNormal.andar();

        DeportistaPro deportista=
        new DeportistaPro("pepe", "tenis", 0);
        System.out.println(deportista.getDeporte());
        deportista.andar();



        
    }


}
