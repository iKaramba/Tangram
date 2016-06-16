import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

import org.omg.CORBA_2_3.portable.InputStream;
import java.applet.AudioClip;
import java.applet.Applet;
import java.net.URL;
import java.applet.AppletContext;
/***********************************************************************
 * Module:  Carre.java
 * Author:  Alban
 * Purpose: Defines the Class Carre
 ***********************************************************************/

import java.util.*;
import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;


public class Carre extends Forme{
    
    private int longueurCotes;
    
    public Carre(int idForme, int positionForme, int orientationForme, String libForme, int longueurCotes){
        super(idForme, positionForme, orientationForme, "Carré");
        this.longueurCotes = longueurCotes;
    }
    
    public void getLongueurCotes(int idForme) {
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "SELECT longueurCotes FROM Carre WHERE idForme = idForme");
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

    public void setLongueurCotes(int longueur, int idForme) {
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "UPDATE Carre SET longueurCotes = longueur WHERE idForme = idForme");
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