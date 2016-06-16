import java.sql.ResultSet;
import java.sql.PreparedStatement;

import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;

/**
 * Vous pouvez décrire votre classe Score ici
 * 
 * @author  Indiquez votre nom
 * @version Indiquez la date
 */
public class Score {

    private int meilleurTemps;

    public void getMeilleurTemps(int idJoueur, int idModele){
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "SELECT score FROM Score WHERE idJoueur = ? AND idModele = ?");
            pr.setInt(1, idJoueur);
            pr.setInt(2, idModele);
            //int res = 0;
            ResultSet rs = pr.executeQuery();
            //System.out.println(rs.next());
            rs.next();
            System.out.println(rs.getObject(1).toString());
            rs.close();
            pr.close();
        }

        catch(Exception e){
            e.printStackTrace();

        }
    }
}