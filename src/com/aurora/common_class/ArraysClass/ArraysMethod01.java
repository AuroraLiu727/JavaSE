package com.aurora.common_class.ArraysClass;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod01 {
    public static void main(String[] args) {
        //1.toString
        Integer[] integers = {10, 20, 90};
        System.out.println(Arrays.toString(integers));

        //2.binarySearch
        Integer[] arr1 = {1, 2, 90, 123, 567};
        int index1 = Arrays.binarySearch(arr1, 567);
        System.out.println(index1); //4
        int index2 = Arrays.binarySearch(arr1, 10); //找不到
        System.out.println(index2); //-3

        //3.copyOf
        Integer[] new_arr1 = Arrays.copyOf(integers, 2);
        System.out.println(Arrays.toString(new_arr1));  //[10, 20]
        Integer[] new_arr2 = Arrays.copyOf(integers, 4);
        System.out.println(Arrays.toString(new_arr2));  //[10, 20, 90, null]

        //4.fill数组元素的填充
        Integer[] arr2 = {1, 2, 90, 123};
        Arrays.fill(arr2, 3);
        System.out.println(Arrays.toString(arr2));  //[3, 3, 3, 3]

        //5.equals
        Integer[] arr3 = {1, 2, 90, 123};
        Integer[] arr4 = {1, 2, 90, 123, 567};
        boolean equals = Arrays.equals(arr3, arr4);
        System.out.println(equals);     //false

        //6.asList
        List list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(list);   //[1, 2, 3, 4, 5, 6]
        System.out.println("list的与逆行类型" + list.getClass());     //list的与逆行类型class java.util.Arrays$ArrayList
    }
}
