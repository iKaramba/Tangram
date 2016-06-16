
import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;
import java.sql.*;

/**
 * Vous pouvez décrire votre classe Singleton ici
 * 
 * @author  Indiquez votre nom
 * @version Indiquez la date
 */

public class Singleton {
    /*
     * La méthode getInstance n'est sûr pour les threads 
     * (possibilité de créer plusieurs Singleton) donc
     * on a besoin de sécuriser celle-ci avec synchronized.
     */    
    public static synchronized Singleton getInstance(){
        if (instance == null) instance = new Singleton();
        return instance;
    }

    private Connection con;

    private Singleton(){
        String pilote = "com.mysql.jdbc.Driver";
        try {
            //Register the JDBC driver for MySQL.
            Class.forName(pilote);
            //System.out.println("Driver O.K.");

            //Define URL of database server for
            // database named mysql on the localhost
            // with the default port number 3306.
            String url = "jdbc:mysql://mysql:3306/infs2_prj19";
            String user = "infs2_prj19";
            String passwd = "fy63VfFv9rFvjd4z";

            //Get a connection to the database for a
            // user named root with a blank password.
            // This user is the default administrator
            // having full privileges to do anything.
            con = DriverManager.getConnection(url,user,passwd);
            //System.out.println("Connexion effective !");  

            //Display URL and connection information
            //System.out.println("URL: " + url);
            //System.out.println("Connection: " + con);

            //Get a Statement object
            //stmt = con.createStatement();

        }catch( Exception e ) {
            e.printStackTrace();
        }//end catch

        //System.out.println("Construction du Singleton");
    }

    private static Singleton instance;

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }

    public Connection getCon() {
        return con;
    }
}
