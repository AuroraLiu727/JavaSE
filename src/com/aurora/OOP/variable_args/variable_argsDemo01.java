package com.aurora.OOP.variable_args;

public class variable_argsDemo01 {
    /*
        可变参数的使用
     */
    public static void main(String[] args) {
        sum(1, 2, 3, 4, 5);
        sum1(1, 1, 1, 2, 3, 4, 5);
    }

    //可变参数
    public static void sum(int... arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    //可变参数与普通参数结合使用
    public static void sum1(int a, int b, int... arr){
        int sum = 0;
        sum += a;
        sum += b;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
