package es.viejo;
public class Calculadora {
    double a;
    double b;
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getsuma(){
        return a+b;
    }
    public double getresta(){
        return a-b;
    }
    public double getmultiplicacion(){
        return a*b;
    }
    public double getdivision(){
        return a/b;
    }
   
    }

