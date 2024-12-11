package es.viejo;
public class PrincipalCaja {

    public static void main(String[] args) {
        
    Caja c= new Caja(20, 15, 60);
        System.out.println("ancho de la caja");
    System.out.println(c.getAncho());
    System.out.println("fondo de la caja");
    System.out.println(c.getFondo());
    System.out.println("largo de la caja");
    System.out.println(c.getLargo());
    System.out.println("volumen de la caja");
    System.out.println(c.getCajaVolumen());
    }
}
