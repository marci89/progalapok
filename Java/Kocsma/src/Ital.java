public class Ital {
    private int price;
    private int spirit;

    public Ital(int price, int spirit) {
        this.price = price;
        this.spirit = spirit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    @Override
    public String toString() {
        return "Ital{" +
                "price=" + price +
                ", spirit=" + spirit +
                '}';
    }
}
