import Kivetel.RosszMinoseg;
import Raktar.Aru;
import java.util.Date;

public class TejTermek implements Aru {
    private String name;
    private long szavatossagiido;
    private  long gyartasiido;

    public TejTermek( long szavatossagiido, long gyartasiido, String name) {
        this.name = name;
        this.szavatossagiido = szavatossagiido;
        this.gyartasiido = gyartasiido;
    }

    @Override
    public boolean joMeg() throws RosszMinoseg {

        long most = System.currentTimeMillis();

            if (gyartasiido-most <= szavatossagiido) {
                return true;
            }

        throw new RosszMinoseg("Ez a gyümölcs megromlott, én nem venném meg...");



    }


    @Override
    public String toString() {
        return "TejTermek{" +
                "name='" + name + '\'' +
                ", szavatossagiido=" + szavatossagiido +
                ", gyartasiido=" + gyartasiido +
                '}';
    }
}
