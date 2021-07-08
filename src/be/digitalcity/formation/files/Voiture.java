package be.digitalcity.formation.files;

import java.io.Serializable;

public class Voiture implements Serializable {
    private String marque;
    private int cylindree;

    public Voiture(String marque, int cylindree) {
        this.marque = marque;
        this.cylindree = cylindree;
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
