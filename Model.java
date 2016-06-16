import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;
import java.util.ArrayList;

/**
 * Vous pouvez décrire votre classe Model ici
 * 
 * @author  Indiquez votre nom
 * @version Indiquez la date
 */
public class Model {

    private int idModele;
    private String libModele;
    private String ombre;
    private ArrayList<Forme> formes;

    public Model(int idModele, String libmodele, String ombre){
        this.idModele = idModele;
        this.libModele = libModele;
        this.ombre = ombre;
    }

    public Model(Model m){
        this.idModele = m.idModele;
        this.libModele = m.libModele;
        this.ombre = m.ombre;
    }

    public int getIdModele(){
        return this.idModele;
    }

    public String getLibModele(){
        return this.libModele;
    }

    public String getOmbre(){
        return this.ombre;
    }

    /*public void setIdModele(int id){
        this.idModele = id;
    }*/

    public void setLibModele(String lib){
        this.libModele = lib;
    }

    public void setOmbre(String ombre){
        this.ombre = ombre;
    }

    public boolean verifModele(Forme carre, Forme paral, Forme gtri1, Forme gtri2, Forme ptri1, Forme ptri2, Forme mtri){
        boolean estCorrect = true;
        ArrayList<Forme> list = new ArrayList<Forme>(this.formes);
        for(Forme f : this.formes){
            if(f.getLibForme().equals("Carré")){
                if(carre.getPosition() != f.getPosition()){
                    estCorrect = false;
                }
            }
            else if(f.getLibForme().equals("Parallélogramme")){
                if(paral.getPosition() != f.getPosition()){
                    estCorrect = false;
                }
            }
            else if(f.getLibForme().equals("Grand Triangle")){
                if(gtri1.getPosition() != f.getPosition() && gtri2.getPosition() != f.getPosition()){
                    estCorrect = false;
                }
            }
            else if(f.getLibForme().equals("Petit Triangle")){
                if(ptri1.getPosition() != f.getPosition()&& ptri2.getPosition() != f.getPosition()){
                    estCorrect = false;
                }
            }
            else if(f.getLibForme().equals("Moyen Triangle")){
                if(mtri.getPosition() != f.getPosition()){
                    estCorrect = false;
                }
            }
        }
    }
}