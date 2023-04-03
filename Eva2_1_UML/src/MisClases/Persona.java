/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author mario
 */
public class Persona {
   private String ID;
   private String Name;
   private  int Age;
   
   public String getID(){
       return ID;
   }
   
   public void setID(String Valor){
       ID = Valor;
   }
   public String getname(){
       return Name;
   }
   
   public void setname(String Valor){
       Name = Valor;
   }
   public int getage(){
       return Age;
   }
   
   public void setage(int Valor){
       Age = Valor;
   }
   public void ImprimirDatos(){
       System.out.println("");   
       System.out.println("");   
       System.out.println("");   
   }
}
