package com.aurora.OOP.class_object;

/*
    Person类
 */
public class Person {
    //属性->成员变量
    String name;
    int age;

    //行为->成员方法
    public void eat(){
        System.out.println("吃饭");
    }

    public String sleep(){
        return "睡觉";
    }

}
