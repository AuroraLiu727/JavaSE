package com.aurora.common_class.StringClass;

/*
    两种创建方式的区别
 */

public class StringDemo03 {
    public static void main(String[] args) {
        String a = "ahu";
        String b = "ahu";
        System.out.println(a == b);         //true
        System.out.println(a.equals(b));    //true

        String c = new String("ahu");
        String d = new String("ahu");
        System.out.println(c == d);         //false
        System.out.println(c.equals(d));    //true

        System.out.println(a == c);         //false
        System.out.println(a.equals(c));    //true

        System.out.println(a == c.intern());    //true
        System.out.println(c == c.intern());    //false
    }
}
