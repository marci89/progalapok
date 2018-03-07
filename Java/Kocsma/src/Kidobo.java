public class Kidobo extends Human {
private boolean muszak = false;
static int dolgozik;
    public Kidobo(String name, int age, boolean gender, int money) {

        super(name, age, gender, money);

    }

    public static int getDolgozik() {
        return dolgozik;
    }

    public static void setDolgozik(int dolgozik) {
        Kidobo.dolgozik = dolgozik;
    }

    public void muszakbanvan () {
        if (muszak==false)
        {
            dolgozik++;
            muszak = true;
            System.out.println(name + " műszakba lépett");
        }
        else System.out.println(name + "már műszakban van");
    }

    public void muszakbolkilep () {
        if (muszak==true)
        {
            dolgozik--;
            muszak = false;
            System.out.println(name + " műszakból kilépett");
        }
        else System.out.println(name + " nincs műszakban");
    }

    public void muszakbanall () {

        System.out.println("dolgozó kidobók száma: " + Kidobo.dolgozik);
    }

    public void kidobodrink(Kocsmaros kocsmaros, Ital ital) {



            if (ital.getSpirit() == 0 && muszak == true) {
                super.drink(kocsmaros, ital);
            } else if (!muszak) {
                super.drink(kocsmaros, ital);
            } else {
                System.out.println(getName() + " műszakban nem ihat.");
            }







    }
}
