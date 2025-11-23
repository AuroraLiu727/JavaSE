package com.aurora.OOP.fengzhuang.thisDemo01;

public class Person {
    String name;

    public void speak(String name){
        System.out.println(this);
        System.out.println(name + "您好，我是" + this.name);
    }
}
