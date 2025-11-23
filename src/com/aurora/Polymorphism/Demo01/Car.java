package com.aurora.Polymorphism.Demo01;

public class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("汽车在行驶");
    }

    //子类的特有方法
    void special(){
        System.out.println("子类的特有方法");
    }
}
