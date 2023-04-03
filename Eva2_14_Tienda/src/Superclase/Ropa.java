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
public abstract class Ropa extends Productos {
    private String Talla;
    private String Marca;
    private String Color;

    public Ropa() {
        this.Talla = "";
        this.Marca = "";
        this.Color = "";        
    }

    public Ropa(String Talla, String Marca, String Color, double Precio, String Descripcion, String UnidadVenta) {
        super(Precio, Descripcion, UnidadVenta);
        this.Talla = Talla;
        this.Marca = Marca;
        this.Color = Color;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
                System.out.println(super.toString());
        return "Ropa{" + "Talla=" + Talla + ", Marca=" + Marca + ", Color=" + Color + '}';
    }
    
    
    
    
}
