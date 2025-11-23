package com.aurora.ExceptionDemo;

public class ExceptionMethodDemo01 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("result:" + result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
