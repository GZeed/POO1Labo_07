/*
 -----------------------------------------------------------------------------------
 Laboratoire : 06
 Fichier     : Regime.java
 Auteurs     : Yohann Meyer, Guillaume Zaretti
 Date        : 19.12.2017

 But         : Classe modélisant le régime des annimaux.
 			   

 Remarque(s) : 

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
 */
import java.util.*;

public class Regime {

    // Constructeur minimal
    public Regime(String nom) {

    }

    // Contructeur
    public Regime(String nom,
            Set<Nourriture> nourritures,
            Map<Nourriture, Double> qteNourriture) {
        this.nom = nom;
        this.nourritures = nourritures;
        this.mapQteNourriture = qteNourriture;

    }

    // Getter du nom du régime
    public String getNom() {
        return nom;
    }

    // Setter du nom du régime
    public void setNom(String nom) {
        this.nom = nom;
    }

    //Ajoute une ou plusieurs nouritures donné(s) en paramètre au régimes courant
    /*public void ajouterNourritures(Nourriture... nouritures){
         for (Nourriture n : nouritures) {
            ajouterNourriture(n);
        }
    }*/

    //Ajoute une nouritures donné en paramètre au régimes courant
    public void ajouterNourriture(Nourriture nourriture, double quantitee) {
        if (!nourritures.contains(nourriture)) {
            nourritures.add(nourriture);
            mapQteNourriture.put(nourriture, quantitee);
        }
    }

    /*public void supprimerNourritures(Nourriture... nouritures){  
    }*/
    //Supprimer une nouritures donné en paramètre au régimes courant
    public void supprimerNourriture(Nourriture nourriture, double quantitee) {
        nourritures.remove(nourriture);
        mapQteNourriture.remove(nourriture);
    }

    //Modifier une nouritures donné en paramètre au régimes courant
    public void modifierQuantiteeNourriture(Nourriture nourriture, double quantitee) {
        if (nourritures.contains(nourriture)) {
            mapQteNourriture.put(nourriture, quantitee);
        }
    }

    private String nom;
    private Map<Nourriture, Double> mapQteNourriture;
    private Set<Nourriture> nourritures;

}
