public class Main {

    public static void main(String[] args) {
  Allat [] tomb = new Allat[4];
  Csirke pipi = new Csirke("pipi");
  Csirke pipi2 = new Csirke("pipis");
  Csirke pipi3 = new Csirke("pipir");
  Csirke pipi4 = new Csirke("pipik");

  tomb[0] = pipi;
  tomb[1] = pipi2;
  tomb[2] = pipi3;
  tomb[3] = pipi4;
          for (int i=0; i<tomb.length;i++) {
              System.out.println(tomb[i].getClass()); // getClass megmondja milyen osztálból való
          }
        boolean a = pipi instanceof Csirke; // true vagy false érték. megmondja hogy abbból az osztályból származik e
        System.out.println("pipi a csirke osztály egy példánya? " + a);

        System.out.println("4 faj tömbje: ");

        // így is lehet lértehozni Allat típusú tömböt, de lejebb gyorsabb
        //Allat [] animals = new Allat[4];

        Csirke csibe = new Csirke("csibe");
        axolot axi = new axolot("axi");
        Gizella gazzella = new Gizella("gazella");
        Macska mirci = new Macska("mirci");

        // hosszasabb így hozzáadni
        //animals[0] =csibe;
        //animals[1] =axi;
        //animals[2] =gazzella;
        //animals[3] =mirci;

        Allat[] animals = new Allat[]{csibe,axi,gazzella,mirci}; // így szebb létrehozni

        for (int i=0; i<animals.length;i++) {
            System.out.println(animals[i].getClass());
        }
        // hangotad metodus kiíratás.
        System.out.println("tyúk mondja: " + csibe.hangotad());
        System.out.println("gazella mondja: " + gazzella.hangotad());
        System.out.println("mirci csak " + mirci.hangotad() +"zik");
        System.out.println("axi pedig " + axi.hangotad() + "kol");

// helper dönti el, hogy szárazföldi lesz e vagy sem. hossz segít abban, hogy milyen hosszú lesz az waterorearth tömb
        int helper = (int) (Math.random()*2);
        int hossz=0;
        int hossz2=0;// növényevő tömb hossz
        int hossz3=0;// húsevőé

        // itt döl el a 3 tömb hossza
        for (int i=0; i<animals.length;i++) {
            boolean igaze = animals[i] instanceof SzarazfoldiAllat;
            boolean plants = animals[i] instanceof Novenyevo; // megnézi hogy növényevő e

            if (helper == 0 && igaze){
                hossz++;
            }
            if (helper == 1 && !igaze) {
                hossz++;
            }
                if (plants){
                    hossz2++;
                }

                if (!plants){
                    hossz3++;
                }


        }


        Allat [] waterorearth = new Allat[hossz];
        Allat [] novenyevo = new Allat[hossz2];
        Allat [] ragadozo = new Allat[hossz3];

// tömbbe belehelyezés
        int counter=0;
        for (int i=0; i<animals.length;i++) {
            boolean igaze = animals[i] instanceof SzarazfoldiAllat;
            if (helper == 0 && igaze){
                waterorearth[counter] =animals[i];
                counter++;
            }
            else if (helper == 1 && !igaze){
                    waterorearth[counter] =animals[i];
                    counter++;
                }


        }



        // növényevő vagy ragadozó tömbbe kerüljön.
        int counter2 =0;
        counter=0;
        for (int i=0; i<animals.length;i++) {

            boolean plants = animals[i] instanceof Novenyevo;
            if (plants){
                novenyevo[counter] =animals[i];
                counter++;
            }
            else if (!plants){
                ragadozo[counter2] =animals[i];
                counter2++;
            }
        }

        System.out.println("vizi vagy szárazföldi?");
        if (helper ==0) {
            System.out.println("szárazföldi lett.");
        }
        else {
            System.out.println("vizi lett");
        }

        for (int i=0; i<waterorearth.length;i++) {
            System.out.println(waterorearth[i]);
        }

        System.out.println("növényevők: ");

        for (int i=0; i<novenyevo.length;i++) {
            System.out.println(novenyevo[i]);
        }

        System.out.println("ragadozók: ");

        for (int i=0; i<ragadozo.length;i++) {
            System.out.println(ragadozo[i]);
        }




/*
output:
class Csirke
class Csirke
class Csirke
class Csirke
pipi a csirke osztály egy példánya? true
4 faj tömbje:
class Csirke
class axolot
class Gizella
class Macska
tyúk mondja: kott kott
gazella mondja: mekk mekk
mirci csak miáúzik
axi pedig lubickol
vizi vagy szárazföldi?
vizi lett
axolot@1d44bcfa
növényevők:
Csirke@266474c2
Gizella@6f94fa3e
ragadozók:
axolot@1d44bcfa
Macska@5e481248

Process finished with exit code 0
 */


    }
}
