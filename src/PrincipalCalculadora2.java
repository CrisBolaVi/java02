public class PrincipalCalculadora2 {
    public static void main(String[] args) {
       
        System.out.println(CalculadoraRegular.sumar(8, 9));
        System.out.println(CalculadoraRegular.restar(10, 9));
        System.out.println(CalculadoraRegular.multiplicar(8, 9));
        System.out.println(CalculadoraRegular.dividir(90, 9));
        System.out.println(Math.pow(10, 5));
    }
//en este metodo que esta conectado con calculadora regular,
//por haberlo puesto static no necesito ponerle en caluladora c= new calculadora
//y dentro de los parentesis le pongo CalculadoraRegular
}
