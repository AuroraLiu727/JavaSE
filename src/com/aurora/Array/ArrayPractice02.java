package com.aurora.Array;

import java.util.Random;

public class ArrayPractice02 {
    /*
        随机10个整数填入数组，统计既是3又是5，但不是7的倍数的个数
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0 && arr[i] % 5 ==0 && arr[i] % 7 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
