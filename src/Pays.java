/*
 -----------------------------------------------------------------------------------
 Laboratoire : 07
 Fichier     : Pays.java
 Auteurs     : Yohann Meyer, Guillaume Zaretti
 Date        : 19.12.2017

 But         : Classe modélisant le pays de provenances des annimaux.
 			   

 Remarque(s) : 

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
 */
import java.util.*;

public class Pays {

    // Constructeur minimal
    public Pays(String nom) {
        this.nom = nom;
    }

    // Getteur pour le nom du pays
    public String getNom() {
        return nom;
    }

    // Setteur pour le nom du pays
    public void setNom(String nom) {
        this.nom = nom;
    }

    private String nom;

    // Redéfinition de l'affichage de la classe
    @Override
    public String toString() {
        return nom;
    }
}
