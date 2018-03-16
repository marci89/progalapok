import Filmek.Film;
import Filmek.Akciofilm;
import java.util.Random;

public class Oscar {
    private int Galayear;
    private int random;
    Film [] tomb;
    static String alapito = " Marci ";

    public Oscar(int galayear, Film[] tomb, String alapito) {
        Galayear = galayear;
        this.tomb = tomb;
        this.alapito = alapito;

    }

    // args paraméterei: film shrek valaki 1989 akcio terminator me 1985 Arnold true 17 film kiraly valaki 1989  film Zootropolis valaki 2016
    public static void main(String[] args) {

        atalakit();



        int filmszamlalo = 0;
// megszámolja hány lehetséges obj lesz args paramétereiben. a filmszamlalo értéke adja meg.
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("film") || args[i].equals("akcio")) {
            filmszamlalo++;
            }
        }

// kiiratjuk mennyi film van az argsban
        System.out.println("Filmek száma: " + filmszamlalo);
        Film [] tomb = new Film[filmszamlalo];

        int counter=0;
// a két for ciklussal kipörgetjük a film és akció filmeket a tomb nevű obj tömbbe.
for (int i=0; i < args.length; i++) {

    if (args[i].equals("film")) {
        Film film = new Film (args[i+1], args[i+2], Integer.parseInt(args[i+3]));
        tomb[counter] = film;
        counter++;
        i += 3;
    }
}
        for (int i=0; i < args.length; i++) {

            if (args[i].equals("akcio")) {
                Akciofilm akcio = new Akciofilm(args[i + 1], args[i + 2], Integer.parseInt(args[i + 3]), args[i + 4], Boolean.parseBoolean(args[i + 5]), Integer.parseInt(args[i + 6]));
                tomb[counter] = akcio;
                counter++;
                i += 5;
            }
        }

        for (int i = 0;i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }


        Oscar oscar = new Oscar(1989,tomb,"marci");

        for (int i = 0; i < tomb.length; i++) {
                System.out.println(tomb[i].getCim() + " film nyert? " + tomb[i].oscardij(oscar.Galayear));
        }


        }




    public static void atalakit (){
        // Stringet betükre váltunk, és visszafelé kiolvastatjuk, fordítva írja ki a szöveget.
        String mondat = "Indul a görög aludni";
        char[] words =mondat.toCharArray();
        for(int i=words.length-1;i>=0;i--) {
            System.out.print(words[i]);
        }
        System.out.println("  fordítva a mondat.");

        // szo tömbbe belehelyezzük a szavakat, majd ugyan így visszafelé kipörgetjük.
        String [] szo = mondat.split(" "); // szóközök között elválsztja

        System.out.println("szavanként visszafelé");
        for (int i =0; i <szo.length; i++) {
            System.out.println(new StringBuilder(szo[i]).reverse()); // visszafele írja.

        }
// Random szám generálás a feladat szerint:
        /*
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(5);
        System.out.println(randomInt);
        */

        // Randomizáláshoz másmilyen eljárás, amit én ismertem.
        int randomszam = (int) (Math.random()*5)+1;
        System.out.println("Random szám 1-5-ig : " + randomszam);

    }





/*
indula görög a ludnI  fordítva a mondat.
szavanként visszafelé
ludnI
a
görög
indula
Random szám 1-5-ig : 5
Filmek száma: 4
Film{cim='shrek', rendezo='valaki', date=1989}
Film{cim='kiraly', rendezo='valaki', date=1989}
Film{cim='Zootropolis', rendezo='valaki', date=2016}
Akciofilm{ cím: terminator rendező: me Dátum: 1985 akciohős neve: 'Arnold', ferfie: true, halottak száma: 17}
shrek film nyert? true
kiraly film nyert? false
Zootropolis film nyert? false
terminator film nyert? false
 */





}
