/*
 -----------------------------------------------------------------------------------
 Laboratoire : 07
 Fichier     : PooLabo_07.java
 Auteurs     : Yohann Meyer, Guillaume Zaretti
 Date        : 14.12.2017

 But         : Programme principal

 Remarque(s) : 

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
 */
import java.util.ArrayList;
import java.util.List;

public class PooLabo_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Zoo zooTycoon = new Zoo("Tycoon");

        Animal animaux[] = {new Chimpanze("Chita", 15),
            new Chimpanze("Banana", 10),
            new Lion("Clarence", 150),
            new Boa("Kaa", 10, 3),
            new Boa("Gloups", 12, 2.5)};

        Lion l = new Lion("Clarence", 150);
        ArrayList<Pays> k = l.getPays();

        zooTycoon.ajouterAnimaux(animaux);

        zooTycoon.affiche();

        zooTycoon.afficheProvenance();
        zooTycoon.afficheResume();
        System.out.print(zooTycoon.cout());
        zooTycoon.supprimerAnimaux(animaux[3]);

    

    }

}
