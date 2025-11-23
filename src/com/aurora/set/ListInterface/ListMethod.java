package com.aurora.set.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        System.out.println("list: " + list);    //list: [张三丰, 贾宝玉]

        //1.void add(int index, Object ele)
        list.add(1, "韩顺平");
        System.out.println("list: " + list);    //list: [张三丰, 韩顺平, 贾宝玉]

        //2.boolean addAll(int index, Collection eles)
        List list2 = new ArrayList();
        list2.add("tom");
        list2.add("jack");
        list.addAll(1, list2);
        System.out.println("list: " + list);    //list: [张三丰, tom, jack, 韩顺平, 贾宝玉]

        //3.Object get(int index)
        Object result = list.get(1);
        System.out.println("result: " + result);    //result: tom

        //4.int indexOf(Object obj)
        list.add("tom");
        System.out.println("list: " + list);    //list: [张三丰, tom, jack, 韩顺平, 贾宝玉, tom]
        System.out.println(list.indexOf("tom"));    //1

        //5.int lastIndexOf(Object obj)
        list.add("韩顺平");
        System.out.println("list: " + list);    //list: [张三丰, tom, jack, 韩顺平, 贾宝玉, tom, 韩顺平]
        System.out.println(list.lastIndexOf("韩顺平"));    //6

        //6.Object remove(int index)
        Object obj = list.remove(0);
        System.out.println("被删除的元素: " + obj);   //被删除的元素: 张三丰
        System.out.println("list: " + list);    //list: [tom, jack, 韩顺平, 贾宝玉, tom, 韩顺平]

        //7.Object set(int index, Object ele)
        list.set(1, "玛丽");
        System.out.println("list: " + list);    //list: [tom, 玛丽, 韩顺平, 贾宝玉, tom, 韩顺平]

        //8.List subList(int fromIndex, int toIndex)
        List returnList = list.subList(0, 2);
        System.out.println("list: " + returnList);  //list: [tom, 玛丽]
    }
}
