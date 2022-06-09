/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.poe.testsunitaires.distributor.Distributor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Cocotte
 */
public class DistributorTest {
    @Test
    public void testToFillStock() {
        Distributor distributor = new Distributor();
        distributor.toFillStock();
        assertEquals(3, distributor.getStock().size());
    }
     @Test
    public void testinserMoney() {
        Distributor distributor = new Distributor();
        //Avec valeur initialisée à 0
        //distributor.insertMoney(5);
        // avec valeur initialisée avec montant
        int initialCredit = distributor.getCredit();
        distributor.insertMoney(5);
        assertEquals(initialCredit + 5, distributor.getCredit());
    }
  
}