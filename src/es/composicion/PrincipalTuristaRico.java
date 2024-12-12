package es.composicion;

import java.util.ArrayList;

public class PrincipalTuristaRico {
    public static void main(String[] args) {
        TuristaRico pepito= new TuristaRico("pepito");
        Maleta m1= new Maleta("sansonite",10);
        Maleta m2 = new Maleta("benzi",5);

        pepito.addMaleta(m2);
        pepito.addMaleta(m1);

        ArrayList<Maleta> maletas=pepito.getMaletas();

        for(int i=0; i<maletas.size();i++){
            Maleta maletaR=maletas.get(i);
            System.out.println(maletaR.getModelo());
            System.out.println(maletaR.getPeso());

        System.out.println(maletas.get(i).getModelo());
        System.out.println(maletas.get(i).getPeso());
        }
    }

}
