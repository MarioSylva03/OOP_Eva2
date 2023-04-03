/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_formato_apa;

/**
 *
 * @author mario
 */
public class Libro extends Documento {
    private String editorial;
    private int Npagina;

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNpagina() {
        return Npagina;
    }

    public void setNpagina(int Npagina) {
        this.Npagina = Npagina;
    }
    
}
