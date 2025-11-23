package com.aurora.DataType_Operation;

public class TypeReverseDemo01 {
    /*
        自动类型转换
     */
    public static void main(String[] args) {
        //赋值
        float a = 1.55f;
        double b = a;   //发生自动类型转换
        System.out.println(a);
        System.out.println(b);

        //运算
        double c = 2.3;
        double sum = a + c;     //发生自动类型转换, double + float = double
        System.out.println(sum);
    }
}
