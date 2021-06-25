package be.digitalcity.formation.banque;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Epargne extends Compte{
    private LocalDateTime dateDernierRetrait;

    public Epargne(String numero, Personne titulaire) {
        super(numero, titulaire);
    }

    public LocalDateTime getDateDernierRetrait() {
        return dateDernierRetrait;
    }

    public void setDateDernierRetrait(LocalDateTime dateDernierRetrait) {
        this.dateDernierRetrait = dateDernierRetrait;
    }

    @Override
    public void retrait(double montant) {
        double oldSolde = this.solde;
        super.retrait(montant);
        if (this.solde < oldSolde){
            this.setDateDernierRetrait(LocalDateTime.now());
        }
    }
}
