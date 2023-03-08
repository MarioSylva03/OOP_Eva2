/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_extends;

/**
 *
 * @author mario
 */
public class Eva2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante();
        estu.setNombre("Mario");
        estu.setApellido("Sylva");
        estu.setEdad(19);
        estu.setNcontrol(22550369);
        System.out.println("DATOS DEL ESTUDIANTE");
        System.out.println(estu.getNombre());
        System.out.println(estu.getApellido());
        System.out.println(estu.getEdad());
        System.out.println(estu.getNcontrol());
    }
    
}
