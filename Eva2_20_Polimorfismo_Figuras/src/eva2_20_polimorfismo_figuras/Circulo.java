/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_polimorfismo_figuras;

/**
 *
 * @author mario
 */
public class Circulo implements Figuras, MostrarDatos {
    private double Radio;

    public Circulo() {
        this.Radio = 0;
    }

    public Circulo(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    @Override
    public double CalcularArea() {
      return  Math.PI * Math.pow(Radio, 2);
    }

    @Override
    public double CalcularPerimetro() {
        return Math.PI * (Radio * 2);
    }

    @Override
    public void ImprimirDatos() {
        System.out.println("Radio:" +Radio);
        System.out.println("Area:" +CalcularArea());
        System.out.println("Perimetro:" +CalcularPerimetro());
    }
    
    
    
}

