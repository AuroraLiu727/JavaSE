package com.aurora.common_class.StringClass;

import java.util.Scanner;

public class StringBufferPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String price = sc.next();
        StringBuffer stringBuffer = new StringBuffer(price);

        /*
            1.找到小数点的位置索引
            2.在小数点的前三位开始，循环每三位插入一个","
         */
        for (int i = stringBuffer.lastIndexOf(".") - 3; i > 0; i -= 3) {
            stringBuffer = stringBuffer.insert(i, ",");
        }

        System.out.println(stringBuffer);
    }
}
