package es.basededatos;

public class PrincipalFacturaRepoDelete {

    public static void main(String[] args) {
        FacturaRepositoryNueva repo= new FacturaRepositoryNueva();
        Factura f= new Factura(5);
        repo.delete(f);
        
    }

}
