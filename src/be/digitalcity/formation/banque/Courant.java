package be.digitalcity.formation.banque;

public class Courant {
    private String numero;
    private double solde;
    private double ligneDeCredit;
    private Personne titulaire;

    // Rend le constructeur inaccessible
    private Courant(){}

    // Constructeur 1. num et titulaire / 2. num, titulaire et ligne de crédit
    public Courant(String numero, Personne titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
    }

    public Courant(String numero, Personne titulaire, double ligneDeCredit) {
        this(numero, titulaire);
        this.ligneDeCredit = ligneDeCredit;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit) {
        this.ligneDeCredit = Math.abs(ligneDeCredit);
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }

    public void retrait(double montant) {
        if (montant < this.solde + this.ligneDeCredit) {
            this.solde -= montant;
            System.out.printf("Retrait de %10.2f EUR sur le compte courant %15s" +
                    "\nNouveau solde de %12.2f EUR\n\n", montant, this.numero, this.solde);
        } else {
            System.out.printf("Retrait de %10.2f EUR sur le compte courant %15s est impossible" +
                    "\nSolde insuffisant\n\n", montant, this.numero);
        }
    }

    public void depot(double montant) {
        if (montant > 0) {
            this.solde += montant;
            System.out.printf("Dépot de %10.2f EUR sur le compte courant %15s" +
                    "\nNouveau solde de %12.2f EUR\n\n", montant, this.numero, this.solde);
        }
    }
}
