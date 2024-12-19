package es.basededatos;

import java.util.ArrayList;

public class PrincipalArrayListFact {
    public static void main(String[] args) {

        FacturaRepositoryNueva repo = new FacturaRepositoryNueva();

        ArrayList<Factura> lista = repo.buscarTodos();
        for (Factura f : lista) {

            System.out.println(f.getNumero());
            System.out.println(f.getConcepto());
            System.out.println(f.getImporte());

        }

    }

}
