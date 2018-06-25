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
import pruebas.Calculadora;

/**
 *
 * @author User
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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

    @ Test
    public void TestSumar(){
        
        int resultado=Calculadora.sumar(5, 3);
        int esperado= 8; //5+3=8
        assertEquals(resultado, esperado);
    }
    @ Test
    public void TestRestar(){
       
        int resultado=Calculadora.restar(10, 5);
        int esperado= 5; //10-5=5
        assertEquals(resultado, esperado);
    }
    @ Test
    public void TestMultiplicar(){
       
        int resultado=Calculadora.multiplicar(3, 6);
        int esperado= 18; // 3*6=18
        assertEquals(resultado, esperado);
    }
    @ Test
    public void TestDividir(){
        
        int resultado=Calculadora.dividir(21, 7);
        int esperado= 3; //21/7=3
        assertEquals(resultado, esperado);
    }
}
