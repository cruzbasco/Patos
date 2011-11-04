package patos;

public class patoMadera extends Pato{

    public patoMadera(){
        volar = new noVolador();
        nadar = new noNadador();
        graznar = new Mudo();
    }
    public void mostrar (){
        System.out.println("Soy un pato de madera");
    }
}
