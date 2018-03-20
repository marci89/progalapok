package Piac;
import Piac.Porteka.Fruit;

public class Vasarlo {
    private int kosarSize;
    private  int money;
    int counter=0;


    public Vasarlo(int kosarSize, int money) {
        this.kosarSize = kosarSize;
        this.money = money;
    }

    public int getKosarSize() {
        return kosarSize;
    }

    public void setKosarSize(int kosarSize) {
        this.kosarSize = kosarSize;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Vasarlo{" +
                "kosar méret: " + kosarSize +
                ", money=" + money +
                "kosár tartalom: " +
                '}';
    }


    public void vasarol(Fruit fruit) {
        Fruit [] kosar = new Fruit[kosarSize];


        if (fruit.getPrice()>money) {
            System.out.println("sajnos nem tudjuk megvenni a megadott gyümölcsöt");
        }


        else if (!fruit.getColor().equals("zöld")) {
            System.out.println("mi csak zöld gyümölcsöt szeretnénk vásárolni.");
        }

        else {
            money= money - fruit.getPrice();
            kosar[counter] = fruit;
            counter++;
            System.out.println("megvettem");


        }

    }

}