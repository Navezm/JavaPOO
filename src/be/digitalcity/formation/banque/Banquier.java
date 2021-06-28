package be.digitalcity.formation.banque;

public interface Banquier {

    void depot(double montant);
    void retrait(double montant) throws SoldeInsuffisantException;
    double appliquerInteret(double tauxInteret);

}
