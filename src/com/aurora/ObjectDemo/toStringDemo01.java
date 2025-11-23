package com.aurora.ObjectDemo;

public class toStringDemo01 {
    public static void main(String[] args) {
        Person person = new Person("Tom", 20);
        //不写toString也默认调用
        System.out.println(person);
        //写toString
        System.out.println(person.toString());  //因为person类默认继承了Object类，所以可以直接写p.toString()去调用
    }
}
