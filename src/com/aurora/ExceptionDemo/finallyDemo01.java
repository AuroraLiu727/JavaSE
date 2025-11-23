package com.aurora.ExceptionDemo;

public class finallyDemo01 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("result is " + result);
        } catch (ArithmeticException e) {
            System.out.println("捕获异常: " + e.getMessage());
        } finally {
            System.out.println("finally一定会执行");
        }
    }
}
