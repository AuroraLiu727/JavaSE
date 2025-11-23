package com.aurora.OOP.ObjectArray;

public class ObjectArrayDemo01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("张三", 18);
        person[1] = new Person("李四", 20);
        person[2] = new Person("王五", 30);

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getName() + " " + person[i].getAge());
        }
    }
}
