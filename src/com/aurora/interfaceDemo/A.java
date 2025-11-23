package com.aurora.interfaceDemo;

public interface A {
    void method();

    default void method_default(){
        System.out.println("接口A中的默认方法");
    }
}
