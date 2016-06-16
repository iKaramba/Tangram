
import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;

/**
 * Vous pouvez décrire votre classe mainForme ici
 * 
 * @author  Indiquez votre nom
 * @version Indiquez la date
 */
public class mainForme {

    public static void main(String[] args) {
        Forme forme = new Forme(1, 8, 10, null);
        
        System.out.println("Test des get : ");
        
        System.out.println(forme.getIdForme() + " res : 1");
        
        forme.getPositionForme(forme.getIdForme());
        System.out.println( " res : 8 ");
        
        //forme.getOrientationForme(forme.getIdForme());
        //System.out.println( " res : 10 ");
        
        //forme.getLibForme(forme.getIdForme());
        //System.out.println(" res : Forme ");
        
        //System.out.println("Test des set : ");
        
        //forme.setPositionForme(3, forme.getIdForme());
        //forme.getPositionForme(forme.getIdForme());
        //System.out.println( " res : 3 ");
        
        //forme.setOrientationForme(7, forme.getIdForme());
        //forme.getOrientationForme(forme.getIdForme());
        //System.out.println( " res : 7 ");
        
        
        

    }
}
