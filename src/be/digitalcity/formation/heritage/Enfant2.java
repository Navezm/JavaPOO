package be.digitalcity.formation.heritage;

// Représente un poisson
public final class Enfant2 extends Parent{
    @Override
    protected void seDeplacer() {
        System.out.printf("%s se déplace en nageant\n", this.nom);
    }

    @Override
    protected void respirer() {
        System.out.println("Je ne sais pas");
    }
}
