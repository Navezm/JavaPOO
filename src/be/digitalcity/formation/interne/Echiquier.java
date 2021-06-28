package be.digitalcity.formation.interne;

import java.util.ArrayList;
import java.util.List;

public class Echiquier {

    private String modele;

    private class Case {
        public int X;
        public int Y;

        public void afficher(){
            System.out.println(modele); // Pas de this parce que modele ne fait pas partie de la même classe
        }
    }

    List<Case> cases = new ArrayList<>();

}
