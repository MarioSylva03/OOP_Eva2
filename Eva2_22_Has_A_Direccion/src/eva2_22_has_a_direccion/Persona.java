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

             // PERSONA ES UNA DIRECCION NO SIRVE EL EXTENDS
public class Persona{
    private String nombre;
    private String apellidos;
    private int edad;
    private Direccion direccion;  //PERSONA HAS-A (TIENE-UNA) DIRECCION

    public Persona() {
        this.nombre = "----";
        this.apellidos = "----";
        this.edad = 0;
        this.direccion = null;  // LA DIRECCION AUN NO EXISTE
        
    }

    public Persona(String nombre, String apellidos, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public void ImprimirDatos(){
        System.out.println("Persona:");
        System.out.println(nombre + "" + apellidos +
        "," + edad + "años");
        
        if(direccion == null)
            System.out.println("Sin direccion");
        else
        direccion.ImprimirDatos();
        
    }
    
    
}
