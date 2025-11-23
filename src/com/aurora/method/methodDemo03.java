package com.aurora.method;

public class methodDemo03 {
    /*
        无参数有返回值的方法使用示例：定义一个方法，实现两个整数相加，将结果返回
     */
    public static void main(String[] args) {
        int sum = add();
        System.out.println("sum = " + sum);
    }

    public static int add(){
        int a = 10;
        int b = 20;
        return a + b;
    }
}
