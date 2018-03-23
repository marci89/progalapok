public abstract class Jarmu {

    private int suly;
    private int maxseb;
    private boolean elromlott;


    public Jarmu(int suly, int maxseb) {
        this.suly = suly;
        this.maxseb = maxseb;
    }


    public int getSuly() {
        return suly;
    }

    public void setSuly(int suly) {
        this.suly = suly;
    }

    public int getMaxseb() {
        return maxseb;
    }

    public void setMaxseb(int maxseb) {
        this.maxseb = maxseb;
    }

    public boolean isElromlott() {
        return elromlott;
    }

    public void setElromlott(boolean elromlott) {
        this.elromlott = elromlott;
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                "suly=" + suly +
                ", maxseb=" + maxseb +
                ", elromlott=" + elromlott +
                '}';
    }


    public abstract void indul () throws ElromlottException;




}
