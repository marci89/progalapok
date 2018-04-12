package Persons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class Personmain {


    public static void main(String[] args)  {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person(10, "jozsi",10,11));
        list.add(new Person(2, "jozsi2",28,34));
        list.add(new Person(3, "ati",30,21));
        list.add(new Person(5, "bela",13,4));
        list.add(new Person(6, "jozsi5",11,5));
        Collections.sort(list);

        for (int i =0; i<list.size();i++) {
            System.out.println(list.get(i));
        }

      Collections.sort(list, new agecomparator());
        for (Person person :list) {

            System.out.println(person);
        }




    }
}
