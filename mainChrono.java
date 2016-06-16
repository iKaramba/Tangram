
import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;

/**
 * Vous pouvez décrire votre classe mainChrono ici
 * 
 * @author  Indiquez votre nom
 * @version Indiquez la date
 */
public class mainChrono {

    public static void main(String[] args) {
        Chrono chrono = new Chrono();

        System.out.println("Chrono nul " + chrono.getHeure() + " " + chrono.getMinute() + " " + chrono.getSeconde() );

        chrono.start();

        System.out.println("Chrono lancé " + chrono.getHeure() + " " + chrono.getMinute() + " " + chrono.getSeconde());

        System.out.println("Méthode affiche() ");
        chrono.affiche();

        chrono.stop();

        System.out.println("Chrono arrêté " + chrono.getHeure() + " " + chrono.getMinute() + " " + chrono.getSeconde());

    }
}
