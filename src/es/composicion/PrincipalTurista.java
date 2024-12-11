package es.composicion;

public class PrincipalTurista {
    public static void main(String[] args) {
        Turista t= new Turista("Ana");

        Maleta m1= new Maleta("samsonite", 23 );
        Maleta m2= new Maleta("benzine", 10);

        //t.setMaleta1(m1);
        t.setMaleta2(m2);

        System.out.println(m1.getModelo());
        System.out.println(m1.getPeso());
        System.out.println(m2.getModelo());
        System.out.println(m2.getPeso());
        System.out.println("*************");
        System.out.println("Peso Total de las maletas");

       
        System.out.println(t.pesoTotal());
        
        System.out.println(t.pesoTotal());  
        System.out.println(t.pesoTotal("null"));  

    }

}
