package com.aurora.Array;

import java.util.Scanner;

public class ArrayPractice06 {
    /*
        键盘录入一个整数，找出整数在数组中存储的索引位置
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 2};
        System.out.println("请输入要查询的数据：");
        int data = sc.nextInt();
        int flag = 0;   //用来标记是否查询到结果
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                flag = 1;
                System.out.println(i);
            }
        }

        if (flag == 0){
            System.out.println(-1);
        }
    }
}
