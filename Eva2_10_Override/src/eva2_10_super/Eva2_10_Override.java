/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_super;

/**
 *
 * @author mario
 */
public class Eva2_10_Override {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona perso1 = new persona("Mario Sylva", 19);
        
        persona perso2 = new persona("joe mama", 80);
        
         System.out.println(perso1);
        System.out.println("------");
        System.out.println(perso2);
        System.out.println("------");
    }
    
}
class persona{
    private String Name;
    private int Age;

    public persona() {
    }

    public persona(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    @Override
    public String toString(){
        
        String cade = "Datos: \n" +
                "Nombre: " +Name+ "\n" +
                "Edad: " +Age;
        return cade;
    }
}