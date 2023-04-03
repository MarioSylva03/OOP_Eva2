/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_herencia_contsructores;

/**
 *
 * @author mario
 */
public class Eva2_6_Herencia_Contsructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Clase Animal");
    Animal animal1 = new Animal();
    animal1.Comer();
    animal1.respirar();
    
        System.out.println("");
    
        System.out.println("Clase Mamifero");    
   Mamifero mamifero1 = new Mamifero();
   mamifero1.Comer();
   mamifero1.respirar();
    }
    
    
}
