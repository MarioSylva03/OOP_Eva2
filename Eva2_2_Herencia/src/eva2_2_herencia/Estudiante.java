/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_herencia;

/**
 *
 * @author mario
 */
public class Estudiante {
    private int edad;
    private String nombre;
    private String apellido;
    private String Ncontrol;

    public Estudiante() {
    }

    public Estudiante(int edad, String nombre, String apellido, String Ncontrol) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Ncontrol = Ncontrol;
    }

    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNcontrol() {
        return Ncontrol;
    }

    public void setNcontrol(String Ncontrol) {
        this.Ncontrol = Ncontrol;
    }
    
    
    
    
}
