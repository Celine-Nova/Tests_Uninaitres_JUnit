/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poe.demotestdunitaired.calculator;

/**
 *
 * @author Celine-Nova
 */
public class Calculator {
   public int add(int a, int b) {
        return a + b;
    }
   public int maxValue(int a, int b){
       //Condition ternaire
       return a > b ? a : b;
      /* if(a > b ){
           return a;
       }else{
           return b;
       }*/
   }
    public int dividende(int number, int divider) {
        return number / divider;
    }
}