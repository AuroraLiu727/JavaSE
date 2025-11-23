package com.aurora.OOP.class_object;

public class PersonDemo01 {
    /*
        调用Person类
     */
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);

        person.name = "liu";
        person.age = 21;
        System.out.println(person.name);
        System.out.println(person.age);

        person.eat();
        String s = person.sleep();
        System.out.println(s);
    }
}
