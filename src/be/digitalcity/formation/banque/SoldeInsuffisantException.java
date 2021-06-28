package be.digitalcity.formation.banque;

public class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException() {
        super("Le solde est insuffisant");
    }
}
