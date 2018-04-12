package Persons;

import java.util.Comparator;

public class namecomporator implements Comparator<Person>{

    @Override
    public int compare(Person person, Person t1) {
        return person.compareTo(t1);
    }
}
