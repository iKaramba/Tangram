import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;

/**
 * Vous pouvez décrire votre classe Forme ici
 * 
 * @author  Indiquez votre nom
 * @version Indiquez la date
 */

public class Forme {

    private int idForme;
    private int positionForme;
    private int orientationForme;
    private String libForme;

    public Forme(int idForme, int positionForme, int orientationForme, String libForme){
        this.idForme = idForme;
        this.positionForme = positionForme;
        this.orientationForme = orientationForme;
        this.libForme = libForme;
    }

    public int getIdForme(){
        return this.idForme;
    }

    public void getPositionForme(int idForme){
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "SELECT positionForme FROM Forme WHERE idForme = idForme");
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

    public void getOrientationForme(int idForme){
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "SELECT orientationForme FROM Forme WHERE idForme = idForme");
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

    public void setPositionForme(int pos, int idForme){
        //boolean res = false;
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "UPDATE Forme SET positionForme = pos WHERE idForme = idForme");
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
        //return res;
    }

    public void setOrientationForme(int orientation, int idForme){
        //boolean res = false;
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "UPDATE Forme SET orientationForme = orientation WHERE idForme = idForme");
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
        //return res;
    }



    //public abstract Forme getForme();

}
