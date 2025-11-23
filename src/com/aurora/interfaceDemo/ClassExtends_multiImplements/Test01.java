package com.aurora.interfaceDemo.ClassExtends_multiImplements;

public class Test01 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method_Zi();     //子类自己的方法
        zi.method_Fu();     //从父类继承来的方法
        zi.method_InterfaceA();     //实现InterfaceA时重写的InterfaceA里的抽象方法
        zi.method_InterfaceB();     //实现InterfaceB时重写的InterfaceB里的抽象方法
    }
}
