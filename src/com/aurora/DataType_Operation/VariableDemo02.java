package com.aurora.DataType_Operation;

public class VariableDemo02 {
    /*
        int型变量加减乘除示例
     */
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        //加法
        int sum = num1 + num2;
        System.out.println(sum);

        //减法
        int sub = num1 - num2;
        System.out.println(sub);

        //乘法
        int mul = num1 * num2;
        System.out.println(mul);

        //除法
        int div = num1 / num2;
        System.out.println(div);    //3

        double div2 = num1 / num2;
        System.out.println(div2);   //3.0
    }
}
