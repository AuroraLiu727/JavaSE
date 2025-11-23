package com.aurora.OOP.recursion;

public class recursionDemo01 {
    /*
        利用递归输出3到1
     */
    public static void main(String[] args) {
        method(3);
    }

    public static void method(int num){
        System.out.println(num);
        if (num > 1){
            method(num - 1);
        }
    }
}
