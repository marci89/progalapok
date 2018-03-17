import java.util.Arrays;

public class Csorda {

    private Allat [] allatok;
    private int csordaLetszam;
    private  int jelenlegiLetszam;

    public Csorda(Allat[] allatok, int csordaLetszam, int jelenlegiLetszam) {
        allatok = new Allat[csordaLetszam];
        this.csordaLetszam = csordaLetszam;
        this.jelenlegiLetszam = jelenlegiLetszam;
    }





    public boolean csordabaFogad(Allat ki) {
        if (jelenlegiLetszam < csordaLetszam) {
            allatok[jelenlegiLetszam] = ki;
            jelenlegiLetszam++;
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
            String str = "A csordaban vannak:";
            for (int i = 0; i < jelenlegiLetszam; i++) {
                str += allatok[i].toString();
            }
            return str;

    }
}
