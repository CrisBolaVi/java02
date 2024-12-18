package es.basededatos;

public class Factura {

    int numero;
    String concepto;
    public int getNumero() {
        return numero;
    }
    public Factura(int numero, String concepto, double importe) {
        this.numero = numero;
        this.concepto = concepto;
        this.importe = importe;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public double getImporte() {
        return importe;
    }
    public void setImporte(double importe) {
        this.importe = importe;
    }
    double importe;
    public Factura(int numero) {
        this.numero = numero;
    }
}
