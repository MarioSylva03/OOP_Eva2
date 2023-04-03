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
public class Triangulo extends Figura {
    private double Base;
    private double Altura;
    private double Lados;

    public Triangulo() {
        Base = 5;
        Altura = 7;
        Lados = 4;
    }

    public Triangulo(double Base, double Altura, double Lados) {
        this.Base = Base;
        this.Altura = Altura;
        this.Lados = Lados;
    }
    
    

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    @Override
    public double calcularArea(){
        return((Base*Altura)/2);
    }
    @Override
    public double calcularPerimetro(){
        double hip = Math.sqrt((Base * Base) + (Altura *Altura));
        return Base + Altura + hip;
    }
}
