package com.aurora.common_class.Practice;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        countStr(str);
    }

    public static void countStr(String str) {
        if (str == null) {
            System.out.println("字符串不能为空");
            return;
        }

        int upperCount = 0;
        int lowerCount = 0;
        int numCount = 0;
        int otherCount = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {upperCount++;}
            else if (chars[i] >= 'a' && chars[i] <= 'z') {lowerCount++;}
            else if (chars[i] >= '0' && chars[i] <= '9') {numCount++;}
            else {otherCount++;}
        }

        System.out.println("大写字母的个数 = " + upperCount);
        System.out.println("小写字母的个数 = " + lowerCount);
        System.out.println("数字的个数 = " + numCount);
        System.out.println("其他字符的个数 = " + otherCount);
    }
}
