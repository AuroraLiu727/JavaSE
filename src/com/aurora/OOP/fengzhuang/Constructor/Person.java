package com.aurora.OOP.fengzhuang.Constructor;

public class Person {
    private String name;
    private int age;

    //无参构造
    public Person(){
        System.out.println("无参构造");
    }

    //有参构造
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return  this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
