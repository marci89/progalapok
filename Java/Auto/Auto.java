package Jarmu;

public class Auto {
    protected int teljesitmeny;
    protected int maxTeljesitmeny;
    protected String tipus;


    @Override
    public String toString() {
        return "Auto{" +
                " teljesitmeny : " + teljesitmeny +
                ", maxTeljesitmeny: " + maxTeljesitmeny +
                ", tipus: '" + tipus + " versenyképesség: " + versenykepesseg() + '\'' +
                '}';
    }

    public Auto(int teljesitmeny, int maxTeljesitmeny, String tipus) {
        this.teljesitmeny = teljesitmeny;
        this.maxTeljesitmeny = maxTeljesitmeny;
        this.tipus = tipus;
    }


    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public void setTeljesitmeny(int teljesitmeny) {
        this.teljesitmeny = teljesitmeny;
    }

    public int getMaxTeljesitmeny() {
        return maxTeljesitmeny;
    }

    public void setMaxTeljesitmeny(int maxTeljesitmeny) {
        this.maxTeljesitmeny = maxTeljesitmeny;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int versenykepesseg() {
        return teljesitmeny+maxTeljesitmeny;
    }
}
