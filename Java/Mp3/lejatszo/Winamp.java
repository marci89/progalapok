package lejatszo;
import media.Mp3;

public class Winamp {
    Mp3 [] tomb = new Mp3[3];
    private int size;
    int counter=0;


    public Winamp(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void hozzaad(Mp3 mp3) {

        tomb[size - size+counter] = mp3;
        counter++;
    }

    public void lekerdez(int melyiket) {
        System.out.println(tomb[melyiket]);

    }

    public void info (Mp3 mp3) {
        System.out.println(mp3.toString());
    }

// argsban: me valami he 3 music kari the 5 you something they 4
    public static void main(String[] args) {
        Winamp a = new Winamp(5);
        int counter=0;

         for (int i=0; i < args.length; i++) {
         Mp3 valami = new Mp3(args[i],args[i+1], args[i+2], Integer.parseInt(args[i + 3]));
         a.tomb[counter] = valami;
         a.hozzaad(a.tomb[counter]);
         counter++;
         i+=3;
        }
        System.out.println(" lekérdez metódussal: ");
        a.lekerdez(0);
        a.lekerdez(1);
        a.lekerdez(2);
        System.out.println(" info metódussal: ");
        a.info(a.tomb[0]);
        a.info(a.tomb[1]);
        a.info(a.tomb[2]);

atlag(a.tomb);

    }

    public  static void atlag (Mp3 [] tomb) {
        float szam =0;
        int counter=0;
        for (int i=0; i < tomb.length; i++) {
            szam+=tomb[i].getHossz();
            counter++;
        }
        szam = szam/counter;
        System.out.println("szám hossz átlaga: " + szam);
    }

    /*

     lekérdez metódussal:
 Ez a szám me előadótól a he című szám, ami az valami albumon található, hossza pedig 3
 Ez a szám music előadótól a the című szám, ami az kari albumon található, hossza pedig 5
 Ez a szám you előadótól a they című szám, ami az something albumon található, hossza pedig 4
 info metódussal:
 Ez a szám me előadótól a he című szám, ami az valami albumon található, hossza pedig 3
 Ez a szám music előadótól a the című szám, ami az kari albumon található, hossza pedig 5
 Ez a szám you előadótól a they című szám, ami az something albumon található, hossza pedig 4
szám hossz átlaga: 4.0

Process finished with exit code 0

     */

}
