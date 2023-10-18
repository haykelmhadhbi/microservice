package com.example.condidat;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity

@ToString
@RequiredArgsConstructor // bech yemchi yamel constructeur avec les attribut eli mahtout fou9hom no null

public class Condidat implements Serializable {

    public static final long serialVersionID = 6 ;

    @Id
    @GeneratedValue

    private  int id;
    @NonNull
    private String nom;
    private String pronom;
    private String email;


    // Constructeur vide (par défaut) requis pour JPA


    public Condidat() {
        super();
    }

    // Constructeur paramétré
    public Condidat(String nom, String pronom, String email) {
        this.nom = nom;
        this.pronom = pronom;
        this.email = email;
    }

    // Getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPronom() {
        return pronom;
    }

    public void setPronom(String pronom) {
        this.pronom = pronom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
