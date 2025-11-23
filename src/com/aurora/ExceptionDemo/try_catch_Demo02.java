package com.aurora.ExceptionDemo;

public class try_catch_Demo02 {
    public static void main(String[] args) {
        //使用try catch捕获多个异常
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);     //数组越界，跳转到第一个catch
            int result = 10 / 0;            //不会执行到这里
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }
    }
}
