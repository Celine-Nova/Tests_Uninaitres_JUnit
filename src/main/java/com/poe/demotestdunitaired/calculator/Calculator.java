/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poe.demotestdunitaired.calculator;

import java.util.ArrayList;

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
     public ArrayList<Integer> getImpairNumbers(int max){
        ArrayList<Integer> result = new ArrayList();
       for(int i=0; i<= max; i++){
           if(i % 2 != 0){
               result.add(i);
           }
        }
        return result;
    }
}
