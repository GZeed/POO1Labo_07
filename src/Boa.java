/*
 -----------------------------------------------------------------------------------
 Laboratoire : 07
 Fichier     : Boa.java
 Auteurs     : Yohann Meyer, Guillaume Zaretti
 Date        : 14.12.2017

 But         : Classe spécialisée modélisant un annimal boa.
 			  

 Remarque(s) : 

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
 */
import java.util.*;

public class Boa extends Animal {

    //Constructeur minimal de la classe
    public Boa(String nom, int poids, double l) {
        super(nom, poids);
        this.longeur = l;

    }

    //Getter des pays de provenance de l'animal
    public ArrayList<Pays> getPays() {
        return Boa.provenance;
    }

    // Setter permettant de modifier le cri de l'animal
    public void setCri(Cri cri) {
        Boa.cri = cri;
    }

    // Getter permettant de retrouner le cri de l'animal
    public Cri getCri() {
        return Boa.cri;
    }

    //Getter du regime de l'animal
    public Regime getRegime() {
        return Boa.regime;
    }

    //Setter du pays de provenance de l'animal
    public void setPays(ArrayList<Pays> pays) {
        Boa.provenance = pays;
    }

    //Getteur de la longeur du Boa
    public double getLongeur() {
        return this.longeur;
    }

    //Setteur de la longeur du boa
    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    //Setter permettant de modifier le régime alimentaire attribué par défaut 
    //à la création de l'annimal boa
    public void setRegime(Regime regime) {
        Boa.regime = regime;
    }

    // Redéfinition de l'affichage de la classe
    @Override
    public String toString() {
        String str = super.toString();
        str += ", " + longeur;
        return str;
    }

    private double longeur;

    private static Regime regime = new Regime("carnivore",
            new HashMap<Nourriture, Double>() {
        {
            put(NourritureType.VIANDE, 1.5);
        }
    }
    );
    private static Cri cri = CriType.SIFFLEMENT;
    private static ArrayList<Pays> provenance = new ArrayList<Pays>() {
        {
            add(PaysType.MEXIQUE);
            add(PaysType.GUATEMALA);
        }
    };
}
