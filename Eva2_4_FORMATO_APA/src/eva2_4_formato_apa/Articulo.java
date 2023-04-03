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
public class Articulo extends Documento {
    private String Nombrejournal;
    private int paginas;

    public String getNombrejournal() {
        return Nombrejournal;
    }

    public void setNombrejournal(String Nombrejournal) {
        this.Nombrejournal = Nombrejournal;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
