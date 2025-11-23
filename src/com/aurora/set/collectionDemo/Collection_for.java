package com.aurora.set.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("all")
public class Collection_for {
    public static void main(String[] args) {
        Collection col =  new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        //使用增强for循环遍历
        for (Object o : col) {
            System.out.println(o);
        }


    }
}
