package com.aurora.common_class.StringClass;

public class StringBufferTest1 {
    public static void main(String[] args) {
        //append(null)可执行
        String str = null;
        StringBuffer stringBuffer1 = new StringBuffer();    //ok
        stringBuffer1.append(str);  //ok
        System.out.println(stringBuffer1);  //null

        //new StringBuffer(null)不可执行
        StringBuffer stringBuffer2 = new StringBuffer(str);
        System.out.println(stringBuffer2);
    }
}
