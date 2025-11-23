package com.aurora.OOP.class_object;

public class PersonDemo02 {
    /*
        匿名对象的使用
     */
    public static void main(String[] args) {
        //使用匿名对象
        new Person().eat();

        //涉及赋值时不能使用
        new Person().name = "liu";
        System.out.println(new Person().name);  //null
    }
}
