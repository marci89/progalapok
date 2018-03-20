package Piac;
import Piac.Vasarlo;
import Piac.Porteka.Fruit;



public class SzuperNagyi extends  Vasarlo {
    private Boolean alku;

    public SzuperNagyi(int kosarSize, int money) {
        super(kosarSize,Math.round(money*0.8f));

        //money =Double.parseDouble(;



        int randomize = (int) (Math.random()*2)+1;
        if (randomize == 1) {
            alku=true;
        }
        else {
            alku=false;
        }




    }

    public void vasarol(Fruit fruit) {
        Fruit [] kosar = new Fruit[getKosarSize()];

        String faj ="";
        String text ="";



        if (fruit.getPrice() > getMoney()) {
            System.out.println("sajnos nem tudjuk megvenni a megadott gyümölcsöt");
        }




        else if (fruit.getColor().equals("piros")) {
            System.out.println("mi csak zöld vagy sárga  gyümölcsöt szeretnénk vásárolni.");
        }


        else if (alku) {
            int randomize = (int) (Math.random()*4)+1;
            if (randomize!=1 && getMoney()>fruit.getPrice()) {

                setMoney(getMoney() - Math.round(fruit.getPrice()*0.9f));
                System.out.println("ugye unokám megmondtam, hogy ennél az árusnál lehet alkudni…");
            }
        }


        else {
            setMoney(getMoney()-fruit.getPrice());
            System.out.println("megvettem");
            //kosar[counter] = fruit;


            // counter++;

        }



    }

    @Override
    public String toString() {
        return "SzuperNagyi{" +
                " alku= " + alku +
                " money: " + getMoney() +
                " kosár: " + getKosarSize() +
                '}';
    }
}
