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
public class Persona {
    private String Nombre;
    private String Apellido;
    private int edad;

    public Persona() {
        Nombre = "";
        Apellido = "";
        edad = 0;
    }

    public String getNombre() {
        return Nombre;
    }
    
  
    public Persona(String Nombre, String Apellido, int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }
    

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }    
    public void imprimirdatos(){
        System.out.println("Nombre:" +Nombre);
        System.out.println("Apellido: " +Apellido);
        System.out.println("Edad: " +edad);
    }
}
