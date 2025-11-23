package com.aurora.method;

public class methodDemo01 {
    /*
        无参无返回值的方法定义与调用
     */
    public static void main(String[] args) {
        hello();
        world();
        hello();
    }

    public static void hello(){
        System.out.println("hello");
    }

    public static void world(){
        System.out.println("world");
    }
}
