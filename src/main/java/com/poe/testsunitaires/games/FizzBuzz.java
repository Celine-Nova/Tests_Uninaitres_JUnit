/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poe.testsunitaires.games;

/*
*On compte chacun son tour.
*Si notre nombre est multiple de 3 on dit à la place Fizz.
*S’il est multiple de 5 on dit à la place Buzz.
*S’il est multiple de 3 et 5 alors on le remplace par FizzBuzz
*
*/
public class FizzBuzz {
     public static String play(int number){
      //if(number % 3 == 0 && number % 5 == 0)
        if(number % 15 == 0)
            return "FizzBuzz";
        if(number  % 3 == 0)
            return "Fizz";
        if(number  % 5 == 0)
            return "Buzz";
        
        return ""+number;
    }
}
