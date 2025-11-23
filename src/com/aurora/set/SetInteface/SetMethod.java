package com.aurora.set.SetInteface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        //以HashSet为例
        Set set = new HashSet();

        //添加元素
        set.add("john");
        set.add("lucy");
        set.add("jack");
        set.add("jerry");
        set.add("john");    //重复
        set.add(null);
        set.add(null);      //再次添加null

        System.out.println(set);    //[null, john, jerry, lucy, jack]，重复的john和null并没有添加进去，且无序

        //删除元素
        set.remove(null);
        System.out.println(set);    //[john, jerry, lucy, jack]

        //迭代器遍历
        System.out.println("===============迭代器遍历=========");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        //增强for循环遍历
        System.out.println("===============增强for循环遍历=========");
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
