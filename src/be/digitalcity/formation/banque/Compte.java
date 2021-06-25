package be.digitalcity.formation.banque;

public abstract class Compte {
    private String numero;
    protected double solde;
    private Personne titulaire;

    public Compte(String numero, Personne titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
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

    public void retrait(double montant){
        if (montant < this.solde) {
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
