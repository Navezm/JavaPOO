package be.digitalcity.formation.abstraction;

public abstract class Animal {
    public Animal() {
        System.out.println("Appel du CTOR d'ANIMAL");
    }

    public abstract void deplacement();
    public abstract void crier();

}
