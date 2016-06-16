

import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;

/**
 * Vous pouvez décrire votre classe mainTriangle ici
 * 
 * @author  Indiquez votre nom
 * @version Indiquez la date
 */
public class mainTriangle {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,8,14,"Triangle",4,6);

        System.out.println("id " + triangle.getIdForme() + " position " + triangle.getPositionForme() + " orientation " + triangle.getOrientationForme() + " lib " + triangle.getLibForme() + " longueur base " + triangle.getLongueurBase()+ " longueur cotes " + triangle.getLongueurCotes() );
        
        triangle.setLongueurBase(15);
        triangle.setLongueurCotes(20);
        
        System.out.println("Après les set longueur base " + triangle.getLongueurBase() + " longueur cotes " + triangle.getLongueurCotes() );

    }

}
