package com.aurora.OOP.StaticDemo;

public class StudentDemo01 {
    public static void main(String[] args) {
        //给静态成员赋值，不需要new
        Student.classroom = "211";

        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 21;

        Student s2 = new Student();
        s2.name = "李四";
        s2.age = 20;

        //所有对象共享同一个静态变量
        System.out.println(s1.name + "," + s1.age + "岁," + s1.classroom + "班");
        System.out.println(s2.name + "," + s2.age + "岁," + s2.classroom + "班");

        //所有对象共享同一个静态变量，修改后所有变量都能看到
        s1.classroom = "985";
        System.out.println(s1.name + "," + s1.age + "岁," + s1.classroom + "班");
        System.out.println(s2.name + "," + s2.age + "岁," + s2.classroom + "班");
    }
}
