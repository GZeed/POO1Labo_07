/*
 -----------------------------------------------------------------------------------
 Laboratoire : 06
 Fichier     : Annimal.java
 Auteurs     : Yohann Meyer, Guillaume Zaretti
 Date        : 14.12.2017

 But         : Classe generale abstraite modélisant un annimal.
 			   La cohérence des données Regime, cri, pays est gérée 
 			   depuis cette classe.

 Remarque(s) : 

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
 */

import java.util.*;

/**
 *
 */
public abstract class Animal {

    protected Animal() {
    }

    private String nom;
    private int poids;
    private Regime regime;
    private cri cri;
    private Set<Pays> pays;
    private Zoo zoo;
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public Regime getRegime() {
        return this.regime;
    }

    public void setRegime(Regime regime) {
        //this.regime = regime.clone();
    }

    public void setPays(Set<Pays> pays) {
        this.pays.clear();
        for (Pays p : pays) {
            //this.pays = p.clone();   
        }
    }

    public Set<Pays> getPays() {
        return null; // pays.clone();
    }

    public Zoo getZoo() {
        return null;//Zoo.clone();
    }

    public void setZoo(Zoo zoo) {
        if (zoo != null) {
            if (/*possedeZoo()*/false) {
                // supprime de son ancien zoo
                //this.zoo.supprimerAnnimal(this);
            }
            this.zoo = zoo;
            //zoo.addAnnimal(this);
        } else {
            supprimerZoo();
        }
    }

    void supprimerZoo() {
        if (/*possedeZoo()*/false) {
            //zoo.getAnnimals().remove(this);
            zoo = null;
        }
    }

    private boolean possedeZoo() {
        return zoo != null;
    }
    
    // Redéfinition de l'affichage de la classe
	@Override
	public String toString() {
		if (!possedeZoo()) {
			//return nom;
		}
		return "affichage";
	}
}
