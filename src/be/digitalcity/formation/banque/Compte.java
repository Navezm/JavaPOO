package be.digitalcity.formation.banque;

import java.util.Objects;

public abstract class Compte implements Banquier, Client{
    protected String numero;
    protected double solde;
    protected Personne titulaire;

    public Compte(String numero, Personne titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public double appliquerInteret(double tauxInteret) {
        return (this.solde * tauxInteret / 100) + this.solde;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }

    protected void retrait(double montant, double ligneDeCredit) {
       if (montant < this.solde + ligneDeCredit) {
           this.retrait(montant);
       }
    }

    public abstract void retrait(double montant);

    public void depot(double montant) {
        if (montant > 0) {
            this.solde += montant;
            System.out.printf("Dépot de %10.2f EUR sur le compte %s %15s" +
                    "\nNouveau solde de %12.2f EUR\n\n", montant, this.getClass().getSimpleName(), this.numero, this.solde);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compte compte = (Compte) o;
        return Double.compare(compte.solde, solde) == 0 && numero.equals(compte.numero) && titulaire.equals(compte.titulaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, solde, titulaire);
    }
}
