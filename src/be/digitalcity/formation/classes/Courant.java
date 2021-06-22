package be.digitalcity.formation.classes;

public class Courant {
    private String numero;
    private double solde;
    private double ligneDeCredit;
    private Personne titulaire;

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
        if (ligneDeCredit >= 0) {
            this.ligneDeCredit = ligneDeCredit;
        } else {
            System.out.println("Erreur la limite doit être un chiffre positif");
        }
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }

    public void retrait(double montant) {
        if ((this.getSolde() - montant) > getLigneDeCredit()) {
            this.solde =- montant;
            System.out.println("Le solde est maintenant de " + getSolde());
        } else {
            System.out.println("Le solde est insufisant");
        }
    }

    public void depot(double montant) {
        this.solde =+ montant;
        System.out.println("Le solde est maintenant de " + getSolde());
    }
}
