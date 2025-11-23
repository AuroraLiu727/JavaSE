package com.aurora.Annotaion;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"rawtypes", "unchecked", "unused"})
public class SuppressWarningsDemo {
    public static void main(String[] args) {

        //使用原始类型的警告，可使用"rawtypes"忽略
        List list = new ArrayList();

        //未检查的类型转换警告，可使用"unchecked忽略
        list.add("Jack");
        list.add("Tom");
        list.add("mary");

        //未使用的变量或方法的警告，可使用"unused"忽略
        int i;

        System.out.println(list.get(1));
    }

}
