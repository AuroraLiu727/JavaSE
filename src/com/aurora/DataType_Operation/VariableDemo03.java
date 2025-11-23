package com.aurora.DataType_Operation;

public class VariableDemo03 {
    /*
        浮点型变量的加减乘除示例
     */
    public static void main(String[] args) {
        float a = 10;
        float b = 3;

        float result = a / b;
        System.out.println(result); //3.3333333

        double c = 10;
        double d = 3;
        double result2 = c / d;
        System.out.println(result2);    //3.3333333333333335

        float x = 3.55F;
        float y = 2.12F;
        float result3 = x - y;
        System.out.println(result3);    //1.4300001
    }

}
