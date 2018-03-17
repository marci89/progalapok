package Konyvespolc;
import Book.Book;
import Book.Regeny;
import Book.Tankonyv;


public class Konyvespolc {

public  static void polcratesz(Book [] mibe, int counter, Book mit) {
    mibe[counter] = mit;

}

    // argsban Regeny Egri_csillagok,Gárdonyi_Géza,Móra,1901 Tankonyv Kalkulus1,Toth_Istvan,Tankönyv_kiadó,1997 Tankonyv Java,Kismarzi_József,Flow_academy,2018

    public static void main(String[] args) {

    Regeny novel = new Regeny();
        System.out.println("adatok definiálása nélküli regény obj: " + novel.toString());

    int howmany =0;
    // howmany változóval megszámoljuk hány lehhetséges könyv van, hogy tudjuk az obj tömb méretét.
        for (int i=0;i <args.length;i++) {
            if (args[i].equals("Tankonyv") || args[i].equals("Regeny"))  {
              howmany++;
            }
        }



        Book [] bookobj = new Book[howmany]; // obj tömb
        String [] book1; // segéd tömb

        int counter=0;

        for (int i=0;i <args.length;i++) {

            if (args[i].equals("Regeny")) {
               book1 = args[i + 1].split(",");
               Regeny regeny = new Regeny(book1[0].replace("_", " "),book1[1].replace("_", " "),book1[2],Integer.parseInt(book1[3]));
                //bookobj[counter] = regeny;
                //counter++;
                polcratesz(bookobj,counter,regeny);
                counter++;
            }

            if (args[i].equals("Tankonyv")) {
                book1 = args[i + 1].split(",");
                Tankonyv tankonyv = new Tankonyv(book1[0],book1[1].replace("_", " "),book1[2].replace("_", " "),Integer.parseInt(book1[3]));
                //bookobj[counter] = tankonyv;
                //counter++;
                polcratesz(bookobj,counter,tankonyv);
                counter++;
            }

        }

        System.out.println(howmany + " könyv található az Args tömbben");
        // obj tömb kiiratas
        for (int i=0;i <bookobj.length;i++) {
            System.out.println(bookobj[i]);
        }
// statikus booknumber kiiratás
        System.out.println("Regények száma: " + Regeny.booknumber);


/*
output:


adatok definiálása nélküli regény obj: Book{cím: Objektumorientált Tervezés és Programozás' szerző: 'Angster Erzsébet' kiadó: kiskapu' date: 2001} Stílusa: Ifjúsági
3 könyv található az Args tömbben
Book{cím: Egri csillagok' szerző: 'Gárdonyi Géza' kiadó: Móra' date: 1901} Stílusa: Ifjúsági
Book{cím: Kalkulus1' szerző: 'Toth Istvan' kiadó: Tankönyv kiadó' date: 1997} tantárgy: Programozás 1
Book{cím: Java' szerző: 'Kismarzi József' kiadó: Flow academy' date: 2018} tantárgy: Programozás 1
Regények száma: 2

Process finished with exit code 0

*/




    }



}

