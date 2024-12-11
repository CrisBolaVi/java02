package es.viejo;
public class Caja {
int Ancho;
int Largo;
public Caja(int ancho, int largo, int fondo) {
    Ancho = ancho;
    Largo = largo;
    Fondo = fondo;
}
int Fondo;
public int getAncho() {
    return Ancho;
}
public void setAncho(int ancho) {
    Ancho = ancho;
}
public int getLargo() {
    return Largo;
}
public void setLargo(int largo) {
    Largo = largo;
}
public int getFondo() {
    return Fondo;
}
public void setFondo(int fondo) {
    Fondo = fondo;
}
public long getCajaVolumen(){
    return Ancho*Fondo*Largo;
}
}


