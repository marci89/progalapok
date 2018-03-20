package media;

public class Mp3 {

    private String eloado;
    private String album;
    private  String cim;
    private int hossz;

    public Mp3(String eloado, String album, String cim, int hossz) {
        this.eloado = eloado;
        this.album = album;
        this.cim = cim;
        this.hossz = hossz;
    }


    public String getEloado() {
        return eloado;
    }

    public void setEloado(String eloado) {
        this.eloado = eloado;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getHossz() {
        return hossz;
    }

    public void setHossz(int hossz) {
        this.hossz = hossz;
    }


    @Override
    public String toString() {
        return " Ez a szám " + eloado+ " előadótól a " + cim + " című szám, ami az " + album+ " albumon található, hossza pedig " + hossz;
    }
}
