package es.composicion;
public class Turista {

    //En esta clase creo tres propiedades, nombre maleta1 y 2
   
        private String nombre;
        private Maleta maleta1;
        private Maleta maleta2;
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public Maleta getMaleta1() {
            return maleta1;
        }
        public void setMaleta1(Maleta maleta1) {
            this.maleta1 = maleta1;
        }
        public Maleta getMaleta2() {
            return maleta2;
        }
        public void setMaleta2(Maleta maleta2) {
            this.maleta2 = maleta2;
        }
        public Turista(String nombre) {
            this.nombre = nombre;
        }
      
        public double pesoTotal(){
            double pesoTotal=0;
            if(maleta1!=null)
            pesoTotal=pesoTotal+maleta1.getPeso();
            if(maleta2!=null)
            pesoTotal=pesoTotal+maleta2.getPeso();

            return pesoTotal;
        }
        //la funcion puede llamarse igual porque tiene parametros distintos que se ponen dentro del parentesis.
        public double pesoTotal(double sobrePeso){
           // double pesoTotal=0;
            //if(maleta1!=null)
           // pesoTotal=pesoTotal+maleta1.getPeso();
            //if(maleta2!=null)
            //pesoTotal=pesoTotal+maleta2.getPeso();

            return pesoTotal()+sobrePeso;
        }
        //aqui en esta funcion tengo que cambiar el parametro de double a string porque no puede ser
        public double pesoTotal(String tipoCarcasa){
            double pesoTotal=0;
            if(maleta1!=null)
            pesoTotal=pesoTotal+maleta1.getPeso();
            if(maleta2!=null)
            pesoTotal=pesoTotal+maleta2.getPeso();

            //si el tipo de carcasas que paso pone "ligera" en el texto añado 2kg
            //sino añado 4kg

            if(tipoCarcasa.equals("ligera")){
                pesoTotal=pesoTotal+2;
            }else{
                pesoTotal=pesoTotal+4;
            }

            return pesoTotal;
        }
        
    }

