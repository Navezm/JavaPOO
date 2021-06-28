package be.digitalcity.formation.anonyme;

import be.digitalcity.formation.banque.Banquier;

public class Main {

    public static void main(String[] args) {

        Banquier banquier = new Banquier() {
            @Override
            public void depot(double montant) {

            }

            @Override
            public void retrait(double montant) {

            }

            @Override
            public double appliquerInteret(double tauxInteret) {
                return 0;
            }
        };

    }

}
