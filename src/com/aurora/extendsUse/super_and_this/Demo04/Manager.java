package com.aurora.extendsUse.super_and_this.Demo04;

public class Manager extends Employee{
    public Manager() {
    }

    public Manager(String name, int age) {
        super(name, age);
    }

    //Manager中不需要单独写Getter/Setter方法，因为可以直接从父类Employee中继承过来
}
