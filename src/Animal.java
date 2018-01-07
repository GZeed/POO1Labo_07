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

    //Constructeur minimal de la classe
    protected Animal(String nom, int poids) {
    }

    private String nom;
    private int poids;
    private Regime regime;
    private cri cri;
    private Set<Pays> pays;
    private Zoo zoo;

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

    //Getter du regime de l'animal 
    public Regime getRegime() {
        return this.regime; // regime.clone() ; ?
    }

    //Setter du regime de l'animal 
    public void setRegime(Regime regime) {
        this.regime = regime; //regime.clone(); ?
    }

    //Setter du pays de provenance de l'animal 
    public void setPays(Set<Pays> pays) {
        this.pays = pays; //pays.clone();        
    }

    //Getter des pays de provenance de l'animal 
    public Set<Pays> getPays() {
        return pays; // pays.clone();
    }

    //Getter du zoo de l'animal 
    public Zoo getZoo() {
        return zoo;//Zoo.clone();
    }

    //Setter du zoo au quel appartiens l'animal 
    public void setZoo(Zoo zoo) {
        if (zoo != null) {
            if (possedeZoo()) {
                //supprime de son ancien zoo
                this.zoo.supprimerAnimal(this);
            }
            this.zoo = zoo;
            zoo.ajouterAnimal(this);
        } else {
            supprimerZoo();
        }
    }

    //Sortir l'animal du zoo 
    void supprimerZoo() {
        if (possedeZoo()) {
            zoo.supprimerAnimal(this);
            zoo = null;
        }
    }

    //Ajoute une ou plusieurs provenances donné(s) en paramètre
    public void ajouterProvenance(Pays... pays) {

        for (Pays p : pays) {
            if (!this.pays.contains(p)) {
                this.pays.add(p);
            }
        }
    }

    //Suprimmer une ou plusieurs provennances donné(s) en paramètre 
    public void supprimerProvenance(Pays... pays) {
        for (Pays p : pays) {
            this.pays.remove(pays);
        }
    }
    
    //Supprimer toutes les provenances
    public void supprimerToutesProvenances(){
        this.pays.clear();
    }

    //Vérifie si l'animal se trouve dans un zoo
    protected boolean possedeZoo() {
        return zoo != null;
    }

    // Redéfinition de l'affichage de la classe
    @Override
    public String toString() {
        if (!possedeZoo()) {
            //return nom;
        }
        return "affichage";
    }
}
