import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;

/**
 * Vous pouvez décrire votre classe Joueur ici
 * 
 * @author  Indiquez votre nom
 * @version Indiquez la date
 */
public class Joueur {

    private int idJoueur;
    private String mdp;
    private String email;

    public Joueur(int idJoueur, String mdp, String email){
        this.idJoueur = idJoueur;
        this.mdp = mdp;
        this.email = email;
    }

    public int getIdJoueur(){
        return this.idJoueur;
    }

    public void getEmail(int idJoueur){
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "SELECT email FROM Joueur WHERE idJoueur = idJoueur");
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

    public void setEmail(String mail, int idJoueur){
        //boolean res = false;
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "UPDATE Joueur SET email = ? WHERE idJoueur = ?");
            //UPDATE `infs2_prj19`.`Joueur` SET `email` = 'azerty@gmail.com' WHERE `Joueur`.`idJoueur` = '1';
            pr.setString(1, mail);
            pr.setInt(2, idJoueur);
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

    public boolean authentification(String mdp, String email){
        boolean res = false;
        try {
            Singleton s = Singleton.getInstance(); 
            //.createStatement()
            PreparedStatement pr = s.getCon().prepareStatement( "SELECT mdp, email FROM Joueur WHERE mdp = ? AND email = ?");
            pr.setString(1, mdp);
            pr.setString(2, email);
            ResultSet rs = pr.executeQuery();
            //System.out.println(rs.next());
            rs.next();
            if(rs.getObject(1).toString().equals(mdp) && rs.getObject(2).toString().equals(email)){
                res = true;
            }
            //System.out.println(rs.getObject(1).toString());
            //System.out.println(rs.getObject(2).toString());
            rs.close();
            pr.close();
        }

        catch(Exception e){
            e.printStackTrace();

        }
        return res;
    }
}