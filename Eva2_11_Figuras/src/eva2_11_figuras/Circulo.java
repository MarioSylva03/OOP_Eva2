/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_figuras;

/**
 *
 * @author mario
 */
public class Circulo extends Figura {
    private double Radio;

    public Circulo() {
        Radio = 8;
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
    public double calcularArea(){
        return (Math.pow(Radio, 2)*Math.PI);
    }
    public double calcularPerimetro(){
        return((Radio*2)*Math.PI);
    }
    
}
