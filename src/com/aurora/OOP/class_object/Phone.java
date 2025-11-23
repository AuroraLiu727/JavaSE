package com.aurora.OOP.class_object;

public class Phone {
    String brand;
    String color;
    int price;

    public void call(String name){
        System.out.println("给" + name + "打电话");
    }

    public String message(){
        return "发短信";
    }
}
