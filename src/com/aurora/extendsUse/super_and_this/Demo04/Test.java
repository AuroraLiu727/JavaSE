package com.aurora.extendsUse.super_and_this.Demo04;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        //使用set方法赋值
        teacher.setName("张三");
        teacher.setAge(18);
        System.out.println(teacher.getName() + "--"  + teacher.getAge());
    }
}
