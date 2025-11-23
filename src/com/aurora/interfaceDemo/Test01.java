package com.aurora.interfaceDemo;

public class Test01 {
    public static void main(String[] args) {
        ////抽象方法使用
        Mouse mouse = new Mouse();
        mouse.open();
        mouse.close();

        //默认方法使用
        mouse.method_default();

        //静态方法使用
        USB.method_static();

        //成员变量使用
        System.out.println(USB.NUM1);
        System.out.println(USB.NUM2);
    }
}
