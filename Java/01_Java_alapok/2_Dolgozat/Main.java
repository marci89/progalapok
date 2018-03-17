import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int jegy = 1;
        String[] honapok = {"jan", "feb", "marc", "april", "maj", "jun", "july", "august", "szept", "okt", "nov", "dec",};

        System.out.println("adj meg egy számot (maximális pont)");
        Scanner szam = new Scanner(System.in);
        int max = szam.nextInt();
        System.out.println("adj meg egy számot(te pontod)");
        int min = szam.nextInt();
        System.out.println("összes pont: " + max + " abból a tiéd: " + min);

        if (max / 2 < min) System.out.println("sikeres");
        else System.out.println("nem felelt meg");

        System.out.println("100 pontos dolgozatból mennyit értél el?");
        Scanner szam2 = new Scanner(System.in);
        int pont = szam2.nextInt();
        //50,65,80,90
        if (pont < 50) jegy = 1;
        if (pont < 65 && pont > 50) jegy = 2;
        if (pont < 80 && pont > 65) jegy = 3;
        if (pont < 90 && pont > 80) jegy = 4;
        if (pont < 100 && pont > 90) jegy = 5;
        if (pont > 100) {
            System.out.println("az értéked nagyobb mint 100!");
            jegy = 0;
        }

        if (jegy == 1) System.out.println("elégtelen");
        if (jegy == 2) System.out.println("elégséges");
        if (jegy == 3) System.out.println("közepes");
        if (jegy == 4) System.out.println("jó");
        if (jegy == 5) System.out.println("jeles");

        System.out.println("hanyadik hónap?");
        int honap = szam.nextInt();
        System.out.println("" + honapok[honap - 1]);


    }
}
/*
output:
adj meg egy számot (maximális pont)

50
adj meg egy számot(te pontod)
40
összes pont: 50 abból a tiéd: 40
sikeres
100 pontos dolgozatból mennyit értél el?
45
elégtelen
hanyadik hónap?
9
szept

Process finished with exit code 0
 */