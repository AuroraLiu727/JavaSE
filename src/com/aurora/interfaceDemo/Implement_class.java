package com.aurora.interfaceDemo;

public class Implement_class implements A,B {
    //接口A,B中有重名且参数列表相同的的method()方法，只需重写一次
    @Override
    public void method() {
        System.out.println("重写的method方法");
    }

    //在实现类中重写冲突的默认方法
    @Override
    public void method_default() {
        System.out.println("重写后的默认方法");
    }
}
