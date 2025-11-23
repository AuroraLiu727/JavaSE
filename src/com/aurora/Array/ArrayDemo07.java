package com.aurora.Array;

public class ArrayDemo07 {
    /*
        数组越界异常
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[0]);     //1
        //System.out.println(arr[3]);     //ArrayIndexOutOfBoundsException
    }
}
