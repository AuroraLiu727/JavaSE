package com.aurora.Polymorphism.Demo01;

public class Test02 {
    public static void main(String[] args) {
        //向上转型
//        Car car = new Car();
//        Vehicle v1 = car;   //向上转型
//        car.run();          //调用Car的run()，体现多态

        //向下转型
        Vehicle v2 = new Car();
        Car c = (Car) v2;
        c.run();
        //v2.special();     //向下转型之前不能直接调用子类的特有方法
        c.special();        //向下转型之后可以调用子类的特有方法
    }
}
