package com.aurora.common_class.StringClass;

/*
    String、StringBuffer、StringBuilder的效率测试
 */

public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;

        //String拼接100000次
        String text = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String拼接100000次的执行时间" + (endTime - startTime) + "ms");

        //StringBuffer拼接100000次
        StringBuffer stringBuffer = new StringBuffer("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer拼接100000次的执行时间"  + (endTime - startTime) + "ms");

        //StringBuilder拼接100000次
        StringBuilder stringBuilder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder拼接100000次的执行时间"  + (endTime - startTime) + "ms");
    }
}
