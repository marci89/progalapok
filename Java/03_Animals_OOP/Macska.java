public class Macska extends SzarazfoldiAllat implements Ragadozo {
    public Macska(String nev) {
        super(nev);
    }

    @Override
    public void eszik(Allat kit) {
        System.out.println(this.getNev()+" jól lakott csirkével.");
        this.setJollakotsag(100);
    }

    @Override
    public void pihenes(int mennyit) {

    }

    @Override
    public String hangotad() {
        return "miáú";
    }
}