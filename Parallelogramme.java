import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/***********************************************************************
 * Module:  Parallelogramme.java
 * Author:  Alban
 * Purpose: Defines the Class Parallelogramme
 ***********************************************************************/

import java.util.*;
import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;

/** @pdOid c3558135-60a1-4b1a-9044-6990dcd75d2f */
public class Parallelogramme extends Forme {
    /** @pdOid fd5b5786-c1ae-471a-8690-3b6faa2762aa */
    private int longueur;
    /** @pdOid 7824bc9f-69c7-4d17-8b19-9014d696a820 */
    private int largeur;

    /** @pdOid b3b2462f-fe57-4f1c-ae15-2026e06bf1e8 */

    public Parallelogramme(int idForme, int positionForme, int orientationForme, String libForme, int longueur, int largeur){
        super(idForme, positionForme, orientationForme, "Parallélogramme");
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public void getLongueur(int idForme) {
       try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "SELECT longueur FROM Parallelogramme WHERE idForme = idForme");
            //pr.setInt(1, idJoueur);
            //pr.setInt(2, idModele);
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

    public void getLargeur(int idForme) {
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "SELECT largeur FROM Parallelogramme WHERE idForme = idForme");
            //pr.setInt(1, idJoueur);
            //pr.setInt(2, idModele);
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

    public void setLongueur(int longueur, int idForme) {
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "UPDATE Parallelogramme SET longueur = longueur WHERE idForme = idForme");
            //UPDATE `infs2_prj19`.`Joueur` SET `email` = 'azerty@gmail.com' WHERE `Joueur`.`idJoueur` = '1';
            //pr.setString(1, mail);
            //pr.setInt(2, idJoueur);
            try {
                pr.executeUpdate();
                pr.close();
            }
            catch(SQLException g){
                g.printStackTrace();
            }
            //System.out.println(rs.next());
            //pr.close();
            //rs.next();
            //System.out.println(rs.getObject(1).toString());
            /*if(getEmail().equals(mail)){
            res = true;
            }*/
            //System.out.println(rs.getObject(1).toString());
            //System.out.println(rs.getObject(2).toString());
            

        }

        catch(SQLException e){
            e.printStackTrace();

        }
    }

    public void setLargeur(int larg, int idForme) {
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "UPDATE Parallelogramme SET largeur = larg WHERE idForme = idForme");
            //UPDATE `infs2_prj19`.`Joueur` SET `email` = 'azerty@gmail.com' WHERE `Joueur`.`idJoueur` = '1';
            //pr.setString(1, mail);
            //pr.setInt(2, idJoueur);
            try {
                pr.executeUpdate();
                pr.close();
            }
            catch(SQLException g){
                g.printStackTrace();
            }
            //System.out.println(rs.next());
            //pr.close();
            //rs.next();
            //System.out.println(rs.getObject(1).toString());
            /*if(getEmail().equals(mail)){
            res = true;
            }*/
            //System.out.println(rs.getObject(1).toString());
            //System.out.println(rs.getObject(2).toString());
            

        }

        catch(SQLException e){
            e.printStackTrace();

        }
    }

    @Override
    public void getLibForme(int idForme){
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "SELECT libForme FROM Forme WHERE idForme = idForme");
            //pr.setInt(1, idJoueur);
            //pr.setInt(2, idModele);
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