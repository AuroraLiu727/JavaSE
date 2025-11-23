package com.aurora.ProcessControl;

import java.util.Scanner;

public class ScannerDemo01 {
    /*
        键盘录入使用示例
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //录入int型整数
        int data1 = sc.nextInt();
        System.out.println("data1 = " + data1);

        //录入String型字符串
        String data2 = sc.next();
        System.out.println("data2 = " + data2);


    }
}
