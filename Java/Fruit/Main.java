import java.io.IOException;
import Piac.Porteka.Fruit;
import Piac.SzuperNagyi;
import Piac.Vasarlo;
public class Main extends Exception {



    //args adatok:  12 100 25 piros eper 25 zöld káposzta 40 sárga búza
    public static void main(String[] args) {

        Vasarlo gizi = new Vasarlo(6,1000);
        SzuperNagyi nagyi = new SzuperNagyi(10,1000);

        int counter=0;
        Fruit [] fruit = new Fruit[3];
        Vasarlo Aniko= new Vasarlo(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        try {
            for (int i = 2; i < args.length; i++) {
                Fruit valami = new Fruit(Integer.parseInt(args[i]), args[i + 1], args[i + 2]);
                fruit[counter] = valami;
                counter++;
                i += 2;

                if (args.length < 5) {
                    throw new Kivetel("2-nél kevesebb");
                }

            }
        }   catch (Kivetel error) {
            error.printStackTrace();
        }


        System.out.println(vasarol(fruit,nagyi));

    }








    static  int vasarol(Fruit [] friut, Vasarlo vasarlo) {
        System.out.println("ezeket találta: ");
        for (int i =0;i < friut.length; i++) {
            vasarlo.vasarol(friut[i]);
            System.out.println(friut[i]);

        }

        System.out.println("maradék pénz: ");
        return vasarlo.getMoney();

    }

    /*
    output ha nem alkuszik:
    ezeket találta:
mi csak zöld vagy sárga  gyümölcsöt szeretnénk vásárolni.
Fruit{price=25, color='piros', race='eper'}
megvettem
Fruit{price=25, color='zöld', race='káposzta'}
megvettem
Fruit{price=40, color='sárga', race='búza'}
maradék pénz:
735

Process finished with exit code 0

ha alkuszik:

ezeket találta:
mi csak zöld vagy sárga  gyümölcsöt szeretnénk vásárolni.
Fruit{price=25, color='piros', race='eper'}
ugye unokám megmondtam, hogy ennél az árusnál lehet alkudni…
Fruit{price=25, color='zöld', race='káposzta'}
ugye unokám megmondtam, hogy ennél az árusnál lehet alkudni…
Fruit{price=40, color='sárga', race='búza'}
maradék pénz:
741
     */


}
