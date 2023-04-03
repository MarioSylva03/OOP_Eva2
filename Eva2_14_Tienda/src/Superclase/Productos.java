/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Superclase;

/**
 *
 * @author mario
 */
public abstract class Productos {
   protected double Precio;
    private String Descripcion;
    private String UnidadVenta;

    public Productos() {
        this.Precio= 0;
        this.Descripcion = "";
        this.UnidadVenta = "";
    }

    public Productos(double Precio, String Descripcion, String UnidadVenta) {
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.UnidadVenta = UnidadVenta;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getUnidadVenta() {
        return UnidadVenta;
    }

    public void setUnidadVenta(String UnidadVenta) {
        this.UnidadVenta = UnidadVenta;
    }

    @Override
    public String toString() {
        return "Productos{" + "Precio=" + Precio + ", Descripcion=" + Descripcion + ", UnidadVenta=" + UnidadVenta + '}';
    }
    
    
    
    
    public abstract double PrecioVenta (int cant);
    
    
}
