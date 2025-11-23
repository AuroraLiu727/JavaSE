package com.aurora.ExceptionDemo;

public class try_catch_Demo01 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("result is " + result);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }

        System.out.println("程序继续运行");
    }
}
