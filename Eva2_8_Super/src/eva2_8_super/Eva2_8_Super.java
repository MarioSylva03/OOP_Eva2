/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_super;

/**
 *
 * @author mario
 */
public class Eva2_8_Super {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        animal animal1 = new animal(100);
        mamifero mamifero1 = new mamifero("nigger", 100);
        perro perro1 = new perro();
    }
    
}
class animal{
    private int peso;

    
    public animal(){
        System.out.println("Animal: Estoy vivo");
    }

    public animal(int peso) {
        this.peso = peso;
        System.out.println("Animal: Estoy vivo, contructor 2");
    }
    
    public void respirar(){
        System.out.println("Respiro");
    }
    public void comer(){
        System.out.println("Comer");
    }
    
    
    
      public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
class mamifero extends animal{
    private String colorpelo;
    public mamifero(){
        super();  //LLAMADA AL CONSTRUCTOR DE LA CLASE
                    // EN NUESTRO CASO LLAMA A ANIMAL()
                    //SIEMPRE DEBEMOS LLAMAR PRIMERO AL 
                    //CONSTRUCTOR DE LA SUPERCLASE
        System.out.println("Soy un mamifero");
    }


    public String getColorpelo() {
        return colorpelo;
    }

    public void setColorpelo(String colorpelo) {
        this.colorpelo = colorpelo;
    }

    public mamifero(String colorpelo, int peso) {
        super(peso); // SIEMPRE LLAMAMOS AL CONSTRUCTOR DE LA SUPERCLASE
        this.colorpelo = colorpelo;
        System.out.println("soy un mamifero contructor 2");
    }


    
}
class perro extends mamifero{
    public perro(){
        //SIEMPRE HAY QUE INVOCAR AL CONSTRUCTOR DE LA SUPERCLASE
        super();
        System.out.println("Soy travisscott y soy un perro");
    }
}
