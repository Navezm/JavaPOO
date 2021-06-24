package be.digitalcity.formation;

import be.digitalcity.formation.classes.Humain;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Humain personne = new Humain();
        personne.setPrenom("Martin");
        personne.setNom("Navez");
        personne.setAnniversaire(LocalDate.of(1996,6,21));

        personne.afficherInfos();
        System.out.println(Humain.COUNT);

        Humain personne2 = new Humain();
        personne2.setPrenom("Gregory");
        personne2.setNom("Ceuleers");
        personne2.setAnniversaire(LocalDate.of(1980,6,26));

        personne2.afficherInfos();
        System.out.println(Humain.COUNT);

    }
}
