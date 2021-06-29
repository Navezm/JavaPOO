package be.digitalcity.formation.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListOperations {

    public static void main(String[] args) {
        execute();
    }

    private static List<Double> data = Arrays.asList(1D,2D,3D,4D,5D,6D,7D,8D,9D);

    public static void execute() {

        Optional<Double> resultat = data.stream()
                .limit(5)
                .filter(item -> item % 2 == 0)
                .map(item -> Math.pow(item, 3))
                .reduce((item1, item2) -> item1 + item2); // Un optionnal permet de faire des opérations sur un double
//                .orElse(0D);        Si jamais on a pas de valeur et que nos tris ne marchent pas on va assigner la valeur zéro
//                 .orElseThrow(() -> new IllegalArgumentException())  Permet si jamais on n'a pas de valeur d'envoyer une erreur

        if (resultat.isPresent()) {
            System.out.println(resultat.get());
        }
//                .forEach(affichage -> System.out.println(affichage));
    }
}
