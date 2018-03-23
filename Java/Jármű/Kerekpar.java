public class Kerekpar extends Jarmu{

    public Kerekpar(int suly,int maxseb) {
        super(suly,maxseb);

        this.setMaxseb(40);
    }

    public void indul() throws ElromlottException {
        if (this.isElromlott()) {
            throw new ElromlottException(" kilyukadt a kereked");
        }
        else System.out.println("minden ok");

    }
}
