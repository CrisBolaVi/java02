public class Factura {

     //en este caso puse int en valor pero es preferible poner double
    //porque normalmente los valores de las facturas llevan decimales
    private int numero;
    private int valor;
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Factura(int numero, int valor) {
        this.numero = numero;
        this.valor = valor;
    }
    
    public double getValorconIVA(){
        return valor*0.21;

    }
    

   }
