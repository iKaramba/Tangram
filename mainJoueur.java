
import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;

/**
 * Vous pouvez décrire votre classe mainJoueur ici
 * 
 * @author  Indiquez votre nom
 * @version Indiquez la date
 */
public class mainJoueur {

    public static void main(String[] args) {
        Joueur j1 = new Joueur(1, "azerty", "azerty@gmail.com");
        System.out.println(j1.getIdJoueur());
        j1.getEmail(j1.getIdJoueur());
        j1.setEmail("azerty@gmail.com", j1.getIdJoueur());
        j1.getEmail(j1.getIdJoueur());
        //j1.authentification("azerty", "azerty@gmail.com");

    }
}
