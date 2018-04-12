import Persons.Person;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {

   transient private String color;
    private  String name;
    private Person gazdi;

    public Dog(String color, String name, Person person) {
        this.color = color;
        this.name=name;
        this.gazdi = person;


    }


    public Dog(String color, String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;

        Dog dog = (Dog) o;

        if (!color.equals(dog.color)) return false;
        return name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    public  boolean equals (Dog dog) {
        if (dog == null) {
            return false;
        } else if (dog instanceof Dog) {

            if (((Dog) dog).getColor().equals(this.getColor())) {
                return true;

            }
        }
        return false;
    }



    public  String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}



