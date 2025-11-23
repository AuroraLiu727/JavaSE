package com.aurora.method;

public class methodDemo07 {
    /*
        基本数据类型做方法参数传递示例
     */
    public static void main(String[] args) {
        int a = 10, b = 20;
        method(a, b);
        System.out.println(a);  //10,不变
        System.out.println(b);  //20,不变
    }

    public static void method(int a, int b){
        a += 10;
        b += 20;
        System.out.println(a);  //20
        System.out.println(b);  //40
    }
}
