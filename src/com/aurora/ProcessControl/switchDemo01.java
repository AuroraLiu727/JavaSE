package com.aurora.ProcessControl;

import java.util.Scanner;

public class switchDemo01 {
    /*
        switch基本用法
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个整数：");
        int data = sc.nextInt();
        switch (data) {
            case 1:
                System.out.println("a");
                break;
            case 2:
                System.out.println("b");
                break;
            case 3:
                System.out.println("c");
                break;
            default:
                System.out.println("d");
                break;
        }
    }
}
