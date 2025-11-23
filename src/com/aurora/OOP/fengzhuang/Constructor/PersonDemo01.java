package com.aurora.OOP.fengzhuang.Constructor;

public class PersonDemo01 {
    /*
        构造方法：有参构造与无参构造
     */
    public static void main(String[] args) {
        //无参构造的使用
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(18);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        //有参构造的使用
        Person person2 = new Person("李四", 20);
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
    }
}
