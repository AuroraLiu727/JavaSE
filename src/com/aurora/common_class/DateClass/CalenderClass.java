package com.aurora.common_class.DateClass;

import java.util.Calendar;

public class CalenderClass {
    public static void main(String[] args) {
        //1.创建对象
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);

        //2.获取日历对象的某个日历字段
        System.out.println("年: " + calendar.get(Calendar.YEAR));
        System.out.println("月: " + calendar.get(Calendar.MONTH) + 1);   //+1的原因是Calender返回月时，从0开始编号
        System.out.println("日: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("时(12小时制): " + calendar.get(Calendar.HOUR));    //12小时制的
        System.out.println("时(24小时制): " + calendar.get(Calendar.HOUR_OF_DAY));  //24小时制
        System.out.println("分: " + calendar.get(Calendar.MINUTE));
        System.out.println("秒: " + calendar.get(Calendar.SECOND));

        //3.只能手动格式化输出
        System.out.println(calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-" +
                calendar.get(Calendar.DAY_OF_MONTH) + "-" + calendar.get(Calendar.HOUR_OF_DAY) + "-" +
                calendar.get(Calendar.MINUTE) + "-" + calendar.get(Calendar.SECOND));
    }
}
