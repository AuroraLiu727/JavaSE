package com.aurora.interfaceDemo.ClassExtends_multiImplements;

public class Zi extends Fu implements InterfaceA, InterfaceB{
    //重写接口InterfaceA, InterfaceB中的抽象方法

    @Override
    public void method_InterfaceA() {
        System.out.println("method_InterfaceA");
    }

    @Override
    public void method_InterfaceB() {
        System.out.println("method_InterfaceB");
    }

    //子类自己的方法
    public void method_Zi(){
        System.out.println("method_Zi");
    }
}
