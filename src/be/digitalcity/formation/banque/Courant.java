package be.digitalcity.formation.banque;

public class Courant extends Compte{
    private double ligneDeCredit;

    /*

    // Rend le constructeur inaccessible
    private Courant(){}

    // Constructeur 1. num et titulaire / 2. num, titulaire et ligne de crédit
    public Courant(String numero, Personne titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
    }

     */

    public Courant(String numero, Personne titulaire, double ligneDeCredit) {
        super(numero, titulaire);
        this.ligneDeCredit = ligneDeCredit;
    }

    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit) {
        this.ligneDeCredit = Math.abs(ligneDeCredit);
    }
}
