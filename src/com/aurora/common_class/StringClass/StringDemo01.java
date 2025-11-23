package com.aurora.common_class.StringClass;

public class StringDemo01 {
    public static void main(String[] args) {
        String name = "Jack";
        name = "Tom";
        System.out.println(name);

        final char[] value = {'a', 'b', 'c'};
        value[0] = 'd';
        System.out.println(value);

        char[] value2 = {'e', 'f', 'g'};
//        value = value2;       //报错
    }
}
