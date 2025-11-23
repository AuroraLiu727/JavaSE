package com.aurora.common_class.StringClass;

/*
    String和StringBuffer的相互转换
 */

public class StringBuffer02 {
    public static void main(String[] args) {
        //String->StringBuffer
        //方式一：使用构造器
        String str = "hello";
        StringBuffer stringBuffer1 = new StringBuffer(str);

        //方式二：使用append方法
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("hello");
    }
}
