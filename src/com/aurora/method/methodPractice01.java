package com.aurora.method;

import java.util.Scanner;

public class methodPractice01 {
    /*
        判断奇偶性
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        String result = method(data);
        System.out.println(result);
    }

    public static String method(int data){
        if(data % 2 == 0){
            return "偶数";
        }else{
            return "奇数";
        }
    }
}
