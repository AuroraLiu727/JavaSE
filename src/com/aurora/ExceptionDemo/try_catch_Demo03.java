package com.aurora.ExceptionDemo;

public class try_catch_Demo03 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
            int result = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("出现了数组越界或除零异常");
        }
    }
}
