package com.aurora.DataType_Operation;

public class VariableDemo01 {
    /*
        8种基本数据类型的使用示例
     */
    public static void main(String[] args) {

        // byte
        byte num1 = 100;
        System.out.println(num1);

        //short
        short num2 = 1000;
        num2 = 1001;
        System.out.println(num2);

        //int 整数的默认类型
        int num3 = 10000;
        num3 = 1;
        System.out.println(num3);

        //long
        long num4 = 10L;
        System.out.println(num4);

        //float
        float num5 = 2.5F;
        System.out.println(num5);

        //double 小数的默认类型
        double num6 = 2.5;
        System.out.println(num6);

        //char
        char num7 = 'a';
        System.out.println(num7);

        //boolean
        boolean num8 = true;
        boolean num9 = false;
        System.out.println(num8);
        System.out.println(num9);

        //String
        String name = "liu";
        System.out.println(name);
    }
}
