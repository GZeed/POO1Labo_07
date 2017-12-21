/*
 -----------------------------------------------------------------------------------
 Laboratoire : 06
 Fichier     : Zoo.java
 Auteurs     : Yohan Meyer, Guillaume Zaretti
 Date        : 19.12.2017

 But         : Classe modélisant le zoo dans lequiel les animaux se trouvent.
 			   

 Remarque(s) :  Pour le moment l'association est unidirectionnel entre zoo et animal

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
 */
import java.util.*;

public class Zoo {

    // Constructeur minimal
    public Zoo(String nom) {
        this.nom = nom;
    }

    // Contructeur
    public Zoo(String nom, Animal... animaux) {
        this.nom = nom;
        ajouterAnimaux(animaux);
    }

    //Getter du nom du zoo
    public String getNom() {

        return nom;
    }

    //Setter du nom du zoo 
    public void setNom(String nom) {
        this.nom = nom;
    }

    //Ajoute un ou plusieurs animaux donné(s) en paramètre au zoo courant
    public void ajouterAnimaux(Animal... animaux) {
        for (Animal animal : animaux) {
            ajouterAnimal(animal);
        }
    }

    //Ajoute l'animal donné en parmètre	
    public void ajouterAnimal(Animal animal) {
        if (!animaux.contains(animal)) {
            animaux.add(animal);

        }
    }

    //Supprime du zoo chaque anima(l/aux) donné(s) en paramètre.
    public void supprimerAnimaux(Animal... animaux) {
        for (Animal a : animaux) {
            supprimerAnimal(a);
        }
    }

    //Supprime du zoo l'animal donné en paramètre	
    public void supprimerAnimal(Animal animal) {
        animaux.remove(animal);
    }

  

    private String nom;
    private Set<Animal> animaux;

}
