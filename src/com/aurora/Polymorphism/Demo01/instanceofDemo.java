package com.aurora.Polymorphism.Demo01;

public class instanceofDemo {
    public static void main(String[] args) {
        //类型正确时
        System.out.println("================类型正确时================");
        Vehicle v1 = new Car();
        if (v1 instanceof Car){
            Car c1 = (Car) v1;
            c1.run();
        } else {
            System.out.println("不是Car类型，不能转型");
        }

        //类型不正确时
        System.out.println("================类型不正确时=================");
        Vehicle v2 = new Bike();
        if (v2 instanceof Car){
            Car c2 = (Car) v2;
            v2.run();
        } else {
            System.out.println("不是Car类型，不能转型");
        }
    }
}
