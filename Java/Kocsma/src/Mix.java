public class Mix extends Ital {

    public Mix(Ital ital1,Ital ital2) {

        super((ital1.getPrice() + ital1.getPrice()) / 2,
                (ital1.getSpirit() + ital2.getSpirit()) / 2)
        ;
    }


    public Mix(Ital ital1,Ital ital2, Ital ital3) {

        super((ital1.getPrice() + ital1.getPrice()+ ital3.getPrice()) / 3,
                (ital1.getSpirit() + ital2.getSpirit()+ ital3.getSpirit()) / 3)
        ;
    }


    public Mix(Ital ital1,Ital ital2, Ital ital3, Ital ital4) {

        super((ital1.getPrice() + ital1.getPrice()+ ital3.getPrice()+ ital4.getPrice()) / 4,
                (ital1.getSpirit() + ital2.getSpirit()+ ital3.getSpirit()+ ital4.getSpirit()) / 4)
        ;
    }
}
