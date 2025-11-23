package com.aurora.DataType_Operation;

public class OperatorDemo04 {
    /*
        自增自减运算符的混合使用
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int result = x++ + --y + ++x;
        System.out.println("result = " + result);
    }
}
