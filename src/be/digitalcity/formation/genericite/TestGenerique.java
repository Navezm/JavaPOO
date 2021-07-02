package be.digitalcity.formation.genericite;

import java.lang.reflect.InvocationTargetException;

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
    }

}
