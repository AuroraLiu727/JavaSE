package com.aurora.ObjectDemo;

public class cloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        clonePerson person1 = new clonePerson("Tom", 20);
        clonePerson person2 = (clonePerson) person1.clone();

        System.out.println(person1 == person2);     //false
        System.out.println(person1.equals(person2));    //true
    }
}
