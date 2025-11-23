package com.aurora.abstractDemo.Demo;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张三", 20);
        System.out.println(teacher.getName() + "-" + teacher.getAge());
        teacher.work();
    }
}
