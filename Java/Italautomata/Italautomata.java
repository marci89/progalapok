package Automata;

public class Italautomata extends  UresAutomata{

    private  boolean hideg;


    public Italautomata( int pohar, boolean hideg) {
        super(0,pohar,true);
        this.hideg = hideg;
    }


    public boolean isHideg() {
        return hideg;
    }

    public void setHideg(boolean hideg) {
        this.hideg = hideg;
    }

    @Override
    public String toString() {
        if (hideg) {
            return "ez egy hideg ital";
        }
        else {
            return "ez egy meleg ital";
        }
    }



    public void penztbedob (int money) {
        if (pohar<1 || hasznalhatoe == false) {
            System.out.println("próbálkozzon később");
        }

        else if (money<95) {
            System.out.println("kevés a pénz");
        }

        else {
            System.out.println("sikeres vásárlás. a visszajáró: " + (money-95) + " Ft");
            pohar--;
            bedobottPenz+=money;
        }
    }


}
