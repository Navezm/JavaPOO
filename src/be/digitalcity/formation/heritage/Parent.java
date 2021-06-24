package be.digitalcity.formation.heritage;

// Représente les êtres vivants
public abstract class Parent {

    protected String nom;

    protected abstract void seDeplacer();

    protected void respirer(){
        System.out.printf("%s respire ", this.nom);
    }

    // Final permet de verouiller la méthode -> donc plus aucune classe ne va pouvoir la définir
    protected final void nonRedefinissableParentEnfant(){
        System.out.println("Tout est dit dans le parent");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
