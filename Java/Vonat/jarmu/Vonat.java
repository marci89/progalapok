package jarmu;

public class Vonat {
    protected String indul;
    protected String vegallomas;
    protected int tav;
    protected int seb;

    public Vonat(String indul, String vegallomas, int tav, int seb) {
        this.indul = indul;
        this.vegallomas = vegallomas;
        this.tav = tav;
        this.seb = seb;
    }


    public String getIndul() {
        return indul;
    }

    public void setIndul(String indul) {
        this.indul = indul;
    }

    public String getVegallomas() {
        return vegallomas;
    }

    public void setVegallomas(String vegallomas) {
        this.vegallomas = vegallomas;
    }

    public int getTav() {
        return tav;
    }

    public void setTav(int tav) {
        this.tav = tav;
    }

    public int getSeb() {
        return seb;
    }

    public void setSeb(int seb) {
        this.seb = seb;
    }


    @Override
    public String toString() {
        return "Vonat{" +
                " indul : '" + indul + '\'' +
                ", vegallomas : '" + vegallomas + '\'' +
                ", tav : " + tav + " km" +
                ", seb : " + seb + " km/h " +
                '}';
    }

    public double leghamarabb () {

        return tav / seb;


    }
}
