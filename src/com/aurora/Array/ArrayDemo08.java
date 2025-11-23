package com.aurora.Array;

public class ArrayDemo08 {
    /*
        空指针异常示例
     */
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr.length); //3

        arr = null;
        System.out.println(arr.length); //NullPointerException
    }
}
