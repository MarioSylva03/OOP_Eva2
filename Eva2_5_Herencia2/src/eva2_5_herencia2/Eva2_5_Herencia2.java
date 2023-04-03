/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_herencia2;

/**
 *
 * @author mario
 */
public class Eva2_5_Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SubClase obj = new SubClase();
        obj.mensaje();
        
    }
    
    
    
    
    
}
 class Superclase{
    public void mensaje(){
        System.out.println("hola");
    }
    }
    class SubClase extends Superclase{
        
    }
