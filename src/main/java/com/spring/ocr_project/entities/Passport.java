package com.spring.ocr_project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor
@Table(name = "passport")
public class Passport {
    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String passportNumber;
    private String nom;
    private String prenom;
    private String nationalite;
    private String dateDeDeliverance;
    private String dateExpiration;
    private String dateNaissance;
    private String LieuNaissance;

    public Long getId() {
        return id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public String getDateDeDeliverance() {
        return dateDeDeliverance;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getLieuNaissance() {
        return LieuNaissance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setDateDeDeliverance(String dateDeDeliverance) {
        this.dateDeDeliverance = dateDeDeliverance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public void setLieuNaissance(String lieuNaissance) {
        LieuNaissance = lieuNaissance;
    }
}
