public class Main {

    public static void main(String[] args) {
        // Példányosítom a Maint, hogy ne statikus metódusokat írjak.
        Main main = new Main();
        // inicializálom a tömböt.
        String [] tomb = {"1","2","3","4","5","6","7","8","9","10",};
        // segéd változó, csak hoogy szebben írja ki, egymás mellé
        String text="";
        // így kell meghívni a metódust ha a Main példányosítva van.
        main.keveres(tomb);
        //megkevert tömb kiíratás
        for (int i =0; i < tomb.length; i++) {
            text+= tomb[i] + " ";
        }
        System.out.println(text);


    }

    public void keveres (String [] tomb) {
// 400* cseréli meg az elemeket
        for (int i =0; i < 400; i++) {
// a és b random szám 0-9, c segéd változó
          int a = (int) (Math.random()*10);
          int b = (int) (Math.random()*10);
          String c = "";

          c = tomb[a];
          tomb[a] = tomb[b];
          tomb[b] = c;
        }

    }
}
/*
output:
7 10 9 3 6 4 8 1 5 2

Process finished with exit code 0
 */