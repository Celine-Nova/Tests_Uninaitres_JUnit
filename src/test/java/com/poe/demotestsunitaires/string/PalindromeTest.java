/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.poe.demotestsunitaires.string;

import com.poe.testsunitaires.string.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    
    @Test
    public void isPalindromeKayak() {
        boolean result = Palindrome.isPalindrome("kayak");
        
        assertTrue(result);
    }
    
    @Test
    public void isPalindromeBonjour() {
        boolean result = Palindrome.isPalindrome("bonjour");
        
        assertFalse(result);
    }
    
        
    @Test
    public void isPalindromeChaineVide() {
        boolean result = Palindrome.isPalindrome("");
        
        assertTrue(result);
    }
    
        
    @Test
    public void isPalindromeKAYak() {
        boolean result = Palindrome.isPalindrome("KAYak");
        
        assertTrue(result);
    }
    
    @Test
    public void isPalindromeAvecEspaces() {
        boolean result = Palindrome.isPalindrome("Engage le jeu que je le gagne");
        
        assertTrue(result);
    }
    
        
    @Test
    public void isPalindromeAvecDesAccents() {
        boolean result = Palindrome.isPalindrome("La mariée ira mal");
        
        assertTrue(result);
    }
}
