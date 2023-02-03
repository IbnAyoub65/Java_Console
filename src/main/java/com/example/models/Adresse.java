package com.example.models;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
 private String ville;
 private String quartier;
 private String Tel;
public String getVille() {
    return ville;
}
public void setVille(String ville) {
    this.ville = ville;
}
public String getQuartier() {
    return quartier;
}
public void setQuartier(String quartier) {
    this.quartier = quartier;
}
public String getTel() {
    return Tel;
}
public void setTel(String tel) {
    Tel = tel;
}   
}
