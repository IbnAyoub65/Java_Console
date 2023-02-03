package com.example.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@DiscriminatorValue("Client")
@NamedQueries({
    @NamedQuery(name = "client.findAll",query = "SELECT C from Client C"),
    @NamedQuery(name = "client.findById",query = "SELECT C from Client C Where C.id=:id"),
    @NamedQuery(name = "client.findByEmail",query = "SELECT C from Client C Where C.email=:email"),

})
public class Client extends User {
    private String numTel;
    @Embedded
    private Adresse adresse;

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }
}
