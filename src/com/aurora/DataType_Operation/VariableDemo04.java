package com.aurora.DataType_Operation;

public class VariableDemo04 {
    /*
        变量的作用域
     */
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);

        {
            int b = 1;
            System.out.println(a);  //小作用域中可以访问大作用域中的变量
        }

        //System.out.println(b);    //报错！大作用域中不可以直接访问小作用域中的变量
    }
}
