package be.digitalcity.formation.revisions;

import java.util.Arrays;
import java.util.List;

public class GestionReservation {

    public static void main(String[] args) {
        List<OptionsHotel> options = DataLoader.getInstance().load("C:\\Users\\local_user\\Desktop\\Exercices\\Java OO\\POO\\src\\be\\digitalcity\\formation\\revisions\\options_hotel_-_Feuille_1.csv");

        System.out.println(Arrays.toString(options.toArray()));
    }

}
