package com.aurora.method;

public class methodDemo08 {
    /*
        引用数据类型做方法参数传递
     */
    public static void main(String[] args) {
        int[] arr = {10, 20};
        method(arr);
        System.out.println(arr[0]);     //20,本身被修改
        System.out.println(arr[1]);     //40,本身被修改
    }

    public static void method(int[] arr){
        arr[0] += 10;
        arr[1] += 20;

        System.out.println(arr[0]); //20
        System.out.println(arr[1]); //40
    }
}
