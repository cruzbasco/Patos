package patos;

public class patoGoma extends Pato {

        public patoGoma(){
            volar = new noVolador();
            nadar = new Flotar();
            graznar = new Rechinar();
        }
        public void mostrar(){
            System.out.println("Soy un pato de goma");
        }
}
