package com.aurora.common_class.WrapperClass;

public class IntegerPractice {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);     //false

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);     //true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);     //false

        Integer u = 127;
        Integer v = 127;
        System.out.println(u == v);     //true

        Integer a = 128;
        int b = 128;
        System.out.println(a == b);     //true
    }
}
