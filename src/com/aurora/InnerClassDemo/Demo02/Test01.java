package com.aurora.InnerClassDemo.Demo02;

public class Test01 {
    public static void main(String[] args) {
        //需要先创建外部类实例
        Person person = new Person();
        Person.Heart heart = person.new Heart();

        //调用内部类的方法
        heart.jump();
    }
}
