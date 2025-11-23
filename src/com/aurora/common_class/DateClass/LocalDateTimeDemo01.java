package com.aurora.common_class.DateClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo01 {
    public static void main(String[] args) {
        //1.创建表示当前时间的LocalDateTime对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);    //2025-11-18T21:28:46.438

        //2.获取年月日时分秒
        System.out.println("年 = " + ldt.getYear());
        System.out.println("月 = " + ldt.getMonth());        //月 = NOVEMBER
        System.out.println("月 = " + ldt.getMonthValue());   //月 = 11
        System.out.println("日 = " + ldt.getDayOfMonth());
        System.out.println("时 = " + ldt.getDayOfYear());
        System.out.println("分 = " + ldt.getDayOfWeek());
        System.out.println("秒 = " + ldt.getDayOfMonth());

        //3.使用DateTimeFormatter对象来格式化日期
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format1 = dtf.format(ldt);    //方式一：格式化器调用 format()
        String format2 = ldt.format(dtf);         //方式二：日期对象调用 format()
        System.out.println(format1);
        System.out.println(format2);
        //System.out.println(ldt.format(DateTimeFormatter.ISO_DATE_TIME));  //内置格式进行格式化

        //4.对当前日加减
        LocalDateTime tomorrow = LocalDateTime.now().plusDays(1);   //加一天
        System.out.println("tomorrow =  " + tomorrow);

        LocalDateTime past = LocalDateTime.now().minusHours(1);     //减一小时
        System.out.println("past = " + past);
    }
}
