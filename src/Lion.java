

/*
 -----------------------------------------------------------------------------------
 Laboratoire : 07
 Fichier     : Lion.java
 Auteurs     : Yohann Meyer, Guillaume Zaretti
 Date        : 14.12.2017

 But         : Classe spécialisée modélisant un annimal Lion.

 Remarque(s) : 

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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

    // Setter permettant de modifier le cri de l'animal
    public void setCri(Cri cri) {
        Lion.cri = cri;
    }

    // Getter permettant de retrouner le cri de l'animal
    public Cri getCri() {
        return Lion.cri;
    }

    //Setter permettant de modifier le régime alimentaire attribué par défaut
    //à la création de l'annimal lion
    public void setRegime(Regime regime) {
        Lion.regime = regime;
    }

    //Getter du regime de l'animal
    public Regime getRegime() {
        return Lion.regime; // regime.clone() ; ?
    }

    //Setter du pays de provenance de l'animal
    public void setPays(ArrayList<Pays> pays) {
        Lion.provenance = pays; //pays.clone();
    }

    //Getter des pays de provenance de l'animal
    public ArrayList<Pays> getPays() {
        return Lion.provenance; // pays.clone();
    }

    private static Regime regime = new Regime("carnivore",
            new HashMap<Nourriture, Double>() {
        {
            put(NourritureType.VIANDE, 10.);
        }
    }
    );
    private static Cri cri = CriType.RUGISSEMENT;
    private static ArrayList<Pays> provenance = new ArrayList<Pays>() {
        {
            add(PaysType.KENYA);
            add(PaysType.TANZANIE);
            add(PaysType.AFRIQUEDUSUD);
        }
    };
}
