package es.basededatos;

public class PrincipalPersoRepositoryDelete {
    public static void main(String[] args) {
        Personarepositorionueva repo= new Personarepositorionueva();
        Persona1 p= new Persona1("pepe");
        repo.delete(p);
    }

}
