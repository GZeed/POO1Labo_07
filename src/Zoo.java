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
import java.lang.reflect.Method;
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
            if (!this.animaux.contains(animal)) {
                this.animaux.add(animal);
            }
        }
    }


    //Supprime du zoo chaque anima(l/aux) donné(s) en paramètre.
    public void supprimerAnimaux(Animal... animaux) {
        for (Animal a : animaux) {
            this.animaux.remove(a);
        }
    }

    void afficheByEspeces() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public void affiche(){

        HashMap< Class<? extends Animal>, Integer> liste = this.listeAnimaux();
        String str = this.nom + " héberge: \n";

        for(Class c : liste.keySet()){
            str += liste.get(c) + " " + c.getSimpleName() + "\n";
        }
        System.out.println(str);


    }

    public void afficheProvenance(){

        HashMap<Class<? extends Animal>, Integer> liste = this.listeAnimaux();
        String str = "Origines des animaux: \n";

        for(Animal a : animaux){
            if(liste.containsKey( a.getClass() )){
                ArrayList<Pays> provenance = a.getPays();
                str += a.getClass().getSimpleName();
                for(Pays pays : provenance){
                str += ", " + pays.getNom() ;
                }
                str += "\n";
                liste.remove(a.getClass());
            }
        }
        System.out.println(str);

    }

    public void afficheResume(){
        String str = "résumé:\n";

        for(Animal a : animaux){
            str += a.toString() +
                    a.getPays().toString() +
                    a.getRegime().toString() + "\n";
        }
        System.out.println(str);
    }


    private HashMap<Class<? extends Animal>, Integer> listeAnimaux(){
        HashMap< Class<? extends Animal>, Integer> liste = new HashMap< >();
        for(Animal a : animaux) {
             Class<? extends Animal> classAnimal = a.getClass();

            if (!liste.containsKey(classAnimal)) {
                liste.put(classAnimal, 1);
            } else {
                liste.put(classAnimal, liste.get(classAnimal) + 1);
            }
        }
        return liste;
    }

    private String nom;
    private ArrayList<Animal> animaux = new ArrayList<Animal>();



}
