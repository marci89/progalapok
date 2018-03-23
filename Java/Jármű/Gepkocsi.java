public class Gepkocsi extends  Jarmu implements Motorizalt{

    private int uzemanyagmenny=50;


    public Gepkocsi(int suly, int maxseb) {
        super(suly, maxseb);
        this.uzemanyagmenny= 50;
    }

    @Override
    public void indul() throws ElromlottException {
        if (isElromlott()) {
        throw new ElromlottException("elromlott az eszköz");
        }
        else if (uzemanyagmenny<=0) {
            throw  new NincsUzemanyagException("nincs üzemanyag");
        }
        else {
            uzemanyagmenny--;
            System.out.println("üzemanyag: " + uzemanyagmenny);
        }



    }




    @Override
    public void uzemanyagToltes(int szam) {

    }

    @Override
    public int getUzemanyag() {
        return 0;
    }


    public int getUzemanyagmenny() {
        return uzemanyagmenny;
    }

    public void setUzemanyagmenny(int uzemanyagmenny) {
        this.uzemanyagmenny = uzemanyagmenny;
    }
}
