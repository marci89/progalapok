package Filmek;


public class Akciofilm extends  Film {

    private String akciohosName;
    private Boolean ferfie;
    private int halottak;

    public Akciofilm(String cim, String rendezo, int date, String akciohosName, Boolean ferfie, int halottak) {
        super(cim, rendezo, date);
        this.akciohosName = akciohosName;
        this.ferfie = ferfie;
        this.halottak = halottak;
    }

    public String getAkciohosName() {
        return akciohosName;
    }

    public void setAkciohosName(String akciohosName) {
        this.akciohosName = akciohosName;
    }

    public Boolean getFerfie() {
        return ferfie;
    }

    public void setFerfie(Boolean ferfie) {
        this.ferfie = ferfie;
    }

    public int getHalottak() {
        return halottak;
    }

    public void setHalottak(int halottak) {
        this.halottak = halottak;
    }


    @Override
    public String toString() {
        return "Akciofilm{" +
                " cím: " + cim +
                " rendező: " + rendezo +
                " Dátum: " + date +
                " akciohős neve: '" + akciohosName + '\'' +
                ", ferfie: " + ferfie +
                ", halottak száma: " + halottak +
                '}';
    }
}
