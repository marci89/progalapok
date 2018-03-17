package Book;

public class Tankonyv extends Book {
    private String tantargy;


    public Tankonyv(String cim, String szerzo, String kiado, int date) {
        super(cim, szerzo, kiado, date);
       // this.tantargy = tantargy;
        tantargy ="Programozás 1";
    }




    public Tankonyv() {
        super();
        tantargy = "Programozás 1";
    }



    public String getTantargy() {
        return tantargy;
    }

    public void setTantargy(String tantargy) {
        this.tantargy = tantargy;
    }


    @Override
    public String toString() {
       return super.toString() + " tantárgy: " + tantargy;
    }
}
