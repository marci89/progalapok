public class Birthcake extends Torta{
    private int gyertya= 0;

    public Birthcake(int szelet, String iz, int gyertya) {
        super(szelet, iz);
        this.gyertya = gyertya;
    }

    public void kivansag() {
        System.out.println("kivánságd teljesült");

    }

    @Override
    public String toString() {
        return "Birthcake{" +
                "gyertya=" + gyertya +
                ", iz='" + iz + '\'' +
                '}';
    }

    public  void info () {
        System.out.println("info");
    }
}
