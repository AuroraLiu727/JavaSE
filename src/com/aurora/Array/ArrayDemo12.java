package com.aurora.Array;

public class ArrayDemo12 {
    /*
        在二维数组中存储元素
     */
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
    }
}
