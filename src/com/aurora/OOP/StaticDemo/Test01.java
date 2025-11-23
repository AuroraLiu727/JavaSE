package com.aurora.OOP.StaticDemo;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
    }

    public static void method01(){
        //同一类中的静态成员访问静态成员
        method02();     //直接调用
        Test01.method02();  //类名调用

        //不同类中的静态成员访问静态成员
        Person.drink();     //类名调用
    }

    public static void method02(){

    }
    public void method03(){
        //同类中非静态方法访问静态方法
        method01();         //直接调用
        Test01.method01();  //类名调用

        //不同类中
        Person.drink();     //类名调用
    }

    public void method04(){
        //同一类中非静态访问非静态
        method03();     //直接调用
        new Test01().method03();    //对象调用(因为这是非静态方法，不能直接类名点调用)

        //不同类中非静态访问非静态
        new Person().eat();     //只能new对象调用
    }

}
