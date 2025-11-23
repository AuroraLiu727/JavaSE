package com.aurora.abstractDemo.Demo;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " is working...");
    }
}
