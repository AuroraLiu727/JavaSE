package com.aurora.extendsUse.super_and_this.Demo02;

public class Fu {

    int num = 10;

    public Fu(){
        System.out.println("我是父类中的无参构造方法");
    }

    public Fu(int data){
        System.out.println("我是父类中的有参构造方法，data = " + data);
    }

    public void method(){
        System.out.println("我是父类中的method方法");
    }
}
