package com.aurora.DataType_Operation;

public class OperatorDemo02 {
    /*
        利用"+"进行字符串拼接
     */
    public static void main(String[] args) {
        int i = 10;
        int j = 3;

        System.out.println(i + "" + j);     //由于""的参与，变成了字符串拼接，将"10"与空字符""拼接，再与"3"拼接

        System.out.println("i和j相加之和为:" + (i+j));
    }
}
