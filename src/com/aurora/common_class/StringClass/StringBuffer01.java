package com.aurora.common_class.StringClass;

public class StringBuffer01 {
    public static void main(String[] args) {
        //1. 创建一个 大小为 16的 char[] ,用于存放字符内容
        StringBuffer stringBuffer1 = new StringBuffer();

        //2 通过构造器指定 char[] 大小
        StringBuffer stringBuffer2 = new StringBuffer(100);

        //3. 通过 给一个String 创建 StringBuffer, char[] 大小就是 str.length() + 16
        StringBuffer hello = new StringBuffer("hello");
    }
}
