package es.viejo;
public class PrincipalFactura {

    public static void main(String[] args) {
        Factura f= new Factura(20, 100);
        System.out.println("el numero de la factura es:");
        System.out.println(f.getNumero());
        System.out.println("el valor de la factura es:");
        System.out.println(f.getValor());  
        System.out.println("el vlor de la factura con iva es es:");
      System.out.println(f.getValorconIVA());
        
    }
    
}
