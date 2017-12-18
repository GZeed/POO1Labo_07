/*
 -----------------------------------------------------------------------------------
 Laboratoire : 06
 Fichier     : Boa.java
 Auteurs     : Yohann Meyer, Guillaume Zaretti
 Date        : 14.12.2017

 But         : Classe spécialisée modélisant un annimal boa.
 			  

 Remarque(s) : 

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
 */
import java.util.*;

/**
 * 
 */
public class Boa extends Animal {

    public Boa() {
    }
    
    public double getLongeur() {
        return this.longeur;
    }

    public void seLongeur(double longeur) {
        this.longeur = longeur;
    }
    
    public static void setRegimeDef(Regime regimeDef){
        Boa.regimeDef = regimeDef;
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
    
    private double longeur;
    private static Regime regimeDef = new Regime();
}