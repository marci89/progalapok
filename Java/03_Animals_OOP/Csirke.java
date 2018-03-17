public class Csirke extends SzarazfoldiAllat implements Novenyevo {

   public Csirke(String nev) {
       super(nev);
       setNumberoflegs(2);
    }

    @Override
    public String hangotad() {
        return "kott kott";
    }

    @Override
    public void eszik() {
        System.out.println(this.getNev()+" jóllakott magvakkal.");
        this.setJollakotsag(100);

    }
}
