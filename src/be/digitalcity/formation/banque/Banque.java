package be.digitalcity.formation.banque;

import java.util.HashMap;

public class Banque {
    private String nom;
    private HashMap<String, Courant> allComptes = new HashMap<>();

    public String getNom() {
        return nom;
    }

    public void search(String numeroCompte){
        System.out.printf("Voici les informations du compte %10s\n" +
                "Nom du titulaire : " +allComptes.get(numeroCompte).getTitulaire().getNom()+" "+allComptes.get(numeroCompte).getTitulaire().getPrenom()+"\n"+
                "Solde : "+allComptes.get(numeroCompte).getSolde()+"\n"+
                "Ligne de crédit : "+allComptes.get(numeroCompte).getLigneDeCredit()+"\n",numeroCompte);
    }

    public void ajouter(Courant compte){
        allComptes.put(compte.getNumero(), compte);
        System.out.printf("Le compte n°%10s du tutilaire %10s a correctement été ajouté à ma banque\n",compte.getNumero(),compte.getTitulaire().getNom());
    }

    public void supprimer(String numeroCompte){
        allComptes.remove(numeroCompte);
        System.out.printf("Le compte N°%10s a bien été supprimé de la DB\n",numeroCompte);
    }
}
