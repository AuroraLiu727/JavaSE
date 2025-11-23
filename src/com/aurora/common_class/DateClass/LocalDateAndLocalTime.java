package com.aurora.common_class.DateClass;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateAndLocalTime {
    public static void main(String[] args) {
        LocalDate  date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("date = " + date);
        System.out.println("time = " + time);
    }
}
