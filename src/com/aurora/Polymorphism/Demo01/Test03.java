package com.aurora.Polymorphism.Demo01;

public class Test03 {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        Car c = (Car) v;
        c.run();
    }
}
