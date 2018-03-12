package Ital;


public class Aszu extends Bor {

    private int puttony;
    static String fajta = "aszu";

    /**
     *
     * @param puttony
     * @param evjarat
     * bor osztály gyermekének "Aszu" tulajdonságai.
     */

    public Aszu(int puttony, int evjarat) {

        super(fajta, evjarat);
        this.puttony=puttony;
    }

    @Override
    public String toString() {
        return "Aszu{" + "Ez egy aszú, melynek évjárata " +
                getEvjarat() + " és "
                + puttony + " puttonyos "+
                '}';
    }


    /**
     *
     * @return
     */
    public int getPuttony() {
        return puttony;
    }

    public void setPuttony(int puttony) {
        if (puttony > 0) {
            this.puttony = puttony;
        }
    }



}





