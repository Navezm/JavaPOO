package be.digitalcity.formation.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
//        List<Integer> ints = new ArrayList<>();
//        ints.add(1);
//        ints.add(2);
//        ints.add(3);
//        ints.add(4);
//
//        for (int value : ints) {
//            System.out.println(value);
//        }
//
//
//        // Utilise l'interface fonctionnelle Consumer -> qui prend un paramètre en entrée et ne renvoie rien
//        ints.forEach(x -> {
//            System.out.println(x);
//            System.out.println();
//        });
//
//        Consumer<Integer> fct = x -> System.out.println(x);
////        Consumer<Integer> fct = System.out::println;
//
//        fct.accept(5);
        liste.add(new Personne("Ceuleers", "Grégory", 41, LocalDate.of(2015,12,5)));
        liste.add(new Personne("Ly", "Khun", 39, LocalDate.of(2013,3,15)));
        liste.add(new Personne("Ovyn", "Flavian", 30, LocalDate.of(2014,3,10)));
        liste.add(new Personne("Geerts", "Mélanie", 28, LocalDate.of(2016,11,17)));
        liste.add(new Personne("Coppin", "Julien", 26, LocalDate.of(2013,10,25)));
        liste.add(new Personne("Ly", "Pyu", 40, LocalDate.of(2014,3,5)));

        // 1ere Aproche
        chercherPersonneAvecLeNom(liste,"Coppin");

        // 2e Approche
        chercherPersonneViaClasse(liste, new CritereRecherche());

        // 3e Approche
        rechercherPersonneViaClasseAnonyme(liste, new CheckPersonne() {
            @Override
            public boolean test(Personne p) {
                return p.getAge() < 40 && p.getNom().contains("n");
            }
        });
        System.out.println();

        // 4e Approche
        rechercherPersonneViaClasseAnonyme(liste, p -> p.getPrenom().endsWith("n") && p.getAge() < 40);
        rechercherPersonneViaClasseAnonyme2(liste, p -> p.getPrenom().endsWith("n") && p.getAge() < 40);
        System.out.println();

        // Exo 1
        rechercheEtAffichage(liste, p -> p.getPrenom().endsWith("e"), p -> System.out.println(p.getPrenom() + " " + p.getNom() + " correspond au critère"));

        // Exo 2
        calcul(10,5, (a, b) -> (a / b));

        // Correction Exo 2
        calculCorrection(5, 9, (a,b) -> System.out.println(a+b));

    }

    private static List<Personne> liste = new ArrayList<>();

    // 1ere Approche : méthode cherchant sur une liste avec un critère
    public static void chercherPersonneAvecLeNom(List<Personne> list, String nom) {
        for (Personne p : list){
            if (p.getNom().equalsIgnoreCase(nom)){
                System.out.println(p.toString());
            }
        }
    }

    // 2e Approche : classe qui va stocker les différentes méthodes de recherche
    public static void chercherPersonneViaClasse(List<Personne> list, CritereRecherche recherche){
        for (Personne p : list){
            if(recherche.test1(p, "Grégory")){
                System.out.println(p.toString());
            }
        }
    }

    // 3e Approche : via classe anonyme
    public static void rechercherPersonneViaClasseAnonyme(List<Personne> list, CheckPersonne recherche){
        for (Personne p : list){
            if(recherche.test(p)){
                System.out.println(p.toString());
            }
        }
    }

    // Interface fonctionnelle
    public static void rechercherPersonneViaClasseAnonyme2(List<Personne> list, Predicate<Personne> recherche){
        for (Personne p : list){
            if(recherche.test(p)){
                System.out.println(p.toString());
            }
        }
    }

    /* Ecrire une méthode qui va permettre sur la liste
     de filtrer un résultat (Predicate<T>) en passant une lambda
     et de passer ensuite une action (Consumer<T>) d'affichage au choix (lambda) */

    public static void rechercheEtAffichage(List<Personne> list, Predicate<Personne> predicate, Consumer<Personne> action) {
        for (Personne p : list) {
            if (predicate.test(p)){
                action.accept(p);
            }
        }
    }

    // Correction
    public static void rechercheEtAffichageCorrection(List<Personne> list, Predicate<Personne> predicate, Consumer<Personne> action) {
        list.forEach(item -> {
            if (predicate.test(item)) {
                action.accept(item);
            }
        });
    }

     /* Ecrire une méthode qui servira de boîte à calcul sur deux variables int
     * Cette méthode prendra en paramètre les 2 nombres, la lambda pour le calcul
     * et affichera le résutat
     */

    public static void calcul(int a, int b, IntBinaryOperator operation){
        System.out.println(operation.applyAsInt(a,b));
    }

    // Correction
    public static void calculCorrection(int a, int b, Calculable operation){
        operation.executer(a,b);
    }
}
