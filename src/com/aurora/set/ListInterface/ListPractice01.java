package com.aurora.set.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPractice01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();

        //添加10个以上的元素
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }
        System.out.println("list: " + list);

        //在2号位插入元素java
        list.add(1, "java");
        System.out.println("list: " + list);

        //获得第5个元素
        Object obj = list.get(4);
        System.out.println("obj: " + obj);

        //删除第6个元素
        list.remove(5);
        System.out.println("list: " + list);

        //修改第7个元素
        list.set(6, "world");
        System.out.println("list: " + list);

        //使用迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }
    }
}
