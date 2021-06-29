package be.digitalcity.formation.lambda;

import java.util.Objects;

public class PersonneSimplifiee {
    // Contient la concatenation du nom et prenom
    // Total de secondes depuis ma date d'annif au jour actuel
    private String nomComplet;
    private int secondeDepuisEntree;

    public PersonneSimplifiee(String nomComplet, int secondeDepuisEntree) {
        this.nomComplet = nomComplet;
        this.secondeDepuisEntree = secondeDepuisEntree;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public int getSecondeDepuisEntree() {
        return secondeDepuisEntree;
    }

    public void setSecondeDepuisEntree(int secondeDepuisEntree) {
        this.secondeDepuisEntree = secondeDepuisEntree;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonneSimplifiee{");
        sb.append("nomComplet='").append(nomComplet).append('\'');
        sb.append(", secondeDepuisEntree=").append(secondeDepuisEntree);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonneSimplifiee that = (PersonneSimplifiee) o;
        return secondeDepuisEntree == that.secondeDepuisEntree && Objects.equals(nomComplet, that.nomComplet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomComplet, secondeDepuisEntree);
    }
}
