package com.poe.demotesunitaire.caltulator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.poe.demotestunitaire.demotestunitaire.Calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Celine-Nova
 */
public class CalculatorTest {
    
     @Test
    public void testAdd3plus2retourne5() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(3, 2);
        
        assertEquals(5, result);
    }
    
    @Test
    public void testAdd2plus1retourne3() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(2, 1);
        
        assertEquals(3, result);
    }
    
    
    @Test
    public void testAdd0plus0retourne0() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(0, 0);
        
        assertEquals(0, result);
    }
    
    @Test
    public void testAddMoinsCinqAndMoins4retourneMoinsNeuf() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(-5, -4);
        
        assertEquals(-9, result);
    }
    
    @Test
    public void testGrandNombres() {
         Calculator calculator = new Calculator();
        
        int result = calculator.add(5000, 10000);
        
        assertTrue(result == 15000);
    }


}
