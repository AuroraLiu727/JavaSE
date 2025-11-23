package com.aurora.extendsUse.super_and_this.thisDemo;

public class Student {
    /*
        使用this关键字实现链式调用
     */

    private String name;
    private int age;


    public Student setName(String name) {   //注意：返回值类型为当前对象的类型Student
        this.name = name;
        return this;    //返回当前对象
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public void show() {
        System.out.println(name + "-" + age);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student
                .setName("张三")
                .setAge(18)
                .show();
    }
}
