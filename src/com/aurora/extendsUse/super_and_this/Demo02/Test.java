package com.aurora.extendsUse.super_and_this.Demo02;

public class Test {
    public static void main(String[] args) {
        //测试调用父类的无参构造
        Zi zi = new Zi();
        System.out.println("----------------");

        //测试调用父类的有参构造
        Zi zi1 = new Zi(99);
        System.out.println("-----------------");

        //测试调用父类的成员方法
        Zi zi2 = new Zi();
        zi2.method();

    }
}
