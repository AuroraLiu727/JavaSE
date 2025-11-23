package com.aurora.OOP.recursion;

public class recursionDemo02 {
    /*
        求n的阶乘
     */
    public static void main(String[] args) {
        int result = jiecheng(5);
        System.out.println(result);
    }

    public static int jiecheng(int n){
        if(n == 1){
            return 1;
        }else{
            return n * jiecheng(n - 1);
        }
    }
}
