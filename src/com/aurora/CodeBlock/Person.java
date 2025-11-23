package com.aurora.CodeBlock;

public class Person {

    //构造方法
    public Person() {
        System.out.println("无参构造方法执行");
    }

    //构造代码块
    {
        System.out.println("构造代码块执行");
    }

    //静态代码块
    static {
        System.out.println("静态代码块执行");
    }
}
