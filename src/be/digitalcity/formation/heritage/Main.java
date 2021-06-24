package be.digitalcity.formation.heritage;

public class Main {
    public static void main(String[] args) {
        Enfant humain = new Enfant();
        humain.setNom("Martin");
        humain.seDeplacer();
        humain.respirer();

        Enfant2 poisson = new Enfant2();
        poisson.setNom("Dory");
        poisson.respirer();
    }
}
