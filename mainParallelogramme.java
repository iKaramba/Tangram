

import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;

/**
 * Vous pouvez décrire votre classe mainParallelogramme ici
 * 
 * @author  Indiquez votre nom
 * @version Indiquez la date
 */
public class mainParallelogramme {

    public static void main(String[] args) {
        Parallelogramme para = new Parallelogramme(7,2,4,"Parallelogramme",7,3);

        System.out.println("id " + para.getIdForme() + " position " + para.getPositionForme() + " orientation " + para.getOrientationForme() + " lib " + para.getLibForme() + " longueur " + para.getLongueur()+ " largeur " + para.getLargeur() );
        
        para.setLongueur(30);
        para.setLargeur(25);
        
        System.out.println("Après les set longueur " + para.getLongueur() + " largeur " + para.getLargeur() );

    }

}
