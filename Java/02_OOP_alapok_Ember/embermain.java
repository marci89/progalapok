public class embermain {
    public static void main(String[] args) {
        ember jozsi = new ember("józsi", 17 , true );
        ember katika = new ember();

        jozsi.koszon();
        katika.koszon();

        System.out.println("emberek száma: " + ember.howmany);
        ember.kocsmabamegy();
        Birthcake barbi = new Birthcake(13,"málna", 12);
        Birthcake cukor = new Birthcake(12, "eper", 28);
        Birthcake cukorka = new Birthcake(13,"málna", 12);
               cukor.kivansag();

               Torta [] cukraszda = new Torta[3];
               cukraszda[0] = new Torta(13, "narancs");
                cukraszda[1] = new Torta(13, "eper");
                cukraszda[2] = new Birthcake(15, "alma",14);

                for (int i=0; i<cukraszda.length;i++) {
                    System.out.println(cukraszda[i]);
                }
    }

}
