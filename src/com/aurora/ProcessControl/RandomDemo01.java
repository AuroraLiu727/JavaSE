package com.aurora.ProcessControl;

import java.util.Random;

public class RandomDemo01 {
    /*
        Random的使用示例
     */
    public static void main(String[] args) {
        Random random = new Random();

        //在int范围内生成随机数
        int data1 = random.nextInt();
        System.out.println("data1 = " + data1);

        //在0-10之间生成随机数
        int data2 = random.nextInt(10);
        System.out.println("data2 = " + data2);

        //在100-999之间生成随机数
        int data3 = random.nextInt(900) + 100;
        System.out.println("data3 = " + data3);
    }
}
