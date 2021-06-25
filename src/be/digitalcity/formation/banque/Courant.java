package be.digitalcity.formation.banque;

public final class Courant extends Compte{
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

    public Courant(String numero, Personne titulaire){
        super(numero, titulaire);
    }

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

    public void retrait(double montant){
        if (montant < this.solde + this.ligneDeCredit) {
            this.solde -= montant;
            System.out.printf("Retrait de %10.2f EUR sur le compte %s %15s" +
                    "\nNouveau solde de %12.2f EUR\n\n", montant, this.getClass().getSimpleName(), this.numero, this.solde);
        } else {
            System.out.printf("Retrait de %10.2f EUR sur le compte %s %15s est impossible" +
                    "\nSolde insuffisant\n\n", montant, this.getClass().getSimpleName(), this.numero);
        }
    }
}
