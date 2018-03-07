



import javax.swing.*;

public class pub {
    private JTextField textField1;

    public static void main(String[] args) {


//beer class
        Beer kozel = new Beer(9,5);
        Beer dreher = new Beer(11,5);
        Beer heineken = new Beer(13,5);
        Beer soproni = new Beer(5,5);
        Beer aranyAszok = new Beer(6,5);
// wine class

        Wine egriBikaver = new Wine(17,11,3);
        Wine kadarka = new Wine(19,11,6);
        Wine merlot = new Wine(18,10,1);
        Wine sangria = new Wine(20,8,1);
        Wine tokaji = new Wine(30,13,10);

// ital class
        Ital whiskey = new Ital(25, 36);
        Ital beer = new Ital(8, 5);
        Ital redwine = new Ital(10, 12);
        Ital whitewine = new Ital(10, 12);
        Ital jager = new Ital(20, 38);
        Ital vodka = new Ital(15, 34);
        Ital absinte = new Ital(40, 70);
        Ital palinka = new Ital(30, 67);
        Ital water = new Ital (13,0);
        Ital ice = new Ital(1,0);

        // mixed class

        Mix death = new Mix(palinka,absinte);
        Mix titanicCoctel = new Mix(ice,water);
        Mix javohe = new Mix(jager,vodka,heineken);
        Mix allin = new Mix(whiskey,tokaji,kozel,death);




        Human zoli = new Human("zoli", 19 , false,12);
        Human jozsi = new Human("marcika", 28 , false,12);
        Human szabi = new Human("szabi", 28 , false,1000);

        Kocsmaros feri = new Kocsmaros(0);
        Kocsmaros tasi = new Kocsmaros(0);

        Diak peti = new Diak("peti", 12, true, 0);

        Kidobo oliver = new Kidobo("olivér",45,true, 1000);
        Kidobo andrás = new Kidobo("bandi",45,true, 12);
        Kidobo zsolti = new Kidobo("zsazsa",45,true, 12);

//szabi.inpub();
//szabi.drink(tasi,palinka);
//szabi.inpub();
//szabi.drink(tasi,palinka);

        oliver.inpub();
        oliver.kidobodrink(tasi,allin);


        System.out.println(peti);
        oliver.muszakbanvan();

        oliver.kidobodrink(tasi,whitewine);

        oliver.kidobodrink(tasi,whiskey);
        jozsi.fight(szabi);







    }
}