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
public class Docente {
        private int edad;
        private String nombre;    
        private String apellido;
        private String plaza;

    public Docente() {
    }

        
        
        
    public Docente(int edad, String nombre, String apellido, String plaza) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.plaza = plaza;
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

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
        
        
        
}
