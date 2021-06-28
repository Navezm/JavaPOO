package be.digitalcity.formation.banque;

public interface Banquier {

    void depot(double montant);
    void retrait(double montant);
    double appliquerInteret(double tauxInteret);

}
