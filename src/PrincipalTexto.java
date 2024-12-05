public class PrincipalTexto {
    public static void main(String[] args) {
    //Hacer con un array de textos o cadenas para imprimir en la consola
    //la cadena con la palabra que sea mas larga.
        String[] lista= new String[]{ "Hola", "qué", "tal", "estas"};

        int i=0;
        int letras=0;
        int posicion=0;

        while (i<lista.length){
            System.out.println(lista[i]);
            System.out.println(lista[i].length());
           
            if (letras<lista[i].length()){
                letras=lista[i].length();
                posicion=i;
               
                System.out.println("mayor munero de letras");
                System.out.println("la palabra es: "+lista[posicion]);
            }
            i++;
            
           
			
        }
           
        } 
   
    }


