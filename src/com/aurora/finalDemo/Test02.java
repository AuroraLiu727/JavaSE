package com.aurora.finalDemo;

public class Test02 {
    /*
        final修饰成员变量的赋值时机
     */

    //1.直接赋值
    //final int x = 10;

    //2.在构造函数中赋值
    final int y;

    public Test02(int y) {
        this.y = y;
    }

    //3.在初始化块中赋值
    final int z;
    {z = 10;}
}
