package Filmek;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;

public class Film {
    protected String cim;
    protected String rendezo;
    protected int date;
    private Random random;


    public Film(String cim, String rendezo, int date) {
        this.cim = cim;
        this.rendezo = rendezo;
        this.date = date;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getRendezo() {
        return rendezo;
    }

    public void setRendezo(String rendezo) {
        this.rendezo = rendezo;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Film{" +
                "cim='" + cim + '\'' +
                ", rendezo='" + rendezo + '\'' +
                ", date=" + date +
                '}';
    }


    public boolean oscardij (int year) {
        int randomize = (int) (Math.random()*2)+1;
     if (year == date && randomize ==1){
         return true;
     }

return false;
    }
}
