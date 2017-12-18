/*
 -----------------------------------------------------------------------------------
 Laboratoire : 06
 Fichier     : Chimpanze.java
 Auteurs     : Yohann Meyer, Guillaume Zaretti
 Date        : 14.12.2017

 But         : Classe spécialisée modélisant un annimal Chimpanze.

 Remarque(s) : 

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
 */
import java.util.*;

/**
 *
 */
public class Chimpanze extends Animal {

    //Constructeur minimal de la classe
    public Chimpanze() {
    }

    //Setter permettant de modifier le régime alimentaire attribué par défaut 
    //à la création de l'annimal chimpanze
    public static void setRegimeDef(Regime regimeDef) {
        Chimpanze.regimeDef = regimeDef;
    }

    // Redéfinition de l'affichage de la classe
    @Override
    public String toString() {
        String string = super.toString();
        if (!possedeZoo()) {
            //return nom;
        }
        return "affichage";
    }


    
    private static Regime regimeDef = new Regime(/**/);

}
