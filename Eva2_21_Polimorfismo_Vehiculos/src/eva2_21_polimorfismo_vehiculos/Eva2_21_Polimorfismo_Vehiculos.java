/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_21_polimorfismo_vehiculos;

/**
 *
 * @author mario
 */
public class Eva2_21_Polimorfismo_Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto1 = new Automovil("Nissan Trueno", 1986);
modificarvel(auto1, 30);
        Bicicleta bici1 = new Bicicleta("Montaña", "Apache", 1);
        modificarvel(bici1, 10);
    }
    public static void modificarvel(ControlarDatos datos, int vel){
        datos.cambiarvelocidad(vel);
        datos.tablero();
    }
}
class Vehiculo{
    private String Marca;
    protected int Velocidad;

    public Vehiculo() {
    }

    public Vehiculo(String Marca, int Velocidad) {
        this.Marca = Marca;
        this.Velocidad = 0;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }
    
    
    
}
interface ControlarDatos{
    void cambiarvelocidad (int cambio);
    public abstract void tablero();
}

class Automovil extends Vehiculo implements ControlarDatos{
    private String modelo;
    private int año;

    public Automovil() {
        super();
        this.modelo = "";
        this.año = 0;
        
        
        
    }

    public Automovil(String modelo, int año) {
        this.modelo = modelo;
        this.año = año;
    }

    public Automovil(String modelo, int año, String Marca, int Velocidad) {
        super(Marca, Velocidad);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void cambiarvelocidad(int cambio) {
        int vel = Velocidad + cambio;
        if(vel >=0){
            Velocidad = vel;
        }
    }

    @Override
    public void tablero() {
        System.out.println("Automovil:");
        System.out.println("Velocidad: " +Velocidad);
        
    }

    
}

class Bicicleta extends Vehiculo implements ControlarDatos{
    private String tipo;

    public Bicicleta() {
        super();
        this.tipo = "";
    }


    public Bicicleta(String tipo, String Marca, int Velocidad) {
        super(Marca, Velocidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void cambiarvelocidad(int cambio) {
 int vel = Velocidad + cambio;
        if(vel >=0){
            Velocidad = vel;    }
    }

    @Override
    public void tablero() {
        System.out.println("Bicicleta");
        System.out.println("Velocidad: " +Velocidad);
        System.out.println("Revoluciones: (Pendientes)");
        System.out.println("Combustible: (Pendientes)");
    }
    
    
    
}
