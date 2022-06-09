/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poe.testsunitaires.distributor;

import java.util.Scanner;

public class Start {

    public static void main(String... args) {
        Distributor distributor = new Distributor();
        // Je rempli le stock
        distributor.toFillStock();

        Scanner clavier = new Scanner(System.in);

        boolean finish = false;
        // Tant que j'ai pas terminé je continue
        while (!finish) {
             System.out.println("Vous disposez de : " +distributor.getCredit());
            System.out.println("1. Inserez de l'argent ");
            System.out.println("2. Commandez votre produit ");
            System.out.println("3. Quittez ");

            int choice = clavier.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Quel est le montant ? ");
                    float amount = clavier.nextInt();
                    distributor.insertMoney(amount);
                    break;
                case 2:
                    System.out.println("Choisissez le numéro du produit:");
                    for (Product produit : distributor.getStock()) {
                        System.out.println(produit.getId() + " : "
                                + produit.getName() + " : " + produit.getPrice() + " [ "
                                + produit.getQuantity() + " ]");
                    }
                    int productId = clavier.nextInt();
                    distributor.orderProduct(productId);
                    break;

                case 3:
                    finish = true;
                    break;

                default:
                    System.out.println("J'ai pas compris");
            }
        }
        System.out.println("AU REVOIR !");
    }

}
