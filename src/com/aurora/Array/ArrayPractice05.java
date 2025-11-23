package com.aurora.Array;

import java.util.Random;

public class ArrayPractice05 {
    /*
        随机50个0-100之间的整数，统计偶数个数
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
