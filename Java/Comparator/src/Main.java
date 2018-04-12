import Persons.Person;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.io.*;

public class Main {

    //shift f6 mindet átnevez

    public static void main(String[] args) throws Exception {

        Person marci = new Person( 1,"mari");

        Set<String> dog = new HashSet<>();
        Set<Dog> dog2 = new HashSet<>();

        Pincsi pincsikutya = new Pincsi("lila","pincsike","valami");

        dog.add("green");
        dog.add("pink");
        dog2.add(new Dog("green","buksi"));
        //dog2.add("pink");

        Dog kutya = new Dog("pink","buksi", marci);
        Dog kutya2 = new Dog("pink","buksi");

        System.out.println(dog.contains("green"));
        System.out.println(dog2.contains(new Dog("green","buksi")));

        System.out.println(kutya2.equals(kutya));



        Map<Dog, Integer> dogmap = new HashMap<>();
        dogmap.put(kutya,5);
        dogmap.put(kutya2,5);

        System.out.println(dogmap.containsKey(new Dog("pink","buksi")));

        FileOutputStream fout=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);

        out.writeObject(kutya);
        out.flush();
        System.out.println("ok");

        ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
        Dog s = (Dog)in.readObject();
        System.out.println(s);
        in.close();

    }
}
