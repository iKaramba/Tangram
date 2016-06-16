
import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;

/**
 * Vous pouvez décrire votre classe mainCarre ici
 * 
 * @author  Indiquez votre nom
 * @version Indiquez la date
 */
public class mainCarre {

    public static void main(String[] args) {
        Carre carre = new Carre(1,10,12,"Carré",4);

        System.out.println("id " + carre.getIdForme() + " position " + carre.getPositionForme() + " orientation " + carre.getOrientationForme() + " lib " + carre.getLibForme() + " longueur " + carre.getLongueurCotes() );
        
        carre.setLongueurCotes(7);
        
        System.out.println("longueur après le set " + carre.getLongueurCotes());

    }
}
