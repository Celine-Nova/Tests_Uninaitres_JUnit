/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poe.testsunitaires.distributor;

import java.util.ArrayList;
public class Distributor {
    float credit; //Argent dispo pour acheter
    ArrayList<Product> stock = new ArrayList<>();

     public Distributor(){
        credit = 0;
    }
    
    // Remplir le distributeur
    public void toFillStock(){
      Product coca = new Product(1,"Coca", 1, 5);
      Product cafe = new Product(2,"Café", 0.80F, 5);
      Product cerealBar = new Product(3,"Barre Céréales", 0.50F, 5);
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
     public void insertMoney(float amount){
     
       credit += amount;
    }    
    // Commander un Produit
      public void orderProduct(int indexProduct){
       for(Product product: stock){
            if(product.getId() == indexProduct){
                
                if(credit >= product.getPrice() && product.getQuantity()>=1){
                    product.setQuantite(product.getQuantity()-1);
                    credit = credit - product.getPrice();
                }
            }
         }
      }
      //Récupérer argent restant
       public void recoverMoney(){
       
    }
       public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public ArrayList<Product> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Product> stock) {
        this.stock = stock;
    }
     public Product getProduit(int id){
         for(Product product: stock){
            if(product.getId() == id){
                return product;
            }
         }
         return new Product();// ATTENTION : à améliorer ?
    }
}
