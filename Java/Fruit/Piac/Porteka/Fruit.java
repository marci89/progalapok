package Piac.Porteka;

public class Fruit {
    private int price;
    private String color;
    private String race;

    public Fruit(int price, String color, String race) {
        this.price = price;
        this.color = color;
        this.race = race;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", race='" + race + '\'' +

                '}';
    }


}