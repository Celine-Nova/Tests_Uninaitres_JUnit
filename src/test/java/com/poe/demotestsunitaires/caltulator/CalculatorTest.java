package com.poe.demotestsunitaires.caltulator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.poe.demotestdunitaired.calculator.Calculator;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Celine-Nova
 */
public class CalculatorTest {
    
     @Test
    public void testAdd3Add2return5() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(3, 2);
        
        assertEquals(5, result);
    }
    
    @Test
    public void testAdd2Add1return3() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(2, 1);
        
        assertEquals(3, result);
    }
    
    
    @Test
    public void testAdd0Add0return0() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(0, 0);
        
        assertEquals(0, result);
    }
    
    @Test
    public void testAddLess5AndLess4returnLes9() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(-5, -4);
        
        assertEquals(-9, result);
    }
    
    @Test
    public void testBigNumber() {
         Calculator calculator = new Calculator();
        
        int result = calculator.add(5000, 10000);
        
        assertTrue(result == 15000);
    }
     @Test
    public void testMaxValue() {
        Calculator calculator = new Calculator();
         
        int result = calculator.maxValue(2200, 13598);
        assertEquals(result, 13598);
    }
     @Test
    public void testMaxBetweenOneAndTwo() {
        Calculator calculator = new Calculator();
        
        int result = calculator.maxValue(-2200, -13598);
        assertEquals(result, -2200);
    }
    @Test
    public void testMaxBetweenSamesValues(){
        Calculator calculator = new Calculator();
        int result = calculator.maxValue(12,12);
        assertEquals(result, 12);
        
    }
    @Test
     public void testDivideWithInResult(){
        Calculator calculator = new Calculator();
        int result = calculator.dividende(12,6);
        assertEquals(result, 2);
        
    }
     @Test
    public void testDivideWithFloatResult(){
        Calculator calculator = new Calculator();
        
        int result = calculator.dividende(10, 3);
        System.out.println(result);
        
        assertEquals(10/3, result);
    }
    @Test
    public void testDivideWithDivideAsZero(){
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () ->{
            calculator.dividende(10,0);
        });
    }
   @Test
   public void TestImpairNumber(){
       Calculator calculator = new Calculator();
       ArrayList<Integer>result = calculator.getImpairNumbers(5);
        assertEquals(3, result.size());
   }
   //EXEMPLES avec des PARAMS
   //  @ParameterizedTest stipule qu'on va tester avec des paramètres
    @ParameterizedTest
    //@ValueSource je donne les valeurs pour les paramètres
    // Parmet  d'executer un seul test plusieurs fois
    @ValueSource(ints = {1, 2, 3, 4})
    void testParameterWithValueSource(int valeur) {
        assertEquals(valeur + valeur, valeur * 2);
    }

    @ParameterizedTest
    // @CsvSource A contrario de @ValueSource ici nous pouvons donner plusieurs valeurs pour un seul paramètre
    @CsvSource({"1, 1", "1, 2", "2, 3"})
    void testAdd(int a, int b) {
        int attendu = a + b;
        assertEquals(attendu, a + b);
    }
    
    @ParameterizedTest
    @CsvSource({"1, 1, 2", "1, 2, 3", "2, 3, 5"})
    void testAddWithResult(int a, int b, int result) {
        assertEquals(result, a + b);
    }
        
    @ParameterizedTest
    @CsvSource({"1, 1, 1", "1, 2, 2", "5, 3, 5", "-1, -4, -1"})
    void testMaxWithDatas(int a, int b, int result) {
        Calculator calculator = new Calculator();
        
        assertEquals(result, calculator.maxValue(a, b));
    }
}
