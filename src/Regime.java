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
        this.nom = nom;
    }

    // Contructeur
    public Regime(String nom, HashMap<Nourriture, Double> quantites) {

        this.nom = nom;
        this.quantites = quantites;

    }

    // Getter du nom du régime
    public String getNom() {
        return nom;
    }

    // Setter du nom du régime
    public void setNom(String nom) {
        this.nom = nom;
    }


    //Ajoute une nouritures donné en paramètre au régimes courant
    public void setQuantites(Nourriture nourriture, double quantite) {
        if (!quantites.containsKey(nourriture)) {
            quantites.put(nourriture, quantite);
        }
    }

    /*public void supprimerNourritures(Nourriture... nouritures){  
    }*/
    //Supprimer une nouritures donné en paramètre au régimes courant
    public void supprimerNourriture(Nourriture nourriture) {
        quantites.remove(nourriture);
    }

    public HashMap<Nourriture, Double> getQuantites(){
        return quantites;
    }



    // Redéfinition de l'affichage de la classe
    @Override
    public String toString() {
        String str = nom + ": " ;
        for(Nourriture n : quantites.keySet()){
            str += n.toString() + " " + quantites.get(n) + "kg ";
        }
        return str;
    }

    private String nom;
    private HashMap<Nourriture, Double> quantites;




}
