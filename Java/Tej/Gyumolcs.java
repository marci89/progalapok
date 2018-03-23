import Kivetel.RosszMinoseg;
import Raktar.Aru;

public class Gyumolcs implements Aru {
String name;

    public Gyumolcs(String name) {
        this.name = name;
    }

    @Override
    public boolean joMeg() throws RosszMinoseg {
        int random = (int) (Math.random() * 6) + 1;
        if (random % 2 == 0) {
            return true;
        }

            if (random == 3) {
                throw new RosszMinoseg("Ez a gyümölcs megromlott, én nem venném meg...");
            }

   return false;


    }


    @Override
    public String toString() {
        return "Gyumolcs{" +
                "name='" + name + '\'' +
                '}';
    }
}
