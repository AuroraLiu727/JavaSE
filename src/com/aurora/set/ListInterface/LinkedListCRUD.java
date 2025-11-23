package com.aurora.set.ListInterface;

/*
    LinkedList的增删查改（CRUD）
 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCRUD {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        //增
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println("linkedList: " + linkedList);

        //删
        linkedList.remove(2);   //如果不传入参数，默认删除的是首节点
        linkedList.remove();
        System.out.println("linkedList: " + linkedList);

        //查
        Object item = linkedList.get(1);
        System.out.println("item: " + item);

        //改
        linkedList.set(1, 999);
        System.out.println("linkedList: " + linkedList);

        //迭代器遍历
        System.out.println("=============迭代器遍历==============");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next: " + next);
        }

        //增强for循环遍历
        System.out.println("=============增强for循环遍历==============");
        for (Object next : linkedList) {
            System.out.println("next: " + next);
        }

        //普通for循环遍历
        System.out.println("=============普通for循环遍历==============");
        for (int i = 0; i < linkedList.size(); i++) {
            Object next = linkedList.get(i);
            System.out.println("next: " + next);
        }
    }
}
