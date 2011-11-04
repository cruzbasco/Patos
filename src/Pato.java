/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author cruzbasco
 */
public abstract  class Pato {

    public ComportamientoGraznar graznar;
    public void graznar(){
        graznar.graznar();
    }
    
    public void setGraznar(ComportamientoGraznar newGraznar){
        graznar = newGraznar;
    }
    public abstract void mostrar();
}
