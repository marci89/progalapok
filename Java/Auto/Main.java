import Jarmu.Auto;
import Jarmu.Forma1;


public class Main {


    public static void autokiir(Auto auto) {
        System.out.println(auto.toString());
    }

// args elemei: Ferrari Alonso 900 330 0.85 RedBull Vettel 820 325 0.9 Lotus Kimi 905 335 0.95 McLaren Button 915 335 0.7
    public static void main(String[] args) {
        Auto fiat = new Auto(34, 56, "fiat");
        Forma1 ferrari = new Forma1("ferrari", "feri", 300, 200, 0.3f);
        //System.out.println(fiat.versenykepesseg());
        //System.out.println(ferrari.versenykepesseg2());
        //autokiir(fiat);

        Forma1[] forma1auto = new Forma1[args.length/5]; // Forma1 osztályból példányosítunk egy tömb obj. Args hossza azért van elosztva, mert 5 elemből áll az obj.
        int counter = 0;
        for (int i = 0; i < args.length; i++) { //args elemeit kipörgetjük és Forma1es objba pakoljuk.
            Forma1 car = new Forma1(args[i], args[i + 1], Integer.parseInt(args[i + 2]), Integer.parseInt(args[i + 3]), Float.parseFloat(args[i + 4]));
            forma1auto[counter] = car; // az obj tomb indexébe belehelyezük a Forma1es obj.
            counter++; // counter változó adja az obj tömb indexét
            i += 4; // a következő adatsorra megy az args indexe

        }



        Forma1 tmp; // buborékos rendezéssel sorrendbe helyezzük
        for (int i = forma1auto.length-1; 0<i; --i) {
            for (int j=0; j < i; ++j) {
                if (forma1auto[j].versenykepesseg2()>forma1auto[j+1].versenykepesseg2()) {
                    // csere
                    tmp=forma1auto[j];
                    forma1auto[j]=forma1auto[j+1];
                    forma1auto[j+1]=tmp;
                }
            }

        }


        autokiir(forma1auto[0]);
        autokiir(forma1auto[1]);
        autokiir(forma1auto[2]);







    }
}
