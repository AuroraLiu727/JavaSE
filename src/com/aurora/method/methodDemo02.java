package com.aurora.method;

public class methodDemo02 {
    /*
        有参数无返回值的方法示例：定义一个方法，实现两个整数相加
     */
    public static void main(String[] args) {
        add(10, 20);

    }

    public static void add(int a, int b){
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
}
