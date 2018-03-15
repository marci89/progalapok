package Jarmu;

public class Forma1 extends Auto{
    private String pilota;
    private float beallitas;


    @Override
    public String toString() {
        return "Forma1{" +
                " tipus: " + getTipus() +
        " pilota= '" + pilota + '\'' +
                ", beallitas= " + beallitas +
                " maxteljesitmeny " + getMaxTeljesitmeny() +
                " teljesitmeny: " + getTeljesitmeny() + " versenyképesség: " + versenykepesseg2() +

                '}';
    }

    public Forma1(String tipus, String pilota, int teljesitmeny, int maxTeljesitmeny, float beallitas) {
        super(teljesitmeny, maxTeljesitmeny, tipus);
        this.pilota = pilota;
        this.beallitas = beallitas;

    }


    public String getPilota() {
        return pilota;
    }

    public void setPilota(String pilota) {
        this.pilota = pilota;
    }

    public float getBeallitas() {
        return beallitas;
    }

    public void setBeallitas(float beallitas) {
        this.beallitas = beallitas;
    }




    public float versenykepesseg2() {
        return (getTeljesitmeny()+getMaxTeljesitmeny() * beallitas);

    }



}

