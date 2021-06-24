package be.digitalcity.formation.banque;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Personne titulaire = new Personne("Martin","Navez",LocalDate.of(1996,6,21));

        Courant courant = new Courant("BE12121212121", titulaire, 500);

        courant.depot(1000);
        courant.retrait(1200);
        courant.retrait(500);
    }
}
