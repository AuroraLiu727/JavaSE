package com.aurora.method;

public class methodDemo04 {
    /*
        有参数有返回值的方法使用示例：定义一个方法，实现两个整数相加，将结果返回
     */
    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println("result = " + result);
    }

    public static int add(int a, int b){
        return a + b;
    }
}
