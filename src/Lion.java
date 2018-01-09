
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 -----------------------------------------------------------------------------------
 Laboratoire : 06
 Fichier     : Lion.java
 Auteurs     : Yohann Meyer, Guillaume Zaretti
 Date        : 14.12.2017

 But         : Classe spécialisée modélisant un annimal Lion.

 Remarque(s) : 

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
import java.util.*;

 */
public class Lion extends Animal {

    //Constructeur minimal de la classe
    public Lion(String nom, int poids) {
        super(nom, poids);

    }


    // Redéfinition de l'affichage de la classe
    @Override
    public String toString() {
        return super.toString();
    }

    public  void setCri(Cri cri){
        Lion.cri = cri;
    }

    public  Cri getCri() {
        return Lion.cri;
    }

    //Setter permettant de modifier le régime alimentaire attribué par défaut
    //à la création de l'annimal lion
    public  void setRegime(Regime regime) {
        Lion.regime = regime;
    }


    //Getter du regime de l'animal
    public  Regime getRegime() {
        return Lion.regime; // regime.clone() ; ?
    }


    //Setter du pays de provenance de l'animal
    public  void setPays(ArrayList<Pays> pays) {
        Lion.provenance = pays; //pays.clone();
    }


    //Getter des pays de provenance de l'animal
    public  ArrayList<Pays> getPays() {
        return Lion.provenance; // pays.clone();
    }


    private static Regime regime = new Regime("carnivore",
            new HashMap<Nourriture, Double>(){{
                put(NourritureType.viande,10.);
            }}
    );
    private static Cri cri = CriType.rugissement;
    private static ArrayList<Pays> provenance = new ArrayList<Pays>(){{
        add(PaysType.Kenya);
        add(PaysType.Tanzanie);
        add(PaysType.AfriqueDuSud);
    }};
}
