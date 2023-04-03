/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_interfaces2;

/**
 *
 * @author mario
 */
public class Eva2_17_Interfaces2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

interface IntA{
    void A();   //EQUIVALENTE A public abstract void A();
}

interface IntB  {
    public abstract void B(); //EQUIVALENTE A void B();
}
interface IntC extends IntA, IntB{
    void C();
}

class prueba implements IntC{

    @Override
    public void C() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void A() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void B() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}