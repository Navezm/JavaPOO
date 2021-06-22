package be.digitalcity.formation.classes;

import java.time.LocalDate;

public class Personne {
    private String nom;
    private String prenom;
    private LocalDate DateNaiss;

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

    public LocalDate getDateNaiss() {
        return DateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        DateNaiss = dateNaiss;
    }
}
