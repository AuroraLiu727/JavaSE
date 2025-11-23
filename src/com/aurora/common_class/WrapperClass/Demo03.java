package com.aurora.common_class.WrapperClass;

/*
    String类型与包装类型相互转换
 */

public class Demo03 {
    public static void main(String[] args) {
        //包装类型(以Integer为例)->String类型
        System.out.println("===============包装类型->String==============");
        Integer i = 100;
        //方法一：直接加""
        String str1 = i + "";
        System.out.println("str1 = " + str1);

        //方法二：toString方法
        String str2 = i.toString();
        System.out.println("str2 = " + str2);

        //方法三：String的valueOf()方法
        String str3 = String.valueOf(i);
        System.out.println("str3 = " + str3);


        //String类型转换为包装类型(以Integer为例)
        System.out.println("===============String->包装类型===================");
        String str = "123";
        //方法一：使用valueOf(）方法
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //方法二：使用parseXXX()方法
        Integer integer2 = Integer.parseInt(str);
        System.out.println("integer2 = " + integer2);

        //方法三：使用构造方法
        Integer integer3 = new Integer(str);
        System.out.println("integer3 = " + integer3);
    }
}
