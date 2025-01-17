package com.spring.ocr_project.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarteIdentite {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String numeroCarteNational;
    private LocalDate dateFinCarteNational;
    private String adresse;
    private LocalDate dateNaissance;


    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroCarteNational() {
        return numeroCarteNational;
    }

    public void setNumeroCarteNational(String numeroCarteNational) {
        this.numeroCarteNational = numeroCarteNational;
    }

    public LocalDate getDateFinCarteNational() {
        return dateFinCarteNational;
    }

    public void setDateFinCarteNational(LocalDate dateFinCarteNational) {
        this.dateFinCarteNational = dateFinCarteNational;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }


}
