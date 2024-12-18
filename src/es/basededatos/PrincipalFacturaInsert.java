package es.basededatos;

public class PrincipalFacturaInsert {

    public static void main(String[] args) {
        FacturaRepositoryNueva repo= new FacturaRepositoryNueva();
        Factura f= new Factura(13, "comidas", 250);
        repo.insertar(f);
        

    }

}
