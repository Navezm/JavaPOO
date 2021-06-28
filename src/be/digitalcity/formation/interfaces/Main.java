package be.digitalcity.formation.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Deplacement> mobiles = new ArrayList<>();
        mobiles.add(new Voiture());
        mobiles.add(new Chien());
        ((Voiture)mobiles.get(0)).modele();
    }

}
