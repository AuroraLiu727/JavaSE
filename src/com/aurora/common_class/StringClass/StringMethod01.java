package com.aurora.common_class.StringClass;

/*
    String的常用方法
 */

public class StringMethod01 {
    public static void main(String[] args) {
        //1.equals
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));  //false

        //2.equalsIgnoreCase,可用于登录
        String name = "joHn";
        if ("john".equalsIgnoreCase(name)) {
            System.out.println("Success!");     //Success
        } else  {
            System.out.println("Fail!");
        }

        //3.length
        System.out.println("ahu".length());     //3

        //4.indexof
        String s1 = "eahu@fjahu@fjk";
        int index1 = s1.indexOf("@");    //4
        System.out.println(index1);      //获取字符串的位置
        System.out.println(s1.indexOf("ahu"));  //1

        //5.lastIndexof
        int index2 = s1.lastIndexOf("@");
        System.out.println(index2);     //10
        System.out.println(s1.lastIndexOf("ahu"));  //7

        //6.substring,截取指定范围的字符串
        String str3 = "Hello,World";
        System.out.println(str3.substring(6));  //截取从索引6（包含）之后的所有内容。World
        System.out.println(str3.substring(0,5));    //截取从索引0（包含）到索引5（不包含）之间的所有内容.Hello
    }
}
