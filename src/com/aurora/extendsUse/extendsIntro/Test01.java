package com.aurora.extendsUse.extendsIntro;

public class Test01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "张三";
        teacher.age = 23;
        System.out.println(teacher.name + "\t" + teacher.age);
        teacher.work();
        //teacher.eat();    //报错，子类继承父类后不能使用父类的私有成员，只能使用父类的非私有成员

        Manager manager = new Manager();
        manager.name = "李四";
        manager.age = 23;
        System.out.println(manager.name + "\t" + manager.age);
        manager.work();
    }
}
