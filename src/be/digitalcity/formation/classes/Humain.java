package be.digitalcity.formation.classes;

import java.time.LocalDate;

public class Humain {

    public String nom;
    public String prenom;
    public LocalDate anniversaire;

    // Compter le nbre d'objet de ce type
    public static int COUNT;

    // Constructeur
    public Humain() {
        COUNT++;
    }

    public void afficherInfos() {
        System.out.println(nom + " " + prenom + " " + anniversaire);
    }
}
