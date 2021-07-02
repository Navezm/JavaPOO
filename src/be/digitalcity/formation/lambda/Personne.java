package be.digitalcity.formation.lambda;

import be.digitalcity.formation.enumeration.Main;

import java.time.LocalDate;
import java.util.Objects;

public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private LocalDate dateEngagement;
    public Main.Genre genre;

    public Personne(String nom, String prenom, int age, LocalDate dateEngagement) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEngagement = dateEngagement;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateEngagement() {
        return dateEngagement;
    }

    public void setDateEngagement(LocalDate dateEngagement) {
        this.dateEngagement = dateEngagement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return age == personne.age && Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom) && Objects.equals(dateEngagement, personne.dateEngagement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, age, dateEngagement);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personne{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", age=").append(age);
        sb.append(", dateEngagement=").append(dateEngagement);
        sb.append('}');
        return sb.toString();
    }
}
