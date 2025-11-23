package com.aurora.set.collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class collectionMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();    //多态写法

        //1.add添加单个元素,可以添加不同类型的
        list.add("jack");
        list.add(10);   //本质是list.add(new Integer(10))
        list.add(true);
        System.out.println("list: " + list);    //[jack, 10, true]

        //2.remove,删除元素
        list.remove(0); //按位置删
        list.remove(true);  //按内容删
        System.out.println("list: " + list);    //[10]

        //3.contains 查找元素是否存在
        System.out.println(list.contains("jack"));  //false

        //4.获取元素个数
        System.out.println(list.size());    //1

        //5.isEmpty 判断是否为空
        System.out.println(list.isEmpty()); //false

        //6.clear 清空
        list.clear();
        System.out.println("list: " + list);    //[]

        //7.addAll 添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println("list: " + list);    //[红楼梦, 三国演义]

        //8.containsAll 查找多个元素是否都存在
        System.out.println(list.containsAll(list2));    //true

        //9.removeAll 删除多个元素
        list.add("聊斋");
        list2.add("时间是金");
        System.out.println("list: " + list);    //[红楼梦, 三国演义, 聊斋]
        System.out.println("list2:" + list2);   //[红楼梦, 三国演义, 时间是金]
        list.removeAll(list2);
        System.out.println("list: " + list);    //[聊斋],只删除list中包含list2中的元素，list2中可以存在list中没有的元素
    }
}
