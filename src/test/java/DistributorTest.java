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
        //Avec valor initialisée à 0
        //distributor.insertMoney(5);
        // avec valor initialisée avec montant
        float initialCredit = distributor.getCredit();
        distributor.insertMoney(5);
        assertEquals(initialCredit + 5, distributor.getCredit());
    }
    @Test
    public void testOrderProduct(){
        Distributor distributor = new Distributor();
        distributor.toFillStock();
        distributor.insertMoney(5);
        
        distributor.orderProduct(1);
        
        assertEquals(4, distributor.getCredit());
        assertEquals(4, distributor.getProduit(1).getQuantity());
    } 
     @Test
    public void testorderProductCreditZero(){
        Distributor distributor = new Distributor();
        distributor.toFillStock();
        
        distributor.orderProduct(1);
        
        assertEquals(0, distributor.getCredit());
        assertEquals(5, distributor.getProduit(1).getQuantity());
    }
    
    @Test
    public void testorderProductCreditInsuffisant(){
        Distributor distributor = new Distributor();
        distributor.toFillStock();
        distributor.insertMoney(0.8F);
        System.out.println(distributor.getCredit());
        // Quel est index du produit que j'ai commandé
        distributor.orderProduct(2);
         System.out.println(distributor.getCredit());
         // Je compare le reste de mon crédit par rapport à mon achat
        assertEquals(0, distributor.getCredit());
        // Je compare la quantité restante du produit dont  l'id est 2 distributor.orderProduct(2);
        assertEquals(4, distributor.getProduit(2).getQuantity());
    }
}