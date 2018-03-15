package jarmu;

public class Szemelyvonat extends  Vonat {

    private int megallo;

    public Szemelyvonat(String indul, String vegallomas, int tav, int seb, int megallo) {
        super(indul, vegallomas, tav, seb);
        this.megallo = megallo;
    }


    // //teher Algyő Dunaújváros 280 70 olaj 2500 személy Szeged Békéscsaba 93 70 13 személy Párizs London 500 300 2
    //}

    public int getMegallo() {
        return megallo;
    }

    public void setMegallo(int megallo) {
        if (megallo < 2) {
            System.out.println("There must be at least 2 stops.");
        } else {
            this.megallo = megallo;
        }



        this.megallo = megallo;
    }


    @Override
    public String toString() {
        return "Szemelyvonat{" +
                " indul : " + indul + '\'' +
                " vegallomas : " + vegallomas + '\'' +
                " tav : " + tav + " km " +
                " seb : " + seb + " km/h " +
                " megallo: " +megallo +
                '}';
    }

    public double leghamarabb () {

        return super.leghamarabb() + (getMegallo()-2) *0.1;

    }
}
