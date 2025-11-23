package com.aurora.enum_;

//演示enum的各种方法

public class enumMethod {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;

        //1. 输出枚举对象的名字
        System.out.println("枚举对象的名字：" + season.name());  //注意是name()，如果写成name输出的是AUTUMN的name属性

        //2. 输出枚举对象的次序/编号，从0开始编号,AUTUMN枚举对象时第三个，因此输出2
        System.out.println("枚举对象的编号：" + season.ordinal());

        //3.values()方法，返回所有对象的数组
        Season[] values = Season.values();
        System.out.println("==========遍历取出枚举对象（增强for循环）==============");
        for (Season s : values) {
            System.out.println(s);
        }

        //4. compareTo()方法：比较两个枚举对象,返回的是两个枚举对象编号之差
        System.out.println("枚举对象编号之差：" + Season.AUTUMN.compareTo(Season.WINTER));
    }
}
