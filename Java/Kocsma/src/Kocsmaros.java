public class Kocsmaros {

    private int money;
    static int dirty_glass = 0;

    public Kocsmaros(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public static int getDirty_glass() {
        return dirty_glass;
    }

    public static void setDirty_glass(int dirty_glass) {
        Kocsmaros.dirty_glass = dirty_glass;
    }

    @Override
    public String toString() {
        return super.toString() +
                "money=" + money +
                '}';
    }

    public void clean(){
        if (dirty_glass>=1) {
            dirty_glass--;
            System.out.println("pohár elmosva" + dirty_glass);
        }
        else System.out.println("nincs koszos pohár");
    }
}
