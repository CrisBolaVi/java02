package es.viejo2;
public class Cuadrado {
private int lado;

public int getLado() {
    return lado;
}

public Cuadrado(int lado) {
    this.lado = lado;
}

public void setLado(int lado) {
    this.lado = lado;
}
public double area(){
    return lado*lado;
}
}
