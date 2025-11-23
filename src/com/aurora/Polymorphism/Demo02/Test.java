package com.aurora.Polymorphism.Demo02;

public class Test {
    public static void main(String[] args) {
        //多态
        Parent p = new Child();

        //调用成员变量
        System.out.println(p.num);

        //调用成员方法
        p.show();

        //不能调用子类的特有方法
        //p.special();  //报错
    }
}
