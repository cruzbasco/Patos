package patos;

/**
 *
 * @author cruzbasco
 */
public class Main {
    public static void main(String[] args) {
        Pato pSilvestre = new patoSilvestre();
        Pato pGoma = new patoGoma();
        Pato pMadera = new patoMadera();
        //Pato Silvestre
        pSilvestre.mostrar();
        pSilvestre.graznar();
        //Pato de Goma
        pGoma.mostrar();
        pGoma.graznar();
        //Pato de Madera
        pMadera.mostrar();
        pMadera.graznar();
        //cambio de comportamientos por medio de la instruccion "setXxxxx"
        System.out.println("///////////////////////////////");
        System.out.println("Cambio de comportamientos");
        System.out.println("///////////////////////////////");
        //Pato Silvestre
        pSilvestre.mostrar();
        pSilvestre.setGraznar(new Mudo());
        pSilvestre.graznar();
        //Pato de Goma
        pGoma.mostrar();
        pGoma.setGraznar(new Graznador());
        pGoma.graznar();
        //Pato de Madera
        pMadera.mostrar();
        pMadera.setGraznar(new Graznador());
        pMadera.graznar();
    }
}
