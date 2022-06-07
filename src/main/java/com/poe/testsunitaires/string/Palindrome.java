/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poe.testsunitaires.string;

import org.apache.commons.lang3.StringUtils;

/**
 * Code reepetitif dans les tests de la classe CalculatorTest
 * Suite aux instanciation de la classe Calculator
 * Ici je mets la methode en static
 */
public class Palindrome {
     public static boolean isPalindrome(String phrase){
        
        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll(" ", "");
        //  stripAccents(String input)Supprime les signes diacritiques (~= accents) d'une chaîne.
        phrase = StringUtils.stripAccents(phrase);
        
        int debut = 0;
        int fin = phrase.length()-1;
        while(debut < fin){
            if(phrase.charAt(debut) != phrase.charAt(fin))
                return false;
            fin--;
            debut++;
        }
        
        return true;
    }
}
