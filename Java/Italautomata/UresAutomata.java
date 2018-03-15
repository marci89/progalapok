package Automata;

public class UresAutomata {

   protected int bedobottPenz;
   protected int pohar;
   protected boolean hasznalhatoe;

    public UresAutomata(int bedobottPenz, int pohar, boolean hasznalhatoe) {
        this.bedobottPenz = bedobottPenz;
        this.pohar = pohar;
        this.hasznalhatoe = hasznalhatoe;
    }

    public int getBedobottPenz() {
        return bedobottPenz;
    }

    public void setBedobottPenz(int bedobottPenz) {
        this.bedobottPenz = bedobottPenz;
    }

    public int getPohar() {
        return pohar;
    }

    public void setPohar(int pohar) {
        this.pohar = pohar;
    }

    public boolean isHasznalhatoe() {
        return hasznalhatoe;
    }

    public void setHasznalhatoe(boolean hasznalhatoe) {
        this.hasznalhatoe = hasznalhatoe;
    }

    @Override
    public String toString() {
        if (hasznalhatoe) {
            return "Használható, a bedobott pénz értéke: " + bedobottPenz;
        } else { return  "nem Használható, a bedobott pénz értéke: " + bedobottPenz; }

    }


    public void penztbedob (int money) {
        System.out.println("Az automata nincs feltöltve, nem használható");
    }


}

