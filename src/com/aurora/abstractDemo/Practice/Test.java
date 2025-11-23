package com.aurora.abstractDemo.Practice;

public class Test {
    public static void main(String[] args) {
        //研发部(Developer)，利用构造方法赋值
        //JavaEE
        JavaEE javaEE = new JavaEE("张三", 1001);
        javaEE.work();

        //Android
        Android android = new Android("李四", 1002);
        android.work();

        System.out.println("===============================");

        //维护部(Maintainer)，利用set()方法赋值
        //Network
        Network network = new Network();
        network.setName("王五");
        network.setId(1003);
        network.work();

        //Hardware
        Hardware hardware = new Hardware();
        hardware.setName("赵六");
        hardware.setId(1004);
        hardware.work();
    }
}
