import java.util.Arrays;

public class Verem {

    private String tomb[];
    private int counter;

    public Verem(int szam) {
        this.tomb = new String[szam];
        this.counter = 0;
    }

    public void push(String in) throws Kivetel {
        if (counter == tomb.length) {
            throw new Kivetel("Elérted a maximális méretet, nem tudsz belerakni többet");
        }

        tomb[counter] = in;
        counter++;
    }


    public String pop() throws Kivetel2 {

            if (counter == 0) {
                throw new Kivetel2("tömb üres");
            }
        counter--;
            return tomb[counter];


    }

    public boolean search(String valami) {
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i].equals(valami)) {
                return true;
            }
        }
return false;
    }

    @Override
    public String toString() {
        return
                "tomb=" + Arrays.toString(tomb) +

                '}';
    }
}
