package com.aurora.common_class.ArraysClass;

import java.util.Arrays;
import java.util.Comparator;

public class sortDemo04 {
    public static void main(String[] args) {
        Person person1 = new Person("Tom", 20);
        Person person2 = new Person("Jack", 10);
        Person person3 = new Person("Alice", 30);

        Person[] persons = {person1, person2, person3};

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
