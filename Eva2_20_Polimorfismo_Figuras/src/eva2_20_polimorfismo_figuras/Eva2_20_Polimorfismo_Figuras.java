/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Eva2_20_Polimorfismo_Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Circulo C1 = new Circulo(5);
        C1.ImprimirDatos();
        
        //FIGURA ES PADRE DE CIRCULO
        //PODEMOS ASIGNAR UN OBJETO CIRCULO A UNA VARIABLE
        Figuras F1 = C1;
       
        System.out.println("");
        System.out.println("Usando Figuras");
        System.out.println("Area: " +F1.CalcularArea());
        System.out.println("Perimetro: " +F1.CalcularPerimetro());
        */
        
       
       
       //int [] arreglo = new int[10];   //ARREGLO DE TIPO ENTERO QUE GUARDA 10 ENTEROS 
       

//UN ARRREGLO DONDE INCIOA Y DONDE TERMINA
//PRIMER POSICION 0
//ULTIMA POSICION: N - 1, N CANTIDAD DE ELEMENTOS DEL ARREGLO
       
       
       //arreglo[0]=100;
       //System.out.println(arreglo [0]);
       
        System.out.println("Cuantas figuras necesitas?");
        
        Scanner input = new Scanner(System.in);
        
        int cant = input.nextInt();
        
        Figuras[] figuras = new Figuras[cant];
        for(int i = 0; i < figuras.length; i++) {
            System.out.println("Que figutas necesitas: Teclea 1 si se necesitas un circulo. Teclea 2 si necesitas un triagulo");
            
            int tipo = input.nextInt();
            
            if(tipo == 1){//CIRCULO
                Circulo C1 = new Circulo();
                System.out.println("Introduce el radio:");
                C1.setRadio(input.nextDouble()); //CAPTURAMOS EL DATO DEL USUARIO
                figuras[i] = C1;
            }else{//TRIANGULO
                Triangulo T1 = new Triangulo();
                System.out.println("Introduce la base:");
                T1.setBase(input.nextDouble()); //CAPTURAMOS EL DATO DEL USUARIO
                figuras[i] = T1;
                System.out.println("Introduce la altura:");
                T1.setAltura(input.nextDouble()); //CAPTURAMOS EL DATO DEL USUARIO
                figuras[i] = T1;
            }
        }
        for (int i = 0; i < figuras.length; i++) {
            if(figuras[i] instanceof Circulo){
                System.out.println("Circulo: " +i);
                //CASTING: --> CONVERSION. EJEMPLO
                //EJEMPLO
                // int val = (int)(Math.random() * 100);
                Circulo C1 = (Circulo) figuras[i];
                C1.ImprimirDatos();
            }else{
                System.out.println("Triangulo: " +i);
                //CASTING
                Triangulo T1 = (Triangulo) figuras[i];
                T1.ImprimirDatos();
            }
            //System.out.println("Area: " + figuras[i].CalcularArea());
            //System.out.println("Perimetro: " + figuras[i].CalcularPerimetro());
            
        }
        //Figuras[] figuras = new Figuras[cant];
        
       /* Circulo[] circulos = new Circulo[cant];
        circulos[0] = new Circulo();
        circulos[0].ImprimirDatos();
        
        for (int i = 0; i < circulos.length; i++) {
            circulos[i] = new Circulo();
        }
        
        for (int i = 0; i < circulos.length; i++) {
            circulos[i].ImprimirDatos();
        }*/
    }
    
}
