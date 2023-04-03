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
public class Eva2_19_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Docente docentes = new Docente("Tiempo Completo", "Mario", "Sylva", 19);
        //docentes.imprimirdatos();
        Estudiante estudiante = new Estudiante ("22550369", "Mario", "Sylva", 19);
        //estudiante.imprimirdatos();
        
        //EN RESUMEN ESTO ES POLIMORFISMO
        Persona persona = docentes;
        persona.imprimirdatos();
        
        Persona persona2 = estudiante;
        persona.imprimirdatos();
        
        //AHORA AL REVES
        
        //NO SE POUEDE HACER CONVERSION DE SUPER CLASE A SUB CLASE
        //EN ESTE CASO NO EXISTE LA PLAZA
      //  Persona persona3 = new Persona();
       // Docente doce =persona3;
    }
    

}
