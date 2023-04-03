/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_tienda;

import Productos.Computadora;

/**
 *
 * @author mario
 */
public class Eva2_14_Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Computadora Compu = new Computadora();
        Compu.PrecioVenta(10);                 
        
        Computadora compu2 = new Computadora(8, "intel i5", "20cm x 30cm" ,500, "Asus", "Modelo 7" , 1, "Laptop Asus intel i5, modelo 7, 500gb de almacenamiento y 8 de ram"   );
        System.out.println(compu2);
        System.out.println("Fabricante: " +Fabricante+);
        
    }
    
}
