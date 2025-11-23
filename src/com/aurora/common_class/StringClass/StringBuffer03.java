package com.aurora.common_class.StringClass;

/*
    StringBuffer->String的转换
 */

public class StringBuffer03 {
    public static void main(String[] args) {
        //方式一：使用toString
        StringBuffer stringBuffer = new StringBuffer("hello");
        String str1 = stringBuffer.toString();


        //方式二：使用构造器
        String str2 = new String(stringBuffer);
    }
}
