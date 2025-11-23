package com.aurora.interfaceDemo;

public interface USB {
    //抽象方法
    public abstract void open();
    public abstract void close();

    //默认方法
    public default void method_default(){
        System.out.println("我是默认方法");
    }

    //静态
    public static void method_static(){
        System.out.println("我是静态方法");
    }

    //成员变量
    public static final int NUM1 = 10;
    int NUM2 = 20;  //不写public static final默认也有
}
