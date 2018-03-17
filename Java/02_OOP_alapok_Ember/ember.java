import com.sun.org.apache.xpath.internal.SourceTree;

// jobb klikk generate, jó dolog

public class ember {
     ember (String nev, int kor, boolean ferfi) {
         this.nev=nev;
         this.kor = kor;
         this.ferfi=ferfi;
         howmany++;
     }
    ember () {
        nev="bárki";
        kor = 12;
        ferfi =false;
        howmany++;
    }
    public static int howmany = 0;
    private  String nev;
    private  int kor;
    private  boolean ferfi;

public String toString () {
    return "ember neve: " + nev + " kora: " + kor + " neme: " + isFerfi();
}
    public  void koszon() {

        System.out.println("ember neve: " + nev + " kora: " + kor + " neme: " + isFerfi());
    }



    public String getname() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public String isFerfi() {
        if (ferfi) {
            return " férfi ";
        } else {
            return " nő ";
        }
    }

    public void setFerfi(boolean ferfi) {
        this.ferfi = ferfi;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public static void kocsmabamegy () {
        System.out.println("elmentem inni");
    }


}


