/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_polimorfismo;

/**
 *
 * @author mario
 */
// CLASE DERIVADA extends clase base
// CLASE HIJO extends CLASE PADRE
//SUBCLASE extends SUPERCLASE
public class Docente extends Persona {
    private String plaza;

    public Docente() {
        super();
        this.plaza = "----";
    }

    public Docente(String plaza, String Nombre, String Apellido, int edad) {
        super(Nombre, Apellido, edad);
        this.plaza = plaza;
    }
    
    

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    @Override
      public void imprimirdatos(){
       super.imprimirdatos();
        System.out.println("Plaza :" +plaza);
        
    }
}
