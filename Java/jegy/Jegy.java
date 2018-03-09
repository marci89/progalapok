public class Jegy {

private int tavolsag;
private String cel;
private boolean ervenyesseg = true;
private double kedvezmeny;
static int jegyar = 25;


    @Override
    public String toString() {
        return "Jegy{" +
                " tavolsag: " + tavolsag + " km" +
                ", cel: " + cel + '\'' +
                ", jegyár: " + jegyar + " ft" +
                ", kedvezmeny: " + kedvezmeny + " %" +
                '}';
    }

    public Jegy(int tavolsag, int kedvezmeny, String cel) {
        this.tavolsag = tavolsag;
        this.cel = cel;
        this.kedvezmeny = kedvezmeny;
        this.ervenyesseg = true;
    }



    public void ar () {
        System.out.println(Math.round((tavolsag*jegyar)*(kedvezmeny/100)));
    }

    public void felhasznal () {

        ervenyesseg = false;
    }







    public int getTavolsag() {
        return tavolsag;
    }

    public void setTavolsag(int tavolsag) {
        this.tavolsag = tavolsag;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public boolean isErvenyesseg() {
        return ervenyesseg;
    }

    public void setErvenyesseg(boolean ervenyesseg) {
        this.ervenyesseg = ervenyesseg;
    }

    public double getKedvezmeny() {
        return kedvezmeny;
    }

    public void setKedvezmeny(int kedvezmeny) {
        this.kedvezmeny = kedvezmeny;
    }

    public static int getJegyar() {
        return jegyar;
    }

    public static void setJegyar(int jegyar) {
        Jegy.jegyar = jegyar;
    }
}
