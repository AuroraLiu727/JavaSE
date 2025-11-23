package com.aurora.method;

public class methodDemo05 {
    /*
        变量作为实参使用：定义一个方法，比较两个整数的大小，如果第一个比第二个大，返回true，否则返回false
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean result = compare(a, b);
        System.out.println("result = " + result);
    }

    public static boolean compare(int a, int b){
        if(a > b){
            return true;
        }else{
            return false;
        }
    }
}
