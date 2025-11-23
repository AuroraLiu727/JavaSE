package com.aurora.Array;

import java.util.Scanner;

public class ArrayPractice03 {
    /*
        用一个数组存储本组学院的姓名，从键盘输入，并遍历显示
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[3];
        for (int i = 0; i < name.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的姓名：");
            name[i] = sc.next();
        }

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
