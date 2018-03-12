/**
 * name: aszu
 * gyakorlás: osztályok közötti átmenet, args tömb feltöltése majd
 * kiíratása a feladat szerint.
 * version 1.0 :)
 */


// java doc a tollsban van, és úgy tudod létrehozni. per cillag csillagal
//tudsz létre hozni ilyen hozzászólást.

import Ital.Bor;
import Ital.Aszu;

public class Main {
    public static void kiirBor(Bor bor) {
        System.out.println(bor);

    }


    public static void main(String[] args) {

        Bor egri = new Bor("egri",1989);
        Aszu tokaji = new Aszu(6,1967);



        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("aszu")) {
                Aszu aszu = new Aszu(Integer.parseInt(args[i+2]), Integer.parseInt(args[i+1]));
                kiirBor(aszu);
                i += 2;
            } else {
                Bor bor = new Bor(args[i], Integer.parseInt(args[i+1]));
                kiirBor(bor);
                i += 1;
            }
}





        //kiirBor(egri);
        //System.out.println(tokaji);



    }
}
