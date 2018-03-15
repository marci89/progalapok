package jarmu;

public class Tehervonat extends Vonat {
    private String rakomany;
    private int mennyiseg;

    public Tehervonat(String indul, String vegallomas, int tav, int seb, String rakomany, int mennyiseg) {
        super(indul, vegallomas, tav, seb);
        this.rakomany = rakomany;
        this.mennyiseg = mennyiseg;
    }


    public String getRakomany() {
        return rakomany;
    }

    public void setRakomany(String rakomany) {
        this.rakomany = rakomany;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }


    @Override
    public String toString() {
        return "Tehervonat{" +
                " indul : " + indul + '\'' +
                " vegallomas : " + vegallomas + '\'' +
                " tav : " + tav + " km " +
                " seb : " + seb + " km/h " +
                " rakomány: " + rakomany +
                " mennyiség: " + mennyiseg + " t " +
                '}';
    }


}