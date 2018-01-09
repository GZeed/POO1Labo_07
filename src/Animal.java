/*
 -----------------------------------------------------------------------------------
 Laboratoire : 06
 Fichier     : Annimal.java
 Auteurs     : Yohann Meyer, Guillaume Zaretti
 Date        : 14.12.2017

 But         : Classe generale abstraite modélisant un animal.
 			   La cohérence des données Regime, cri, pays est gérée 
 			   depuis cette classe.

 Remarque(s) : 

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
 */

import java.util.*;

/**
 *Classe Animal
 */
public abstract class Animal {

    protected String nom;
    protected int poids;

    protected  Regime regime;
    protected  Cri cri;
    protected  ArrayList<Pays> provenance;

    //Constructeur minimal de la classe
    protected Animal(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
    }


    //Getter du nom de l'animal
    public String getNom() {
        return nom;
    }

    //Setter du nom de l'animal 
    public void setNom(String nom) {
        this.nom = nom;
    }

    //Getter du poids de l'animal 
    public int getPoids() {
        return poids;
    }

    //Setter du poids de l'animal 
    public void setPoids(int poids) {
        this.poids = poids;
    }


    public  void setCri(Cri cri){
        this.cri = cri;
    }

    public  Cri getCri(){
        return this.cri;
    }
    //Getter du regime de l'animal 
    public  Regime getRegime() {
        return this.regime; // regime.clone() ; ?
    }


    //Setter du regime de l'animal 
    public  void setRegime(Regime regime) {
        this.regime = regime; //regime.clone(); ?
    }

    //Setter du pays de provenance de l'animal 
    public  void setPays(ArrayList<Pays> pays) {
        this.provenance = pays; //pays.clone();
    }

    //Getter des pays de provenance de l'animal
    public  ArrayList<Pays> getPays() {
        return this.provenance; // pays.clone();
    }

    //Ajoute une ou plusieurs provenances donné(s) en paramètre
    public void ajouterProvenance(Pays... pays) {

        for (Pays p : pays) {
            if (!this.provenance.contains(p)) {
                this.provenance.add(p);
            }
        }
    }

    //Suprimmer une ou plusieurs provennances donné(s) en paramètre 
    public void supprimerProvenance(Pays... pays) {
        for (Pays p : pays) {
            this.provenance.remove(p);
        }
    }
    
    //Supprimer toutes les provenances
    public void supprimerToutesProvenances(){
        this.provenance.clear();
    }


    // Redéfinition de l'affichage de la classe
    @Override
    public String toString() {
        return "\"" + this.nom  + "\", " + this.poids + "kg";

    }
}
