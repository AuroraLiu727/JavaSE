package com.aurora.set.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings("all")
public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        //获得迭代器
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj: " + obj);
        }

        //此时iterator失效
        //iterator.next();      //报错：NoSuchElementException

        //第二次遍历
        iterator = col.iterator();  //重置遍历器
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj: " + obj);
        }
    }
}
