package com.aurora.interfaceDemo.multiExtends_multiImplements;

public class ImplementsDemo implements C{
    @Override
    public void method_C() {
        System.out.println("method_C");
    }

    @Override
    public void method_A() {
        System.out.println("method_A");
    }

    @Override
    public void method_B() {
        System.out.println("method_B");
    }
}
