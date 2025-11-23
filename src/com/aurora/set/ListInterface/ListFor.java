package com.aurora.set.ListInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //这里以LinkedList为例
        List list = new LinkedList();
        list.add("jack");
        list.add("tom");
        list.add("jerry");

        //1.迭代器
        System.out.println("=================迭代器=================");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }

        //2.增强for循环
        System.out.println("=================增强for循环=================");
        for (Object object : list) {
            System.out.println(object);
        }

        //3.普通for循环
        System.out.println("=================普通for循环=================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
