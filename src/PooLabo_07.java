
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ZEED
 */
public class PooLabo_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Zoo zooTycoon = new Zoo("Tycoon");

      
        
        Animal annimaux[] = {new Chimpanze("Chita", 15),
            new Chimpanze("Banana", 10),
            new Lion("Clarence", 150),
            new Boa("Kaa", 10, 3),
            new Boa("Gloups", 12, 2.5)};

        zooTycoon.ajouterAnimaux(annimaux);
        
        zooTycoon.afficheByEspeces();
        
        zooTycoon.supprimerAnimal(annimaux[3]);
        
        zooTycoon.afficheByEspeces();
    }
    
    

}
