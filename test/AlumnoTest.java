/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pruebas.Alumno;
import pruebas.Nivel;

/**
 *
 * @author User
 */
public class AlumnoTest {
    
    public AlumnoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    Nivel nivel= new Nivel(0, 100, "Inicial");// creo un nivel para asociarlo al alumno
    Alumno a= new Alumno("Ricardo", "54626585", nivel); // creo un usuario alumno para realizar las pruebas
    
    @Test
    public void usuario(){
        String n=a.getUsuario();
        assertNotEquals(n.length(), 0);// verifica que el usuario no este vacio
    }
    @Test
    public void contraseña(){
        String contr=a.getContraseña();
        int esperado=6;
        assertTrue((contr.length())>=esperado);//verifica que la contraseña sea mayor a 6 caracteres
    }
    @Test
    public void nivel(){
        String niv=a.getNivelDelAlumno().getNombreNivel();
        assertTrue(niv.compareTo("Inicial")==0);//verifica que el nivel cuando se crea un alumno sea el Inicial
    }
}
