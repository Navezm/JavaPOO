package be.digitalcity.formation.enumeration;

import be.digitalcity.formation.lambda.Personne;

public class Main {

    public enum JourSemaine {
        Lundi,
        Mardi,
        Mercredi,
        Jeudi,
        Vendredi,
        Samedi,
        Dimanche
    }

    public enum Genre {
        M,
        F,
        X
    }

    public enum AllTVA {
        TVA_6(0.06, new String[]{"renovation", "chocolat"}, new Personne("C","G",42,null)),
        TVA_12(0.12, new String[]{"alimentation", "chaussure"}, null),
        TVA_21(0.21, new String[]{"produits divers"}, null);

        private double taux_tva;

        private String[] categories;

        private Personne personne;

        AllTVA(double taux_tva, String[] categories, Personne personne) {
            this.taux_tva = taux_tva;
            this.categories = categories;
            this.personne = personne;
        }

        public double getTaux_tva() {
            return taux_tva;
        }

        public Personne getPersonne() {
            return personne;
        }
        //        public void setTaux_tva(double taux_tva) {
//            this.taux_tva = taux_tva;
//        }
    }

    public static void main(String[] args) {
        JourSemaine jour = JourSemaine.Mercredi;
        System.out.println(jour.name());
        System.out.println(jour.ordinal());
        System.out.println(jour);

        Personne p = new Personne("C","G",41,null);
        p.genre = Genre.X;

        AllTVA maTVA = AllTVA.TVA_6;
        System.out.println(maTVA.getTaux_tva());

        for (int i = 0; i < maTVA.categories.length; i++) {
            System.out.println(maTVA.categories[i]);
        }

//        maTVA.setTaux_tva(0.35);
        System.out.println(maTVA.taux_tva);

        for (AllTVA value : AllTVA.values()) {
            System.out.println(value.taux_tva);
        }

    }

}
