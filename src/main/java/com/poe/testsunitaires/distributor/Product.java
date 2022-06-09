/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poe.testsunitaires.distributor;

public class Product {
    private String nom;
    private float prix;
    private int quantite;

    public Product(String nom, float prix, int quantite) {
      this.nom = nom;
      this.prix = prix;
      this.quantite = quantite;
  }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    @Override
    public String toString() {
        return "Product{" + "nom=" + nom + ", prix=" + prix + ", quantite=" + quantite + '}';
    }

}
