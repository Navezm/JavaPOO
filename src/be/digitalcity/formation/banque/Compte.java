package be.digitalcity.formation.banque;

public class Compte extends Courant {

    public Compte(String numero, Personne titulaire) {
        super(numero, titulaire);
    }

    public Compte(String numero, Personne titulaire, double ligneDeCredit) {
        super(numero, titulaire, ligneDeCredit);
    }


}
