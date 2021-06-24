package be.digitalcity.formation.banque;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Banque myBank = new Banque("BNP Paris-Bas Fortis");
        Personne titulaire = new Personne("Martin","Navez",LocalDate.of(1996,6,21));

        Courant courant = new Courant("BE12121212121", titulaire, 500);
        Courant courant1 = new Courant("BE746392444325", titulaire);

        courant.depot(1000);
//        courant.retrait(1200);
//        courant.retrait(500);

        courant1.depot(500);
        courant1.retrait(650);

        myBank.ajouter(courant);
        myBank.ajouter(courant1);

        myBank.search(courant1.getNumero());

        myBank.ajouter(new Courant("BE436527328436",new Personne("Gregory","Ceuleers",LocalDate.of(1980,2,15)),1000));
//        myBank.search("BE436527328436");

        // Quand on lance le programme, la ligne 32 s'effectue avant la ligne 29, Pourquoi ?
        myBank.supprimer("BE436527326");
//        myBank.search("BE12121212121");

        myBank.totalAvoir(titulaire);

        Epargne epargne1 = new Epargne();
        epargne1.setDateDernierRetrait(LocalDateTime.now());
    }
}
