import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

        public static void main(String [] args) throws Exception {

            System.out.println("Helló Világ!");
            System.out.println("Tedd a kezed homlokomra,mintha kezed kezem volna\n");
            System.out.println("Tedd a kezed homlokomra,mintha kezed kezem volna \nTedd a kezed homlokomra,mintha kezed kezem volna \nTedd a kezed homlokomra,mintha kezed kezem volna \nTedd a kezed homlokomra,mintha kezed kezem volna \n");

            System.out.println("hanyadik sortól szeretnéd látni a verset?");
            Scanner szam = new Scanner(System.in);
            int number = szam.nextInt();


            FileReader file = new FileReader("/home/kismarczi/vers.txt");
            BufferedReader reader = new BufferedReader(file);
            String text ="";
            String line =  reader.readLine();
            int sor = 0;
            while (line != null) {
                sor++;
                if (sor>=number) {
                    text += line + " \n";
                }
                line = reader.readLine();


            }


            System.out.println(text);


       number();


        }

        public static void number () {
            System.out.println("adj meg egy számot");
            Scanner szam = new Scanner(System.in);
            int number = szam.nextInt();
            System.out.println("A bekert szam : "+number);
            numberdoouble();
        }

        public static void numberdoouble () {
            System.out.println("adj meg egy valós számot");
            Scanner szam2 = new Scanner(System.in);
            double number2 = szam2.nextInt();
            System.out.println("A bekert szam : "+number2);
            numberplus();
        }

        public static void numberplus () {
            System.out.println("adj meg két számot számot");
            Scanner szamadd = new Scanner(System.in);
            int number3 = szamadd.nextInt();
            int number4 = szamadd.nextInt();
            System.out.println("A bekert összege : " + (number3+number4));
            numberdec();
        }

        public static void numberdec () {
            System.out.println("adj meg két számot számot");
            Scanner szamadd = new Scanner(System.in);
            int number3 = szamadd.nextInt();
            int number4 = szamadd.nextInt();
            System.out.println("A bekert különbsége: " + (number3-number4));
            numberszor();
        }

        public static void numberszor () {
            System.out.println("adj meg két számot számot");
            Scanner szamadd = new Scanner(System.in);
            int number3 = szamadd.nextInt();
            int number4 = szamadd.nextInt();
            System.out.println("A bekert szorzata : " + (number3*number4));
            numberoszt();
        }

        public static void numberoszt () {
            System.out.println("adj meg két számot számot");
            Scanner szamadd = new Scanner(System.in);
            int number3 = szamadd.nextInt();
            int number4 = szamadd.nextInt();
            System.out.println("A bekert szamok osztásának értéke : " + (number3/number4));
            numberosztmaradek();
        }

        public static void numberosztmaradek () {
            System.out.println("adj meg két számot számot");
            Scanner szamadd = new Scanner(System.in);
            int number3 = szamadd.nextInt();
            int number4 = szamadd.nextInt();
            System.out.println("A bekert szamok maradéka : " + (number3%number4));
            numberdadd();
        }

        public static void numberdadd () {
            System.out.println("adj meg két valós számot számot");
            Scanner szamadd = new Scanner(System.in);
            double number3 = szamadd.nextInt();
            double number4 = szamadd.nextInt();
            System.out.println("A bekert szamok öszege : " + (number3+number4));
            numberddec();
        }

        public static void numberddec () {
            System.out.println("adj meg két valós számot számot");
            Scanner szamadd = new Scanner(System.in);
            double number3 = szamadd.nextInt();
            double number4 = szamadd.nextInt();
            System.out.println("A bekert szamok kivonva : " + (number3-number4));
            numberdszor();
        }
        public static void numberdszor () {
            System.out.println("adj meg két valós számot számot");
            Scanner szamadd = new Scanner(System.in);
            double number3 = szamadd.nextInt();
            double number4 = szamadd.nextInt();
            System.out.println("A bekert szamok szorzva : " + (number3*number4));
            numberdoszt();
        }

        public static void numberdoszt () {
            System.out.println("adj meg két valós számot számot");
            Scanner szamadd = new Scanner(System.in);
            double number3 = szamadd.nextInt();
            double number4 = szamadd.nextInt();
            System.out.println("A bekert szamok osztva : " + (number3/number4));
            numberdmaradek();
        }

        public static void numberdmaradek () {
            System.out.println("adj meg két valós számot számot");
            Scanner szamadd = new Scanner(System.in);
            double number3 = szamadd.nextInt();
            double number4 = szamadd.nextInt();
            System.out.println("A bekert szamok maradéka : " + (number3%number4));
        }


}
 /*
 output:

 Helló Világ!
Tedd a kezed homlokomra,mintha kezed kezem volna

Tedd a kezed homlokomra,mintha kezed kezem volna
Tedd a kezed homlokomra,mintha kezed kezem volna
Tedd a kezed homlokomra,mintha kezed kezem volna
Tedd a kezed homlokomra,mintha kezed kezem volna

hanyadik sortól szeretnéd látni a verset?

6
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20

adj meg egy számot
 5
A bekert szam : 5
adj meg egy valós számot
5
A bekert szam : 5.0
adj meg két számot számot
3
3
A bekert összege : 6
adj meg két számot számot
5
5
A bekert különbsége: 0
adj meg két számot számot
5
5
A bekert szorzata : 25
adj meg két számot számot
5
5
A bekert szamok osztásának értéke : 1
adj meg két számot számot
6
6
A bekert szamok maradéka : 0
adj meg két valós számot számot
12
5
A bekert szamok öszege : 17.0
adj meg két valós számot számot
23
45
A bekert szamok kivonva : -22.0
adj meg két valós számot számot
13
56
A bekert szamok szorzva : 728.0
adj meg két valós számot számot
12
3
A bekert szamok oszva : 4.0
adj meg két valós számot számot
13
12
A bekert szamok maradéka : 1.0

Process finished with exit code 0
  */