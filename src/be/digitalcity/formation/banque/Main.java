package be.digitalcity.formation.banque;

import java.time.LocalDate;

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
        try {
            courant1.retrait(650);
        } catch (SoldeInsuffisantException e) {
            e.printStackTrace();
        } finally { // Il est facultatif et permet de toujours passer par là peut-importe les erreurs qui sont catchs avant
            System.out.println("Je passe tjrs par ici pour finir");
        }

        myBank.ajouter(courant);
        myBank.ajouter(courant1);

        Compte rechercheCompte = myBank.search(courant1.getNumero());

        myBank.ajouter(new Courant("BE436527328436",new Personne("Gregory","Ceuleers",LocalDate.of(1980,2,15)),1000));
//        myBank.search("BE436527328436");

        myBank.supprimer("BE436527326");
//        myBank.search("BE12121212121");

        myBank.totalAvoir(titulaire);

//        myBank.ajouter();
        myBank.ajouter(new Epargne("BE125469646875", titulaire));
        myBank.getAllComptes().get("BE125469646875").depot(1200);

        myBank.totalAvoir(titulaire);

        // Logique pour le client
        System.out.println(((Banquier)rechercheCompte).appliquerInteret(rechercheCompte instanceof Courant ?
                ((Courant)rechercheCompte).TAUX_INTERET :
                ((Epargne)rechercheCompte).TAUX_INTERET));

    }
}
