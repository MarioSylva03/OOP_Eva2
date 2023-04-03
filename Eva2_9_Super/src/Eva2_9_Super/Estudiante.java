/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eva2_9_Super;

/**
 *
 * @author mario
 */

// CLASE DERIVADA extends calse base
// CLASE HIJO extends CLASE PADRE
//SUBCLASE extends SUPERCLASE
public class Estudiante extends Persona {
    private String Ncontrol;

    public Estudiante(){
        super();
        this.Ncontrol = "------";
     }

    public Estudiante(String Ncontrol, String Nombre, String Apellido, int edad) {
        super(Nombre, Apellido, edad);
        this.Ncontrol = Ncontrol;
    }
    
    public String getNcontrol() {
        return Ncontrol;
    }

    public void setNcontrol(String Ncontrol) {
        this.Ncontrol = Ncontrol;
    }
    
    @Override
      public void imprimirdatos(){
          super.imprimirdatos();
        System.out.println("No de control:" +Ncontrol);
    }
    
}
