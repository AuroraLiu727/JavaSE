package com.aurora.OOP.class_object;

public class Citizen {
    //姓名
    String name;

    /*
        生日 MyDate类型
        MyDate属于自定义类型(引用数据类型)，在操作之前需要new对象再赋值，
        如果不new对象就直接赋值，会出现空指针异常(NullPointerException)
        空指针异常：当一个对象为null时，再调用此对象中的其他成员
     */
    MyDate birthday = new MyDate();

    //身份证
    String idCard;
}
