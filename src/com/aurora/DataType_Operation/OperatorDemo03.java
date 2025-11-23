package com.aurora.DataType_Operation;

public class OperatorDemo03 {
    /*
        自增自减运算符的使用
     */
    public static void main(String[] args) {
        int i = 10;
        i++;
        System.out.println("i = " + i);

        int j = 10;
        ++j;
        System.out.println("j = " + j);

        int x = 10;
        x--;
        System.out.println("x = " + x);

        int y = 10;
        y--;
        System.out.println("y = " + y);

        int z = 10;
        z = z++;
        System.out.println("z = " + z);

        int t = 10;
        t = ++t;
        System.out.println("t = " + t);
    }
}
