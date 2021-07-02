package be.digitalcity.formation.genericite;

import be.digitalcity.formation.lambda.Personne;
import be.digitalcity.formation.lambda.PersonneSimpliféeCorrection;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestGenerique {

//    public int addition(int a, int b){
//        return a + b;
//    }
//
//    public double addition(double a, double b) {
//        return a + b;
//    }
//
//    public float addition(float a, float b) {
//        return a + b;
//    }

    public static <T extends Number> Number addition(T a, T b) {
        switch (a.getClass().getSimpleName()) {
            case "Integer":
                return ((int)a) + ((int)b);
            case "Double":
                return ((double)a) + ((double)b);
            case "Float":
                return ((float)a) + ((float)b);
            case "Long":
                return ((long)a) + ((long)b);
        }
        throw new IllegalArgumentException("Mauvais type de données");
    }

    public static void main(String[] args) {
        System.out.println(addition(1.52D,45.48D));

        Directeur<Stagiaire> directeur = new Directeur<>();
        directeur.nom = "Jean-Pol";

//        Directeur<Directeur<Stagiaire>> directeur1 = new Directeur<>();
//        directeur1.assistant.assistant.nom

        try {
            directeur.setAssistant(Stagiaire.class, "Vanessa");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        directeur.afficher();
        System.out.println(directeur.getAssistant().nom);

        List<Integer> ints = fromArrayToList(new Integer[]{1,2,3,4,5,6,7});
        ints.forEach(System.out::println);

        List<Integer> ints2 = fromArrayToList(new Integer[]{1,2,3,4,5,6,7}, x -> x * 2);
        ints2.forEach(System.out::println);

        List<PersonneSimpliféeCorrection> listeSimplifiee = fromArrayToList(new Personne[] {
                new Personne("Ceuleers","Grégory",41, LocalDate.of(1996,6,21))
        }, personne -> new PersonneSimpliféeCorrection(personne.getNom() + " " + personne.getPrenom(), personne.getDateEngagement()));
        listeSimplifiee.forEach(System.out::println);

//        Personne objet1 = new Personne("Statham", "Jason", 48, LocalDate.of(2020,6,15));
        String i = "5";
        double j = convert(i, x -> Double.parseDouble(i));

        Personne p = null;
        PersonneSimpliféeCorrection ps = convert(p, pers -> new PersonneSimpliféeCorrection(p.getNom(), p.getDateEngagement()));

    }

    public static <T> List<T> fromArrayToList(T[] tab) {
        return Arrays.stream(tab).collect(Collectors.toList());
    }

    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }

    public static <T extends Number & Comparable & Serializable> void test(T parameter) { // Le "&" permet d'implémenter une interface (voir plusieurs)

    }

    // Prend 1 objet T en param et qui prend ma logique de conversion en param. Qui permet de transformer un objet de type T en objet de type R
    public static <T, R> R convert(T object, Function<T, R> transform) {
//        System.out.println("Je passe ici");
        return transform.apply(object);
    }

}
