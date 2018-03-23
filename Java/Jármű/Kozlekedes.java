public class Kozlekedes {
    public static void main(String[] args) {
        Kerekpar bicikli1 = new Kerekpar(10,10);
        Kerekpar bicikli2 = new Kerekpar(10,10);
        Gepkocsi auto1 = new Gepkocsi(200,25);
        Gepkocsi auto2 = new Gepkocsi(200,60);
        Jarmu uj = new Gepkocsi(200,60);
        bicikli2.setElromlott(true);


     Jarmu [] tomb = new Jarmu []{bicikli1,bicikli2,auto1,auto2};

     for (int i=0; i<tomb.length;i++) {


         try {
             tomb[i].indul();
         } catch (ElromlottException e) {
             e.printStackTrace();
         }


     }
        System.out.println();
        System.out.println(" kocsi indul: ");
        for (int i= 51;i> 0;i--) {
            try {
                uj.indul();

            } catch (NincsUzemanyagException e) {
               e.printStackTrace();

           } catch (ElromlottException e) {
                e.printStackTrace();
            }
        }




    }
}
/*
output:
minden ok
ElromlottException:  kilyukadt a kereked
	at Kerekpar.indul(Kerekpar.java:11)
	at Kozlekedes.main(Kozlekedes.java:20)
üzemanyag: 49
üzemanyag: 49

 kocsi indul:
üzemanyag: 49
üzemanyag: 48
üzemanyag: 47
üzemanyag: 46
üzemanyag: 45
üzemanyag: 44
üzemanyag: 43
üzemanyag: 42
üzemanyag: 41
üzemanyag: 40
üzemanyag: 39
üzemanyag: 38
üzemanyag: 37
üzemanyag: 36
üzemanyag: 35
üzemanyag: 34
üzemanyag: 33
üzemanyag: 32
üzemanyag: 31
üzemanyag: 30
üzemanyag: 29
üzemanyag: 28
üzemanyag: 27
üzemanyag: 26
üzemanyag: 25
üzemanyag: 24
üzemanyag: 23
üzemanyag: 22
üzemanyag: 21
üzemanyag: 20
üzemanyag: 19
üzemanyag: 18
üzemanyag: 17
üzemanyag: 16
üzemanyag: 15
üzemanyag: 14
üzemanyag: 13
üzemanyag: 12
üzemanyag: 11
üzemanyag: 10
üzemanyag: 9
üzemanyag: 8
üzemanyag: 7
üzemanyag: 6
üzemanyag: 5
üzemanyag: 4
üzemanyag: 3
üzemanyag: 2
üzemanyag: 1
üzemanyag: 0
NincsUzemanyagException: nincs üzemanyag
	at Gepkocsi.indul(Gepkocsi.java:17)
	at Kozlekedes.main(Kozlekedes.java:31)

Process finished with exit code 0
 */