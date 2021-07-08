package be.digitalcity.formation.files;

import be.digitalcity.formation.annotation.Logging;

import java.io.Serializable;

public class Voiture implements Serializable {
    private String marque;
    private int cylindree;

    public Voiture(String marque, int cylindree) {
        this.marque = marque;
        this.cylindree = cylindree;
    }

    /**
     * @deprecated : Ne s'utilise plus
     */
    @Deprecated
    @Logging(value = "FAIRE QQCH")
    public void faireQqch() {
        System.out.println("Faire quelque chose");
    }


    private void ExecutionApresCTOR() {
        System.out.println("Nouvelle voiture générée");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Voiture{");
        sb.append("marque='").append(marque).append('\'');
        sb.append(", cylindree=").append(cylindree);
        sb.append('}');
        return sb.toString();
    }
}
