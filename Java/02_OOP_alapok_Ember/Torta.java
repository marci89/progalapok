public class Torta {
    @Override
    public String toString() {
        return "torta{" +
                "szelet=" + szelet +
                ", iz='" + iz + '\'' +
                '}';
    }

         private int szelet;

    public Torta(int szelet, String iz) {
        this.szelet = szelet;
        this.iz = iz;
    }

    protected String iz;

    public int getSzelet() {
        return szelet;
    }

    public void setSzelet(int szelet) {
        this.szelet = szelet;
    }

    public String getIz() {
        return iz;
    }

    public void setIz(String iz) {
        this.iz = iz;
    }
}


