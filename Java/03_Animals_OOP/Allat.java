public abstract class Allat {

    private String nev;
    private int jollakotsag;
    private  int ero;

    public Allat(String nev) {
        this.nev = nev;
        this.jollakotsag = 100;
        this.ero = 0;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getJollakotsag() {
        return jollakotsag;
    }

    public void setJollakotsag(int jollakotsag) {
        this.jollakotsag = jollakotsag;
    }

    public int getEro() {
        return ero;
    }

    public void setEro(int ero) {
        this.ero = ero;
    }


    public abstract String hangotad ();

}
