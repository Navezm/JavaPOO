package be.digitalcity.formation.interfaces;

public class Voiture extends Vehicule implements Deplacement{

    public void modele(){
        System.out.println("Modèle");
    }
    @Override
    public void seDeplacer() {
        System.out.println(this.getClass().getSimpleName()+ " se déplace en roulant");
    }
}
