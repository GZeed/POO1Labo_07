/*
 -----------------------------------------------------------------------------------
 Laboratoire : 06
 Fichier     : Lion.java
 Auteurs     : Yohann Meyer, Guillaume Zaretti
 Date        : 14.12.2017

 But         : Classe spécialisée modélisant un annimal Lion.

 Remarque(s) : 

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
import java.util.*;

 */
public class Lion extends Animal {

    public Lion() {
    }

    public static void setRegimeDef(Regime regimeDef) {
        Lion.regimeDef = regimeDef;
    }

    private static Regime regimeDef = new Regime(/**/);
}
