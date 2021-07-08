package be.digitalcity.formation.designpattern;

public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void faireQch() {
        System.out.println("Appel depuis mon Singleton");
    }
}
