package com.aurora.ProcessControl;

import java.util.Scanner;

public class ScannerDemo02 {
    /*
        sc.nextLine()的使用
     */
    public static void main(String[] args) {
        //录入包含空白符的一整行数据
        Scanner sc = new Scanner(System.in);

        String data3 = sc.nextLine();
        System.out.println("data3 = " + data3);
    }
}
