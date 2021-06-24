package be.digitalcity.formation.banque;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Epargne {
    private String numero;
    private double solde;
    private LocalDateTime dateDernierRetrait;
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

    public LocalDateTime getDateDernierRetrait() {
        return dateDernierRetrait;
    }

    public void setDateDernierRetrait(LocalDateTime dateDernierRetrait) {
        this.dateDernierRetrait = dateDernierRetrait;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }

    public void retrait(double montant){
        if (montant < this.solde) {
            this.solde -= montant;
            this.setDateDernierRetrait(LocalDateTime.now());
            System.out.printf("Retrait de %10.2f EUR sur le compte épargne %15s" +
                    "\nNouveau solde de %12.2f EUR\n\n", montant, this.numero, this.solde);
        } else {
            System.out.printf("Retrait de %10.2f EUR sur le compte épargne %15s est impossible" +
                    "\nSolde insuffisant\n\n", montant, this.numero);
        }
    }

    public void depot(double montant){
        if (montant > 0) {
            this.solde += montant;
            System.out.printf("Dépot de %10.2f EUR sur le compte courant %15s" +
                    "\nNouveau solde de %12.2f EUR\n\n", montant, this.numero, this.solde);
        }
    }
}
