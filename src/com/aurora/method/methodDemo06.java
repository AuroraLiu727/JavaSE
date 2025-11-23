package com.aurora.method;

public class methodDemo06 {
    /*
        方法的重载
     */
    public static void main(String[] args) {
        sum(10, 20);
        sum(10, 20, 30);
        sum(10, 20, 30, 40);
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
}
