package be.digitalcity.formation.banque;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Banque {
    private final String NOM;
    private final HashMap<String, Courant> allComptes = new HashMap<>();

    public Banque(String nom) {
        this.NOM = nom;
    }

    public String getNom() {
        return NOM;
    }

    public HashMap<String, Courant> getAllComptes() {
        return allComptes;
    }

    public Courant search(String numeroCompte) {
        if (numeroCompte != null) {
            if (this.allComptes.containsKey(numeroCompte)) {
                System.out.printf("Voici les informations du compte %10s\n" +
                        "Nom du titulaire : " + this.allComptes.get(numeroCompte).getTitulaire().getNom() + " " + this.allComptes.get(numeroCompte).getTitulaire().getPrenom() + "\n" +
                        "Solde : " + this.allComptes.get(numeroCompte).getSolde() + "\n" +
                        "Ligne de crédit : " + this.allComptes.get(numeroCompte).getLigneDeCredit() + "\n", numeroCompte);
                return this.allComptes.get(numeroCompte);
            } else {
                System.out.printf("Le compte %10s n'a pas été trouvé\n", numeroCompte);
            }
        } else {
            System.err.println("Le numéro de compte n'est pas valide");
        }
        return null;
    }

    public void ajouter(Courant compte) {
        if (compte != null) {
            this.allComptes.put(compte.getNumero(), compte);
            System.out.printf("Le compte n°%1s du tutilaire %1s a correctement été ajouté à ma banque\n", compte.getNumero(), compte.getTitulaire().getNom());
        } else {
            System.err.println("Le compte est vide, il n'est pas possible de l'ajouter");
        }
    }

    public void supprimer(String numeroCompte) {
        if (this.allComptes.remove(numeroCompte) != null) {
            System.out.printf("Le compte N°%1s a bien été supprimé\n", numeroCompte);
        } else {
            System.err.printf("Le compte %1s n'existe pas ! Suppression impossible\n", numeroCompte);
        }
    }

    public double totalAvoir(Personne titulaire) {
        if (titulaire != null) {
            /*
            // Map des données de type Entry<V,V> dans la variable entry (après les ":" on rentre ce qu'on veut mapper)
            for (Map.Entry<String, Courant> entry :
                    allComptes.entrySet()) {
                if (entry.getValue().getSolde() > 0) {
                    total += entry.getValue().getSolde();
                }
            }
            System.out.println("Le total des comptes de "+ titulaire.getNom() + " " + titulaire.getPrenom() + " est de : " + total);
             */

            double total = 0;
            int compteur = 0;
            for (Courant compte : this.allComptes.values()) {
                if (compte.getTitulaire().equals(titulaire)) {
                    if (compte.getSolde() > 0) {
                        total += compte.getSolde();
                        compteur ++;
                    }
                }
            }
            if (compteur == 0) {
                System.out.printf("Le titulaire %25s ne possède pas de compte\n",
                        titulaire.getPrenom()+" "+titulaire.getNom());
            } else {
                System.out.printf("Total des avoirs de %25s : %.2fEUR\n",
                        titulaire.getPrenom()+" "+titulaire.getNom(),
                        total);
            }
            return total;
        }
        System.err.println("Problème de données non valide");
        return 0;
    }

}
