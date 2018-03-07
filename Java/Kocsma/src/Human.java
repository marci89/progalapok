public class Human {
    public String name;
    private int age;
    private boolean gender;
    private int money;
    private int alcohol;
    private boolean inPub;

    Human (String name, int age, boolean gender, int money) {
        this.name=name;
        this.age = age;
        this.gender = gender;
        this.money = money;
        alcohol = 0;
        inPub = false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInPub() {
        return inPub;
    }

    public void setInPub(boolean inPub) {
        this.inPub = inPub;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(int alcohol) {
        this.alcohol = alcohol;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", money=" + money +
                ", alcohol=" + alcohol +
                ", inpub=" + inPub +
                '}';
    }
    public void inpub () {
        inPub = true;
        System.out.println(this.name + " kocsmában van");
    }


    public void drink (Kocsmaros kocsmaros) {
        if (inPub) {
            money--;
            alcohol++;
                Kocsmaros.dirty_glass++;
                System.out.println(Kocsmaros.dirty_glass);

            kocsmaros.setMoney(kocsmaros.getMoney()+1);
            System.out.println("ittam és " + money + " pénzem maradt. részegségem:" + alcohol + " koszos pohár: " + Kocsmaros.dirty_glass );
        }
        else System.out.println("nem is vagy kocsmában");

    }


    public void drink (Kocsmaros kocsmaros, Ital ital) {
        if (inPub== false) System.out.println("nem is vagy kocsmában");
        if (inPub==true) {
            if (alcohol>=40) {
                System.out.println("túl részeg vagy, így hazamész");
                sleep();}
                if (money<ital.getPrice()) {
                    System.out.println("nincs elég pénzed,így hazamész");
                    gohome();
                }
                }
        if (inPub==true && alcohol<=40 && money>ital.getPrice()) {
            money -= ital.getPrice();
            alcohol += ital.getSpirit();
            Kocsmaros.dirty_glass++;
            kocsmaros.setMoney(kocsmaros.getMoney()+ ital.getPrice() );
            System.out.println("kocsmáros pénze " + kocsmaros.getMoney()+" . ittam és " + money + " pénzem maradt. részegségem:" + alcohol + " koszos pohár: " + Kocsmaros.dirty_glass);
        }



    }



    public void sleep () {
        alcohol=0;
        System.out.println("kiütötte magát");
    }

    public void gohome () {
        inPub= false;
        System.out.println("otthon édes otthon");
    }

    public void fight (Human human) {
        if (Kidobo.dolgozik > 0) {
            System.out.println("a kidobó kizavart téged");
        }
        else {
            System.out.println("nincs kidoobó, így kötöszködésed sikeres volt");
        }



    }



}

