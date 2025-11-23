package com.aurora.common_class.DateClass;

import java.time.Instant;
import java.util.Date;

public class InstantDemo {
    public static void main(String[] args) {
        //1.创建表示当前时间戳的Instant对象
        Instant now = Instant.now();
        System.out.println("now = " + now);     //实际输出的是now.toString()

        //2.Instant -> Date
        Date date = Date.from(now);
        System.out.println("date = " + date);

        //3.Date -> Instant
        Instant instant = date.toInstant();
        System.out.println("instant = " + instant);
    }
}
