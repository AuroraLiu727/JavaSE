package com.aurora.Polymorphism.Demo02;

public class Child extends Parent{
    int num =  20;

    @Override
    void show() {
        System.out.println("子类的show()");
    }

    void special(){
        System.out.println("子类的特有方法");
    }
}
