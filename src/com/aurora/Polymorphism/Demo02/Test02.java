package com.aurora.Polymorphism.Demo02;

public class Test02 {
    public static void main(String[] args) {
        //向上转型
        Child child = new Child();
        Parent p = child;   //向上转型
//        p.show();           //调用child的show()，体现多态

        //向下转型
        Parent p1 = new Child();
        Child c = (Child) p1;
        c.show();
    }
}
