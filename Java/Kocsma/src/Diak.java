
public class Diak extends Human {

    private int osztondij;

    public int getOsztondij() {
        return osztondij;
    }

    public void setOsztondij(int osztondij) {
        this.osztondij = osztondij;
    }

    public Diak(String name, int age, boolean gender, int money) {
        super(name, age, gender, money);
    }

    @Override
    public String toString() {
        return super.toString() +
                "osztondij=" + osztondij +
                '}';
    }

    public void tanul(){
        osztondij =10;
        setMoney(getMoney()+ osztondij );
        System.out.println("tanulói ösztöndíj: " + osztondij + " pénze: " + getMoney());

    }
    public void tanul(int mennyit)
    {
        osztondij =10;
        setMoney(getMoney()+ osztondij*mennyit );
        System.out.println("tanulói ösztöndíj: " + osztondij + " a tanulás " + mennyit + " órát vett igénybe így a pénze: " + getMoney());

    }



}

