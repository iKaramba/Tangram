
import info.graphics.*;
import static info.utils.io.*;
import static info.graphics.Color.*;
import static info.graphics.Tools.*;
import static java.lang.Math.*;

/**
 * Vous pouvez décrire votre classe Chrono ici
 * 
 * @author  Indiquez votre nom
 * @version Indiquez la date
 */
public class Chrono {

    private int heure;
    private int minute;
    private int seconde;
    private int duree;

    public Chrono(){
        this.heure = 0;
        this.minute = 0;
        this.seconde = 0;
        this.duree = 0;
    }

    public void start(){
        int milli = 0;
        //while(stop() == false){
        while(minute <= 30){
            milli ++;
            if(milli == 1000){
                seconde += 1;
                milli = 0;
            }
            if(seconde == 60){
                minute += 1;
                seconde = 0;
            }
            if(minute == 60){
                heure += 1;
                minute = 0;
            }
            System.out.println(heure + " " + minute + " " + seconde + " " + milli);
        }
        duree = heure +  minute + seconde;
    }

    public boolean stop(){
        boolean res = true;
        //System.out.println(getHeure() + " h " + getMinute() + " m " + getSeconde() + " s ");
        heure = 0;
        minute = 0;
        seconde = 0;
        return res;
    }        

    public int getHeure(){
        return this.heure;
    }

    public int getMinute(){
        return this.minute;
    }        

    public int getSeconde(){
        return this.seconde;
    }

    public void affiche(){
        String temps = "";
        if(getHeure()<=9){
            temps += 0 + getHeure();

        }
        else{
            temps += getHeure();
        }
        temps += " h ";
        if(getMinute()<=9){
            temps += 0 + getMinute();

        }
        else{
            temps += getMinute();
        }
        temps += " m ";
        if(getSeconde()<=9){
            temps += 0 + getSeconde();

        }
        else{
            temps += getSeconde();
        }
        temps += " s ";

        System.out.println(temps);       
    }
}
