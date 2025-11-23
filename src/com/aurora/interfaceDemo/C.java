package com.aurora.interfaceDemo;

public interface C extends A, B{
    void method_C();

    //需要重写重名的默认方法
    @Override
    default void method_default() {
        A.super.method_default();   //指定使用接口A中的抽象方法
    }
}
