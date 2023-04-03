/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_sobrecarga;

/**
 *
 * @author mario
 */
public class Eva1_16_Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Suma: "+suma(4, 9));
        System.out.println("Suma: "+suma(3.5, 9.5));
        System.out.println("Suma: "+suma("joe " , "mama"));
        suma();
        //suma nombre del metodo + ctrl espacio muestra la cantidad de metodos
        
    }
    //SUMA DE DOS NUMEROS ENTEROS
                    //suma(int, int) firma
  public static int suma(int val1, int val2){
   return val1 + val2;   
  }
                       //suma(double, double) firma
  public static double suma(double val1, double val2){
   return val1 + val2;   
  }
                       //suna(String, String) firma
  public static String suma(String val1, String val2){
   return val1 + val2;   
  }
  public static void suma(){
      System.out.println("Suma: sin argumentos"); 
  }
    
}
