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


public class cri {

    public cri(String nom) {
        this.nom = nom;
    }

    public String getCri() {
        return nom;
    }

    public void setCri(String nom) {
        this.nom = nom;
    }
    
    private String nom;

}