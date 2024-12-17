package es.basededatos;

public class PrincipalPersonaRepoinsert {
    public static void main(String[] args) {
        Personarepositorionueva repo= new Personarepositorionueva();
        Persona1 p= new Persona1("jaime", "perez", 45);
        repo.insertar(p);
    }

}
