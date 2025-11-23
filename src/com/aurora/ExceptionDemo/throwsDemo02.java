package com.aurora.ExceptionDemo;

public class throwsDemo02 {
    public static void main(String[] args) {
//        try {
//            method();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.toString());
//        } catch (ArithmeticException e) {
//            System.out.println(e.toString());
//        }

        try {
            method();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.toString());
        }
    }

    public static void method() throws ArrayIndexOutOfBoundsException, ArithmeticException {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);
        int result = 10 / 0;    //不会执行到这里
    }
}
