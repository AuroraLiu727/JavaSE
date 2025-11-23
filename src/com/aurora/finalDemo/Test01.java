package com.aurora.finalDemo;

public class Test01 {
    /*
        final修饰局部变量示例
     */
    public static void main(String[] args) {
        final int i = 10;
//        i = 100;  //不能修改

        final int j;
        j = 10;     //首次赋值，可以
//        j = 100;  //错误，不能再次赋值
    }
}
