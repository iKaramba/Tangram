import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/***********************************************************************
 * Module:  Triangle.java
 * Author:  Alban
 * Purpose: Defines the Class Triangle
 ***********************************************************************/

import java.util.*;
import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;

public class Triangle extends Forme {
    private int longueurHyp;
    private int longueurCotes;

    public Triangle(int idForme, int positionForme, int orientationForme, String libForm, int longueurHyp, int longueurCotes){
        super(idForme, positionForme, orientationForme, "Triangle");
        this.longueurHyp = longueurHyp;
        this.longueurCotes = longueurCotes;
    }

    public void getLongueurHyp(int idForme) {
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "SELECT longueurHyp FROM Triangle WHERE idForme = idForme");
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

    public void getLongueurCotes(int idForme) {
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "SELECT longueurCotes FROM Triangle WHERE idForme = idForme");
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

    public void setLongueurHyp(int longueurHyp, int idForme) {
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "UPDATE Triangle SET longueurHyp = longueurHyp WHERE idForme = idForme");
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

    public void setLongueurCotes(int longueurCotes, int idForme) {
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "UPDATE Triangle SET longueurCotes = longueurCotes WHERE idForme = idForme");
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