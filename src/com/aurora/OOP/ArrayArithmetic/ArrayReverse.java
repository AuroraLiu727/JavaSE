package com.aurora.OOP.ArrayArithmetic;

public class ArrayReverse {
    /*
        数组翻转
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int min = 0, max = arr.length - 1; min <= max; min++, max--){
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
