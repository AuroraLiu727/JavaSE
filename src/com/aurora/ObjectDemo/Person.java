package com.aurora.ObjectDemo;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    //重写equals方法

    @Override
    public boolean equals(Object obj) {
        //1. 判断是否为同一个对象
        if (this == obj) return true;
        //2. 判断obj是否为person类型
        if (obj instanceof Person) {
            Person p = (Person) obj;    //向下强转类型
            //3. 比较主要属性
            return this.name.equals(p.name) && this.age == p.age;
        }

        //不是同类对象，返回false
        return false;
    }
    
}
