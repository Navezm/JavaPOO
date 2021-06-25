package be.digitalcity.formation.types;

import be.digitalcity.formation.abstraction.Chien;

public class Main {
    public static void main(String[] args) {

        // Boxing -> conversion implicite
        int i = 5;
        Integer j = i;

        // Unboxing
        Integer k = 6;
        int l = k;

        Chien chien = new Chien();
    }
}
