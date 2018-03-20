package media;

import media.Mp3;

public class VideoClip extends Mp3 {
    private int kepszeles;
    private  int kephossz;


    public VideoClip(String eloado, String album, String cim, int hossz, int kepszeles, int kephossz) {
        super(eloado, album, cim, hossz);
        this.kepszeles = kepszeles;
        this.kephossz = kephossz;
    }


    public int getKepszeles() {
        return kepszeles;
    }

    public void setKepszeles(int kepszeles) {
        this.kepszeles = kepszeles;
    }

    public int getKephossz() {
        return kephossz;
    }

    public void setKephossz(int kephossz) {
        this.kephossz = kephossz;
    }

    @Override
    public String toString() {
        return super.toString() + " " + kephossz + ":" + kepszeles;
    }
}
