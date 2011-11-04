package patos;

public class patoSilvestre extends Pato {

    public patoSilvestre(){
        graznar = new Graznador();
    }
    public void mostrar(){
        System.out.println("Soy un pato silvestre   ");
    }
}
