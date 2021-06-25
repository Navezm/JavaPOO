package be.digitalcity.formation.banque;

import java.time.LocalDate;
import java.util.Objects;

public class Personne {
    private String nom;
    private String prenom;
    private LocalDate dateNaiss;

    public Personne(String nom, String prenom, LocalDate dateNaiss){
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
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

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return nom.equals(personne.nom) && prenom.equals(personne.prenom) && dateNaiss.equals(personne.dateNaiss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, dateNaiss);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personne{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", dateNaiss=").append(dateNaiss);
        sb.append('}');
        return sb.toString();
    }
}

