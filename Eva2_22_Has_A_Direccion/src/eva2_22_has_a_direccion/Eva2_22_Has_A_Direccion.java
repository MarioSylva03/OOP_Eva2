/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_has_a_direccion;

/**
 *
 * @author mario
 */
public class Eva2_22_Has_A_Direccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona P1 = new Persona();
        P1.setNombre("Mario");
        P1.setApellidos("Sylva");
        P1.setEdad(0);
        /*Direccion direccion = new Direccion();
        direccion.setCalle("Av. industria");
        direccion.setNumero(11101);
        direccion.setColonia("Complejo industrial");
        direccion.setCp("5713");
        direccion.setCiudad("Chihuahua");
        direccion.setEstado("Chihuahua");
        
        P1.setDireccion(direccion)*/
        P1.ImprimirDatos();
    }
    
}