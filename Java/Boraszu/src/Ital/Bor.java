package Ital;

public class Bor {

    private String fajta;
    private int evjarat;

    /**
     *
     * @param fajta
     * @param evjarat
     * bor osztály tulajdonságai.
     */

    public Bor(String fajta, int evjarat) {
        this.fajta = fajta;
        this.evjarat = evjarat;
    }


    @Override
    public String toString() {
        return "Bor{" +
                "fajta='" + fajta + '\'' +
                ", evjarat=" + evjarat +
                '}';
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public int getEvjarat() {
        return evjarat;
    }

    public void setEvjarat(int evjarat) {
        if (evjarat > 0) {
            this.evjarat = evjarat;
        }
        else System.out.println("időszámításunk előtt nem volt aszu");
    }


}
