package be.digitalcity.formation.lambda;

import java.time.LocalDate;
import java.util.*;

public class ListOperations {

    public static void main(String[] args) {
//        execute();
//        manageList();
        changeList(liste, listeUpdate);
    }

    public static List<Personne> liste = Arrays.asList(
        new Personne("Ceuleers", "Grégory", 41, LocalDate.of(2015,12,5)),
        new Personne("Ly", "Khun", 39, LocalDate.of(2013,3,15)),
        new Personne("Ovyn", "Flavian", 30, LocalDate.of(2014,3,10)),
        new Personne("Geerts", "Mélanie", 28, LocalDate.of(2016,11,17)),
        new Personne("Coppin", "Julien", 26, LocalDate.of(2013,10,25)),
        new Personne("Ly", "Pyu", 40, LocalDate.of(2014,3,5))
    );

    public static List<PersonneSimplifiee> listeUpdate = new ArrayList<>();

    private static List<Double> data = Arrays.asList(1D,2D,3D,4D,5D,6D,7D,8D,9D);

    public static void execute() {

        Optional<Double> resultat = data.stream()
                .limit(5)
                .filter(item -> item % 2 == 0)
                .map(item -> Math.pow(item, 3))
                .reduce((item1, item2) -> item1 + item2); // Rend un optionnal permet de faire des opérations sur un double

//                .orElse(0D);        Si jamais on a pas de valeur et que nos tris ne marchent pas on va assigner la valeur zéro
//                 .orElseThrow(() -> new IllegalArgumentException())  Permet si jamais on n'a pas de valeur d'envoyer une erreur

//                .forEach(affichage -> System.out.println(affichage));

        if (resultat.isPresent()) {
            System.out.println(resultat.get());
        }
    }

    public static void manageList() {
//        System.out.println("La moyenne vaut = " + liste.stream()
//                .mapToInt(p -> p.getAge())
//                .average()
//                .orElse(-1D));

//        liste.stream()
//                .mapToInt(Personne::getAge)
//                .peek(System.out::println)
//                .reduce((a,b) -> a + b)
//                .ifPresent(total -> System.out.println(total/liste.size()));

        // Trier du moins agé au plus âgé
        liste.sort((a,b) -> a.getAge() - b.getAge());
//        liste.sort(Comparator.comparingInt(p -> p.getAge()));
        liste.forEach(item -> System.out.println(item));
    }

    public static void changeList(List<Personne> list, List<PersonneSimplifiee> list2) {
        list2.forEach(p -> p.setNomComplet(list.stream().map(p2 -> p2.getPrenom() + " " + p2.getNom())));
    }
}
