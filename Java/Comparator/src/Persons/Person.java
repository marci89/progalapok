package Persons;

import java.io.Serializable;

public class Person implements Serializable, Comparable<Person> {
    private int id;
    private  String name;
    private int age;
    private int tailwiggle;

    public Person(int id, String name, int age, int tailwiggle) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tailwiggle = tailwiggle;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Persons.Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", tailwiggle=" + tailwiggle +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTailwiggle() {
        return tailwiggle;
    }

    public void setTailwiggle(int tailwiggle) {
        this.tailwiggle = tailwiggle;
    }

    @Override
    public int compareTo(Person person) {
        if (name.equals(person.name)) {
            return 0;
        } else if (name.compareTo(person.name) >0) {
            return 1;
        } else
        return -1;
    }
}
/*
       if (age == person.age) {
               return 0;
               } else if (age > person.age) {
               return 1;
               } else
               return -1;
               }
               */