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
    public Regime(String nom, Map<Nourriture,
             Set<Nourriture> nour,
            Double>  gteNourriture) {

    }

    public String getNom() {
        // TODO implement here
        return null;
    }

    public void setNom(String nom) {
        // TODO implement here
        return null;
    }

    public double getQteNourriture() {
        // TODO implement here
        return 0.0d;
    }

    public void setQteNourriture(double qteNourriture) {
        // TODO implement here
        return null;
    }

    private String nom;
    private Map<Nourriture, Double> qteNourriture;
    private Set<Nourriture> nourritures;

}
