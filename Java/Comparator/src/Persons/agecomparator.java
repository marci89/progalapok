package Persons;

import java.util.Comparator;

public class agecomparator implements Comparator<Person> {


    @Override
    public int compare(Person person, Person t1) {
        if (t1.getAge() == person.getAge()) {
            return 0;
        } else if (t1.getAge() > person.getAge()) {
            return 1;
        } else
            return -1;

    }
}
