/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author User
 */

public class Nivel {
    int rangoDesde;
    int rangoHasta;
    String nombreNivel;

    public int getRangoDesde() {
        return rangoDesde;
    }

    public int getRangoHasta() {
        return rangoHasta;
    }

    public String getNombreNivel() {
        return nombreNivel;
    }

    public void setRangoDesde(int rangoDesde) {
        this.rangoDesde = rangoDesde;
    }

    public void setRangoHasta(int rangoHasta) {
        this.rangoHasta = rangoHasta;
    }

    public void setNombreNivel(String nombreNivel) {
        this.nombreNivel = nombreNivel;
    }

    public Nivel(int rangoDesde, int rangoHasta, String nombreNivel) {
        this.rangoDesde = rangoDesde;
        this.rangoHasta = rangoHasta;
        this.nombreNivel = nombreNivel;
    }
    
}
