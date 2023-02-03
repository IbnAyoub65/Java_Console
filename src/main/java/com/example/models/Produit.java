package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String libelle; 
    @ManyToOne
    @JoinColumn(name = "categorie",referencedColumnName = "id")
  private Categorie categorie;

public String getLibelle() {
    return libelle;
}
public void setLibelle(String libelle) {
    this.libelle = libelle;
}
public Categorie getCategorie() {
    return categorie;
}
public void setCategorie(Categorie categorie) {
    this.categorie = categorie;
}

}
