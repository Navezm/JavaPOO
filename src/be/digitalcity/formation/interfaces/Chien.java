package be.digitalcity.formation.interfaces;

public class Chien extends Animal implements Deplacement{
    @Override
    public void seDeplacer() {
        System.out.println(this.getClass().getSimpleName()+ " se déplace à 4 pattes");
    }
}
