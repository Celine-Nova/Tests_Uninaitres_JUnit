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
    public void testAdd(){
    Calculator calculator = new Calculator();
    int result = calculator.add(1,2);
    assertEquals(3, result);
}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
