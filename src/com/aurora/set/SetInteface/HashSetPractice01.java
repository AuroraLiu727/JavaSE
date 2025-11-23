package com.aurora.set.SetInteface;

import java.util.HashSet;

public class HashSetPractice01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("tom", 18));       //加入成功
        hashSet.add(new Employee("jerry", 20));     //加入成功
        hashSet.add(new Employee("tom", 18));       //name和age均重复，没有加入

        System.out.println(hashSet);    //[Employee{name='jerry', age=20}, Employee{name='tom', age=18}]
    }
}
