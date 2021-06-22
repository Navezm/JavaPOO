package be.digitalcity.formation.classes;

import java.time.LocalDate;

public class Humain {

    private String nom;
    private String prenom;
    private LocalDate anniversaire;

    // Compter le nbre d'objet de ce type
    public static int COUNT;

    // Constructeur
    public Humain() {
        COUNT++;
    }

    public Humain(String nom) {
        this(); // Appel au constructeur
        this.nom = nom;
    }

    public Humain(String nom, String prenom) {
        this(nom); // Appel au constructeur avec un paramètre
        this.prenom = prenom;
    }

    // Getters & Setters
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

    public LocalDate getAnniversaire() {
        return anniversaire;
    }

    public void setAnniversaire(LocalDate anniversaire) {
        this.anniversaire = anniversaire;
    }

    public void afficherInfos() {
        System.out.println(nom + " " + prenom + " " + anniversaire);
    }
}
