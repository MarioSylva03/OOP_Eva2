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
public class Eva2_11_Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo C1 = new Circulo();
        System.out.println("Area: " +C1.calcularArea());
        System.out.println("Perimetro: " +C1.calcularPerimetro());
        
        System.out.println("");
        
        Triangulo T1 = new Triangulo();
        System.out.println("Area: " +T1.calcularArea());
        System.out.println("Perimetro: " +T1.calcularPerimetro());
    
        System.out.println("");
        
        Figura F1 = new Figura();
        System.out.println("Area:" +F1.calcularArea());
        System.out.println("Perimetro:" +F1.calcularPerimetro());
    
    
    }
    
}
