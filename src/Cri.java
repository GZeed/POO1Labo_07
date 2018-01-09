/*
 -----------------------------------------------------------------------------------
 Laboratoire : 06
 Fichier     : Regime.java
 Auteurs     : Yohann Meyer, Guillaume Zaretti
 Date        : 19.12.2017

 But         : Classe modélisant les cris des annimaux.
 			   

 Remarque(s) : 

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
 */
import java.util.*;


public class Cri {

    // Constructeur minimal
    public Cri(String nom) {
        this.nom = nom;
    }

    // Getter du cri de l'animal
    public String getCri() {
        return nom;
    }
    // Setter du cri de l'animal
    public void setCri(String nom) {
        this.nom = nom;
    }
    
    private String nom;

    @Override
    public String toString() {
        return nom;
    }


}