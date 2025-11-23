package com.aurora.OOP.fengzhuang.thisDemo01;

public class PersonDemo01 {
    /*
        哪个对象调用的this所在的方法，this就代表哪个对象
     */
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1);
        person1.name = "张三";
        person1.speak("李四");


        Person person2 = new Person();
        System.out.println(person2);
        person2.name = "王五";
        person2.speak("赵六");

    }
}
