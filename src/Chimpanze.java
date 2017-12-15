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

    public Chimpanze() {
    }

     public static void setRegimeDef(Regime regimeDef){
        Chimpanze.regimeDef = regimeDef;
    }
    

    private static Regime regimeDef = new Regime();

}