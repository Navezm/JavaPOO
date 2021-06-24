package be.digitalcity.formation.heritage;

// Modélise un humain
public class Enfant extends Parent{
    @Override
    protected void seDeplacer() {
        System.out.printf("%s se déplace en marchant\n", this.nom);
    }

    @Override
    protected void respirer() {
        super.respirer();
        System.out.println("de l'air et je m'en porte pas plus mal");
    }
}
