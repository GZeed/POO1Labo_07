/*
 -----------------------------------------------------------------------------------
 Laboratoire : 06
 Fichier     : Annimal.java
 Auteurs     : Yohann Meyer, Guillaume Zaretti
 Date        : 14.12.2017

 But         : Classe generale abstraite modélisant un annimal.
 			   La cohérence des données Regime, cri, pays est gérée 
 			   depuis cette classe.

 Remarque(s) : 

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
 */

import java.util.*;

/**
 *
 */
public abstract class Animal {

    protected Animal() {
    }

    private String nom;
    private int poids;
    private Regime regime;
    private cri cri;
    private Set<Pays> pays;
    private Zoo zoo;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }
}
