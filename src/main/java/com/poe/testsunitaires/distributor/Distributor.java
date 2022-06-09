/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poe.testsunitaires.distributor;

import java.util.ArrayList;
import com.poe.testsunitaires.distributor.StockDistributor;
public class Distributor {
    int credit; //Argent dispo pour acheter
    ArrayList<Product> stock = new ArrayList<>();

     public Distributor(){
        credit = 0;
    }
    
    // Remplir le distributeur
    public void toFillStock(){
      Product coca = new Product("Coca", 1, 5);
      Product cafe = new Product("Café", 0.80F, 5);
      Product cerealBar = new Product("Barre Céréales", 0.50F, 5);
      stock.add(coca);
      stock.add(cafe);
      stock.add(cerealBar);
      if (stock!=null){
         System.out.println(stock); 
      }else{
            System.out.println("vous devez remplir le stock");
        }
      
    }
    // Insérer de l'argent
     public void insertMoney(int amount){
     
       credit += amount;
    }    
    // Commander un Produit
      public void orderProduct(int IndexProduct){
       
    }
      //Récupérer argent restant
       public void recoverMoney(){
       
    }
       public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public ArrayList<Product> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Product> stock) {
        this.stock = stock;
    }
}
