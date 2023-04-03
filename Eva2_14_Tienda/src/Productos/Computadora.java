/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Superclase.Electronica;

/**
 *
 * @author mario
 */

public final class Computadora extends Electronica {
 
    private int Memoria;
    private String procesador;
    private String Tamaño;
    private int Discoduro;

    public Computadora() {
        this.Memoria = 0;
        this.procesador = "";
        this.Tamaño = "";
        this.Discoduro = 0;       
    }

    public Computadora(int Memoria, String procesador, String Tamaño, int Discoduro, String Fabricante, String Modelo, int Garantia, double Precio, String Descripcion, String UnidadVenta) {
        super(Fabricante, Modelo, Garantia, Precio, Descripcion, UnidadVenta);
        this.Memoria = Memoria;
        this.procesador = procesador;
        this.Tamaño = Tamaño;
        this.Discoduro = Discoduro;
    }

    public int getMemoria() {
        return Memoria;
    }

    public void setMemoria(int Memoria) {
        this.Memoria = Memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public int getDiscoduro() {
        return Discoduro;
    }

    public void setDiscoduro(int Discoduro) {
        this.Discoduro = Discoduro;
    }
    
    
    
 @Override
 public double PrecioVenta (int cant){
     //Antes de cierta cantidad manejamos precio
     //
     if (cant <= 10)
         return Precio * cant;
     else
         return (Precio * 0.8) * cant;
 }

    @Override
    public String toString() {
                System.out.println(super.toString());
        return "Computadora{" + "Memoria=" + Memoria + ", procesador=" + procesador + ", Tamaño=" + Tamaño + ", Discoduro=" + Discoduro + '}';
    }

 
 
}

/*
final---> no se puede heredar de una clase con final
class Laptop extends Computadora{
}
*/