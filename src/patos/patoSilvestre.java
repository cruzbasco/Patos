package patos;

public class patoSilvestre extends Pato {

    public patoSilvestre(){
        volar = new volador();
        nadar = new Nadador();
        graznar = new Graznador();
    }
    public void mostrar(){
        System.out.println("Soy un pato silvestre   ");
    }
}
