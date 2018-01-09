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
    public Chimpanze(String nom, int poids) {
        super(nom, poids);


    }

    //Setter permettant de modifier le régime alimentaire attribué par défaut 
    //à la création de l'animal chimpanze
    public  void setRegime(Regime regime) {
        Chimpanze.regime = regime;
    }

    // Redéfinition de l'affichage de la classe
    @Override
    public String toString() {
        return super.toString();
    }


    public  void setCri(Cri cri){
        Chimpanze.cri = cri;
    }

    public  Cri getCri(){
        return Chimpanze.cri;
    }
    //Getter du regime de l'animal
    public  Regime getRegime() {
        return Chimpanze.regime; // regime.clone() ; ?
    }



    //Getter des pays de provenance de l'animal
    public  ArrayList<Pays> getPays() {
        return Chimpanze.provenance; // pays.clone();
    }

    private static Regime regime = new Regime("carnivore",
            new HashMap<Nourriture, Double>(){{
                put(NourritureType.fruit,3.5);
            }}
    );
    private static Cri cri = CriType.hurlement;
    private static ArrayList<Pays> provenance = new ArrayList<Pays>(){{
        add(PaysType.Liberia);
        add(PaysType.Congo);
        add(PaysType.Cameroun);
    }};
}
