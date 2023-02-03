package com.example.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String libelle;
  @OneToMany(mappedBy = "categorie")
  private List<Produit> produits= new ArrayList<>();
public List<Produit> getProduits() {
    return produits;
}
public void setProduits(List<Produit> produits) {
    this.produits = produits;
}
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getLibelle() {
    return libelle;
}
public void setLibelle(String libelle) {
    this.libelle = libelle;
}  
}
