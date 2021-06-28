package be.digitalcity.formation.banque;

import java.time.LocalDateTime;

public final class Epargne extends Compte{

    private LocalDateTime dateDernierRetrait;

    protected final double TAUX_INTERET = 3.95;

    public Epargne(String numero, Personne titulaire) {
        super(numero, titulaire);
    }

    public LocalDateTime getDateDernierRetrait() {
        return dateDernierRetrait;
    }

    public void setDateDernierRetrait(LocalDateTime dateDernierRetrait) {
        this.dateDernierRetrait = dateDernierRetrait;
    }


    public void retrait(double montant) {
        if (montant < this.solde) {
            this.solde -= montant;
            this.setDateDernierRetrait(LocalDateTime.now());
            System.out.printf("Retrait de %10.2f EUR sur le compte %s %15s" +
                    "\nNouveau solde de %12.2f EUR\n\n", montant, this.getClass().getSimpleName(), this.numero, this.solde);
        } else {
            System.out.printf("Retrait de %10.2f EUR sur le compte %s %15s est impossible" +
                    "\nSolde insuffisant\n\n", montant, this.getClass().getSimpleName(), this.numero);
        }
    }
}
