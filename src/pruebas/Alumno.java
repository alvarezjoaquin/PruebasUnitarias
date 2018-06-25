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
public class Alumno {
    String usuario;
    String contraseña;
    Nivel nivelDelAlumno;

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Nivel getNivelDelAlumno() {
        return nivelDelAlumno;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNivelDelAlumno(Nivel nivelDelAlumno) {
        this.nivelDelAlumno = nivelDelAlumno;
    }

    public Alumno(String usuario, String contraseña, Nivel nivelDelAlumno) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nivelDelAlumno = nivelDelAlumno;
    }
    
    
    
}
