package Book;

public class Book {
    protected String cim;
    protected String szerzo;
    protected String kiado;
    protected int date;

    public Book(String cim, String szerzo, String kiado, int date) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.kiado = kiado;
        this.date = date;
    }

    public Book (){
        this.cim = "Objektumorientált Tervezés és Programozás";
        this.szerzo = "Angster Erzsébet";
        this.kiado = "kiskapu";
        this.date = 2001;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public String getKiado() {
        return kiado;
    }

    public void setKiado(String kiado) {
        this.kiado = kiado;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "cím: " + cim + '\'' +
                " szerző: '" + szerzo + '\'' +
                " kiadó: " + kiado + '\'' +
                " date: " + date +
                '}';
    }
}
