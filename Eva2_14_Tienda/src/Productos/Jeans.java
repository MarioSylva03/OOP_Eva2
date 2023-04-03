/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Superclase.Ropa;

/**
 *
 * @author mario
 */
public final class Jeans extends Ropa {
    private String Estilo;
    private String Material;

    public Jeans() {
    }

    public Jeans(String Estilo, String Material, String Talla, String Marca, String Color, double Precio, String Descripcion, String UnidadVenta) {
        super(Talla, Marca, Color, Precio, Descripcion, UnidadVenta);
        this.Estilo = Estilo;
        this.Material = Material;
    }

    public String getEstilo() {
        return Estilo;
    }

    public void setEstilo(String Estilo) {
        this.Estilo = Estilo;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Jeans{" + "Estilo=" + Estilo + ", Material=" + Material + '}';
    }
    
    
    
    
    
    
@Override
public double PrecioVenta (int cant){   
return -1;
}
}
