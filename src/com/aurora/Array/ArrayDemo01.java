package com.aurora.Array;

public class ArrayDemo01 {
    /*
        数组的定义
     */
    public static void main(String[] args) {
        //动态初始化
        int[] arr1 = new int[3];
        String[] arr2 = new String[3];

        //静态初始化
        int[] arr3 = new int[]{1, 2, 3, 4, 5};

        //简化静态初始化
        int[] arr4 = {1, 2, 3, 4, 5};
        String[] arr5 = {"hello", "world"};
    }
}
