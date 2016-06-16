import java.sql.DriverManager;
import java.sql.Connection;

import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;

/**
 * Vous pouvez décrire votre classe Connexion ici
 * 
 * @author  Indiquez votre nom
 * @version Indiquez la date
 */
public class Connexion {
    public static void main(String[] args) { 
        String pilote = "com.mysql.jdbc.Driver"; 
        try {
            Class.forName(pilote);
            System.out.println("Driver O.K.");

            String url = "jdbc:mysql://mysql:3306/infs2_prj19";
            String user = "infs2_prj19";
            String passwd = "fy63VfFv9rFvjd4z";

            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");         

        }

        catch (Exception e) {
            e.printStackTrace();
        }      
    }
}

