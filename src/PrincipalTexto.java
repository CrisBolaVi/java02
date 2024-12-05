public class PrincipalTexto {
    public static void main(String[] args) {
    
        String[] lista= new String[]{ "Hola", "qué", "tal", "estas"};

        int i=0;
        int letras=0;
        while (i<lista.length){
            System.out.println(lista[i]);
            System.out.println(lista[i].length());
           
            if (letras<lista[i].length()){
                letras=lista[i].length();
               
                System.out.println("mayor munero de letras");
            }
            i++;
            
           
			
        }
           
        } 
   
    }


