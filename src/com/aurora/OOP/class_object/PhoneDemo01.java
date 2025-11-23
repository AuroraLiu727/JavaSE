package com.aurora.OOP.class_object;

public class PhoneDemo01 {
    /*
        调用手机类
     */
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "vivo";
        phone.color = "blue";
        phone.price = 3099;

        System.out.println(phone.brand);
        System.out.println(phone.color);
        System.out.println(phone.price);

        phone.call("liu");
        String s = phone.message();
        System.out.println(s);
    }
}
