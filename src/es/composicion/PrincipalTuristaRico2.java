package es.composicion;

import java.util.ArrayList;

public class PrincipalTuristaRico2 {
     public static void main(String[] args) {
        TuristaRico pepito= new TuristaRico("pepito");
        Maleta m1= new Maleta("sansonite",10);
        Maleta m2 = new Maleta("benzi",5);
        //usamos el metodo addmaleta de la clase TuristaRico para añadir a pepito dos maletas
        pepito.addMaleta(m2);
        pepito.addMaleta(m1);

        ArrayList<Maleta> maletas=pepito.getMaletas();

        //con este bucle piedes pedir cualquier posicion sin inportar la posicion que ocupe. por cada elemento de la lista dame el siguiente
        //recorreme
        for(Maleta m:maletas){
           
            System.out.println(m.getModelo());
            System.out.println(m.getPeso());

        }
    }

}
