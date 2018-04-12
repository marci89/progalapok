import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.StringTokenizer;

public class moondatok {


    public static void main(String[] args) {

        int value = 30;
        System.out.println("Return Value : " + String.valueOf(value+10) );


        String szoveg = "alma az finom";
        String szoveg2 = szoveg.replace("alma","citrom");
        System.out.println(szoveg2);

        String tel= "telefonszam: 06302075454 aranyos";
        String tel2 = tel.replaceAll("[0-9\\-\\+\\s]{6,18}", "telszam");
        System.out.println(tel2);




        String mondat = ".ez egy mondat";
        String[] szavak = mondat.split(" ");

        for (int i = 0; i < szavak.length; i++) {
            System.out.println("a " + (i + 1) + " szó: " + szavak[i]);

        }
        String str = "alma az nagyon jó, aranyoos, cuki";

        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            System.out.println(tmp);
        }


        StringTokenizer st2 = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            System.out.println(tmp);
        }

        String s1 = "welcome";
        String s2 = "welcome";
        String s3 = new String("wel");
        String s4 = new String("hi");
        System.out.println(s1);
        System.out.println(s2 == s1);
        System.out.println(s2);

        s3.concat(s4);
        System.out.println(s3);

        s3 = s3.concat(s4);
        System.out.println(s3);

        String a1 = "alma";
        String a2 = "alma";
        String a3 = "lamas";
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a3));
        System.out.println(a3.compareTo(a1));

        String s5 = 50 + 40 + "szia" + 40 + 50;
        System.out.println(s5);

        s1.charAt(0);
        String s10 = "Tamas";
        System.out.println(Character.isUpperCase(s10.charAt(0))); // nagy betűvel kezdődik?

        //contain
        //endswith
        String a13 = new String("hello javapoint how jjj r u");
        char[] ch = new char[10];
        try {
            a13.getChars(6, 16, ch, 0);
            System.out.println(ch);
        } catch (Exception ex) {
            System.out.println(ex);
        }


        try {
            a13.getChars(a13.indexOf("j"), 16, ch, 0);
            System.out.println(ch);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        int num = 0;
        int count = 0;
        while (a13.indexOf('j', num) != -1) {
            num += a13.indexOf('j', num) + 1;
            System.out.println(num);
            count++;

        }
        System.out.println(count);
        System.out.println(valami (a13,"j"));

    }

   static int valami(String miben, String mit) {
        int num = 0;
        int counter = 0;

        while (miben.indexOf(mit, num) != -1) {
            num += miben.indexOf(mit, num) + 1;

            counter++;


        }
        return counter;
    }

}

/*
output:

Return Value : 40
citrom az finom
telefonszam:telszamaranyos
a 1 szó: .ez
a 2 szó: egy
a 3 szó: mondat
alma
az
nagyon
jó,
aranyoos,
cuki
welcome
true
welcome
wel
welhi
0
-11
11
90szia4050
true
javapoint
javapoint
7
28
2
2

Process finished with exit code 0


 */



