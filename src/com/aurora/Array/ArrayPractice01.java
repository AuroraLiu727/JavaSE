package com.aurora.Array;

public class ArrayPractice01 {
    /*
        求数组中元素的最大值
     */
    public static void main(String[] args) {
        int[] arr = {5, 3, 5, 7, 4, 6, 8, 9};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("数组arr的最大值为：" + max);
    }
}
