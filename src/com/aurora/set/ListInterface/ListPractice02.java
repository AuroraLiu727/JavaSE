package com.aurora.set.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListPractice02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //使用ArrayList实现
        List list = new ArrayList();

        //添加图书信息
        list.add(new Book("红楼梦", 100, "曹雪芹"));
        list.add(new Book("西游记", 10, "吴承恩"));
        list.add(new Book("水浒传", 19, "施耐庵"));
        list.add(new Book("三国演义", 80, "罗贯中"));

        //排序前
        System.out.println("=================排序前=================");
        for (Object object : list) {
            System.out.println(object);
        }

        //排序
        bubbleSort(list);

        //排序后
        System.out.println("=================排序后=====================");
        for (Object object : list) {
            System.out.println(object);
        }
    }

    //冒泡排序算法
    public static void bubbleSort(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                //取出Book对象
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}
