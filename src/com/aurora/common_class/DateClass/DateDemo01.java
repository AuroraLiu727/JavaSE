package com.aurora.common_class.DateClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) throws ParseException {
        //获取当前系统的时间
        Date date1 = new Date();
        System.out.println("当前时间 = " + date1);

        //通过指定毫秒数获得时间
        Date date2 = new Date(9234567);
        System.out.println("date2 = " + date2);

        //创建SimpleDateFormat对象，指定格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");

        //格式化
        String format = sdf.format(date1);
        System.out.println("format = " + format);

        //解析
        Date parse = sdf.parse(format);
        System.out.println("parse = " + parse);
    }
}
