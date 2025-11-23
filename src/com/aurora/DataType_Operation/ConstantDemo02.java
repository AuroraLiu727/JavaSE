package com.aurora.DataType_Operation;

public class ConstantDemo02 {
    /*
    * 带有运算符的常量
    * */
    public static void main(String[] args) {
        System.out.println(10 + 3);
        System.out.println(10 - 3);
        System.out.println(10 * 3);

        System.out.println(10 / 3);     //结果保留整数
        // 除数与被除数中，只要有一个数带小数点，结果就是正常小数了
        System.out.println(10.0 / 3);
        System.out.println(10 / 3.0);
        System.out.println(10.0 / 3.0);

    }
}
