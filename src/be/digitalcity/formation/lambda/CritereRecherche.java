package be.digitalcity.formation.lambda;

public class CritereRecherche {

    public boolean test(Personne p, String nom) {
        return p.getNom().equalsIgnoreCase(nom);
    }

    public boolean test1(Personne p, String prenom) {
        return p.getPrenom().equalsIgnoreCase(prenom);
    }
}
