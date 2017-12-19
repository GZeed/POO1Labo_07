/*
 -----------------------------------------------------------------------------------
 Laboratoire : 06
 Fichier     : Nourriture.java
 Auteurs     : Yohann Meyer, Guillaume Zaretti
 Date        : 19.12.2017

 But         : Classe modélisant la nouriture faisant parti du régime des annimaux.
 			   

 Remarque(s) : 

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
 */
import java.util.*;

public class Nourriture {

    // Constructeur minimal
    public Nourriture(String nom, double prixAnnuel) {
    }

    // Getter du nom de la nourriture
    public String getNom() {
        return nom;
    }

    // Setter du nom de la nourriture
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter du prix annuel de la nourriture
    public double getPrixAnnuel() {
       return prixAnnuel;
    }

    // Setter du prix annuel de la nourriture
    public void setPrixAnnuel(double prixAnnuel) {
        this.prixAnnuel = prixAnnuel;
    }

    private String nom;
    private double prixAnnuel;
}