package Book;

public class Regeny extends Book {
    public static int booknumber =0;
    String stilus;


    public Regeny(String cim, String szerzo, String kiado, int date) {
        super(cim, szerzo, kiado, date);
        stilus = "Ifjúsági";
        booknumber++;
    }

    public Regeny () {
        super();
        stilus = "Ifjúsági";
        booknumber++;
    }



    public String getStilus() {
        return stilus;
    }

    public void setStilus(String stilus) {
        this.stilus = stilus;
    }


    @Override
    public String toString() {
        return super.toString() + " Stílusa: " + stilus;
    }
}
