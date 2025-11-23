package com.aurora.extendsUse.super_and_this.thisDemo;

public class Person {
    int num = 10;

    public Person() {
        this(10);   //调用另一个构造方法
        System.out.println("我是Person中的无参构造");
    }

    public Person(int num) {
        this.num = num;
        System.out.println("我是Person中的有参构造");
    }

    public void method() {
//        int num = 20;
//        System.out.println("num = " + num);
//        System.out.println("this.num = " + this.num);
        this.method01();    //调用另一个方法
        System.out.println("我是Person中的method方法");
    }

    public void method01(){
        System.out.println("我是Person中的method01方法");
    }
}
