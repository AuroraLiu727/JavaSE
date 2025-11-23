package com.aurora.Polymorphism.Demo01;

public class Test {

    public static void drive(Vehicle vehicle) {
        vehicle.run();
    }
    public static void main(String[] args) {
        //多态形式的new对象
        Vehicle a1 = new Car();  // Car，但被当成Vehicle大类看
        Vehicle a2 = new Bike();  //Bike ，但被当成Vehicle大类看

//        a1.run();
//        a2.run();

        drive(a1);
        drive(a2);

    }
}
