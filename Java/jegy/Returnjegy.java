public class Returnjegy extends Jegy{
int useticket;
    public Returnjegy(int tavolsag, int kedvezmeny, String cel) {
        super(tavolsag, kedvezmeny, cel);
        this.useticket = 0;
    }


    @Override
    public String toString() {
        return "Returnjegy{" +
                " useticket = " + useticket +
                " tavolsag: " + getTavolsag() + " km" +
                ", cel: " + getCel() + '\'' +
                ", jegyár: " + jegyar + " ft" +
                ", kedvezmeny: " + getKedvezmeny() + " %" +
                '}';
    }

    public int getUseticket() {
        return useticket;
    }

    public void setUseticket(int useticket) {
        this.useticket = useticket;
    }


    public void felhasznal () {

    if (useticket == 2) {
        setErvenyesseg(false);
        System.out.println("Már nem jó a jegyed");
    }
        else  {
        System.out.println("sikeresen használtad a jegyed");
        useticket++; }
    }

    public void ar () {
        System.out.println(Math.round((getTavolsag()*jegyar)*(getKedvezmeny()/100))*2);
    }
}
