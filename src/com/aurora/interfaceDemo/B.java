package com.aurora.interfaceDemo;

public interface B {
    void method();

    default void method_default(){
        System.out.println("接口B中的默认方法");
    }
}
