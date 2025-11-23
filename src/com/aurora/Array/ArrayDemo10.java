package com.aurora.Array;

public class ArrayDemo10 {
    /*
        二维数组的长度
     */
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        //二维数组的长度
        System.out.println(arr.length);

        //二维数组中每个一维数组的长度
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].length);  //arr[i]表示每个一维数组
        }
    }
}
